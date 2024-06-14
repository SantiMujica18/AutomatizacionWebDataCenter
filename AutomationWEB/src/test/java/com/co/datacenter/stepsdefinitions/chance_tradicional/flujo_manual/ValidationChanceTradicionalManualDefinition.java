package com.co.datacenter.stepsdefinitions.chance_tradicional.flujo_manual;

import com.co.datacenter.questions.chance_tradicional.ChanceTradicionalQuestion;
import com.co.datacenter.tasks.OpenThePage;
import com.co.datacenter.tasks.chance_tradicional.flujo_aleatorio.*;
import com.co.datacenter.tasks.chance_tradicional.flujo_manual.IngresaApuestaTask;
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

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;

public class ValidationChanceTradicionalManualDefinition {
    @Managed(driver = "Chrome")
    private WebDriver hisBrowser;
    private Actor User = Actor.named("user");
    @Before
    public void setUp(){
        User.can(BrowseTheWeb.with(hisBrowser));
    }


    @Given("^El usuario se logea en paga todo app con su usuario \"([^\"]*)\" y su contrasena \"([^\"]*)\"$")
    public void elUsuarioSeLogeaEnPagaTodoAppConSuUsuarioYSuContrasena(String arg1, String arg2) {
        User.wasAbleTo(
                        OpenThePage.on(),
                        LoginUserTask.on(),
                        SecurityQuestionsTask.on(),
                        SelectBetTask.on()

                );
    }

    @When("^El usuario selecciona el juego de chance tradicional$")
    public void elUsuarioSeleccionaElJuegoDeChanceTradicional() {
        User.wasAbleTo(
                SwitchToIframeTask.on(),
                SelectServiceTask.on()
        );
    }

    @When("^el usuario selecciona una loteria$")
    public void elUsuarioSeleccionaUnaLoteria() {
        User.wasAbleTo(
                SeleccionarLoteriaTask.on()
        );
    }

    @When("^el usuario digita el numero de apuesta \"([^\"]*)\"$")
    public void elUsuarioDigitaElNumeroDeApuesta(String numero_apuesta) {
        User.wasAbleTo(
                IngresaApuestaTask.in(numero_apuesta)
        );
    }

    @When("^el usuario ingresa el valor de la apuesta directa \"([^\"]*)\"$")
    public void elUsuarioIngresaElValorDeLaApuestaDirecta(String valor_apuesta) {
        User.wasAbleTo(
                SwitchToIframeTask.on(),
                IngresaValorTask.in(valor_apuesta)
        );
    }

    @When("^el usuario valida el resumen de la apuesta$")
    public void elUsuarioValidaElResumenDeLaApuesta() {
        User.wasAbleTo(
                ResumenApuestaTask.on()
        );
    }

    @When("^el usuario paga la apuesta$")
    public void elUsuarioPagaLaApuesta() {
        User.wasAbleTo(
                PagarApuestaTask.on()
        );
    }

    @Then("^El usuario debera ver el titulo Pago exitoso$")
    public void elUsuarioDeberaVerElTituloPagoExitoso() {
        User.should(
                seeThat("El titulo de validacion de pago exitoso se encuentra visible",
                        ChanceTradicionalQuestion.validacionPago(),
                        is(true))
        );
    }
    }


