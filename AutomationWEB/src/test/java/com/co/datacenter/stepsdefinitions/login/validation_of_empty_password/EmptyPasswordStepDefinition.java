package com.co.datacenter.stepsdefinitions.login.validation_of_empty_password;

import com.co.datacenter.questions.login.validation_of_empty_password.EmptyPasswordQuestion;
import com.co.datacenter.tasks.login.validation_of_empty_password.EmptyPasswordTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class EmptyPasswordStepDefinition {

    @Managed(driver = "chrome")

    private WebDriver hisBrowser;


    private Actor Sebas = Actor.named("Sebas");

    @Before
    public void setUp(){
        Sebas.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^Sebastian login with empty password$")
    public void sebastianLoginWithEmptyPassword() {
        Sebas.wasAbleTo(
                //OpenThePage.on()
        );
    }


    @When("^he tries to log in without password$")
    public void heTriesToLogInWithoutPassword() {
        Sebas.wasAbleTo(
                EmptyPasswordTask.on()
        );
    }

    @Then("^He should sees the massage El valor del campo es obligatorio$")
    public void heShouldSeesTheMassageElValorDelCampoEsObligatorio() {
        System.out.println("Alerta de login no valido ?  \n el titulo de la alerta es: "+ EmptyPasswordQuestion.emptyPassword().answeredBy(Sebas));
    }
}
