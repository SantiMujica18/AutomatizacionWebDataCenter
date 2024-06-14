package com.co.datacenter.stepsdefinitions.pines.select_pines;

import com.co.datacenter.questions.pines.select_pines.SelectPinesQuestion;
import com.co.datacenter.tasks.OpenThePage;
import com.co.datacenter.tasks.login.signin.LoginUserTask;
import com.co.datacenter.tasks.pines.select_pines.SelectPinesTask;
import com.co.datacenter.tasks.select_bets.SelectBetTask;
import com.co.datacenter.tasks.switch_iframe.SwitchToIframeTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class SelectPayPinesDefinition {


    @Managed(driver = "chrome")

    private WebDriver hisBrowser;

    private Actor Sebas = Actor.named("Sebastian");

    @Before
    public void setUp(){
        Sebas.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^Sebastian in the pay pines page$")
    public void sebastianInThePayPinesPage() throws InterruptedException {
        Sebas.wasAbleTo(
                OpenThePage.on(),
                LoginUserTask.on()
        );
        Thread.sleep(40000);

    }


    @When("^He select pay pines service$")
    public void heSelectPayPinesService() {
        Sebas.wasAbleTo(
                SelectPinesTask.on(),
                SwitchToIframeTask.on()
        );
    }

    @Then("^He should sees the title Selecciona el$")
    public void heShouldSeesTheTitleSeleccionaEl() {
        System.out.println("El titulo de validacion es Selecciona el \n " + SelectPinesQuestion.selectPines().answeredBy(Sebas).equals("Selecciona el"));
    }


}
