package com.co.datacenter.stepsdefinitions.maxi_chance.bet_four_figures_maxi_chance;

import com.co.datacenter.questions.maxi_chance.bet_four_figures_maxi_chance.BetFourFiguresMaxiChanceQuestion;
import com.co.datacenter.questions.maxi_chance.bet_three_figures_maxi_chance.BetThreeFiguresMaxiChanceQuestion;
import com.co.datacenter.tasks.OpenThePage;
import com.co.datacenter.tasks.login.security_questions_tasks.SecurityQuestionsTask;
import com.co.datacenter.tasks.login.signin.LoginUserTask;
import com.co.datacenter.tasks.maxi_chance.bet_four_figures_maxi_chance.BetFourFiguresMaxiChanceTask;
import com.co.datacenter.tasks.maxi_chance.bet_three_figures_maxi_chance.BetThreeFiguresMaxiChanceTask;
import com.co.datacenter.tasks.maxi_chance.maxi_chance_element_frame.MaxiChanceElementIframeTask;
import com.co.datacenter.tasks.select_bets.SelectBetTask;
import com.co.datacenter.tasks.switch_iframe.SwitchToIframeTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.eo.Se;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class BetFourFiguresMaxiChanceDefinitions {

    @Managed(driver = "Chrome")

    private WebDriver hisBrowser;

    private Actor Sebas = Actor.named("Sebas");


    @Before
    public void setUp(){
        Sebas.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^Sebastian wants make  four figure a maxi chance$")
    public void sebastian_wants_make_four_figure_a_maxi_chance() throws InterruptedException {

        Sebas.wasAbleTo(
                OpenThePage.on(),
                LoginUserTask.on(),
                SecurityQuestionsTask.on()
        );

        Sebas.wasAbleTo(
                SelectBetTask.on(),
                SwitchToIframeTask.on(),
                MaxiChanceElementIframeTask.on()
        );
    }

    @When("^He makes four figure to maxi chance$")
    public void he_makes_four_figure_to_maxi_chance() {
        Sebas.wasAbleTo(
                BetFourFiguresMaxiChanceTask.on()
        );
    }

    @Then("^He should sees the text Pago exitoso$")
    public void he_should_sees_the_text_Pago_exitoso() {
        System.out.println("El titulo de validacion es Pago exitoso ? \n el titulo es :" + BetFourFiguresMaxiChanceQuestion.betFourFigure().answeredBy(Sebas));

    }


}
