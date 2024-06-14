package com.co.datacenter.stepsdefinitions.login.validation_of_incorrect_data_login;


import com.co.datacenter.questions.login.validation_of_incorrect_data_login.IncorrectDataLoginQuestion;
import com.co.datacenter.tasks.login.validation_of_incorrect_data_login.IncorrectDataLoginTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class IncorrectDataLoginStepDefinition {

    @Managed(driver = "chrome")

    private WebDriver hisBrowser;


    private Actor Sebas = Actor.named("Sebas");

    @Before
    public void setUp(){
        Sebas.can(BrowseTheWeb.with(hisBrowser));
    }


    @Given("^Sebastian login with incorrect data$")
    public void sebastianLoginWithIncorrectData() {
        Sebas.wasAbleTo(
                //OpenThePage.on()
        );
    }


    @When("^He fills with incorrect data in the form login$")
    public void heFillsWithIncorrectDataInTheFormLogin() {
        Sebas.wasAbleTo(
                IncorrectDataLoginTask.on()
        );
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Then("^He should sees the text La cuenta o contraseña ingresada es incorrecta$")
    public void heShouldSeesTheTextLaCuentaOContraseñaIngresadaEsIncorrecta() {
        System.out.println("Alerta de login no valido ?  \n el titulo de la alerta es: "+ IncorrectDataLoginQuestion.incorrectData().answeredBy(Sebas));
    }
}
