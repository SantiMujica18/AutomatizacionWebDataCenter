package com.co.datacenter.stepsdefinitions.maxi_chance.confirm_buy_maxi_chance;


import com.co.datacenter.questions.maxi_chance.bet_four_figures_maxi_chance.BetFourFiguresMaxiChanceQuestion;
import com.co.datacenter.questions.maxi_chance.confirm_maxi_chance.ConfirmMaxiChanceQuestion;
import com.co.datacenter.questions.maxi_chance.data_maxi_chance.DataMaxiChanceQuestion;
import com.co.datacenter.tasks.OpenThePage;
import com.co.datacenter.tasks.delay.Delay;
import com.co.datacenter.tasks.login.security_questions_tasks.SecurityQuestionsTask;
import com.co.datacenter.tasks.login.signin.LoginUserTask;
import com.co.datacenter.tasks.maxi_chance.bet_four_figures_maxi_chance.BetFourFiguresMaxiChanceTask;
import com.co.datacenter.tasks.maxi_chance.bet_same_number_maxi_chance.BetTheSameNumberMaxiChanceTask;
import com.co.datacenter.tasks.maxi_chance.bet_three_figures_maxi_chance.BetThreeFiguresMaxiChanceTask;
import com.co.datacenter.tasks.maxi_chance.confirm_maxi_chance.AcceptMaxiChanceTask;
import com.co.datacenter.tasks.maxi_chance.confirm_maxi_chance.ConfirmMaxiChanceTask;
import com.co.datacenter.tasks.maxi_chance.confirm_maxi_chance.PreviousPageMaxiChanceTask;
import com.co.datacenter.tasks.maxi_chance.data_maxi_chance.DataMaxiChanceTask;
import com.co.datacenter.tasks.maxi_chance.maxi_chance_element_frame.MaxiChanceElementIframeTask;
import com.co.datacenter.tasks.maxi_chance.validation_delete_maxi_chance.DeleteMaxiChanceElementIframeTask;
import com.co.datacenter.tasks.maxi_chance.validation_lottery_empty_maxi_chance.LotteryEmptyMaxiChanceTask;
import com.co.datacenter.tasks.maxi_chance.validation_num_empty_maxi_chance.NumEmptyMaxiChanceTask;
import com.co.datacenter.tasks.maxi_chance.validation_of_add_max_maxi_chance.ValidationAddMaxMaxiChanceTask;
import com.co.datacenter.tasks.maxi_chance.validation_value_empty_maxi_chance.ValueEmptyMaxiChanceTask;
import com.co.datacenter.tasks.select_bets.SelectBetTask;
import com.co.datacenter.tasks.switch_iframe.SwitchToIframeTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.eo.Se;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Switch;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class ConfirmMaxiChanceDefinition {

    @Managed(driver = "Chrome")
    private WebDriver hisBrowser;
    private Actor Sebas = Actor.named("Sebas");

    @Before
    public void setUp() {
        Sebas.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^Sebastian wants to confirm a maxi chance$")
    public void sebastian_wants_to_confirm_a_maxi_chance() throws InterruptedException {
        Sebas.wasAbleTo(
                OpenThePage.on(),
                LoginUserTask.on(),
                SecurityQuestionsTask.on()
        );

        Sebas.wasAbleTo(
                SelectBetTask.on(),
                SwitchToIframeTask.on(),
                MaxiChanceElementIframeTask.on(),
                LotteryEmptyMaxiChanceTask.on(),
                ValueEmptyMaxiChanceTask.on(),
                DeleteMaxiChanceElementIframeTask.on(),
                NumEmptyMaxiChanceTask.on(),
                DeleteMaxiChanceElementIframeTask.on(),
                ValidationAddMaxMaxiChanceTask.on(),
                Delay.ofMilliseconds(5000),
                Switch.toDefaultContext(),
                SwitchToIframeTask.on(),
                DeleteMaxiChanceElementIframeTask.on(),
                DeleteMaxiChanceElementIframeTask.on(),
                DeleteMaxiChanceElementIframeTask.on(),
                DeleteMaxiChanceElementIframeTask.on(),
                //BetTheSameNumberMaxiChanceTask.on(),
                //ConfirmMaxiChanceTask.on(),
                BetThreeFiguresMaxiChanceTask.on(),
                ConfirmMaxiChanceTask.on()
        );

        //Thread.sleep(20000);

        Sebas.wasAbleTo(
                Switch.toDefaultContext(),
                SelectBetTask.on(),
                SwitchToIframeTask.on(),
                MaxiChanceElementIframeTask.on(),
                BetFourFiguresMaxiChanceTask.on(),
                ConfirmMaxiChanceTask.on()

        );


        //Thread.sleep(20000);

        Sebas.wasAbleTo(
                Switch.toDefaultContext(),
                SelectBetTask.on(),
                SwitchToIframeTask.on(),
                MaxiChanceElementIframeTask.on(),
                DataMaxiChanceTask.on()
        );

    }

    @When("^He confirm the maxi chance$")
    public void he_confirm_the_maxi_chance()  {
        Sebas.wasAbleTo(
                ConfirmMaxiChanceTask.on(),
                Delay.ofMilliseconds(5000)
        );
    }

    @Then("^He should sees the title Pago exitoso$")
    public void he_should_sees_the_title_Pago_exitoso() {
        System.out.println("El titulo de validacion es Pago exitoso ? \n el titulo es :" + ConfirmMaxiChanceQuestion.confirmMaxiChance().answeredBy(Sebas).equals("Pago exitoso"));
    }

}
