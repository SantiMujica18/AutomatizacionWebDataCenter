package com.co.datacenter.stepsdefinitions.paga_triple.all_scenarios_paga_triple;

import net.thucydides.core.annotations.Step;
import com.co.datacenter.questions.paga_triple.confirm_paga_triple.ConfirmPagaTripleQuestion;
import com.co.datacenter.questions.paga_triple.paga_triple_no_credit.PagaTripleNoFoundsQuestion;
import com.co.datacenter.tasks.OpenThePage;
import com.co.datacenter.tasks.delay.Delay;
import com.co.datacenter.tasks.login.security_questions_tasks.SecurityQuestionsTask;
import com.co.datacenter.tasks.login.signin.LoginUserTask;
import com.co.datacenter.tasks.paga_triple.confirm_buy_paga_triple.ConfirmAndNewBetPagaTripleTask;
import com.co.datacenter.tasks.paga_triple.confirm_buy_paga_triple.ConfirmPagaTripleTask;
import com.co.datacenter.tasks.paga_triple.empty_values_paga_triple.EmptyValuesPagaTripleTask;
import com.co.datacenter.tasks.paga_triple.incomplete_number_bet_paga_triple.IncompleteNumberBetTask;
import com.co.datacenter.tasks.paga_triple.max_value_paga_triple.MaxValueBetTask;
import com.co.datacenter.tasks.paga_triple.min_value_paga_triple.MinValueBetTask;
import com.co.datacenter.tasks.paga_triple.repeatedlotteryselectiontask.repeatedLotterySelectionTask;
import com.co.datacenter.tasks.paga_triple.same_number_paga_triple.SameNumberBetTask;
import com.co.datacenter.tasks.paga_triple.select_paga_triple.SelectPagaTripleTask;
import com.co.datacenter.tasks.select_bets.SelectBetTask;
import com.co.datacenter.tasks.switch_iframe.SwitchToIframeTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.TimeoutException;


public class ValidateAllScenariosPagaTriple {
    @Managed(driver = "Chrome")
    private WebDriver hisBrowser;
    private Actor user = Actor.named("user");

    @Before
    public void setUp() {
        user.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^user make all scenarios to validate the functioning$")
    public void userMakeAllScenariosToValidateTheFunctioning() throws InterruptedException {
        user.wasAbleTo(
                OpenThePage.on(),
                LoginUserTask.on(),
                SecurityQuestionsTask.on()
        );
        user.wasAbleTo(
                SelectBetTask.on(),
                SwitchToIframeTask.on(),
                SelectPagaTripleTask.on()
        );

    }

    @When("^he do all the task$")
    public void heDoAllTheTask() throws InterruptedException {
        try {
            Thread.sleep(10000);

            user.wasAbleTo(
                    IncompleteNumberBetTask.on(),
                    repeatedLotterySelectionTask.on(),
                    Delay.ofMilliseconds(3000),
                    SameNumberBetTask.on(),
                    Delay.ofMilliseconds(3000),
                    ConfirmAndNewBetPagaTripleTask.on(),
                    Delay.ofMilliseconds(3000),
                    MaxValueBetTask.on(),
                    Delay.ofMilliseconds(3000),
                    ConfirmAndNewBetPagaTripleTask.on(),
                    Delay.ofMilliseconds(3000),
                    MinValueBetTask.on(),
                    Delay.ofMilliseconds(3000),
                    ConfirmPagaTripleTask.on()
            );
        } catch (TimeoutException e) {
            hisBrowser.navigate().refresh();
            heDoAllTheTask();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Then("^He should sees the title Pago exitoso$")
    public void heShouldSeesTheTitlePagoExitoso() throws InterruptedException {
        Thread.sleep(10000);
        String confirmationMessage = ConfirmPagaTripleQuestion.confirmPagaTriple().answeredBy(user);
        String errorMessage = PagaTripleNoFoundsQuestion.PagaTripleNoFounds().answeredBy(user);

        if (confirmationMessage.equals("Enviaremos los soportes de esta transacción a tu correo electrónico.")) {
            System.out.println("\n El titulo de validacion es : \n Pago exitoso" + confirmationMessage);
        } else if (errorMessage.equals("Fondos Insuficientes")) {
            System.out.println("Se genera el siguiente mensaje de error : \n Fondos Insuficientes");
        } else {
            System.out.println("Se encontro un error que no se pudo validar");
            throw new AssertionError("No se pudo validar el mensaje de confirmación ni de error.");
        }
    }
}
