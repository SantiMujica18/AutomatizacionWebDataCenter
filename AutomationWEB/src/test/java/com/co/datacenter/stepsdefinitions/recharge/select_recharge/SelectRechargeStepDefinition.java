package com.co.datacenter.stepsdefinitions.recharge.select_recharge;

import com.co.datacenter.questions.recharge.select_recharge.SelectRechargeQuestion;
import com.co.datacenter.tasks.login.signin.LoginUserTask;
import com.co.datacenter.tasks.OpenThePage;
import com.co.datacenter.tasks.recharge.select_recharge.SelectRechargeTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class SelectRechargeStepDefinition {

    @Managed(driver = "Chrome")
    private WebDriver hisBrowser;
    private Actor Sebas = Actor.named("Sebas");
    @Before
    public void setUp(){
        Sebas.can(BrowseTheWeb.with(hisBrowser));
    }


    @Given("^Sebastian in the recharge page$")
    public void sebastianInTheRechargePage() throws InterruptedException {
        Sebas.wasAbleTo(
                OpenThePage.on(),
                LoginUserTask.on()
        );
        Thread.sleep(40000);
    }

    @When("^He select recharge service$")
    public void heSelectRechargeService() {
        Sebas.wasAbleTo(
                SelectRechargeTask.on()
        );
    }

    @Then("^He should sees the title REALIZAR RECARGA$")
    public void heShouldSeesTheTitleRealizarRecarga() {
        System.out.println("Bienvenido a el servicio de recarga ?  \n el titulo de bievenida es: "+ SelectRechargeQuestion.selectRecharge().answeredBy(Sebas));
    }
}
