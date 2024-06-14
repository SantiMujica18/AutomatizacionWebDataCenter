package com.co.datacenter.stepsdefinitions.login.validation_of_empty_login_fields;



import com.co.datacenter.questions.login.validation_of_empty_login_fields.EmptyLoginFieldsQuestion;
import com.co.datacenter.tasks.login.validation_of_empty_login_fields.EmptyLoginFieldsTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class LoginEmptyFieldsStepDefinition {

    @Managed(driver = "chrome")

    private WebDriver hisBrowser;


    private Actor Sebas = Actor.named("Sebas");

    @Before
    public void setUp(){
        Sebas.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^Sebastian login with empty fields$")
    public void sebastianLoginWithEmptyFields() {
        Sebas.wasAbleTo(
                //OpenThePage.on()
        );
    }


    @When("^He doesn't fill in the form login$")
    public void heDoesnTFillInTheFormLogin() {
        Sebas.wasAbleTo(
                EmptyLoginFieldsTask.on()
        );
    }

    @Then("^He should sees the text El valor del campo es obligatorio$")
    public void heShouldSeesTheTextElValorDelCampoEsObligatorio() {
        System.out.println("Alerta de login no valido ?  \n el titulo de la alerta es: "+ EmptyLoginFieldsQuestion.emptyLoginFields().answeredBy(Sebas));
    }
}
