package com.co.datacenter.stepsdefinitions.chance.validation_of_add_max_game_chance;

import com.co.datacenter.tasks.OpenThePage;
import com.co.datacenter.tasks.chance.chance_element_iframe.ChanceElementIframeTask;

import com.co.datacenter.tasks.login.security_questions_tasks.SecurityQuestionsTask;
import com.co.datacenter.tasks.login.signin.LoginUserTask;
import com.co.datacenter.questions.chance.validation_of_add_max_game_chance.AddMaxChanceQuestion;
import com.co.datacenter.tasks.chance.validation_of_add_max_game_chance.AddMaxChanceElementIframeTask;

import com.co.datacenter.tasks.switch_iframe.SwitchToIframeTask;
import com.co.datacenter.tasks.select_bets.SelectBetTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class ValidationAddMaxChanceDefinition {

    @Managed(driver = "Chrome")
    private WebDriver hisBrowser;
    private Actor user = Actor.named("Sebas");

    @Before
    public void setUp() {
        user.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^Sebastian wants to make maximum bets$")
    public void sebastianWantsToMakeMaximumBets() throws InterruptedException {

        user.wasAbleTo(
                OpenThePage.on(),
                LoginUserTask.on()
        );
        Thread.sleep(30000);

        user.wasAbleTo(
                SecurityQuestionsTask.on(),
                SwitchToIframeTask.on(),
                SelectBetTask.on(),
                ChanceElementIframeTask.on()
        );


    }


    @When("^He makes the maximum bets$")
    public void heMakesTheMaximumBets() {
        user.wasAbleTo(
                AddMaxChanceElementIframeTask.on()
        );

    }

    @Then("^He should sees the class change to button$")
    public void heShouldSeesTheClassChangeToButton() {
        System.out.println("El titulo de la alerta es No se Permiten Mas de 5 Juegos ?  \n el estado es: " + AddMaxChanceQuestion.addMaxChance().answeredBy(user));
    }


}
