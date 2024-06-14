package com.co.datacenter.stepsdefinitions.maxi_chance.select_maxi_chance;


import com.co.datacenter.questions.maxi_chance.select_maxi_chance.SelectMaxiChanceQuestion;
import com.co.datacenter.tasks.OpenThePage;

import com.co.datacenter.tasks.login.security_questions2_tasks.SecurityQuestions2Task;
import com.co.datacenter.tasks.login.security_questions_tasks.SecurityQuestionsTask;
import com.co.datacenter.tasks.login.signin.LoginUserTask;
import com.co.datacenter.tasks.maxi_chance.maxi_chance_element_frame.MaxiChanceElementIframeTask;
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

public class SelectMaxiChanceDefinition {

    @Managed(driver = "Chrome")
    private WebDriver hisBrowser;
    private Actor user = Actor.named("user");

    @Before
    public void setUp() {
        user.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^Sebastian in the maxi chance  page$")
    public void sebastianInTheMaxiChancePage() throws InterruptedException {
        user.wasAbleTo(
                OpenThePage.on(),
                LoginUserTask.on()
        );
        user.wasAbleTo(
                SecurityQuestionsTask.on(),
                SwitchToIframeTask.on(),
                SelectBetTask.on()

        );
    }

    @When("^He select maxi chance service$")
    public void heSelectMaxiChanceService() {
        user.wasAbleTo(
                MaxiChanceElementIframeTask.on()
        );
    }

    @Then("^He should sees the title MI JUEGO$")
    public void heShouldSeesTheTitleMIJUEGO() {
        System.out.println("Bienvenido a el servicio de maxi chance ?  \n el titulo de bievenida es: " + SelectMaxiChanceQuestion.selectMaxiChance().answeredBy(user));
    }


}
