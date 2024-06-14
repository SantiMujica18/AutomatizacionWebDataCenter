package com.co.datacenter.stepsdefinitions.cupones;

import com.co.datacenter.tasks.OpenThePage;
import com.co.datacenter.tasks.cupones.CuponesInfoTask;
import com.co.datacenter.tasks.cupones.SelectCuponesTask;
import com.co.datacenter.tasks.login.security_questions_tasks.SecurityQuestionsTask;
import com.co.datacenter.tasks.login.signin.LoginUserTask;
import com.co.datacenter.tasks.switch_iframe.SwitchToIframeTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class SelectCuponesStep {
    @Managed(driver = "Chrome")
    private WebDriver hisBrowser;
    private Actor User = Actor.named("User");

    @Before
    public void setUp() {
        User.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^User wants to see all the cupons$")
    public void userWantsToSeeAllTheCupons() {
        User.wasAbleTo(
                OpenThePage.on(),
                LoginUserTask.on(),
                SecurityQuestionsTask.on()
        );
    }


    @When("^He clicks cupons services$")
    public void heClicksCuponsServices() {
        User.wasAbleTo(
                SelectCuponesTask.on(),
                SwitchToIframeTask.on(),
                CuponesInfoTask.on()
        );

    }

    @Then("^He shoulds sees the cupons page$")
    public void heShouldsSeesTheCuponsPage() {

    }
}
