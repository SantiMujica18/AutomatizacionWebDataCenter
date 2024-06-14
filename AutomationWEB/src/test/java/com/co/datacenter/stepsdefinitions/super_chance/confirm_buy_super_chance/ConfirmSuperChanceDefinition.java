package com.co.datacenter.stepsdefinitions.super_chance.confirm_buy_super_chance;


import com.co.datacenter.questions.super_chance.confirm_super_chance.ConfirmSuperChanceQuestion;
import com.co.datacenter.tasks.login.security_questions_tasks.SecurityQuestionsTask;
import com.co.datacenter.tasks.login.signin.LoginUserTask;
import com.co.datacenter.tasks.OpenThePage;
import com.co.datacenter.tasks.select_bets.SelectBetTask;
import com.co.datacenter.tasks.super_chance.bet_four_super_chance.BetFourSuperChanceTask;
import com.co.datacenter.tasks.super_chance.bet_three_super_chance.BetThreeSuperChanceTask;
import com.co.datacenter.tasks.super_chance.confirm_super_chance.ConfirmSuperChanceTask;
import com.co.datacenter.tasks.super_chance.data_super_chance.DataSuperChanceTask;
import com.co.datacenter.tasks.super_chance.delete_super_chance.DeleteSuperChanceElementIframeTask;
import com.co.datacenter.tasks.super_chance.select_super_chance.SuperChanceElementIframeTask;
import com.co.datacenter.tasks.super_chance.validation_add_max_super_chance.AddMaxSuperChanceTask;
import com.co.datacenter.tasks.super_chance.validation_field_value_empty_super_chance.ValueEmptySuperChanceTask;
import com.co.datacenter.tasks.super_chance.validation_min_value_super_chance.MinValueSuperChanceTask;
import com.co.datacenter.tasks.switch_iframe.SwitchToIframeTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Switch;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class ConfirmSuperChanceDefinition {

    @Managed(driver = "Chrome")
    private WebDriver hisBrowser;
    private Actor Sebas = Actor.named("Sebas");
    @Before
    public void setUp(){
        Sebas.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^Sebastian wants to confirm a super chance$")
    public void sebastianWantsToConfirmASuperChance() {
        Sebas.wasAbleTo(
                OpenThePage.on(),
                LoginUserTask.on(),
                SecurityQuestionsTask.on(),
                SelectBetTask.on(),
                SwitchToIframeTask.on(),
                SuperChanceElementIframeTask.on(),
                ValueEmptySuperChanceTask.on(),
                DeleteSuperChanceElementIframeTask.on(),
                MinValueSuperChanceTask.on(),
                DeleteSuperChanceElementIframeTask.on(),
                AddMaxSuperChanceTask.on(),
                DeleteSuperChanceElementIframeTask.on(),
                DeleteSuperChanceElementIframeTask.on(),
                DeleteSuperChanceElementIframeTask.on(),
                DeleteSuperChanceElementIframeTask.on(),
                DeleteSuperChanceElementIframeTask.on(),
                BetThreeSuperChanceTask.on(),
                ConfirmSuperChanceTask.on());


            Sebas.wasAbleTo(
                    Switch.toDefaultContext(),
                    SelectBetTask.on(),
                    SwitchToIframeTask.on(),
                    SuperChanceElementIframeTask.on(),
                    BetFourSuperChanceTask.on(),
                    ConfirmSuperChanceTask.on()
            );



            Sebas.wasAbleTo(
                    Switch.toDefaultContext(),
                    SelectBetTask.on(),
                    SwitchToIframeTask.on(),
                    SuperChanceElementIframeTask.on(),
                    DataSuperChanceTask.on()
            );

    }


    @When("^He confirm the super chance$")
    public void heConfirmTheSuperChance() {
        Sebas.wasAbleTo(
                ConfirmSuperChanceTask.on()
        );
    }

    @Then("^He should sees the title Pago exitosos$")
    public void heShouldSeesTheTitlePagoExitosos() throws InterruptedException {
        try {
            Thread.sleep(5000);
            System.out.println("Chance realizado exitosamente ?  \n el titulo de confirmacion es: " + ConfirmSuperChanceQuestion.confirmSuperChance().answeredBy(Sebas).equals("Pago exitoso"));
        } catch (NoSuchElementException e) {
            System.out.println("El elemento no se encontró en la página.");
        }
    }
}
