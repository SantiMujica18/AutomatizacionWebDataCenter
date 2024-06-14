package com.co.datacenter.stepsdefinitions.data_admin;

import com.co.datacenter.questions.admin.data_admin.DataAdminQuestion;
import com.co.datacenter.questions.admin.select_admin.SelectClenaBalanceQuestion;
import com.co.datacenter.tasks.SelectCleanBalanceTask;
import com.co.datacenter.tasks.admin.SelectSectionAdminTask;
import com.co.datacenter.tasks.admin.SelectSetionSettingTask;
import com.co.datacenter.tasks.admin.admin_data.*;
import com.co.datacenter.tasks.admin.login_admin.ClickBtnGetIntoTask;
import com.co.datacenter.tasks.admin.login_admin.LoginAdminTask;
import com.co.datacenter.tasks.admin.openthepageadmin.OpenThePageAdmin;
import com.co.datacenter.tasks.switch_iframe.SwitchToIframeTask;
import com.co.datacenter.userinterfaces.admin.data_admin.DataAdminInterface;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.eo.Se;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.Switch;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class DataAdminDefinition {

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

    @Given("^Sebastian on the settings page$")
    public void sebastianOnTheSettingsPage() {
        Sebas.wasAbleTo(
                OpenThePageAdmin.open(),
                LoginAdminTask.on(),
                ClickBtnGetIntoTask.on(),
                SelectSectionAdminTask.on(),
                SelectSetionSettingTask.on(),
                SelectCleanBalanceTask.on()

        );
    }
    @When("^he enters the document number$")
    public void heEntersTheDocumentNumber() throws InterruptedException {
        Sebas.wasAbleTo(
                SwitchToIframeTask.on(),
                //ClickBtnProcessTask.on(),
                //Scroll.to(DataAdminInterface.SCROLL),
                //ClickBtnAlertTask.on(),
                //SwitchToIframeTask.on(),
                EnterDocumentTask.on());
                //ClickBtnProcessTask.on()


    }

    @When("^he cleans the document$")
    public void heCleansTheDocument() {
        Sebas.wasAbleTo(
                ClickBtnCleanTask.on(),
                EnterDocumentTask.on()
        );
    }


    @When("^he enters selects the type of adjustment$")
    public void heEntersSelectsTheTypeOfAdjustment() {
        Sebas.wasAbleTo(
                EnterSelectAdjustmentTask.on()
        );
    }
    @When("^he enters value adjustment$")
    public void heEntersValueAdjustment() {
        Sebas.wasAbleTo(
                EnterSettingaIncreasesTask.on()
        );
    }

    @When("^he enters the setting value$")
    public void heEntersTheSettingValue() {
        Sebas.wasAbleTo(
                EnterValueTask.on()
        );
    }

    @When("^he clicks the process button$")
    public void heClicksTheProcessButton() {
        Sebas.wasAbleTo(
                ClickBtnProcessTask.on()
        );
    }

    @Then("^he should see the title Change Successfully Done$")
    public void heShouldSeeTheTitleChangeSuccessfullyDone() {
        System.out.println("El titulo de validacion es Cambio Realizado exitosamente : \n " + DataAdminQuestion.dataAdminSuccessful().answeredBy(Sebas).equals("Cambio Realizado exitosamente"));

    }
}
