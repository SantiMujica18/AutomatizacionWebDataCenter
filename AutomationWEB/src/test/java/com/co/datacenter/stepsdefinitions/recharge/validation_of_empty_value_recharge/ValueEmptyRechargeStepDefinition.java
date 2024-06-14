package com.co.datacenter.stepsdefinitions.recharge.validation_of_empty_value_recharge;


import com.co.datacenter.questions.recharge.validation_of_empty_value_recharge.ValueEmptyRechargeQuestion;
import com.co.datacenter.tasks.login.signin.LoginUserTask;
import com.co.datacenter.tasks.OpenThePage;
import com.co.datacenter.tasks.operator_element_iframe.OperatorElementIframeTask;
import com.co.datacenter.tasks.recharge.select_recharge.SelectRechargeTask;
import com.co.datacenter.tasks.recharge.validation_of_empty_value_recharge.ValueEmptyRechargeTask;
import com.co.datacenter.tasks.switch_iframe.SwitchToIframeTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class ValueEmptyRechargeStepDefinition {
    @Managed(driver = "chrome")

    private WebDriver hisBrowser;


    private Actor Sebas = Actor.named("Sebas");

    @Before
    public void setUp(){
        Sebas.can(BrowseTheWeb.with(hisBrowser));
    }


    @Given("^Sebastian reloads with empty reload value$")
    public void sebastianReloadsWithEmptyReloadValue() {
        Sebas.wasAbleTo(
                OpenThePage.on(),
                LoginUserTask.on()
        );
        try {
            Thread.sleep(40000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Sebas.wasAbleTo(
                SelectRechargeTask.on(),
                SwitchToIframeTask.on(),
                OperatorElementIframeTask.on()
        );
    }

    @When("^He tries to reload without value$")
    public void heTriesToReloadWithoutValue() {
        Sebas.wasAbleTo(
                ValueEmptyRechargeTask.on()
        );
    }

    @Then("^He should sees the title El valor del campo es obligatorio\\.$")
    public void heShouldSeesTheTitleElValorDelCampoEsObligatorio() {
        System.out.println("Titulo de alerta deberia ser El valor del campo es obligatorio \n Titulo de la alerta es: "+ ValueEmptyRechargeQuestion.emptyValue().answeredBy(Sebas));
    }
}
