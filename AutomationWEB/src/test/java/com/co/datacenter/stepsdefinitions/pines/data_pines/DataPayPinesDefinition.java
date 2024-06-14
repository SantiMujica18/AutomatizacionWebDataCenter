package com.co.datacenter.stepsdefinitions.pines.data_pines;

import com.co.datacenter.questions.pines.data_pines.DataPinesQuestion;
import com.co.datacenter.tasks.OpenThePage;
import com.co.datacenter.tasks.login.signin.LoginUserTask;
import com.co.datacenter.tasks.pines.data_pines.*;
import com.co.datacenter.tasks.pines.select_pines.SelectPinesTask;
import com.co.datacenter.tasks.switch_iframe.SwitchToIframeTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class DataPayPinesDefinition {

    @Managed(driver = "Chrome")

    private WebDriver hisBrowser;


    private Actor Sebas = Actor.named("Sebastian");

    @Before
    public void setUp(){
        Sebas.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^Sebastian on the product page$")
    public void sebastianOnTheProductPage() throws InterruptedException {
        Sebas.wasAbleTo(
                OpenThePage.on(),
                LoginUserTask.on()
        );
        Thread.sleep(40000);

        Sebas.wasAbleTo(
                SelectPinesTask.on(),
                SwitchToIframeTask.on()
        );
    }


    @When("^he selects the xbox product$")
    public void heSelectsTheXboxProduct() {
        Sebas.wasAbleTo(
                SelectProductPinTask.on()
        );
    }

    @When("^he select the pin$")
    public void heSelectThePin() {
        Sebas.wasAbleTo(
            SelectInputPinTask.on(),
            SelectValuePinTask.on()
        );
    }

    @When("^he select the personal data check$")
    public void heSelectThePersonalDataCheck() {
        Sebas.wasAbleTo(
                InputCelTask.on(),
                InputConfirmCelTask.on(),
                InputCorreoTask.on(),
                InputConfirmCorreoTask.on(),
                ClickBtnNextTask.on(),
                ClickBtnAcceptAlertTask.on(),
                ClickCheckBoxDateTask.on()
        );
    }

    @When("^he click on the next button$")
    public void heClickOnTheNextButton() {
        Sebas.wasAbleTo(
                ClickBtnNextTask.on()
        );
    }

    @When("^he click on the payment method$")
    public void heClickOnThePaymentMethod() {
        Sebas.wasAbleTo(
                ClickMethodPayTask.on()
        );
    }

    @When("^he click on the pay button$")
    public void heClickOnThePayButton() {
        Sebas.wasAbleTo(
                ClickBtnPayTask.on()
        );
    }

    @Then("^he should then see the title Exito$")
    public void heShouldThenSeeTheTitleExito() {
        System.out.println("El titulo de validacion es Pago exitoso: \n " + DataPinesQuestion.paymentSuccessful().answeredBy(Sebas).equals("Pago exitoso"));
    }


}
