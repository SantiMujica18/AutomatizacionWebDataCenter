package com.co.datacenter.stepsdefinitions.recargas_app.confirm_recharge;

import com.co.datacenter.questions.recharge_app.ConfirmRechargeAppQuestion;
import com.co.datacenter.tasks.OpenThePage;
import com.co.datacenter.tasks.login.security_questions_tasks.SecurityQuestionsTask;
import com.co.datacenter.tasks.login.signin.LoginUserTask;
import com.co.datacenter.tasks.recargas_app.ConfirmPinTask;
import com.co.datacenter.tasks.recargas_app.SeeBalanceTask;
import com.co.datacenter.tasks.switch_iframe.SwitchToIframeTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class ConfirmRechargeDefinition {
    @Managed(driver = "chrome")

    private WebDriver hisBrowser;

    private Actor User = Actor.named("User");

    @Before
    public void setUp() {
        User.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^User is in saldo virtual page$")
    public void userIsInSaldoVirtualPage() {
        User.wasAbleTo(
                OpenThePage.on(),
                LoginUserTask.on(),
                SecurityQuestionsTask.on(),
                SeeBalanceTask.on(),
                SwitchToIframeTask.on()
        );

    }


    @When("^User clicks into recargar saldo and put a value of recharge$")
    public void userClicksIntoRecargarSaldoAndPutAValueOfRecharge() {
        User.wasAbleTo(
                ConfirmPinTask.on()
        );
    }

    @Then("^User should sees the text PIN Generado correctamente$")
    public void userShouldSeesTheTextPINGeneradoCorrectamente() throws InterruptedException {
        Thread.sleep(5000);
        System.out.println("El titulo de validacion es: PIN Generado correctamente \n" + ConfirmRechargeAppQuestion.confirmRecharge().answeredBy(User).equals("PIN Generado correctamente"));

    }

}
