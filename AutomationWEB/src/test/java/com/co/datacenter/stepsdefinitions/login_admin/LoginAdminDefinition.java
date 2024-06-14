package com.co.datacenter.stepsdefinitions.login_admin;

import com.co.datacenter.questions.admin.login_admin.LoginAdminQuestion;
import com.co.datacenter.tasks.admin.openthepageadmin.OpenThePageAdmin;
import com.co.datacenter.tasks.admin.login_admin.ClickBtnGetIntoTask;
import com.co.datacenter.tasks.admin.login_admin.LoginAdminTask;

import com.co.datacenter.tasks.switch_iframe.SwitchToIframeTask;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;

public class LoginAdminDefinition {

    //Declaramos el driver que sera administrado
    @Managed(driver = "Chrome")

    //Declaramos el WebDriver
    private WebDriver hisBrowser;

    //Declaramos el actor que realizara las interacciones
    private Actor Sebas = Actor.named("Sebas");


    @Before
    public void setUp(){
        Sebas.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^that I'm on the login page$")
    public void thatIMOnTheLoginPage() {
        Sebas.wasAbleTo(
                OpenThePageAdmin.open()
        );
    }


    @When("^I enter my username and password$")
    public void iEnterMyUsernameAndPassword() {
        Sebas.wasAbleTo(
                LoginAdminTask.on()
        );
    }

    @When("^I click on the ingresar button$")
    public void iClickOnTheButton() {
        Sebas.wasAbleTo(
                ClickBtnGetIntoTask.on(),
                SwitchToIframeTask.on()
        );
    }

    @Then("^you should see the home page Bienvenido$")
    public void youShouldSeeTheHomePageBienvenido() {
        System.out.println("El actor observara el titulo de Bienvenido ? \n " + LoginAdminQuestion.loginAdminSuccessful().answeredBy(Sebas));
    }


}
