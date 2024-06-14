package com.co.datacenter.stepsdefinitions.buc.login_buc;


import com.co.datacenter.questions.buc.EntryToTheDataRecordTableQuestions;
import com.co.datacenter.tasks.buc.login_buc.*;
import com.co.datacenter.tasks.buc.OpenPageBUCTasks;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class DataRegisterLandingTheBUCStepDefinitions {

    @Managed(driver = "Chrome")
    private WebDriver hisBrowser;
    private final Actor user = Actor.named("user");

    @Before
    public void setUp() {
        user.can(BrowseTheWeb.with(hisBrowser));
    }


    @Given("^It is validated on the page if you are registered$")
    public void itIsValidatedOnThePageIfYouAreRegistered() {
        user.wasAbleTo(
                OpenPageBUCTasks.open()
        );
    }

    @When("^registration of my personal data to the single customer database$")
    public void registrationOfMyPersonalDataToTheSingleCustomerDatabase() {
          user.wasAbleTo(
                  LoginUserBucCCTask.on(),
                  OpenPageBUCTasks.open(),

                  LoginUserBucCETask.on(),
                  OpenPageBUCTasks.open(),

                  LoginUserBucPassportTask.on(),
                  OpenPageBUCTasks.open(),

                  LoginUserBucPEDPPEFDLFTask.on(),
                  OpenPageBUCTasks.open(),

                  LoginUserBucPEDPTask.on(),
                  OpenPageBUCTasks.open(),

                  LoginUserBucPPPTTask.on()
          );
    }

    @Then("^The user completes the form with the completed data and should display a successful registration alert\\.$")
    public void theUserCompletesTheFormWithTheCompletedDataAndShouldDisplayASuccessfulRegistrationAlert() {
        EntryToTheDataRecordTableQuestions.EntryToTheDataRecordTable().answeredBy(user);
        System.out.println("Acceso a buc correcto");
    }

}
