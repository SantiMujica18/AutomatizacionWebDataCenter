package com.co.datacenter.stepsdefinitions.login.validation_of_empty_briefcase;


import com.co.datacenter.questions.login.validation_of_empty_briefcase.BriefCaseQuestion;
import com.co.datacenter.tasks.login.validation_of_empty_briefcase.BriefCaseTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class BriefCaseStepDefinition {
    @Managed(driver = "chrome")

    private WebDriver hisBrowser;


    private Actor Sebas = Actor.named("Sebas");

    @Before
    public void setUp(){
        Sebas.can(BrowseTheWeb.with(hisBrowser));
    }



    @Given("^Sebastian login with empty briefcase$")
    public void sebastianLoginWithEmptyBriefcase() {

        Sebas.wasAbleTo(
                //OpenThePage.on()
        );
    }


    @When("^he tries to log in without briefcase$")
    public void heTriesToLogInWithoutBriefcase() {
            Sebas.wasAbleTo(
                    BriefCaseTask.on()
            );
    }

    @Then("^He should sees the title Debes aceptar el portafolio actual habilitado$")
    public void heShouldSeesTheTitleDebesAceptarElPortafolioActualHabilitado() {
        System.out.println("Alerta de login no valido ?  \n el titulo de la alerta es: "+ BriefCaseQuestion.emptyBrief().answeredBy(Sebas));
    }
}
