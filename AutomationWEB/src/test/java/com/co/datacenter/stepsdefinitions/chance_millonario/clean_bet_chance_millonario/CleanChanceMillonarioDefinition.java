package com.co.datacenter.stepsdefinitions.chance_millonario.clean_bet_chance_millonario;


import com.co.datacenter.questions.chance_millonario.clean_chance_millonario.CleanChanceMillonarioQuestion;
import com.co.datacenter.tasks.OpenThePage;
import com.co.datacenter.tasks.chance_millonario.clean_chance_millonario.CleanBetChanceMillonarioTask;
import com.co.datacenter.tasks.chance_millonario.data_chance_millonario.DataOneChanceMillonarioTask;
import com.co.datacenter.tasks.chance_millonario.data_chance_millonario.DataTwoChanceMillonarioTask;
import com.co.datacenter.tasks.chance_millonario.select_chance_millonario.SelectChanceMillonarioTask;
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

public class CleanChanceMillonarioDefinition {

    @Managed(driver = "Chrome")
    private WebDriver hisBrowser;
    private Actor Sebas = Actor.named("Sebas");
    @Before
    public void setUp(){
        Sebas.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^Sebastian wants to clean a bet$")
    public void sebastianWantsToCleanABet()  {

     }

    @When("^He cleanes the bet$")
    public void heCleanesTheBet() {
        Sebas.wasAbleTo(
            CleanBetChanceMillonarioTask.on()
        );
    }

    @Then("^He should sees the class change to next button$")
    public void heShouldSeesTheClassChangeToNextButton() {
        System.out.println("El estado del boton es bloqueado ? \n : "+ CleanChanceMillonarioQuestion.cleanChanceMillonario.answeredBy(Sebas));

    }

}
