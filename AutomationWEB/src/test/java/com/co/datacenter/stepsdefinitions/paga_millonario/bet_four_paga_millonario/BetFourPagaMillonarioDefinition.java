package com.co.datacenter.stepsdefinitions.paga_millonario.bet_four_paga_millonario;


import com.co.datacenter.questions.paga_millonario.data_paga_millonario.DataTwoPagaMillonarioQuestion;
import com.co.datacenter.tasks.OpenThePage;
import com.co.datacenter.tasks.login.security_questions_tasks.SecurityQuestionsTask;
import com.co.datacenter.tasks.login.signin.LoginUserTask;
import com.co.datacenter.tasks.paga_millonario.bet_four_paga_millonario.BetFourOnePagePagaMillonarioTask;
import com.co.datacenter.tasks.paga_millonario.bet_four_paga_millonario.BetFourTwoPagePagaMillonarioTask;
import com.co.datacenter.tasks.paga_millonario.bet_three_paga_millonario.BetThreeOnePagePagaMillonarioTask;
import com.co.datacenter.tasks.paga_millonario.confirm_buy_paga_millonario.ConfirmPagaMillonarioTask;
import com.co.datacenter.tasks.paga_millonario.select_paga_millonario.SelectPagaMillonarioTask;
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

public class BetFourPagaMillonarioDefinition {

    @Managed(driver = "Chrome")
    private WebDriver hisBrowser;
    private Actor Sebas = Actor.named("Sebas");
    @Before
    public void setUp(){
        Sebas.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^Sebastian wants make  four figure a paga millonario$")
    public void sebastianWantsMakeFourFigureAPagaMillonario() throws InterruptedException {
        Sebas.wasAbleTo(
                OpenThePage.on(),
                LoginUserTask.on(),
                SecurityQuestionsTask.on()

        );
        Thread.sleep(50000);
        Sebas.wasAbleTo(
                SelectBetTask.on(),
                SwitchToIframeTask.on(),
                SelectPagaMillonarioTask.on()
        );

        Thread.sleep(4000);

        Sebas.wasAbleTo(
                BetFourOnePagePagaMillonarioTask.on()
        );

    }

    @When("^He makes four figure to paga millonario$")
    public void heMakesFourFigureToPagaMillonario() {
        Sebas.wasAbleTo(
                BetFourTwoPagePagaMillonarioTask.on()
        );
    }

    @Then("^He should sees the text Pago exitoso$")
    public void heShouldSeesTheTextPagoExitoso() {
        System.out.println("El titulo de validacion es: \n " + DataTwoPagaMillonarioQuestion.dataPagesPagaMillonario().answeredBy(Sebas));
    }


}
