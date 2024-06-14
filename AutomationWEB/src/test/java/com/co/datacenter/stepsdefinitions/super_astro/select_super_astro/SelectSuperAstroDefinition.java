package com.co.datacenter.stepsdefinitions.super_astro.select_super_astro;

import com.co.datacenter.questions.super_astro.select_super_astro.SelectSuperAstroQuestion;
import com.co.datacenter.tasks.OpenThePage;
import com.co.datacenter.tasks.login.signin.LoginUserTask;
import com.co.datacenter.tasks.select_bets.SelectBetTask;
import com.co.datacenter.tasks.super_astro.select_super_astro.SelectSuperAstroTask;
import com.co.datacenter.tasks.switch_iframe.SwitchToIframeTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;



public class SelectSuperAstroDefinition {

    @Managed(driver = "Chrome")
    private WebDriver hisBrowser;

    private Actor Sebas = Actor.named("Sebas");

    @Before
    public void setUp(){
        Sebas.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^Sebastian in the super astro  page$")
    public void sebastianInTheSuperAstroPage() throws InterruptedException {
        Sebas.wasAbleTo(
                OpenThePage.on(),
                LoginUserTask.on()
        );
        Thread.sleep(40000);

        Sebas.wasAbleTo(
                SelectBetTask.on(),
                SwitchToIframeTask.on()
        );
    }

    @When("^He select super astro service$")
    public void heSelectSuperAstroService() {
        Sebas.wasAbleTo(
                SelectSuperAstroTask.on()
        );
    }

    @Then("^He should sees the title MI JUEGO$")
    public void heShouldSeesTheTitleMIJUEGO() {
        System.out.println("Bienvenido a el servicio de super astro ?  \n el titulo de bievenida es: " + SelectSuperAstroQuestion.selectSuperAstro().answeredBy(Sebas));
    }


}
