package com.co.datacenter.stepsdefinitions.chance.validation_of_add_game_chance;

import com.co.datacenter.questions.chance.validation_of_add_game_chance.AddChanceQuestion;
import com.co.datacenter.questions.chance.validation_of_max_value_chance.MaxValueChanceQuestion;
import com.co.datacenter.questions.chance.validation_of_min_value_chance.MinValueChanceQuestion;
import com.co.datacenter.tasks.OpenThePage;
import com.co.datacenter.tasks.chance.chance_element_iframe.ChanceElementIframeTask;
import com.co.datacenter.tasks.chance.validation_of_add_game_chance.AddChanceElementIframeTask;
import com.co.datacenter.tasks.chance.validation_of_max_value_chance.MaxValueChanceElementIframeTask;
import com.co.datacenter.tasks.chance.validation_of_min_value_chance.MinValueChanceElementIframeTask;
import com.co.datacenter.tasks.login.security_questions2_tasks.SecurityQuestions2Task;
import com.co.datacenter.tasks.login.security_questions_tasks.SecurityQuestionsTask;
import com.co.datacenter.tasks.login.signin.LoginUserTask;
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

public class ValidationAddChanceDefinition {

    @Managed(driver = "Chrome")
    private WebDriver hisBrowser;
    private Actor user = Actor.named("user");
    @Before
    public void setUp(){
        user.can(BrowseTheWeb.with(hisBrowser));
    }


    @Given("^Sebastian wants to make several bets$")
    public void sebastianWantsToMakeSeveralBets() throws InterruptedException {

        user.wasAbleTo(
                OpenThePage.on(),
                LoginUserTask.on()
        );
        Thread.sleep(30000);

        user.wasAbleTo(
                SecurityQuestionsTask.on(),
                SecurityQuestions2Task.on(),
                SelectBetTask.on(),
                ChanceElementIframeTask.on()
        );


    }

    @When("^He makes the various bets$")
    public void heMakesTheVariousBets() {
        user.wasAbleTo(
                AddChanceElementIframeTask.on()
        );
    }

    @Then("^He should sees the class change to button$")
    public void heShouldSeesTheClassChangeToButton() {
        System.out.println("Alerta de validacion Tu juego fue añadido al resumen de tus juegos, podras realizar un maximo de 5 juegos. A Todos los Juegos que realices le seran aplicadas la mismas loterías seleccionadas. ?  \n el titulo de la alerta es: "+ AddChanceQuestion.addChance().answeredBy(user));
    }


    @Given("^Sebastian wants insert 1000000 how min value")
    public void sebastianWantsInsert1000000HowMinValue() throws InterruptedException {
        user.wasAbleTo(
                OpenThePage.on(),
                LoginUserTask.on()
        );
        Thread.sleep(40000);

        user.wasAbleTo(
                SelectBetTask.on(),
                SwitchToIframeTask.on(),
                ChanceElementIframeTask.on()
        );
    }


    @When("^He insert the 1000000 in the form")
    public void heInsertThe1000000InTheForm() {
        user.wasAbleTo(
                MaxValueChanceElementIframeTask.on()
        );
    }
    /*
    @Then("^He should sees the title Total tiquete no permitido")
    public void heShouldSeesTheTitleTotalTiqueteNoPermitido() {
        System.out.println("Alerta de validacion Total tiquete no permitido máximo $ 100000 ?  \n el titulo de la alerta es: "+ MaxValueChanceQuestion.maxValueChance().answeredBy(user));
    }*/


    @Given("^Sebastian wants insert 50 how min value")
    public void sebastianWantsInsertHowMinValue() throws InterruptedException {
        user.wasAbleTo(
                OpenThePage.on(),
                LoginUserTask.on()
        );
        Thread.sleep(40000);

        user.wasAbleTo(
                SelectBetTask.on(),
                SwitchToIframeTask.on(),
                ChanceElementIframeTask.on()
        );
    }


    @When("^He insert the 50 in the form")
    public void heInsertTheInTheForm() {
        user.wasAbleTo(
                MinValueChanceElementIframeTask.on()
        );
    }

    @Then("^He should sees the title Total tiquete no permitido")
    public void heShouldSeesTheTitleTotalTiqueteNoPermitido() {
        System.out.println("Alerta de validacion Total tiquete no permitido minimo $ 700 ?  \n el titulo de la alerta es: "+ MinValueChanceQuestion.minValueChance().answeredBy(user));
    }





}
