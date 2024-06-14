package com.co.datacenter.stepsdefinitions.recargas_app.select_recharge;

import com.co.datacenter.tasks.OpenThePage;
import com.co.datacenter.tasks.login.security_questions_tasks.SecurityQuestionsTask;
import com.co.datacenter.tasks.login.signin.LoginUserTask;
import com.co.datacenter.tasks.recargas_app.SeeBalanceTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class SelectRechargeAppDefinition {
    @Managed(driver = "chrome")

    private WebDriver hisBrowser;

    private Actor Sebas = Actor.named("Sebastian");

    @Before
    public void setUp() {
        Sebas.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^I'm on the main page of paga todo$")
    public void iMOnTheMainPageOfPagaTodo() {
        Sebas.wasAbleTo(
                OpenThePage.on(),
                LoginUserTask.on(),
                SecurityQuestionsTask.on()
        );
    }


    @When("^I click in my balance$")
    public void iClickInMyBalance() {
        Sebas.wasAbleTo(
                SeeBalanceTask.on()
        );

    }

    @Then("^User should sees page of saldo virtual$")
    public void userShouldSeesPageOfSaldoVirtual() {
    }
}
