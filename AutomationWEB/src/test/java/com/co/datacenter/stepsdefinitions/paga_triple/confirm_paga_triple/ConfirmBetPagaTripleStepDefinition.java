package com.co.datacenter.stepsdefinitions.paga_triple.confirm_paga_triple;


import com.co.datacenter.questions.paga_triple.confirm_paga_triple.ConfirmPagaTripleQuestion;
import com.co.datacenter.questions.paga_triple.paga_triple_no_credit.PagaTripleNoFoundsQuestion;
import com.co.datacenter.tasks.OpenThePage;
import com.co.datacenter.tasks.login.security_questions_tasks.SecurityQuestionsTask;
import com.co.datacenter.tasks.login.signin.LoginUserTask;

import com.co.datacenter.tasks.paga_triple.bet_paga_triple.BetThreeNumberOfTwoFigurePagaTripleTask;
import com.co.datacenter.tasks.paga_triple.confirm_buy_paga_triple.ConfirmPagaTripleTask;
import com.co.datacenter.tasks.paga_triple.empty_values_paga_triple.EmptyValuesPagaTripleTask;
import com.co.datacenter.tasks.paga_triple.select_paga_triple.SelectPagaTripleTask;
import com.co.datacenter.tasks.select_bets.SelectBetTask;
import com.co.datacenter.tasks.switch_iframe.SwitchToIframeTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class ConfirmBetPagaTripleStepDefinition {
    @Managed(driver = "Chrome")
    private WebDriver hisBrowser;
    private Actor user = Actor.named("user");
    @Before
    public void setUp(){
        user.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^user wants to confirm a paga triple$")
    public void userWantsToConfirmAPagaTriple() throws InterruptedException {
        user.wasAbleTo(
                OpenThePage.on(),
                LoginUserTask.on()
        );

        Thread.sleep(30000);
        user.wasAbleTo(
                SecurityQuestionsTask.on()
        );

        user.wasAbleTo(
                SwitchToIframeTask.on(),
                SelectBetTask.on(),
                SelectPagaTripleTask.on()
                );

        user.wasAbleTo(
                BetThreeNumberOfTwoFigurePagaTripleTask.on()
        );


    }

    @When("^He confirm the paga triple$")
    public void heConfirmThePagaTriple() throws InterruptedException {
        Thread.sleep(10000);
        user.wasAbleTo(
                ConfirmPagaTripleTask.on()
        );
    }

    @Then("^He should sees the title Pago exitoso$")
    public void heShouldSeesTheTitlePagoExitoso() throws InterruptedException {
        Thread.sleep(10000);
        String confirmationMessage = ConfirmPagaTripleQuestion.confirmPagaTriple().answeredBy(user);
        String errorMessage = PagaTripleNoFoundsQuestion.PagaTripleNoFounds().answeredBy(user);

        if (confirmationMessage.equals("Enviaremos los soportes de esta transacción a tu correo electrónico.")) {
            System.out.println("El titulo de validacion es : \n Pago exitoso" + confirmationMessage);
        } else if(errorMessage.equals("Fondos Insuficientes")){
            System.out.println("Se genera el siguiente mensaje de error : \n Fondos Insuficientes");
        }else {
            System.out.println("Se encontro un error que no se pudo validar");
        }
    }


}
