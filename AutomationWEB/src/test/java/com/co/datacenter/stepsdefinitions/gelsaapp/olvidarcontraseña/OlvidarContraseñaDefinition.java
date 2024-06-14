package com.co.datacenter.stepsdefinitions.gelsaapp.olvidarcontraseña;

import com.co.datacenter.questions.admin.data_admin.DataAdminQuestion;
import com.co.datacenter.questions.chance.bet_four_figure_chance_spc.BetFourFigureChanceSpcQuestion;
import com.co.datacenter.questions.gelsaapp.olvidarcontraseña.OlvidarContraseñaQuestion;
import com.co.datacenter.tasks.SelectCleanBalanceTask;
import com.co.datacenter.tasks.admin.SelectSectionAdminTask;
import com.co.datacenter.tasks.admin.SelectSetionSettingTask;
import com.co.datacenter.tasks.admin.admin_data.*;
import com.co.datacenter.tasks.admin.login_admin.ClickBtnGetIntoTask;
import com.co.datacenter.tasks.admin.login_admin.LoginAdminTask;
import com.co.datacenter.tasks.admin.openthepageadmin.OpenThePageAdmin;
import com.co.datacenter.tasks.gelsaapp.olvidarcontraseña.*;
import com.co.datacenter.tasks.gelsaapp.openthepagegelsaapp.OpenThePageGelsaApp;
import com.co.datacenter.tasks.switch_iframe.SwitchToIframeTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.eo.Se;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class OlvidarContraseñaDefinition {

    //Declaramos el driver que sera administrado
    @Managed(driver = "Chrome")

    //Declaramos el WebDriver
    private WebDriver hisBrowser;

    //Declaramos el actor que realizara las interacciones
    private Actor Sebas = Actor.named("Sebas");


    @Before
    public void setUp() {
        Sebas.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^I am on the login page$")
    public void iAmOnTheLoginPage() {
        Sebas.wasAbleTo(
                OpenThePageGelsaApp.open()
        );
    }

    @When("^I select the Olvide clave$")
    public void iSelectTheOlvideClave() {
        Sebas.wasAbleTo(
                ClickOlvidarClaveTask.on()
        );

        Sebas.wasAbleTo(
                ValidateUserTask.on(),
                ClickBtnSolicitarTask.on(),
                ClickBtnCloseAlertTask.on()
        );
    }

    @When("^I provide my user \"([^\"]*)\"$")
    public void iProvideMyUser(String user) {
        if (user != null && !user.isEmpty()) {
            // Cargar la tarea UserIfRegisteredTask con el correo electrónico proporcionado desde el archivo credentials.properties
            UserIfRegisteredTask userTask = UserIfRegisteredTask.on();
            // Ejecutar la tarea con el correo electrónico cargado
            Sebas.attemptsTo(
                    userTask
                    // Puedes seguir agregando más acciones aquí si es necesario
            );

            Sebas.wasAbleTo(
                    ClickBtnSolicitarTask.on(),
                    ClickBtnSendYesTask.on()
            );
        }
    }

    @Then("^Then I should receive a token in my email$")
    public void thenIShouldReceiveaTokenInMyEmail() {
        System.out.println("el titulo de confirmacion es: "+ OlvidarContraseñaQuestion.OlvidarClave().answeredBy(Sebas));
    }

}