package com.co.datacenter.stepsdefinitions.login.validationSecurityQuestion;


import com.co.datacenter.questions.securityquestions.SecurityQuestionsQuest;
import com.co.datacenter.tasks.OpenThePage;
import com.co.datacenter.tasks.login.security_questions_tasks.SecurityQuestionsTask;
import com.co.datacenter.tasks.login.signin.LoginUserTask;
import com.co.datacenter.tasks.switch_iframe.SwitchToIframeTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class validationSecurityQuestionStepsDefinitions {

    @Managed(driver = "chrome")

    private WebDriver hisBrowser;


    private Actor user = Actor.named("user");

    @Before
    public void setUp() {
        user.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^answers security questions$")
    public void answersSecurityQuestions() throws InterruptedException {
        user.wasAbleTo(
                OpenThePage.on(),
                LoginUserTask.on()
        );
        try {
            Thread.sleep(35000);

        } catch (ArithmeticException e) {
            System.out.println("Error de tiempo");
            e.printStackTrace();
        }

    }


    @When("^you ask the security question steps$")
    public void youAskTheSecurityQuestionSteps() {

        user.wasAbleTo(
                SecurityQuestionsTask.on(),
                SwitchToIframeTask.on()

        );

    }

    @Then("^you should enter the Pay paga todo$")
    public void youShouldEnterThePayPagaTodo() {

        System.out.println("Bienvenido a el servicio de paga todo ?  \n el titulo de bievenida es: " + SecurityQuestionsQuest.SecurityQuestions().answeredBy(user));

    }
}