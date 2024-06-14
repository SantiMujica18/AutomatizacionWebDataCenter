package com.co.datacenter.stepsdefinitions.buc.login_buc;

import com.co.datacenter.questions.buc.EntryToTheDataRecordTableQuestions;
import com.co.datacenter.tasks.buc.OpenPageBUCTasks;
import com.co.datacenter.tasks.buc.login_buc.LoginUserBucCCTask;
import com.co.datacenter.tasks.buc.login_buc.LoginUserBucPassportTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class LoginBucPassportDefinition {

    @Managed(driver = "Chrome")
    private WebDriver hisBrowser;
    private final Actor user = Actor.named("user");

    @Before
    public void setUp() {
        user.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^that the User is on the main page validating their data with their Passport$")
    public void thatTheUserIsOnTheMainPageValidatingTheirDataWithTheirPassport() {
        user.wasAbleTo(
                OpenPageBUCTasks.open()
        );
    }

    @When("^you fill out the buc login with its Passport$")
    public void youFillOutTheBucLoginWithItsPassport() {
        user.wasAbleTo(
                LoginUserBucPassportTask.on()
        );
    }

    @Then("^the user confirms if he is registered with his Passport$")
    public void theUserConfirmsIfHeIsRegisteredWithHisCc() {
        EntryToTheDataRecordTableQuestions.EntryToTheDataRecordTable().answeredBy(user);
        System.out.println("Acceso a buc correcto");
    }
}
