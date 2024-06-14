package com.co.datacenter.stepsdefinitions.super_astro.send_super_astro_manual;

import com.co.datacenter.questions.super_astro.send_super_astro_manual.ConfirmBuySuperAstroQuestion;
import com.co.datacenter.tasks.OpenThePage;
import com.co.datacenter.tasks.login.security_questions_tasks.SecurityQuestionsTask;
import com.co.datacenter.tasks.login.signin.LoginUserTask;
import com.co.datacenter.tasks.select_bets.SelectBetTask;
import com.co.datacenter.tasks.super_astro.select_super_astro.SelectSuperAstroTask;
import com.co.datacenter.tasks.super_astro.send_super_astro.ConfirmBuySuperAtroTask;
import com.co.datacenter.tasks.super_astro.send_super_astro.FillOutFormOneSuperAstroTask;
import com.co.datacenter.tasks.super_astro.send_super_astro.FillOutFormTwoSuperAstroTask;
import com.co.datacenter.tasks.super_astro.send_super_astro.NextBetTask;
import com.co.datacenter.tasks.super_astro.send_super_astro_both_lotteries.SendAstroBothLotteriesTask;
import com.co.datacenter.tasks.super_astro.validation_add_max_bet.ValidationAddMaxBetTask;
import com.co.datacenter.tasks.super_astro.validation_delete_bet.ValidationDeleteBetTask;
import com.co.datacenter.tasks.super_astro.validation_empty_value.ValidationValueEmptySuperAstroTask;
import com.co.datacenter.tasks.super_astro.validation_max_value.ValidationMaxValueTask;
import com.co.datacenter.tasks.super_astro.validation_min_value.ValidationMinValueTask;
import com.co.datacenter.tasks.switch_iframe.SwitchToIframeTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Switch;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;


public class SendSuperAstroManualDefinition {

    @Managed(driver = "Chrome")
    private WebDriver hisBrowser;

    private Actor Sebas = Actor.named("Sebas");

    @Before
    public void setUp(){
        Sebas.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^Sebastian wants make super astro  sol$")
    public void sebastianWantsMakeSuperAstroSol() throws InterruptedException {
        Sebas.wasAbleTo(
                OpenThePage.on(),
                LoginUserTask.on(),
                SecurityQuestionsTask.on()
        );

        Sebas.wasAbleTo(
                SelectBetTask.on(),
                SwitchToIframeTask.on(),
                SelectSuperAstroTask.on(),
                ValidationValueEmptySuperAstroTask.on(),
                ValidationMinValueTask.on(),
                ValidationMaxValueTask.on(),
                FillOutFormOneSuperAstroTask.on(),
                ValidationAddMaxBetTask.on(),
                ValidationDeleteBetTask.on(),
                ValidationDeleteBetTask.on(),
                ValidationDeleteBetTask.on()
        );
        Sebas.wasAbleTo(
                //FillOutFormOneSuperAstroTask.on(),
                FillOutFormTwoSuperAstroTask.on(),
                ConfirmBuySuperAtroTask.on()
        );
        Sebas.wasAbleTo(
                NextBetTask.on(),
                SendAstroBothLotteriesTask.on(),
                //FillOutFormOneSuperAstroTask.on(),
                FillOutFormTwoSuperAstroTask.on()
        );


    }


    @When("^He inserts data in the form super astro$")
    public void heInsertsDataInTheFormSuperAstro() {
        Sebas.wasAbleTo(
                ConfirmBuySuperAtroTask.on()
        );
    }

    @Then("^He should sees the title Pago exitoso$")
    public void heShouldSeesTheTitlePagoExitoso() {
        System.out.println("El titulo es Confirmacion de Compra ?  \n  el titulo de validacion es: " + ConfirmBuySuperAstroQuestion.confirmBuySuperAstro().answeredBy(Sebas).equals("Pago exitoso"));

    }


}
