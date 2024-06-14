package com.co.datacenter.stepsdefinitions.recharge.recharge_data;


import com.co.datacenter.questions.recharge.recharge_data.RechargeDataQuestion;
import com.co.datacenter.tasks.login.signin.LoginUserTask;
import com.co.datacenter.tasks.operator_element_iframe.OperatorElementIframeTask;
import com.co.datacenter.tasks.recharge.recharge_data_element_iframe.RechargeDataTask;
import com.co.datacenter.tasks.recharge.select_recharge.SelectRechargeTask;
import com.co.datacenter.tasks.switch_iframe.SwitchToIframeTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class RechargeDataStepDefinition {


    @Managed(driver = "Chrome")

    private WebDriver hisBrowser;

    private Actor Sebas = Actor.named("Sebas");

    @Before
    public void setUp(){
        Sebas.can(BrowseTheWeb.with(hisBrowser));
    }


    @Given("^Sebastian in the recharge data page$")
    public void sebastianInTheRechargeDataPage() {
        Sebas.wasAbleTo(
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

    @When("^He fills in the form recharge data$")
    public void heFillsInTheFormRechargeData() {
        Sebas.wasAbleTo(
                RechargeDataTask.on()
        );
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Then("^He should sees the title confirmacion de compra$")
    public void heShouldSeesTheTitleConfirmacionDeCompra() {
        System.out.println("Bienvenido a confirmacion de compra: ?  \n el titulo de confirmacion es: "+ RechargeDataQuestion.confirmRecharge().answeredBy(Sebas));
    }
}
