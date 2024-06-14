package com.co.datacenter.stepsdefinitions.paga_triple.validation_missing_lottery;
import com.co.datacenter.questions.paga_triple.confirm_paga_triple.ConfirmPagaTripleQuestion;
import com.co.datacenter.questions.paga_triple.paga_triple_no_credit.PagaTripleNoFoundsQuestion;
import com.co.datacenter.tasks.OpenThePage;
import com.co.datacenter.tasks.login.security_questions_tasks.SecurityQuestionsTask;
import com.co.datacenter.tasks.login.signin.LoginUserTask;
import com.co.datacenter.tasks.paga_triple.bet_paga_triple.BetThreeNumberOfTwoFigurePagaTripleTask;
import com.co.datacenter.tasks.paga_triple.confirm_buy_paga_triple.ConfirmPagaTripleTask;
import com.co.datacenter.tasks.paga_triple.missing_lottery_paga_triple.MissingLotteryBetTask;
import com.co.datacenter.tasks.paga_triple.select_paga_triple.SelectPagaTripleTask;
import com.co.datacenter.tasks.select_bets.SelectBetTask;
import com.co.datacenter.tasks.switch_iframe.SwitchToIframeTask;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

public class BetMissingLotteryPagaTripleDefinition {
    @Managed(driver = "Chrome")
    private WebDriver hisBrowser;
    private Actor user = Actor.named("user");
    @Before
    public void setUp(){
        user.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^user wants to validate a incomplete bet$")
    public void userWantsToValidateAIncompleteBet() throws InterruptedException{
        user.wasAbleTo(
                OpenThePage.on(),
                LoginUserTask.on()
        );

        Thread.sleep(30000);
        user.wasAbleTo(
                SecurityQuestionsTask.on()
        );

        Thread.sleep(20000);
        user.wasAbleTo(
                SwitchToIframeTask.on(),
                SelectBetTask.on(),
                SelectPagaTripleTask.on()
        );
    }


    @When("^user fill the bet form with a missing lottery$")
    public void userFillTheBetFormWithAMissingLottery() {
        MissingLotteryBetTask.on();

    }

    @Then("^He can't make the bet$")
    public void heCanTMakeTheBet() {



    }

}
