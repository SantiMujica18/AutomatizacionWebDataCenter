package com.co.datacenter.stepsdefinitions.login.validation_of_empty_terms;


import com.co.datacenter.questions.login.validation_of_empty_terms.EmptyTermsQuestion;
import com.co.datacenter.tasks.login.validation_of_empty_terms.EmptyTermsTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class EmptyTermsStepDefinition {

    @Managed(driver = "chrome")

    private WebDriver hisBrowser;


    private Actor Sebas = Actor.named("Sebas");

    @Before
    public void setUp(){
        Sebas.can(BrowseTheWeb.with(hisBrowser));
    }


    @Given("^Sebastian login with empty terms$")
    public void sebastianLoginWithEmptyTerms() {
        Sebas.wasAbleTo(
                //OpenThePage.on()
        );
    }

    @When("^he tries to log in without terms$")
    public void heTriesToLogInWithoutTerms() {
        Sebas.wasAbleTo(
                EmptyTermsTask.on()
        );
    }

    @Then("^He should sees the title Debes aceptar los términos y condiciones$")
    public void heShouldSeesTheTitleDebesAceptarLosTérminosYCondiciones() {
        System.out.println("Alerta de login no valido ?  \n el titulo de la alerta es: "+ EmptyTermsQuestion.emptyTerms().answeredBy(Sebas));
    }
}
