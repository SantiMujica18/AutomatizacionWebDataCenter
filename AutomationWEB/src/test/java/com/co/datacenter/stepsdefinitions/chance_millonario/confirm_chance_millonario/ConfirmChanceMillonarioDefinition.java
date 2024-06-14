package com.co.datacenter.stepsdefinitions.chance_millonario.confirm_chance_millonario;


import com.co.datacenter.questions.chance.confirm_chance.ConfirmChanceQuestion;
import com.co.datacenter.questions.chance_millonario.confirm_chance_millonario.ConfirmChanceMillonarioQuestion;
import com.co.datacenter.tasks.OpenThePage;
import com.co.datacenter.tasks.chance.bet_four_figure_chance_spd.BetFourFigureSpdChanceTask;
import com.co.datacenter.tasks.chance.bet_four_figures_chance_spc.BetFourFigureSpcChanceTask;
import com.co.datacenter.tasks.chance.bet_three_figure_chance_una.BetThreeFigureUnaChanceTask;
import com.co.datacenter.tasks.chance.bet_three_figures_chance_pc.BetThreeFigurePcChanceTask;
import com.co.datacenter.tasks.chance.bet_three_figures_chance_pd.BetThreeFigurePdChanceTask;
import com.co.datacenter.tasks.chance.bet_three_figures_chance_pta.BetThreeFigurePtaChanceTask;
import com.co.datacenter.tasks.chance.bet_three_figures_chance_pta.BtnAcceptChanceTask;
import com.co.datacenter.tasks.chance.chance_element_iframe.ChanceElementIframeTask;
import com.co.datacenter.tasks.chance.confirm_chance.ConfirmChanceTask;
import com.co.datacenter.tasks.chance.data_chance_element_iframe.DataChanceElementIframeTask;
import com.co.datacenter.tasks.chance.validation_bet_same_number_chance.BetSameNumberChanceElementIframeTask;
import com.co.datacenter.tasks.chance.validation_of_add_game_chance.AddChanceElementIframeTask;
import com.co.datacenter.tasks.chance.validation_of_add_max_game_chance.AddMaxChanceElementIframeTask;
import com.co.datacenter.tasks.chance.validation_of_delete_game_chance.DeleteChanceElementIframeTask;
import com.co.datacenter.tasks.chance.validation_of_max_value_chance.MaxValueChanceElementIframeTask;
import com.co.datacenter.tasks.chance.validation_of_min_value_chance.MinValueChanceElementIframeTask;
import com.co.datacenter.tasks.chance_millonario.confirm_chance_millonario.ConfirmChanceMillonarioTask;
import com.co.datacenter.tasks.chance_millonario.data_chance_millonario.DataOneChanceMillonarioTask;
import com.co.datacenter.tasks.chance_millonario.data_chance_millonario.DataTwoChanceMillonarioTask;
import com.co.datacenter.tasks.chance_millonario.select_chance_millonario.SelectChanceMillonarioTask;
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
import net.serenitybdd.screenplay.actions.Switch;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ConfirmChanceMillonarioDefinition {


    @Managed(driver = "Chrome")
    private WebDriver hisBrowser;
    private Actor Sebas = Actor.named("Sebas");


    @Before
    public void setUp(){Sebas.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^Sebastian wants to confirm a chance millonario$")
    public void sebastianWantsToConfirmAChanceMillonario() throws InterruptedException {
        Sebas.wasAbleTo(
                OpenThePage.on(),
                LoginUserTask.on(),
                SecurityQuestionsTask.on()
        );
        Sebas.wasAbleTo(
                SelectBetTask.on(),
                SwitchToIframeTask.on(),
                SelectChanceMillonarioTask.on(),
                DataOneChanceMillonarioTask.on(),
                DataTwoChanceMillonarioTask.on()
        );
    }


    @When("^He confirm the chance millonario$")
    public void heConfirmTheChanceMillonario() {
        Sebas.wasAbleTo(
                ConfirmChanceMillonarioTask.on()
        );
    }

    @Then("^He should sees the title Pago exitoso$")
    public void heShouldSeesTheTitlePagoExitoso() throws InterruptedException{
        Thread.sleep(10000);
        System.out.println("Chance millonario realizado exitosamente ?  \n el titulo de confirmacion es: "+ ConfirmChanceMillonarioQuestion.confimrChanceMillonario().answeredBy(Sebas).equals("Pago exitoso"));

    }

}
