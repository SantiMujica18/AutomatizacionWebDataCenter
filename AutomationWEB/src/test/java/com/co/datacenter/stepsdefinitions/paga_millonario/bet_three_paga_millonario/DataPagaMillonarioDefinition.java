package com.co.datacenter.stepsdefinitions.paga_millonario.bet_three_paga_millonario;


import com.co.datacenter.questions.paga_millonario.data_paga_millonario.DataTwoPagaMillonarioQuestion;
import com.co.datacenter.tasks.OpenThePage;
import com.co.datacenter.tasks.login.security_questions_tasks.SecurityQuestionsTask;
import com.co.datacenter.tasks.login.signin.LoginUserTask;
import com.co.datacenter.tasks.paga_millonario.bet_three_paga_millonario.BetThreeOnePagePagaMillonarioTask;
import com.co.datacenter.tasks.paga_millonario.bet_three_paga_millonario.BetThreeTwoPagePagaMillonarioTask;
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

public class DataPagaMillonarioDefinition {

    @Managed(driver = "Chrome")
    private WebDriver hisBrowser;
    private Actor Sebas = Actor.named("Sebas");
    @Before
    public void setUp(){
        Sebas.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^Sebastian wants to take a paga millonario$")
    public void sebastianWantsToTakeAPagaMillonario() throws InterruptedException {
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
                BetThreeOnePagePagaMillonarioTask.on()
        );
    }


    @When("^He insert the data in the form$")
    public void heInsertTheDataInTheForm() {
        Sebas.wasAbleTo(
                BetThreeTwoPagePagaMillonarioTask.on()
        );
    }

    @Then("^He should sees the title Confirmación de compra$")
    public void heShouldSeesTheTitleConfirmaciónDeCompra() {
        System.out.println("Bienvenido a el servicio de paga millonario ?  \n el titulo de bievenida es: "+ DataTwoPagaMillonarioQuestion.dataPagesPagaMillonario().answeredBy(Sebas));

    }

    /*
    @Given("^Sebastian in the paga millonario  page$")
    public void sebastianInThePagaMillonarioPage() throws InterruptedException {
        Sebas.wasAbleTo(
                OpenThePage.on(),
                LoginUserTask.on()
        );
        Thread.sleep(50000);
        Sebas.wasAbleTo(
                SelectBetTask.on(),
                SwitchToIframeTask.on()
        );
    }

    @When("^He select paga millonario service$")
    public void heSelectPagaMillonarioService() {
        Sebas.wasAbleTo(
                SelectPagaMillonarioTask.on()
        );
    }

    @Then("^He should sees the title MI JUEGO$")
    public void heShouldSeesTheTitleMIJUEGO() {
        System.out.println("Bienvenido a el servicio de paga millonario ?  \n el titulo de bievenida es: "+ SelectPagaMillonarioQuestion.selectPagaMillonario().answeredBy(Sebas));

    }

     */

}
