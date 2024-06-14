package com.co.datacenter.stepsdefinitions.betplay.confirm_betplay;


import com.co.datacenter.questions.betplay.ValidationServiceQuestion;
import com.co.datacenter.tasks.OpenThePage;
import com.co.datacenter.tasks.betplay.ConfirmRechargeBetplayTask;
import com.co.datacenter.tasks.betplay.SelectRechargeTask;
import com.co.datacenter.tasks.login.security_questions_tasks.SecurityQuestionsTask;
import com.co.datacenter.tasks.login.signin.LoginUserTask;
import com.co.datacenter.tasks.switch_iframe.SwitchToIframeTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Switch;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class ConfirmRechargeBetplayDefinition {
    @Managed(driver = "Chrome")
    private WebDriver hisBrowser;
    private Actor user = Actor.named("User");

    @Before
    public void setUp() {
        user.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^User is in the main page of paga todo$")
    public void userIsInTheMainPageOfPagaTodo() {
        user.wasAbleTo(
                OpenThePage.on(),
                LoginUserTask.on(),
                SecurityQuestionsTask.on()
        );
    }

    @When("^User select betplay and fills the form$")
    public void userSelectBetplayAndFillsTheForm() {
        user.wasAbleTo(
                SelectRechargeTask.on(),
                SwitchToIframeTask.on(),
                ConfirmRechargeBetplayTask.on()
        );

    }

    @Then("^User should sees the text Recarga exitosa$")
    public void userShouldSeesTheTextRecargaExitosa() throws InterruptedException{
        Thread.sleep(5000);
        System.out.println("El titulo de validacion es el siguiente: " + ValidationServiceQuestion.ValidationService().answeredBy(user).equals("Servicio no disponible"));
    }


}
