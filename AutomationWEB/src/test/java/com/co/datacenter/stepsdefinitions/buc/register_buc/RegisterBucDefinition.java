package com.co.datacenter.stepsdefinitions.buc.register_buc;

import com.co.datacenter.questions.buc.EntryToTheDataRecordTableQuestions;
import com.co.datacenter.tasks.buc.OpenPageBUCTasks;
import com.co.datacenter.tasks.buc.login_buc.*;
import com.co.datacenter.tasks.buc.register_buc.FillsTheFormBucTask;
import com.co.datacenter.tasks.buc.register_buc.ValidationEmptyValuesTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class RegisterBucDefinition {
    @Managed(driver = "Chrome")
    private WebDriver hisBrowser;
    private final Actor user = Actor.named("user");

    @Before
    public void setUp() {
        user.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^User is in register page of buc$")
    public void userIsInRegisterPageOfBuc() {
        user.wasAbleTo(
                OpenPageBUCTasks.open()
        );
    }
    @When("^He fills the form of buc$")
    public void heFillsTheFormOfBuc() {
        user.wasAbleTo(
                LoginUserBucCCTask.on(),
                ValidationEmptyValuesTask.on(),
                FillsTheFormBucTask.on(),


                OpenPageBUCTasks.open(),
                LoginUserBucCETask.on(),
                ValidationEmptyValuesTask.on(),
                FillsTheFormBucTask.on(),


                OpenPageBUCTasks.open(),
                LoginUserBucPassportTask.on(),
                ValidationEmptyValuesTask.on(),
                FillsTheFormBucTask.on(),


                OpenPageBUCTasks.open(),
                LoginUserBucPEDPTask.on(),
                ValidationEmptyValuesTask.on(),
                FillsTheFormBucTask.on(),


                OpenPageBUCTasks.open(),
                LoginUserBucPPPTTask.on(),
                ValidationEmptyValuesTask.on(),
                FillsTheFormBucTask.on(),


                OpenPageBUCTasks.open(),
                LoginUserBucPEDPPEFDLFTask.on(),
                ValidationEmptyValuesTask.on(),
                FillsTheFormBucTask.on()
        );
    }

    @Then("^He should sees the tittle registro exitoso$")
    public void heShouldSeesTheTittleRegistroExitoso() {
        EntryToTheDataRecordTableQuestions.EntryToTheDataRecordTable().answeredBy(user);
        System.out.println("Acceso a buc correcto");
    }

}
