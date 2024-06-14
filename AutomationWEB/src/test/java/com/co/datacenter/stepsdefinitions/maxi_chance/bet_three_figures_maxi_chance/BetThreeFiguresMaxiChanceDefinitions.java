package com.co.datacenter.stepsdefinitions.maxi_chance.bet_three_figures_maxi_chance;

import com.co.datacenter.questions.maxi_chance.bet_three_figures_maxi_chance.BetThreeFiguresMaxiChanceQuestion;
import com.co.datacenter.tasks.OpenThePage;
import com.co.datacenter.tasks.login.security_questions_tasks.SecurityQuestionsTask;
import com.co.datacenter.tasks.login.signin.LoginUserTask;
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

public class BetThreeFiguresMaxiChanceDefinitions {

    @Managed(driver = "Chrome")

    private WebDriver hisBrowser;

    private Actor user = Actor.named("Sebas");


    @Before
    public void setUp(){
        user.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^Sebastian wants make  three figure a maxi chance$")
    public void sebastian_wants_make_three_figure_a_maxi_chance() throws InterruptedException {

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


    @When("^He makes three figure to maxi chance$")
    public void he_makes_three_figure_to_maxi_chance() {
        user.wasAbleTo(
                BetThreeFiguresMaxiChanceTask.on()

        );
    }

    @Then("^He should sees the text Pago exitoso$")
    public void he_should_sees_the_text_Pago_exitoso() {
        System.out.println("El titulo de validacion es Pago exitoso ? \n el titulo es :" + BetThreeFiguresMaxiChanceQuestion.betThreeFigure().answeredBy(user));

    }


}
