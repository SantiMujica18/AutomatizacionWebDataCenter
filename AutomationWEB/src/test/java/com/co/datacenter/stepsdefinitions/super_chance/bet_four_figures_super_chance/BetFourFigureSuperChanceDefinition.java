package com.co.datacenter.stepsdefinitions.super_chance.bet_four_figures_super_chance;


import com.co.datacenter.questions.super_chance.bet_four_super_chance.BetFourFigureSuperChanceQuestion;
import com.co.datacenter.tasks.login.signin.LoginUserTask;
import com.co.datacenter.tasks.OpenThePage;
import com.co.datacenter.tasks.select_bets.SelectBetTask;
import com.co.datacenter.tasks.super_chance.bet_four_super_chance.BetFourSuperChanceTask;
import com.co.datacenter.tasks.super_chance.confirm_super_chance.ConfirmSuperChanceTask;
import com.co.datacenter.tasks.super_chance.select_super_chance.SuperChanceElementIframeTask;
import com.co.datacenter.tasks.switch_iframe.SwitchToIframeTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class BetFourFigureSuperChanceDefinition {

    @Managed(driver = "Chrome")
    private WebDriver hisBrowser;
    private Actor Sebas = Actor.named("Sebas");
    @Before
    public void setUp(){
        Sebas.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^Sebastian wants make  four figure a super chance$")
    public void sebastianWantsMakeFourFigureASuperChance() throws InterruptedException {
        Sebas.wasAbleTo(
                OpenThePage.on(),
                LoginUserTask.on()
        );
        Thread.sleep(40000);

        Sebas.wasAbleTo(
                SelectBetTask.on(),
                SwitchToIframeTask.on(),
                SuperChanceElementIframeTask.on()
        );
    }

    @When("^He makes four figure to super chance$")
    public void heMakesFourFigureToSuperChance() {
        Sebas.attemptsTo(
                BetFourSuperChanceTask.on()
        );
    }

    @Then("^He should sees the text Pago exitoso$")
    public void heShouldSeesTheTextPagoExitoso() {
        System.out.println("Super chance realizado exitosamente ?  \n el titulo de confirmacion es: "+ BetFourFigureSuperChanceQuestion.betFourSuperChance().answeredBy(Sebas));

    }

}
