package com.co.datacenter.stepsdefinitions.super_astro.validation_add_max_bet;

import com.co.datacenter.questions.super_astro.validation_add_max_bet.ValidationAddMaxBetQuestion;
import com.co.datacenter.questions.super_astro.validation_max_value.ValidationMaxValueQuestion;
import com.co.datacenter.tasks.OpenThePage;
import com.co.datacenter.tasks.login.signin.LoginUserTask;
import com.co.datacenter.tasks.select_bets.SelectBetTask;
import com.co.datacenter.tasks.super_astro.select_super_astro.SelectSuperAstroTask;
import com.co.datacenter.tasks.super_astro.send_super_astro.FillOutFormOneSuperAstroTask;
import com.co.datacenter.tasks.super_astro.validation_add_max_bet.ValidationAddMaxBetTask;
import com.co.datacenter.tasks.super_astro.validation_delete_bet.ValidationDeleteBetTask;
import com.co.datacenter.tasks.super_astro.validation_max_value.ValidationMaxValueTask;
import com.co.datacenter.tasks.switch_iframe.SwitchToIframeTask;
import com.co.datacenter.userinterfaces.super_astro.send_super_astro.SendSuperAstroTwoInterface;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.Switch;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;


public class ValidationAddMaxBetDefinition {

    @Managed(driver = "Chrome")
    private WebDriver hisBrowser;

    private Actor Sebas = Actor.named("Sebas");

    @Before
    public void setUp(){
        Sebas.can(BrowseTheWeb.with(hisBrowser));
    }
    @Given("^Sebastian wants to make maximum bets super astro$")
    public void sebastianWantsToMakeMaximumBetsSuperAstro() throws InterruptedException {
        /*
        Sebas.wasAbleTo(
                OpenThePage.on(),
                LoginUserTask.on()
        );
        Thread.sleep(40000);

        Sebas.wasAbleTo(
                SelectBetTask.on(),
                SwitchToIframeTask.on(),
                SelectSuperAstroTask.on(),
                FillOutFormOneSuperAstroTask.on()
        );

         */
    }

    @When("^He makes the maximum bets super astro$")
    public void heMakesTheMaximumBetsSuperAstro(){
        Sebas.attemptsTo(
                ValidationAddMaxBetTask.on());


    }

    @Then("^He should sees the the button Añadir Apuesta change class$")
    public void heShouldSeesTheTheButtonAñadirApuestaChangeClass() {
        System.out.println("El boton de añadir producto cambio clase css ?  \n  el estado del boton es bloqueado : " + ValidationAddMaxBetQuestion.validationAddMaxBet.answeredBy(Sebas));
    }

}
