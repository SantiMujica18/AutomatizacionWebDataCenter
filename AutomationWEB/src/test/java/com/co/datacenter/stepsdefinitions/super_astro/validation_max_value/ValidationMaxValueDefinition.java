package com.co.datacenter.stepsdefinitions.super_astro.validation_max_value;

import com.co.datacenter.questions.super_astro.validation_max_value.ValidationMaxValueQuestion;
import com.co.datacenter.questions.super_astro.validation_min_value.ValidationMinValueQuestion;
import com.co.datacenter.tasks.OpenThePage;
import com.co.datacenter.tasks.login.signin.LoginUserTask;
import com.co.datacenter.tasks.select_bets.SelectBetTask;
import com.co.datacenter.tasks.super_astro.select_super_astro.SelectSuperAstroTask;
import com.co.datacenter.tasks.super_astro.validation_max_value.ValidationMaxValueTask;
import com.co.datacenter.tasks.super_astro.validation_min_value.ValidationMinValueTask;
import com.co.datacenter.tasks.switch_iframe.SwitchToIframeTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;


public class ValidationMaxValueDefinition {

    @Managed(driver = "Chrome")
    private WebDriver hisBrowser;

    private Actor Sebas = Actor.named("Sebas");

    @Before
    public void setUp(){
        Sebas.can(BrowseTheWeb.with(hisBrowser));
    }


    @Given("^Sebastian wants make super astro  sol$")
    public void sebastianWantsMakeSuperAstroSol() throws InterruptedException {
        /*
        Sebas.wasAbleTo(
                OpenThePage.on(),
                LoginUserTask.on()
        );
        Thread.sleep(40000);

        Sebas.wasAbleTo(
                SelectBetTask.on(),
                SwitchToIframeTask.on(),
                SelectSuperAstroTask.on()
        );

         */
    }

    @When("^He inserts data in the form super astro max value$")
    public void heInsertsDataInTheFormSuperAstroMaxValue() {
        Sebas.wasAbleTo(
                ValidationMaxValueTask.on()
        );
    }

    @Then("^He should sees the title El valor de la apuesta es mayor$")
    public void heShouldSeesTheTitleElValorDeLaApuestaEsMayor() {
        System.out.println("Validacion del campo vacio ?  \n  el titulo de validacion es: " + ValidationMaxValueQuestion.validationMaxValue().answeredBy(Sebas));
    }


}
