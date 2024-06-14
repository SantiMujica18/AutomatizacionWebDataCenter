package com.co.datacenter.stepsdefinitions.recharge.validation_of_empty_fields_data_recharge;


import com.co.datacenter.questions.recharge.validation_of_empty_data_recharge.DataRechargeEmptyQuestion;
import com.co.datacenter.tasks.login.signin.LoginUserTask;
import com.co.datacenter.tasks.OpenThePage;
import com.co.datacenter.tasks.operator_element_iframe.OperatorElementIframeTask;
import com.co.datacenter.tasks.recharge.select_recharge.SelectRechargeTask;
import com.co.datacenter.tasks.recharge.validation_of_empty_data_recharge.DataRechargeEmptyTask;
import com.co.datacenter.tasks.switch_iframe.SwitchToIframeTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class DataRechargeEmptyStepDefinition {

    @Managed(driver = "chrome")

    private WebDriver hisBrowser;


    private Actor Sebas = Actor.named("Sebas");

    @Before
    public void setUp(){
        Sebas.can(BrowseTheWeb.with(hisBrowser));
    }


    @Given("^Sebastian login with empty cell phone number$")
    public void sebastianLoginWithEmptyCellPhoneNumber() {

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


    @When("^he tries to log in without cell phone number$")
    public void heTriesToLogInWithoutCellPhoneNumber() {
        Sebas.wasAbleTo(DataRechargeEmptyTask.on()
        );
    }

    @Then("^He should sees the title El campo debe contener un número de (\\d+) digitos\\.$")
    public void heShouldSeesTheTitleElCampoDebeContenerUnNúmeroDeDigitos(int arg1) {
        System.out.println("Titulo de alerta deberia ser El campo debe contener un número de 10 digitos? \n Titulo de la alerta es: "+ DataRechargeEmptyQuestion.emptyData().answeredBy(Sebas));
    }
}
