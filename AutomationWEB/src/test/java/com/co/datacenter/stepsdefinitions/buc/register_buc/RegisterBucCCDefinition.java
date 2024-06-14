package com.co.datacenter.stepsdefinitions.buc.register_buc;

import com.co.datacenter.questions.buc.EntryToTheDataRecordTableQuestions;
import com.co.datacenter.tasks.buc.OpenPageBUCTasks;
import com.co.datacenter.tasks.buc.login_buc.LoginUserBucCCTask;
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

public class RegisterBucCCDefinition {

    @Managed(driver = "Chrome")
    private WebDriver hisBrowser;
    private final Actor user = Actor.named("user");

    @Before
    public void setUp() {
        user.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^user is on the buc registration in the Landing page$")
    public void userIsOnBucRegistrationInTheLandingPage() {
        user.wasAbleTo(
                OpenPageBUCTasks.open(),
                LoginUserBucCCTask.on()
        );
    }

    @When("^you fill out the buc form with your data$")
    public void youFillOutTheBucFormWithYourData() {
        user.wasAbleTo(
                ValidationEmptyValuesTask.on(),
                FillsTheFormBucTask.on()
        );
    }

    @Then("^the user is registered with his CC$")
    public void theUserIsRegisteredWithHisCC() {
        EntryToTheDataRecordTableQuestions.EntryToTheDataRecordTable().answeredBy(user);
        System.out.println("Acceso a buc correcto");
    }
}
