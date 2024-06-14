package com.co.datacenter.stepsdefinitions.recharge.all_operators.confirm_movistar_recharge;

import com.co.datacenter.questions.pines.pines_no_founds.PinesNoFoundsQuestion;
import com.co.datacenter.questions.recharge.confirm_recharge.ConfirmRechargeQuestion;
import com.co.datacenter.tasks.OpenThePage;
import com.co.datacenter.tasks.confirm_recharge.ConfirmRechargeTask;
import com.co.datacenter.tasks.login.security_questions_tasks.SecurityQuestionsTask;
import com.co.datacenter.tasks.login.signin.LoginUserTask;
import com.co.datacenter.tasks.recharge.recharge_data_element_iframe.RechargeDataTask;
import com.co.datacenter.tasks.recharge.select_recharge.SelectMovistarRechargeTask;
import com.co.datacenter.tasks.recharge.select_recharge.SelectRechargeTask;
import com.co.datacenter.tasks.recharge.validation_of_empty_data_recharge.DataRechargeEmptyTask;
import com.co.datacenter.tasks.recharge.validation_of_empty_select_payment.SelectEmptyPaymentTask;
import com.co.datacenter.tasks.recharge.validation_of_empty_value_recharge.ValueEmptyRechargeTask;
import com.co.datacenter.tasks.switch_iframe.SwitchToIframeTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class ConfirmMovistarRechargeDefinition {
    @Managed(driver = "Chrome")

    private WebDriver hisBrowser;

    private Actor User = Actor.named("User");

    @Before
    public void setUp(){
        User.can(BrowseTheWeb.with(hisBrowser));
    }
    @Given("^User wants to make a Movistar recharge$")
    public void userWantsToMakeAMovistarRecharge() {
        User.wasAbleTo(
                OpenThePage.on(),
                LoginUserTask.on(),
                SecurityQuestionsTask.on(),
                SelectRechargeTask.on(),
                SwitchToIframeTask.on(),
                SelectMovistarRechargeTask.on()
        );
    }

    @When("^User makes the recharge and he pays$")
    public void userMakesTheRechargeAndHePays() {
        User.wasAbleTo(
                DataRechargeEmptyTask.on(),
                ValueEmptyRechargeTask.on(),
                RechargeDataTask.on(),
                SelectEmptyPaymentTask.on()
        );
        User.wasAbleTo(
                ConfirmRechargeTask.on()
        );
    }

    @Then("^He should sees the title Pago exitoso$")
    public void heShouldSeesTheTitlePagoExitoso() throws InterruptedException{

        Thread.sleep(10000);
        String confirmationMessage = ConfirmRechargeQuestion.confirmRecharge().answeredBy(User);
        String errorMessage = PinesNoFoundsQuestion.unsuccesfulpurchase().answeredBy(User);

        if (confirmationMessage.equals("Enviaremos los soportes de esta transacción a tu correo electrónico.")) {
            System.out.println("El titulo de validacion es: " + ConfirmRechargeQuestion.confirmRecharge().answeredBy(User).equals("Pago exitoso"));
        } else if (errorMessage.equals("Fondos Insuficientes")) {
            System.out.println("Se genera el siguiente mensaje de error : \n Fondos Insuficientes");
        } else {
            System.out.println("Se encontro un error que no se pudo validar");
            throw new AssertionError("No se pudo validar el mensaje de confirmación ni de error.");
        }
    }
}
