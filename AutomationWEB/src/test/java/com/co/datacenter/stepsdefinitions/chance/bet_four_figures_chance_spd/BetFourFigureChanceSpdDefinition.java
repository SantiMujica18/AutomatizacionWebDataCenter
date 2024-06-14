package com.co.datacenter.stepsdefinitions.chance.bet_four_figures_chance_spd;

import com.co.datacenter.questions.chance.bet_four_figure_chance_spd.BetFourFigureChanceSpdQuestion;
import com.co.datacenter.tasks.OpenThePage;
import com.co.datacenter.tasks.chance.bet_four_figure_chance_spd.BetFourFigureSpdChanceTask;
import com.co.datacenter.tasks.chance.chance_element_iframe.ChanceElementIframeTask;
import com.co.datacenter.tasks.chance.confirm_chance.ConfirmChanceTask;
import com.co.datacenter.tasks.chance.data_chance_element_iframe.DataChanceElementIframeTask;
import com.co.datacenter.tasks.chance.validation_bet_same_number_chance.BetSameNumberChanceElementIframeTask;
import com.co.datacenter.tasks.chance.validation_of_add_game_chance.AddChanceElementIframeTask;
import com.co.datacenter.tasks.chance.validation_of_add_max_game_chance.AddMaxChanceElementIframeTask;
import com.co.datacenter.tasks.chance.validation_of_delete_game_chance.DeleteChanceElementIframeTask;
import com.co.datacenter.tasks.chance.validation_of_max_value_chance.MaxValueChanceElementIframeTask;
import com.co.datacenter.tasks.chance.validation_of_min_value_chance.MinValueChanceElementIframeTask;
import com.co.datacenter.tasks.login.security_questions2_tasks.SecurityQuestions2Task;
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

public class BetFourFigureChanceSpdDefinition {

    @Managed(driver = "Chrome")
    private WebDriver hisBrowser;
    private Actor user = Actor.named("Sebas");
    @Before
    public void setUp(){
        user.can(BrowseTheWeb.with(hisBrowser));
    }


    @Given("^Sebastian wants make  four figure a chance$")
    public void sebastianWantsMakeFourFigureAChance() throws InterruptedException {
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


    @When("^He makes four figure to chance$")
    public void heMakesFourFigureToChance()  {
       user.wasAbleTo(
               BetFourFigureSpdChanceTask.on()
       );
    }

    @Then("^He should sees the text Pago exitoso$")
    public void heShouldSeesTheTextPagoExitoso() {
        System.out.println("Chance realizado exitosamente ?  \n el titulo de confirmacion es: "+ BetFourFigureChanceSpdQuestion.betFourFigureChance().answeredBy(user));
    }


    @Given("^Sebastian wants to confirm a chance$")
    public void sebastianWantsToConfirmAChance() throws InterruptedException {
        user.wasAbleTo(
                OpenThePage.on(),
                LoginUserTask.on()
        );
        Thread.sleep(40000);

        user.wasAbleTo(
                SwitchToIframeTask.on(),
                SelectBetTask.on(),
                ChanceElementIframeTask.on(),
                MinValueChanceElementIframeTask.on(),
                MaxValueChanceElementIframeTask.on(),
                DeleteChanceElementIframeTask.on(),
                DeleteChanceElementIframeTask.on(),
                BetSameNumberChanceElementIframeTask.on(),
                DeleteChanceElementIframeTask.on(),
                AddMaxChanceElementIframeTask.on(),
                DeleteChanceElementIframeTask.on(),
                DeleteChanceElementIframeTask.on(),
                AddChanceElementIframeTask.on(),
                DeleteChanceElementIframeTask.on(),
                DataChanceElementIframeTask.on(),
                ConfirmChanceTask.on()


        );
    }


    @When("^He confirm the chance$")
    public void heConfirmTheChance() {
        user.wasAbleTo(
                ConfirmChanceTask.on()
        );
    }

    @Then("^He should sees the title Pago exitoso$")
    public void heShouldSeesTheTitlePagoExitoso() {
       // System.out.println("Chance realizado exitosamente ?  \n el titulo de confirmacion es: "+ BetFourFigureChanceSpcQuestion.betFourFigureChanceSp.answeredBy(user));
    }




}
