package com.co.datacenter.stepsdefinitions.super_astro.validation_empty_value_field;

import com.co.datacenter.questions.super_astro.validation_empty_value_field.EmptyValueFieldQuestion;
import com.co.datacenter.tasks.OpenThePage;
import com.co.datacenter.tasks.login.signin.LoginUserTask;
import com.co.datacenter.tasks.select_bets.SelectBetTask;
import com.co.datacenter.tasks.super_astro.select_super_astro.SelectSuperAstroTask;
import com.co.datacenter.tasks.super_astro.validation_empty_value.ValidationValueEmptySuperAstroTask;
import com.co.datacenter.tasks.switch_iframe.SwitchToIframeTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;


public class ValidationFieldValueEmptyDefinition {

    @Managed(driver = "Chrome")
    private WebDriver hisBrowser;

    private Actor Sebas = Actor.named("Sebas");

    @Before
    public void setUp(){
        Sebas.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^Sebastian wants to make super astro sol$")
    public void sebastianWantsToMakeSuperAstroSol() throws InterruptedException {
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

    @When("^He does not insert data in the super astro value field$")
    public void heDoesNotInsertDataInTheSuperAstroValueField() {
        Sebas.wasAbleTo(
                ValidationValueEmptySuperAstroTask.on()
        );
    }

    @Then("^you should see the title You must enter the value of the bet$")
    public void youShouldSeeTheTitleYouMustEnterTheValueOfTheBet() {
        System.out.println("Validacion del campo vacio ?  \n  el titulo de validacion es: " + EmptyValueFieldQuestion.validationEmptyValueField().answeredBy(Sebas));
    }

    /*
    @Given("^Sebastian wants make super astro  sol$")
    public void sebastianWantsMakeSuperAstroSol() throws InterruptedException {
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

        Sebas.wasAbleTo(
                FillOutFormOneSuperAstroSolTask.on(),
                FillOutFormTwoSuperAstroSolTask.on()
        );

    }


    @When("^He inserts data in the form super astro$")
    public void heInsertsDataInTheFormSuperAstro() {
        Sebas.wasAbleTo(
                ConfirmBuySuperAtroSolTask.on()
        );
    }

    @Then("^He should sees the title Pago exitoso$")
    public void heShouldSeesTheTitlePagoExitoso() {
        System.out.println("El titulo es Confirmacion de Compra ?  \n  el titulo de validacion es: " + ConfirmBuySuperAstroQuestion.confirmBuySuperAstro().answeredBy(Sebas));
        //System.out.println("Bienvenido a el servicio de super astro ?  \n el titulo de validacion es: " + FillOutFormOneSuperAstroSolQuestion.fillOutFormOne().answeredBy(Sebas));
        //System.out.println("El titulo es Resumen de juego ?  \n  el titulo de validacion es: " + FillOutFormTwoSuperAstroSolQuestion.fillOutFormTwo().answeredBy(Sebas));

    }

     */


}
