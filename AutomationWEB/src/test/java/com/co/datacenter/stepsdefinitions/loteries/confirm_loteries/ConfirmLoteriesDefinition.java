package com.co.datacenter.stepsdefinitions.loteries.confirm_loteries;


import com.co.datacenter.questions.loteries.confirm_loteries.ConfirmLoteriesQuestion;
import com.co.datacenter.questions.loteries.data_loteries.DataThreePageQuestion;
import com.co.datacenter.tasks.OpenThePage;
import com.co.datacenter.tasks.login.security_questions_tasks.SecurityQuestionsTask;
import com.co.datacenter.tasks.login.signin.LoginUserTask;
import com.co.datacenter.tasks.loteries.confirm_loteries.ConfirmLoteriesTask;
import com.co.datacenter.tasks.loteries.data_loteries.DataOnePageTask;
import com.co.datacenter.tasks.loteries.data_loteries.DataThreePageTask;
import com.co.datacenter.tasks.loteries.data_loteries.DataTwoPageTask;
import com.co.datacenter.tasks.loteries.select_loteries.SelectLoteriesTask;
import com.co.datacenter.tasks.switch_iframe.SwitchToIframeTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class ConfirmLoteriesDefinition {

    @Managed(driver = "Chrome")
    private WebDriver hisBrowser;
    private Actor Sebas = Actor.named("Sebas");
    @Before
    public void setUp(){
        Sebas.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^Sebastian wants to confirm a loteries$")
    public void sebastianWantsToConfirmALoteries() throws InterruptedException {
        Sebas.wasAbleTo(
                OpenThePage.on(),
                LoginUserTask.on(),
                SecurityQuestionsTask.on()
        );
        Thread.sleep(40000);
        Sebas.wasAbleTo(
                SwitchToIframeTask.on(),
                SelectLoteriesTask.on()
        );

        Sebas.wasAbleTo(
                DataOnePageTask.on(),
                DataTwoPageTask.on(),
                DataThreePageTask.on()
        );
    }


    @When("^He confirm the lottery$")
    public void heConfirmTheLottery() {
        Sebas.wasAbleTo(
                ConfirmLoteriesTask.on()
        );
    }

    @Then("^He should sees the title Pago exitoso$")
    public void heShouldSeesTheTitlePagoExitoso() {
        System.out.println("El titulo de validacion de compra es Pago Exitoso ?  \n el titulo es: "+ ConfirmLoteriesQuestion.confirmLottery().answeredBy(Sebas));

    }

}
