package com.co.datacenter.stepsdefinitions.chance.validation_bet_same_number_chance;

import com.co.datacenter.questions.chance.validation_bet_same_number_chance.BetSameNumberChanceQuestion;
import com.co.datacenter.tasks.chance.validation_bet_same_number_chance.BetSameNumberChanceElementIframeTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class BetSameNumberChanceDefinition {

    @Managed(driver = "Chrome")
    private WebDriver hisBrowser;
    private Actor Sebas = Actor.named("Sebas");
    @Before
    public void setUp(){
        Sebas.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^Sebastian wants to take a chance same number$")
    public void sebastianWantsToTakeAChanceSameNumber() {

    }


    @When("^He insert the data in the form same number$")
    public void heInsertTheDataInTheFormSameNumber() {
        Sebas.wasAbleTo(
                BetSameNumberChanceElementIframeTask.on()
        );
    }

    @Then("^He should sees the title Ya tienes un juego con este mismo número\\.$")
    public void heShouldSeesTheTitleYaTienesUnJuegoConEsteMismoNúmero() {
        System.out.println("Alerta Ya tienes un juego con este mismo número, por favor cámbialo por otro. ?  \n el titulo de la alerta es: "+ BetSameNumberChanceQuestion.sameNumberChance().answeredBy(Sebas));
    }

    /*
    @Given("^Sebastian wants to take a chance$")
    public void sebastianSebastianWantsToTakeAChance() throws InterruptedException {
        Sebas.wasAbleTo(
                OpenThePage.on(),
                LoginUserTask.on()
        );
        Thread.sleep(40000);

        Sebas.wasAbleTo(
                SelectBetTask.on(),
                SwitchToIframeTask.on(),
                ChanceElementIframeTask.on()
        );
    }

    @When("^He insert the data in the form$")
    public void heInsertTheDataInTheForm() {
        Sebas.wasAbleTo(
                DataChanceElementIframeTask.on()
        );
    }

    @Then("^He should sees the title Confirmación de compra$")
    public void heShouldSeesTheTitleConfirmaciónDeCompra() {
        System.out.println("Confirmacion de compra ?  \n el titulo de bievenida es: "+ DataChanceQuestion.dataChance().answeredBy(Sebas));
    }

     */



}
