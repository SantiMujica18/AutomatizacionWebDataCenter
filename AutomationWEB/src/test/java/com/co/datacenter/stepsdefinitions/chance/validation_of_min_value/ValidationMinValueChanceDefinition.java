package com.co.datacenter.stepsdefinitions.chance.validation_of_min_value;

import com.co.datacenter.questions.chance.validation_of_min_value_chance.MinValueChanceQuestion;

import com.co.datacenter.tasks.OpenThePage;
import com.co.datacenter.tasks.chance.chance_element_iframe.ChanceElementIframeTask;
import com.co.datacenter.tasks.chance.validation_of_min_value_chance.MinValueChanceElementIframeTask;
import com.co.datacenter.tasks.login.security_questions2_tasks.SecurityQuestions2Task;
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

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class ValidationMinValueChanceDefinition {

    @Managed(driver = "Chrome")
    private WebDriver hisBrowser;
    private Actor Sebas = Actor.named("Sebas");
    @Before
    public void setUp(){
        Sebas.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^Sebastian wants insert 50 how min value")
    public void sebastianWantsInsertHowMinValue() throws InterruptedException {

        Sebas.wasAbleTo(

                OpenThePage.on(),
                LoginUserTask.on()
        );
        Thread.sleep(30000);

        Sebas.wasAbleTo(
                SecurityQuestions2Task.on(),
                SwitchToIframeTask.on(),
                SelectBetTask.on(),
                ChanceElementIframeTask.on()


        );


    }


    @When("^He insert the 50 in the form")
    public void heInsertTheInTheForm() {
        Sebas.wasAbleTo(
                MinValueChanceElementIframeTask.on()
        );
    }

    @Then("^He should sees the title Total tiquete no permitido")
    public void heShouldSeesTheTitleTotalTiqueteNoPermitido() {
        System.out.println("Alerta de validacion Total tiquete no permitido minimo $ 700 ?  \n el titulo de la alerta es: "+ MinValueChanceQuestion.minValueChance().answeredBy(Sebas));
        //System.out.println("la cantidad de componentes?  \n el titulo de la alerta es: "+ MinValueChanceQuestion.cantidadDeComponentesVisibles().answeredBy(Sebas));

        // Validar que haya al menos 3 componentes visibles con la clase CSS
        //Sebas.should(seeThat( MinValueChanceQuestion.cantidadDeComponentesVisibles(), equalTo(10)));
    }



}
