package com.co.datacenter.stepsdefinitions.super_astro.send_super_astro_luna;

import com.co.datacenter.questions.super_astro.validation_super_astro_luna.ConfirmBuySuperAstroLunaQuestion;
import com.co.datacenter.tasks.OpenThePage;
import com.co.datacenter.tasks.login.signin.LoginUserTask;
import com.co.datacenter.tasks.select_bets.SelectBetTask;
import com.co.datacenter.tasks.super_astro.select_super_astro.SelectSuperAstroTask;
import com.co.datacenter.tasks.super_astro.validation_super_astro_luna.FillOutFormOneSuperAstroLunaTask;
import com.co.datacenter.tasks.super_astro.send_super_astro.ConfirmBuySuperAtroTask;
import com.co.datacenter.tasks.switch_iframe.SwitchToIframeTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;


public class SendSuperAstroLunalDefinition {

    @Managed(driver = "Chrome")
    private WebDriver hisBrowser;

    private Actor Sebas = Actor.named("Sebas");

    @Before
    public void setUp(){
        Sebas.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^Sebastian wants make super astro  luna$")
    public void sebastianWantsMakeSuperAstroLuna() throws InterruptedException {
        Sebas.wasAbleTo(
                OpenThePage.on(),
                LoginUserTask.on()
        );
        Thread.sleep(40000);

        Sebas.wasAbleTo(
                SelectBetTask.on(),
                SwitchToIframeTask.on(),
                SelectSuperAstroTask.on(),
                FillOutFormOneSuperAstroLunaTask.on()
        );
    }

    @When("^He inserts data in the form super astro automatic$")
    public void heInsertsDataInTheFormSuperAstroAutomatic() {
        Sebas.wasAbleTo(
                ConfirmBuySuperAtroTask.on()
        );
    }

    @Then("^He should sees the title La fecha es posterior al horario permitido para Astro Luna, no es posible realizar la venta$")
    public void heShouldSeesTheTitleLaFechaEsPosteriorAlHorarioPermitidoParaAstroLuna() {
        System.out.println("El titulo de la validacion es ?  \n  el titulo de validacion es: " + ConfirmBuySuperAstroLunaQuestion.confirmBuySuperAstroLuna().answeredBy(Sebas));

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
        System.out.println("El titulo es Confirmacion de Compra ?  \n  el titulo de validacion es: " + ConfirmBuySuperAstroSolQuestion.confirmBuySuperAstroSol().answeredBy(Sebas));
        //System.out.println("Bienvenido a el servicio de super astro ?  \n el titulo de validacion es: " + FillOutFormOneSuperAstroSolQuestion.fillOutFormOne().answeredBy(Sebas));
        //System.out.println("El titulo es Resumen de juego ?  \n  el titulo de validacion es: " + FillOutFormTwoSuperAstroSolQuestion.fillOutFormTwo().answeredBy(Sebas));

    }

     */


}
