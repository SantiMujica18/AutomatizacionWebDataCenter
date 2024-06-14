package com.co.datacenter.stepsdefinitions.maxi_chance.bet_with_same_number_maxi_chance;

import com.co.datacenter.questions.maxi_chance.bet_the_same_number_maxi_chance.BetSameNumberMaxiChanceQuestion;
import com.co.datacenter.questions.maxi_chance.bet_three_figures_maxi_chance.BetThreeFiguresMaxiChanceQuestion;
import com.co.datacenter.tasks.OpenThePage;
import com.co.datacenter.tasks.login.security_questions_tasks.SecurityQuestionsTask;
import com.co.datacenter.tasks.login.signin.LoginUserTask;
import com.co.datacenter.tasks.maxi_chance.bet_same_number_maxi_chance.BetTheSameNumberMaxiChanceTask;
import com.co.datacenter.tasks.maxi_chance.bet_three_figures_maxi_chance.BetThreeFiguresMaxiChanceTask;
import com.co.datacenter.tasks.maxi_chance.confirm_maxi_chance.ConfirmMaxiChanceTask;
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

public class BetSameNumberMaxiChanceDefinitions {

    @Managed(driver = "Chrome")

    private WebDriver hisBrowser;

    private Actor user = Actor.named("user");


    @Before
    public void setUp(){
        user.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^Sebastian wants make  the same number a maxi chance$")
    public void sebastian_wants_make_the_same_number_a_maxi_chance() throws InterruptedException {

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


    @When("^He makes the same number to maxi chance$")
    public void he_makes_the_same_number_to_maxi_chance() throws InterruptedException {
        user.wasAbleTo(
                BetTheSameNumberMaxiChanceTask.on(),
                ConfirmMaxiChanceTask.on()
        );
        Thread.sleep(30000);
    }

    @Then("^He should sees the text No se pudo completar la transaccion$")
    public void he_should_sees_the_text_No_se_pudo_completar_la_transaccion() {
        System.out.println("El titulo de validacion  es :\n " + BetSameNumberMaxiChanceQuestion.betSameNumber().answeredBy(user));

    }

}
