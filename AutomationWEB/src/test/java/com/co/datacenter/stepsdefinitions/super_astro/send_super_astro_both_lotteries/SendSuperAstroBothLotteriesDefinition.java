package com.co.datacenter.stepsdefinitions.super_astro.send_super_astro_both_lotteries;

import com.co.datacenter.questions.super_astro.send_super_astro_manual.ConfirmBuySuperAstroQuestion;
import com.co.datacenter.tasks.OpenThePage;
import com.co.datacenter.tasks.login.signin.LoginUserTask;
import com.co.datacenter.tasks.select_bets.SelectBetTask;
import com.co.datacenter.tasks.super_astro.select_super_astro.SelectSuperAstroTask;
import com.co.datacenter.tasks.super_astro.send_super_astro.ConfirmBuySuperAtroTask;
import com.co.datacenter.tasks.super_astro.send_super_astro.FillOutFormTwoSuperAstroTask;
import com.co.datacenter.tasks.super_astro.send_super_astro_both_lotteries.SendAstroBothLotteriesTask;
import com.co.datacenter.tasks.switch_iframe.SwitchToIframeTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;


public class SendSuperAstroBothLotteriesDefinition {

    @Managed(driver = "Chrome")
    private WebDriver hisBrowser;

    private Actor Sebas = Actor.named("Sebas");

    @Before
    public void setUp(){
        Sebas.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^Sebastian wants make super astro  two lotteries$")
    public void sebastianWantsMakeSuperAstroTwoLotteries() throws InterruptedException {
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
    }


    @When("^He inserts data in the form super astro both lotteries$")
    public void heInsertsDataInTheFormSuperAstroBothLotteries() {
        Sebas.wasAbleTo(
                SendAstroBothLotteriesTask.on(),
                FillOutFormTwoSuperAstroTask.on(),
                ConfirmBuySuperAtroTask.on()
        );
    }

    @Then("^He should sees the title Pago exitoso$")
    public void heShouldSeesTheTitlePagoExitoso() {
        System.out.println("El titulo es Confirmacion de Compra ?  \n  el titulo de validacion es: " + ConfirmBuySuperAstroQuestion.confirmBuySuperAstro().answeredBy(Sebas));
    }

}
