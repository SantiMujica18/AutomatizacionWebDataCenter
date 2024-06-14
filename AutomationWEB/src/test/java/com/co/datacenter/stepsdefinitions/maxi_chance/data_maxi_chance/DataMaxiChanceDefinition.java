package com.co.datacenter.stepsdefinitions.maxi_chance.data_maxi_chance;


import com.co.datacenter.questions.maxi_chance.data_maxi_chance.DataMaxiChanceQuestion;
import com.co.datacenter.tasks.OpenThePage;
import com.co.datacenter.tasks.login.security_questions_tasks.SecurityQuestionsTask;
import com.co.datacenter.tasks.login.signin.LoginUserTask;
import com.co.datacenter.tasks.maxi_chance.data_maxi_chance.DataMaxiChanceTask;
import com.co.datacenter.tasks.maxi_chance.maxi_chance_element_frame.MaxiChanceElementIframeTask;
import com.co.datacenter.tasks.select_bets.SelectBetTask;
import com.co.datacenter.tasks.super_astro.select_super_astro.SelectSuperAstroTask;
import com.co.datacenter.tasks.switch_iframe.SwitchToIframeTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import javax.xml.crypto.Data;

public class DataMaxiChanceDefinition {

    @Managed(driver = "Chrome")
    private WebDriver hisBrowser;
    private Actor user = Actor.named("user");
    @Before
    public void setUp(){
        user.can(BrowseTheWeb.with(hisBrowser));
    }



    @Given("^users wants to take a maxichance$")
    public void usersWantsToTakeAMaxichance() throws InterruptedException {
        user.wasAbleTo(
                OpenThePage.on(),
                LoginUserTask.on()
        );
        user.wasAbleTo(
                SecurityQuestionsTask.on(),
                SwitchToIframeTask.on(),
                SelectBetTask.on(),
                MaxiChanceElementIframeTask.on()
        );
    }


    @When("^He insert the data in the form$")
    public void heInsertTheDataInTheForm() {
        user.wasAbleTo(
                DataMaxiChanceTask.on()
        );
    }

    @Then("^He should sees the title Confirmación de compra$")
    public void heShouldSeesTheTitleConfirmaciónDeCompra() {
        System.out.println("El titulo de validacion es Confirmacion de compra ?" +
                " \n El titulo es : " + DataMaxiChanceQuestion.dataMaxiChance().answeredBy(user));
    }

}
