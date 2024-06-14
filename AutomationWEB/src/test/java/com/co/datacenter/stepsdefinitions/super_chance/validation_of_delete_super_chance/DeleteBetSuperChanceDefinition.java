package com.co.datacenter.stepsdefinitions.super_chance.validation_of_delete_super_chance;


import com.co.datacenter.questions.super_chance.delete_super_chance.DeleteSuperChanceQuestion;
import com.co.datacenter.tasks.login.signin.LoginUserTask;
import com.co.datacenter.tasks.OpenThePage;
import com.co.datacenter.tasks.select_bets.SelectBetTask;
import com.co.datacenter.tasks.super_chance.delete_super_chance.DeleteSuperChanceElementIframeTask;
import com.co.datacenter.tasks.super_chance.select_super_chance.SuperChanceElementIframeTask;
import com.co.datacenter.tasks.switch_iframe.SwitchToIframeTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class DeleteBetSuperChanceDefinition {

    @Managed(driver = "Chrome")
    private WebDriver hisBrowser;
    private Actor Sebas = Actor.named("Sebas");
    @Before
    public void setUp(){
        Sebas.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^Sebastian wants to delete a bet super chance$")
    public void sebastianWantsToDeleteABetSuperChance() throws InterruptedException {
        Sebas.wasAbleTo(
                OpenThePage.on(),
                LoginUserTask.on()
        );
        Thread.sleep(40000);

        Sebas.wasAbleTo(
                SelectBetTask.on(),
                SwitchToIframeTask.on(),
                SuperChanceElementIframeTask.on()
        );
    }


    @When("^He deletes the bet super chance$")
    public void heDeletesTheBetSuperChance() {
        Sebas.wasAbleTo(
                //DataSuperChanceTask.on(),
                DeleteSuperChanceElementIframeTask.on()
        );
    }

    @Then("^He should sees the class change to next button$")
    public void heShouldSeesTheClassChangeToNextButton() {
        System.out.println("El estado del boton es bloqueado ?  \n el estado es:  "+ DeleteSuperChanceQuestion.deleteSuperChance.answeredBy(Sebas));

    }


}
