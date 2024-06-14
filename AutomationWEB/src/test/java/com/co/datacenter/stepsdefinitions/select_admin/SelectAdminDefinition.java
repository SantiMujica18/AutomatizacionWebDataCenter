package com.co.datacenter.stepsdefinitions.select_admin;

import com.co.datacenter.questions.admin.select_admin.SelectClenaBalanceQuestion;
import com.co.datacenter.tasks.SelectCleanBalanceTask;
import com.co.datacenter.tasks.admin.SelectSectionAdminTask;
import com.co.datacenter.tasks.admin.SelectSetionSettingTask;
import com.co.datacenter.tasks.admin.login_admin.ClickBtnGetIntoTask;
import com.co.datacenter.tasks.admin.openthepageadmin.OpenThePageAdmin;
import com.co.datacenter.tasks.admin.login_admin.LoginAdminTask;
import com.co.datacenter.tasks.switch_iframe.SwitchToIframeTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class SelectAdminDefinition {

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


    @Given("^Sebastian on the home page$")
    public void sebastianOnTheHomePage() {
        Sebas.wasAbleTo(
                OpenThePageAdmin.open(),
                LoginAdminTask.on(),
                ClickBtnGetIntoTask.on()
        );
    }

    @When("^He clicks on administration$")
    public void heClicksOnAdministration() {
        Sebas.wasAbleTo(
                SelectSectionAdminTask.on()
        );
    }

    @When("^He clicks on the settings section$")
    public void heClicksOnTheSettingsSection() {
        Sebas.wasAbleTo(
                SelectSetionSettingTask.on()
        );
    }

    @When("^He clicks on the delete balances section$")
    public void heClicksOnTheDeleteBalancesSection() {
        Sebas.wasAbleTo(
                SelectCleanBalanceTask.on(),
                SwitchToIframeTask.on()
        );
    }

    @Then("^He should then see the balance clear page$")
    public void heShouldThenSeeTheBalanceClearPage() {
        System.out.println("El titulo de validacion es Borrado de Saldos : \n " + SelectClenaBalanceQuestion.titleCleanBalance().answeredBy(Sebas).equals("Borrado de Saldos"));
    }


}
