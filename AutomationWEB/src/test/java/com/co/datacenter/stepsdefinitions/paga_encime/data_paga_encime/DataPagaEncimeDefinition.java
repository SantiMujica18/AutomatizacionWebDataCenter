package com.co.datacenter.stepsdefinitions.paga_encime.data_paga_encime;


import com.co.datacenter.questions.maxi_chance.data_maxi_chance.DataMaxiChanceQuestion;
import com.co.datacenter.questions.paga_encime.data_paga_encime.DataPagaEncimeQuestion;
import com.co.datacenter.questions.paga_encime.select_paga_encime.SelectPagaEncimeQuestion;
import com.co.datacenter.tasks.OpenThePage;
import com.co.datacenter.tasks.login.security_questions_tasks.SecurityQuestionsTask;
import com.co.datacenter.tasks.login.signin.LoginUserTask;
import com.co.datacenter.tasks.paga_encime.data_paga_encime.DataPagaEncimeTask;
import com.co.datacenter.tasks.paga_encime.select_paga_encime.SelectPagaEncimeTask;
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

public class DataPagaEncimeDefinition {

    @Managed(driver = "Chrome")
    private WebDriver hisBrowser;
    private Actor Sebas = Actor.named("Sebas");
    @Before
    public void setUp(){
        Sebas.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^Sebastian wants to take a paga encime$")
    public void sebastianWantsToTakeAPagaEncime() throws InterruptedException {
        Sebas.wasAbleTo(
                OpenThePage.on(),
                LoginUserTask.on(),
                SecurityQuestionsTask.on(),
                SelectBetTask.on(),
                SwitchToIframeTask.on(),
                SelectPagaEncimeTask.on()
        );
    }


    @When("^He insert the data in the form$")
    public void heInsertTheDataInTheForm() {
        Sebas.wasAbleTo(
                DataPagaEncimeTask.on()
        );
    }

    @Then("^He should sees the title Confirmación de compra$")
    public void heShouldSeesTheTitleConfirmaciónDeCompra() {
        System.out.println("El titulo de validacion es Confirmacion de compra ?" +
                " \n El titulo es : " + DataPagaEncimeQuestion.dataPagaEncime().answeredBy(Sebas));
    }

}
