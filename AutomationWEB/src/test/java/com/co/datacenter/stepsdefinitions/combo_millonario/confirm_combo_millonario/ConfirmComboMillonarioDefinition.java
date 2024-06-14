package com.co.datacenter.stepsdefinitions.combo_millonario.confirm_combo_millonario;


import com.co.datacenter.questions.combo_millonario.confirm_combo_millonario.ConfirmComboMillonarioQuestion;
import com.co.datacenter.tasks.OpenThePage;
import com.co.datacenter.tasks.combo_millonario.confirm_combo_millonario.ConfirmComboMillonarioTask;
import com.co.datacenter.tasks.combo_millonario.data_combo_millonario.BetFourOnePageComboMillonarioTask;
import com.co.datacenter.tasks.combo_millonario.data_combo_millonario.BetFourTwoPageComboMillonarioTask;
import com.co.datacenter.tasks.combo_millonario.select_combo_millonario.SelectComboMillonarioTask;
import com.co.datacenter.tasks.login.security_questions_tasks.SecurityQuestionsTask;
import com.co.datacenter.tasks.login.signin.LoginUserTask;
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

public class ConfirmComboMillonarioDefinition {

    @Managed(driver = "Chrome")
    private WebDriver hisBrowser;
    private Actor Sebas = Actor.named("Sebas");

    @Before
    public void setUp() {
        Sebas.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^Sebastian wants to confirm a combo millonario$")
    public void sebastianWantsToConfirmAComboMillonario() {
        Sebas.wasAbleTo(
                OpenThePage.on(),
                LoginUserTask.on(),
                SecurityQuestionsTask.on(),
                SelectBetTask.on(),
                SwitchToIframeTask.on(),
                SelectComboMillonarioTask.on(),
                BetFourOnePageComboMillonarioTask.on(),
                BetFourTwoPageComboMillonarioTask.on()
        );
    }

    @When("^He confirm the combo millonario$")
    public void heConfirmTheComboMillonario()  {
        Sebas.wasAbleTo(
                ConfirmComboMillonarioTask.on()
        );
    }

    @Then("^He should sees the title Pago exitoso$")
    public void heShouldSeesTheTitlePagoExitoso() throws InterruptedException{
        Thread.sleep(20000);
        System.out.println("El titulo de validacion es Pago exitoso ? : \n " + ConfirmComboMillonarioQuestion.confirmComboMillonario().answeredBy(Sebas).equals("Pago exitoso"));

    }

}
