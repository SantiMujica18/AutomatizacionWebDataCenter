package com.co.datacenter.stepsdefinitions.recharge.validation_of_empty_select_payment;


import com.co.datacenter.questions.recharge.validation_of_empty_select_payment.SelectEmptyPaymentQuestion;
import com.co.datacenter.tasks.login.signin.LoginUserTask;
import com.co.datacenter.tasks.OpenThePage;
import com.co.datacenter.tasks.operator_element_iframe.OperatorElementIframeTask;
import com.co.datacenter.tasks.recharge.recharge_data_element_iframe.RechargeDataTask;
import com.co.datacenter.tasks.recharge.select_recharge.SelectRechargeTask;
import com.co.datacenter.tasks.recharge.validation_of_empty_select_payment.SelectEmptyPaymentTask;
import com.co.datacenter.tasks.switch_iframe.SwitchToIframeTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class SelectEmptyPaymentStepDefinition {
    @Managed(driver = "chrome")

    private WebDriver hisBrowser;


    private Actor Sebas = Actor.named("Sebas");

    @Before
    public void setUp(){
        Sebas.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^Sebastian reloads select payment method$")
    public void sebastianReloadsSelectPaymentMethod() {
        Sebas.wasAbleTo(OpenThePage.on(),
                LoginUserTask.on());
        try {
            Thread.sleep(40000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Sebas.wasAbleTo(
                SelectRechargeTask.on(),
                SwitchToIframeTask.on(),
                OperatorElementIframeTask.on(),
                RechargeDataTask.on()
        );
    }

    @When("^He tries to reload select payment method$")
    public void heTriesToReloadSelectPaymentMethod() {
        Sebas.wasAbleTo(
                SelectEmptyPaymentTask.on()
        );
    }

    @Then("^He should sees the title Selecciona un método de pago\\.$")
    public void heShouldSeesTheTitleSeleccionaUnMétodoDePago() {
        System.out.println("Titulo de alerta deberia ser Selecciona un metodo de pago \n Titulo de la alerta es: "+ SelectEmptyPaymentQuestion.emptyMethod().answeredBy(Sebas));
    }
}
