package com.co.datacenter.stepsdefinitions.chance_millonario.select_chance_millonario;


import com.co.datacenter.questions.chance.select_chance.SelectChanceQuestion;
import com.co.datacenter.questions.chance_millonario.select_chance_millonario.SelectChanceMillonarioQuestion;
import com.co.datacenter.tasks.OpenThePage;
import com.co.datacenter.tasks.chance.chance_element_iframe.ChanceElementIframeTask;
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
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class SelectChanceMillonarioDefinition {

    @Managed(driver = "Chrome")
    private WebDriver hisBrowser;
    private Actor Sebas = Actor.named("Sebas");
    @Before
    public void setUp(){
        Sebas.can(BrowseTheWeb.with(hisBrowser));
    }


    @Given("^Sebastian in the chance millonario  page$")
    public void sebastianInTheChanceMillonarioPage() throws InterruptedException {
        Sebas.wasAbleTo(
                OpenThePage.on(),
                LoginUserTask.on(),
                SecurityQuestionsTask.on()
        );

        Sebas.wasAbleTo(
                SecurityQuestionsTask.on()
        );

        Thread.sleep(10000);

        Sebas.wasAbleTo(
                SelectBetTask.on(),
                SwitchToIframeTask.on()
        );
    }

    @When("^He select chance millonario service$")
    public void heSelectChanceMillonarioService() {
        Sebas.wasAbleTo(
                SelectChanceMillonarioTask.on()
        );
    }

    @Then("^He should sees the title MI JUEGO$")
    public void heShouldSeesTheTitleMIJUEGO() {
        System.out.println("Bienvenido a el servicio de chance millonario ?  \n el titulo de bievenida es: "+ SelectChanceMillonarioQuestion.selectChanceMillonario().answeredBy(Sebas));

    }

}
