package com.co.datacenter.stepsdefinitions.paga_triple.bet_paga_triple;

import com.co.datacenter.questions.paga_millonario.data_paga_millonario.DataTwoPagaMillonarioQuestion;
import com.co.datacenter.questions.paga_triple.data_paga_triple.DataOnePagaTripleQuestion;
import com.co.datacenter.tasks.OpenThePage;
import com.co.datacenter.tasks.login.security_questions_tasks.SecurityQuestionsTask;
import com.co.datacenter.tasks.login.signin.LoginUserTask;
import com.co.datacenter.tasks.paga_triple.select_paga_triple.SelectPagaTripleTask;
import com.co.datacenter.tasks.paga_triple.bet_paga_triple.BetThreeNumberOfTwoFigurePagaTripleTask;
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

public class DataPagaTripleDefinition {

    @Managed(driver = "Chrome")
    private WebDriver hisBrowser;
    private Actor user = Actor.named("user");
    @Before
    public void setUp(){
        user.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^user wants make three number of two figure on paga triple$")
    public void userWantsMakeThreeNumberOfTwoFigureOnPagaTriple() throws InterruptedException {
        user.wasAbleTo(
                OpenThePage.on(),
                LoginUserTask.on()
        );

        Thread.sleep(30000);
        user.wasAbleTo(
                SecurityQuestionsTask.on()
        );

        Thread.sleep(2000);
        user.wasAbleTo(

                SwitchToIframeTask.on(),
                SelectBetTask.on(),
                SelectPagaTripleTask.on()
        );

    }


    @When("^He makes three number of two figure on paga triple$")
    public void heMakesThreeNumberOfTwoFigureOnPagaTriple() throws InterruptedException{
        Thread.sleep(10000);

        user.wasAbleTo(
                BetThreeNumberOfTwoFigurePagaTripleTask.on()
        );
    }

    @Then("^He should sees the title Confirmación de compra$")
    public void heShouldSeesTheTextPagoExitoso() {
        System.out.println("El titulo de validacion es: \n " + DataOnePagaTripleQuestion.DataOnePagaTriple().answeredBy(user));;

    }

}
