package com.co.datacenter.stepsdefinitions.chance.bet_three_figures_chance_una;

import com.co.datacenter.questions.chance.bet_three_figure_chance_una.BetThreeFigureChanceUnaQuestion;
import com.co.datacenter.tasks.OpenThePage;
import com.co.datacenter.tasks.chance.bet_three_figure_chance_una.BetThreeFigureUnaChanceTask;
import com.co.datacenter.tasks.chance.chance_element_iframe.ChanceElementIframeTask;
import com.co.datacenter.tasks.login.security_questions_tasks.SecurityQuestionsTask;
import com.co.datacenter.tasks.login.signin.LoginUserTask;
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

public class BetThreeFigureChanceUnaDefinition {

    @Managed(driver = "Chrome")
    private WebDriver hisBrowser;
    private Actor user = Actor.named("Sebas");
    @Before
    public void setUp(){
        user.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^Sebastian wants make  three figure a chance una$")
    public void sebastianWantsMakeThreeFigureAChanceUna() throws InterruptedException {

        user.wasAbleTo(
                OpenThePage.on(),
                LoginUserTask.on()
        );
        Thread.sleep(30000);

        user.wasAbleTo(
                SecurityQuestionsTask.on(),
                SwitchToIframeTask.on(),
                SelectBetTask.on(),
                ChanceElementIframeTask.on()

        );
    }


    @When("^He makes three figure to chance una$")
    public void heMakesThreeFigureToChanceUna() {
        user.wasAbleTo(
                BetThreeFigureUnaChanceTask.on()
        );


    }

    @Then("^He should sees the text Pago exitoso$")
    public void heShouldSeesTheTextPagoExitoso() {
        System.out.println("Chance realizado exitosamente ?  \n el titulo de confirmacion es: "+ BetThreeFigureChanceUnaQuestion
                .betThreeFigureUnaChance().answeredBy(user));
    }





}
