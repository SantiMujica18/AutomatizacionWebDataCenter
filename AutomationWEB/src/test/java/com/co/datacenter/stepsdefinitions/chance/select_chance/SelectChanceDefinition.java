package com.co.datacenter.stepsdefinitions.chance.select_chance;


import com.co.datacenter.questions.chance.select_chance.SelectChanceQuestion;
import com.co.datacenter.tasks.login.security_questions2_tasks.SecurityQuestions2Task;
import com.co.datacenter.tasks.login.signin.LoginUserTask;
import com.co.datacenter.tasks.OpenThePage;
import com.co.datacenter.tasks.chance.chance_element_iframe.ChanceElementIframeTask;
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

public class SelectChanceDefinition {

    @Managed(driver = "Chrome")
    private WebDriver hisBrowser;
    private Actor user = Actor.named("user");
    @Before
    public void setUp(){
        user.can(BrowseTheWeb.with(hisBrowser));
    }


    @Given("^Sebastian in the chance  page$")
    public void sebastianInTheChancePage() throws InterruptedException {
        user.wasAbleTo(
                OpenThePage.on(),
                LoginUserTask.on()
        );
        Thread.sleep(30000);
        user.wasAbleTo(
                SecurityQuestions2Task.on(),
                SwitchToIframeTask.on(),
                SelectBetTask.on()
        );
    }


    @When("^He select chance service$")
    public void heSelectChanceService() {
        user.wasAbleTo(
                ChanceElementIframeTask.on()
        );
    }

    @Then("^He should sees the title MI JUEGO$")
    public void heShouldSeesTheTitleMIJUEGO() {
        System.out.println("Bienvenido a el servicio de chance ?  \n el titulo de bievenida es: "+ SelectChanceQuestion.selectChance().answeredBy(user));
    }

}
