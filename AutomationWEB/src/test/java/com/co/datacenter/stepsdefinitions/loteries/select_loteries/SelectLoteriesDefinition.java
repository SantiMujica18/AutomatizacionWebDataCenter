package com.co.datacenter.stepsdefinitions.loteries.select_loteries;


import com.co.datacenter.questions.chance.select_chance.SelectChanceQuestion;
import com.co.datacenter.questions.loteries.select_loteries.SelectLoteriesQuestion;
import com.co.datacenter.tasks.OpenThePage;
import com.co.datacenter.tasks.chance.chance_element_iframe.ChanceElementIframeTask;
import com.co.datacenter.tasks.login.signin.LoginUserTask;
import com.co.datacenter.tasks.loteries.select_loteries.SelectLoteriesTask;
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

public class SelectLoteriesDefinition {

    @Managed(driver = "Chrome")
    private WebDriver hisBrowser;
    private Actor Sebas = Actor.named("Sebas");
    @Before
    public void setUp(){
        Sebas.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^Sebastian in the loteries  page$")
    public void sebastianInTheLoteriesPage() throws InterruptedException {
        Sebas.wasAbleTo(
                OpenThePage.on(),
                LoginUserTask.on()
        );
        Thread.sleep(40000);
        Sebas.wasAbleTo(
                SwitchToIframeTask.on()
        );
    }


    @When("^He select loteries service$")
    public void heSelectLoteriesService() {
        Sebas.wasAbleTo(
                SelectLoteriesTask.on()
        );
    }

    @Then("^He should sees the title MI JUEGO$")
    public void heShouldSeesTheTitleMIJUEGO() {
        System.out.println("Bienvenido a el servicio de loterias?  \n el titulo de bievenida es: "+ SelectLoteriesQuestion.selectLoteries().answeredBy(Sebas));

    }
    /*

    @Then("^He should sees the title MI JUEGO$")
    public void heShouldSeesTheTitleMIJUEGO() {
        System.out.println("Bienvenido a el servicio de chance ?  \n el titulo de bievenida es: "+ SelectChanceQuestion.selectChance().answeredBy(Sebas));
    }

     */

}
