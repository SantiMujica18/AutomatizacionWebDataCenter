package com.co.datacenter.stepsdefinitions.paga_triple.select_paga_triple;

import com.co.datacenter.questions.paga_triple.selec_paga_triple.SelectPagaTripleQuestion;
import com.co.datacenter.tasks.OpenThePage;
import com.co.datacenter.tasks.login.security_questions_tasks.SecurityQuestionsTask;
import com.co.datacenter.tasks.login.signin.LoginUserTask;
import com.co.datacenter.tasks.paga_triple.select_paga_triple.SelectPagaTripleTask;
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

public class SelectPagaTripleDefinition {

    @Managed(driver = "Chrome")
    private WebDriver hisBrowser;
    private Actor user = Actor.named("user");

    @Before
    public void setUp() {
        user.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^user is in paga triple  page$")
    public void userIsInPagaTriplePage() throws InterruptedException {
        user.wasAbleTo(
                OpenThePage.on(),
                LoginUserTask.on()
        );

        Thread.sleep(35000);
        user.wasAbleTo(
                SecurityQuestionsTask.on(),
                SwitchToIframeTask.on(),
                SelectBetTask.on()
        );

    }

    @When("^He select paga triple service$")
    public void heSelectPagaTripleService() throws InterruptedException {

        user.wasAbleTo(
                SelectPagaTripleTask.on()
        );
    }

    @Then("^He should sees the title MI JUEGO$")
    public void heShouldSeesTheTitleMIJUEGO() throws InterruptedException {
        Thread.sleep(10000);
        System.out.println("Bienvenido a el servicio de paga triple ?  \n el titulo de bievenida es: " + SelectPagaTripleQuestion.SelectPagaTriple().answeredBy(user));

    }

}

