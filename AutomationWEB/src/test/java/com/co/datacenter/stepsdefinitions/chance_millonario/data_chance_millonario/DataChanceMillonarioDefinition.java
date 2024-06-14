package com.co.datacenter.stepsdefinitions.chance_millonario.data_chance_millonario;



import com.co.datacenter.questions.chance_millonario.data_chance_millonario.DataTwoChanceMillonarioQuestion;
import com.co.datacenter.tasks.OpenThePage;

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
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.CompletableFuture;

import static net.serenitybdd.screenplay.actors.OnStage.aNewActor;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class DataChanceMillonarioDefinition {

    @Managed(driver = "Chrome")
    private WebDriver hisBrowser;
    private Actor Sebas = Actor.named("Sebas");
    @Before
    public void setUp(){
        Sebas.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^Sebastian wants to take a chance millonario$")
    public void sebastianWantsToTakeAChanceMillonario() throws InterruptedException {
        Sebas.wasAbleTo(

                OpenThePage.on(),
                LoginUserTask.on(),
                SecurityQuestionsTask.on()

        );

        Sebas.wasAbleTo(
                SwitchToIframeTask.on(),
                SelectBetTask.on(),
                SelectChanceMillonarioTask.on(),
                DataOneChanceMillonarioTask.on()
        );
    }

    @When("^He insert the data in the form$")
    public void heInsertTheDataInTheForm() {
        Sebas.wasAbleTo(
                DataTwoChanceMillonarioTask.on()
        );
    }

    @Then("^He should sees the title Confirmación de compra$")
    public void heShouldSeesTheTitleConfirmaciónDeCompra() {
        System.out.println("El titulo de validacion es : \n " + DataTwoChanceMillonarioQuestion.dataTwoChanceMillonario().answeredBy(Sebas));
    }


}
