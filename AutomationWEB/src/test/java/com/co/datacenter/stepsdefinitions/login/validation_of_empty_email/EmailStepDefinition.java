package com.co.datacenter.stepsdefinitions.login.validation_of_empty_email;


import com.co.datacenter.questions.login.validation_of_empty_email.EmailQuestion;
import com.co.datacenter.tasks.login.validation_of_empty_email.EmailTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class EmailStepDefinition {

    @Managed(driver = "chrome")

    private WebDriver hisBrowser;


    private Actor Sebas = Actor.named("Sebas");

    @Before
    public void setUp(){
        Sebas.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^Sebastian login with empty email$")
    public void sebastianLoginWithEmptyEmail() {
        Sebas.wasAbleTo(
                //OpenThePage.on()
        );
    }

    @When("^he tries to log in without email$")
    public void heTriesToLogInWithoutEmail() {
        Sebas.wasAbleTo(
                EmailTask.on()
        );
    }

    @Then("^He should sees the title El valor del campo es obligatorio$")
    public void heShouldSeesTheTitleElValorDelCampoEsObligatorio() {
        System.out.println("Alerta de login no valido ?  \n el titulo de la alerta es: "+ EmailQuestion.emptyEmail().answeredBy(Sebas));
    }
}
