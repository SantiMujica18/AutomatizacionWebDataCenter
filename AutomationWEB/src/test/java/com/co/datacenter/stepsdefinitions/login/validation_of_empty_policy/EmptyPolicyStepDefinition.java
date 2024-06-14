package com.co.datacenter.stepsdefinitions.login.validation_of_empty_policy;


import com.co.datacenter.questions.login.validation_of_empty_policy.EmptyPolicyQuestion;
import com.co.datacenter.tasks.login.validation_of_empty_policy.EmptyPolicyTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class EmptyPolicyStepDefinition {

    @Managed(driver = "chrome")

    private WebDriver hisBrowser;


    private Actor Sebas = Actor.named("Sebas");

    @Before
    public void setUp(){
        Sebas.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^Sebastian login with empty policy$")
    public void sebastianLoginWithEmptyPolicy() {
        Sebas.wasAbleTo(
                //OpenThePage.on()
        );
    }

    @When("^he tries to log in without policy$")
    public void heTriesToLogInWithoutPolicy() {
        Sebas.wasAbleTo(
                EmptyPolicyTask.on()
        );
    }

    @Then("^He should sees the title Debes aceptar la politica de tratamiento de datos Personales$")
    public void heShouldSeesTheTitleDebesAceptarLaPoliticaDeTratamientoDeDatosPersonales() {
        System.out.println("Alerta de login no valido ?  \n el titulo de la alerta es: "+ EmptyPolicyQuestion.emptyPolicy().answeredBy(Sebas));
    }
}
