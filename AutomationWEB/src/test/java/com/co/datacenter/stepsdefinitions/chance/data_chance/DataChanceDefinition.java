package com.co.datacenter.stepsdefinitions.chance.data_chance;


import com.co.datacenter.questions.chance.data_chance.DataChanceQuestion;
import com.co.datacenter.tasks.login.security_questions2_tasks.SecurityQuestions2Task;
import com.co.datacenter.tasks.login.signin.LoginUserTask;
import com.co.datacenter.tasks.OpenThePage;
import com.co.datacenter.tasks.chance.chance_element_iframe.ChanceElementIframeTask;
import com.co.datacenter.tasks.chance.data_chance_element_iframe.DataChanceElementIframeTask;
import com.co.datacenter.tasks.select_bets.SelectBetTask;
import com.co.datacenter.tasks.switch_iframe.SwitchToIframeTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class DataChanceDefinition {

    @Managed(driver = "Chrome")
    private WebDriver hisBrowser;
    private Actor user = Actor.named("Sebas");
    @Before
    public void setUp(){
        user.can(BrowseTheWeb.with(hisBrowser));
    }


    @Given("^Sebastian wants to take a chance$")
    public void sebastianSebastianWantsToTakeAChance() throws InterruptedException {
        user.wasAbleTo(
                OpenThePage.on(),
                LoginUserTask.on()
        );
        Thread.sleep(30000);

        user.wasAbleTo(
                SecurityQuestions2Task.on(),
                SwitchToIframeTask.on(),
                SelectBetTask.on(),
                ChanceElementIframeTask.on()
        );
    }

    @When("^He insert the data in the form$")
    public void heInsertTheDataInTheForm() {
        user.wasAbleTo(
                DataChanceElementIframeTask.on()
        );
    }

    @Then("^He should sees the title Confirmación de compra$")
    public void heShouldSeesTheTitleConfirmaciónDeCompra() {
        System.out.println("Confirmacion de compra ?  \n el titulo de bievenida es: "+ DataChanceQuestion.dataChance().answeredBy(user));
    }



}
