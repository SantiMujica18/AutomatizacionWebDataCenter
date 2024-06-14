package com.co.datacenter.stepsdefinitions.buc.register_buc;

import com.co.datacenter.questions.buc.EntryToTheDataRecordTableQuestions;
import com.co.datacenter.tasks.buc.OpenPageBUCTasks;
import com.co.datacenter.tasks.buc.login_buc.LoginUserBucPEDPPEFDLFTask;
import com.co.datacenter.tasks.buc.register_buc.FillsTheFormBucTask;
import com.co.datacenter.tasks.buc.register_buc.ValidationEmptyValuesTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class RegisterBucPEDPPEFDLFDefinition {

    @Managed(driver = "Chrome")
    private WebDriver hisBrowser;
    private final Actor user = Actor.named("user");

    @Before
    public void setUp() {
        user.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^User is on the buc registration page for PEDPPEFDLF$")
    public void userIsOnBucRegistrationPageForPEDPPEFDLF() {
        user.wasAbleTo(
                OpenPageBUCTasks.open(),
                LoginUserBucPEDPPEFDLFTask.on()
        );
    }

    @When("^You fill out the buc form with PEDPPEFDLF$")
    public void youFillOutBucFormWithPEDPPEFDLF() {
        user.wasAbleTo(
                ValidationEmptyValuesTask.on(),
                FillsTheFormBucTask.on()

        );
    }

    @Then("^You fill out the buc form$")
    public void titleRegistrationShouldBeSuccessful() {
        EntryToTheDataRecordTableQuestions.EntryToTheDataRecordTable().answeredBy(user);
        System.out.println("Acceso a buc correcto");
    }
}
