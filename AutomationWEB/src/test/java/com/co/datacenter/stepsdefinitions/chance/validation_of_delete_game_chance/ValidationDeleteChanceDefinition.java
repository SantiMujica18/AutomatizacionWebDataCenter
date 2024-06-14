package com.co.datacenter.stepsdefinitions.chance.validation_of_delete_game_chance;

import com.co.datacenter.tasks.OpenThePage;
import com.co.datacenter.tasks.login.security_questions_tasks.SecurityQuestionsTask;
import com.co.datacenter.tasks.login.signin.LoginUserTask;
import com.co.datacenter.questions.chance.validation_of_delete_game_chance.DeleteChanceQuestion;
import com.co.datacenter.tasks.chance.validation_of_delete_game_chance.DeleteChanceElementIframeTask;
import com.co.datacenter.tasks.switch_iframe.SwitchToIframeTask;
import com.co.datacenter.tasks.select_bets.SelectBetTask;
import com.co.datacenter.tasks.chance.chance_element_iframe.ChanceElementIframeTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class ValidationDeleteChanceDefinition {

    @Managed(driver = "Chrome")
    private WebDriver hisBrowser;
    private Actor user = Actor.named("user");

    @Before
    public void setUp() {
        user.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^Sebastian wants to delete a bet$")
    public void sebastianWantsToDeleteABet() throws InterruptedException {

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

    @When("^He deletes the bet$")
    public void heDeletesTheBet() {
        user.wasAbleTo(
                DeleteChanceElementIframeTask.on()
        );
    }

    @Then("^He should sees the class change to next button$")
    public void heShouldSeesTheClassChangeToNextButton() {
        System.out.println("El estado del boton es bloqueado ?  \n el estado es: " + DeleteChanceQuestion.deleteChance.answeredBy(user));
    }


}
