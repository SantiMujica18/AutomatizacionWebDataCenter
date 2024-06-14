package com.co.datacenter.stepsdefinitions.select_bets;


import com.co.datacenter.questions.select_bet.SelectBetQuestion;
import com.co.datacenter.tasks.login.signin.LoginUserTask;
import com.co.datacenter.tasks.OpenThePage;
import com.co.datacenter.tasks.select_bets.SelectBetTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class SelectBetsDefinition {

    @Managed(driver = "Chrome")
    private WebDriver hisBrowser;
    private Actor Sebas = Actor.named("Sebas");
    @Before
    public void setUp(){
        Sebas.can(BrowseTheWeb.with(hisBrowser));
    }


    @Given("^Sebastian in the bets  page$")
    public void sebastianInTheBetsPage() throws InterruptedException  {
        Sebas.wasAbleTo(
                OpenThePage.on(),
                LoginUserTask.on()
        );
        //Thread.sleep(10000);

    }


    @When("^He select bets service$")
    public void heSelectBetsService() {
        Sebas.wasAbleTo(
                SelectBetTask.on()
        );

    }

    @Then("^He should sees the title Prepárate para ganar$")
    public void heShouldSeesTheTitlePreparateParaGanar() {
        System.out.println("Bienvenido a el servicio de apuestas ?  \n el titulo de bievenida es: "+ SelectBetQuestion.selectBut().answeredBy(Sebas));
    }


}
