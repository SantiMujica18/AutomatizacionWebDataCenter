package com.co.datacenter.stepsdefinitions.paga_encime.confirm_paga_encime;


import com.co.datacenter.questions.maxi_chance.confirm_maxi_chance.ConfirmMaxiChanceQuestion;
import com.co.datacenter.questions.paga_encime.confirm_paga_encime.ConfirmPagaEncimeQuestion;
import com.co.datacenter.questions.paga_encime.data_paga_encime.DataPagaEncimeQuestion;
import com.co.datacenter.tasks.OpenThePage;
import com.co.datacenter.tasks.login.security_questions_tasks.SecurityQuestionsTask;
import com.co.datacenter.tasks.login.signin.LoginUserTask;
import com.co.datacenter.tasks.paga_encime.confirm_paga_encime.ConfirmPagaEncimeTask;
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

public class ConfimPagaEncimeDefinition {

    @Managed(driver = "Chrome")
    private WebDriver hisBrowser;
    private Actor Sebas = Actor.named("Sebas");
    @Before
    public void setUp(){
        Sebas.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^Sebastian wants to confirm a paga encime$")
    public void sebastianWantsToConfirmAPagaEncime() throws InterruptedException {
        Sebas.wasAbleTo(
                OpenThePage.on(),
                LoginUserTask.on(),
                SecurityQuestionsTask.on(),
                SelectBetTask.on(),
                SwitchToIframeTask.on(),
                SelectPagaEncimeTask.on(),
                DataPagaEncimeTask.on()
        );
    }


    @When("^He confirm the paga encime$")
    public void heConfirmThePagaEncime() {
        Sebas.wasAbleTo(
                ConfirmPagaEncimeTask.on()
        );
    }

    @Then("^He should sees the title Pago exitoso$")
    public void heShouldSeesTheTitlePagoExitoso() throws InterruptedException{
        Thread.sleep(10000);

        System.out.println("El titulo de validacion es Pago exitoso ? \n el titulo es :" + ConfirmPagaEncimeQuestion.confirmPagaEncime().answeredBy(Sebas).equals("Pago exitoso"));

    }

}
