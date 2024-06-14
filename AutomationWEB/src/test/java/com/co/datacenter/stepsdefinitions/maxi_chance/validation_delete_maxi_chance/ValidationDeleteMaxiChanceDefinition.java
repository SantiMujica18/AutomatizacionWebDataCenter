    package com.co.datacenter.stepsdefinitions.maxi_chance.validation_delete_maxi_chance;


import com.co.datacenter.questions.maxi_chance.validation_of_add_max_maxi_chance.ValidationAddMaxQuestion;
import com.co.datacenter.questions.super_chance.delete_super_chance.DeleteSuperChanceQuestion;
import com.co.datacenter.tasks.OpenThePage;
import com.co.datacenter.tasks.login.security_questions2_tasks.SecurityQuestions2Task;
import com.co.datacenter.tasks.login.security_questions_tasks.SecurityQuestionsTask;
import com.co.datacenter.tasks.login.signin.LoginUserTask;
import com.co.datacenter.tasks.maxi_chance.maxi_chance_element_frame.MaxiChanceElementIframeTask;
import com.co.datacenter.tasks.maxi_chance.validation_delete_maxi_chance.DeleteMaxiChanceElementIframeTask;
import com.co.datacenter.tasks.maxi_chance.validation_of_add_max_maxi_chance.ValidationAddMaxMaxiChanceTask;
import com.co.datacenter.tasks.select_bets.SelectBetTask;
import com.co.datacenter.tasks.switch_iframe.SwitchToIframeTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

    public class ValidationDeleteMaxiChanceDefinition {

        @Managed(driver = "Chrome")
        private WebDriver hisBrowser;
        private Actor user = Actor.named("Sebas");

        @Before
        public void setUp() {
            user.can(BrowseTheWeb.with(hisBrowser));
        }

        @Given("^Sebastian wants to delete a bet maxi chance$")
        public void SebastianWantsToDeleteABetMaxiChance() throws InterruptedException {

            user.wasAbleTo(
                    OpenThePage.on(),
                    LoginUserTask.on()
            );
            user.wasAbleTo(
                    SecurityQuestionsTask.on(),
                    SwitchToIframeTask.on(),
                    SelectBetTask.on()

            );
        }

        @When("^He deletes the bet maxi chance$")
        public void heDeletesTheBetMaxiChance() {
            user.wasAbleTo(
                    DeleteMaxiChanceElementIframeTask.on()
            );
        }

        @Then("^He should sees the class change to next button$")
        public void heShouldSeesTheClassChangeToNextButton() {
            System.out.println("El estado del boton es bloqueado ?  \n el estado es:  "+ DeleteSuperChanceQuestion.deleteSuperChance.answeredBy(user));

        }


    }






