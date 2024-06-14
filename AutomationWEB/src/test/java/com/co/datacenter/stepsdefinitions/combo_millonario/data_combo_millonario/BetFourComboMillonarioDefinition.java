package com.co.datacenter.stepsdefinitions.combo_millonario.data_combo_millonario;


import com.co.datacenter.questions.combo_millonario.data_combo_millonario.DataTwoPageComboMillonarioQuestion;
import com.co.datacenter.questions.combo_millonario.select_combo_millonario.SelectComboMillonarioQuestion;
import com.co.datacenter.tasks.OpenThePage;
import com.co.datacenter.tasks.combo_millonario.data_combo_millonario.BetFourOnePageComboMillonarioTask;
import com.co.datacenter.tasks.combo_millonario.data_combo_millonario.BetFourTwoPageComboMillonarioTask;
import com.co.datacenter.tasks.combo_millonario.select_combo_millonario.SelectComboMillonarioTask;
import com.co.datacenter.tasks.login.security_questions_tasks.SecurityQuestionsTask;
import com.co.datacenter.tasks.login.signin.LoginUserTask;
import com.co.datacenter.tasks.paga_millonario.confirm_buy_paga_millonario.ConfirmPagaMillonarioTask;
import com.co.datacenter.tasks.select_bets.SelectBetTask;
import com.co.datacenter.tasks.switch_iframe.SwitchToIframeTask;
import com.co.datacenter.userinterfaces.combo_millonario.data_combo_millonario.DataTwoPageComboMillonarioInterface;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class BetFourComboMillonarioDefinition {

    @Managed(driver = "Chrome")
    private WebDriver hisBrowser;
    private Actor user = Actor.named("user");

    @Before
    public void setUp() {
        user.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^Sebastian wants make  four figure a combomillonario$")
    public void sebastianWantsMakeFourFigureACombomillonario() throws InterruptedException {
        user.wasAbleTo(
                OpenThePage.on(),
                LoginUserTask.on(),
                SecurityQuestionsTask.on(),
                SwitchToIframeTask.on(),
                SelectBetTask.on(),
                SelectComboMillonarioTask.on(),
                BetFourOnePageComboMillonarioTask.on()
        );
    }

    @When("^He makes four figure to combo millonario$")
    public void heMakesFourFigureToComboMillonario() {
        user.wasAbleTo(
                BetFourTwoPageComboMillonarioTask.on(),
                ConfirmPagaMillonarioTask.on()
        );
    }

    @Then("^He should sees the text Pago exitoso$")
    public void heShouldSeesTheTextPagoExitoso() {
       System.out.println("Bienvenido a el servicio de combo millonario ?  \n el titulo de bievenida es: " + DataTwoPageComboMillonarioQuestion.dataTwoPageComboMillonario().answeredBy(user));

    }

}
