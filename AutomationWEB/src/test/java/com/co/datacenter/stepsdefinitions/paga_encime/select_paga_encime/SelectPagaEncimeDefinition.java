package com.co.datacenter.stepsdefinitions.paga_encime.select_paga_encime;


import com.co.datacenter.questions.maxi_chance.select_maxi_chance.SelectMaxiChanceQuestion;
import com.co.datacenter.questions.paga_encime.select_paga_encime.SelectPagaEncimeQuestion;
import com.co.datacenter.tasks.OpenThePage;
import com.co.datacenter.tasks.login.security_questions_tasks.SecurityQuestionsTask;
import com.co.datacenter.tasks.login.signin.LoginUserTask;
import com.co.datacenter.tasks.maxi_chance.maxi_chance_element_frame.MaxiChanceElementIframeTask;
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

public class SelectPagaEncimeDefinition {

    @Managed(driver = "Chrome")
    private WebDriver hisBrowser;
    private Actor Sebas = Actor.named("Sebas");
    @Before
    public void setUp(){
        Sebas.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^Sebastian in the paga encime  page$")
    public void sebastianInThePagaEncimePage() throws InterruptedException {
        Sebas.wasAbleTo(
                OpenThePage.on(),
                LoginUserTask.on(),
                SecurityQuestionsTask.on(),
                SelectBetTask.on(),
                SwitchToIframeTask.on()
        );
    }
    @When("^He select paga encime service$")
    public void heSelectPagaEncimeService() {
        Sebas.wasAbleTo(
                SelectPagaEncimeTask.on()
        );
    }

    @Then("^He should sees the title MI JUEGO$")
    public void heShouldSeesTheTitleMIJUEGO() {
        System.out.println("Bienvenido a el servicio de paga encime ?  \n el titulo de bievenida es: "+ SelectPagaEncimeQuestion.selectPagaEncime().answeredBy(Sebas));

    }

}
