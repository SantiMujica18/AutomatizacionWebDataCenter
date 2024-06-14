package com.co.datacenter.stepsdefinitions.maxi_chance.validation_num_empty_maxi_chance;


import com.co.datacenter.questions.maxi_chance.validation_lottery_empty_maxi_chance.ValidationLotteryEmptyQuestion;
import com.co.datacenter.questions.maxi_chance.validation_num_empty_maxi_chance.ValidationNumEmptyQuestion;
import com.co.datacenter.tasks.OpenThePage;
import com.co.datacenter.tasks.login.security_questions_tasks.SecurityQuestionsTask;
import com.co.datacenter.tasks.login.signin.LoginUserTask;
import com.co.datacenter.tasks.maxi_chance.maxi_chance_element_frame.MaxiChanceElementIframeTask;
import com.co.datacenter.tasks.maxi_chance.validation_lottery_empty_maxi_chance.LotteryEmptyMaxiChanceTask;
import com.co.datacenter.tasks.maxi_chance.validation_num_empty_maxi_chance.NumEmptyMaxiChanceTask;
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

public class ValidationNumEmptyMaxiChanceDefinition {

    @Managed(driver = "Chrome")
    private WebDriver hisBrowser;
    private Actor user = Actor.named("Sebas");

    @Before
    public void setUp() {
        user.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^Sebastian wants to make num empty bets maxi chance$")
    public void sebastian_wants_to_make_num_empty_bets_maxi_chance() throws InterruptedException {

        user.wasAbleTo(
                OpenThePage.on(),
                LoginUserTask.on()
        );
        user.wasAbleTo(
                SecurityQuestionsTask.on(),
                SwitchToIframeTask.on(),
                SelectBetTask.on(),
                MaxiChanceElementIframeTask.on()
        );


    }

    @When("^He makes the field num empty bets maxi chance$")
    public void he_makes_the_field_num_empty_bets_maxi_chance() {
        user.wasAbleTo(
                NumEmptyMaxiChanceTask.on()
        );
    }

    @Then("^He should sees the title Validacion Especificar numero$")
    public void he_should_sees_the_title_Validacion_Especificar_numero() {
        System.out.println("El titulo de validacion es \n : " + ValidationNumEmptyQuestion.numEmpty().answeredBy(user));

    }

}






