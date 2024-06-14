package com.co.datacenter.stepsdefinitions.pines.all_pines.validate_all_pines;

import com.co.datacenter.questions.paga_triple.confirm_paga_triple.ConfirmPagaTripleQuestion;
import com.co.datacenter.questions.paga_triple.paga_triple_no_credit.PagaTripleNoFoundsQuestion;
import com.co.datacenter.questions.pines.data_pines.SuccessfullyOrNotQuestion;
import com.co.datacenter.questions.pines.pines_no_founds.PinesNoFoundsQuestion;
import com.co.datacenter.tasks.OpenThePage;
import com.co.datacenter.tasks.delay.Delay;
import com.co.datacenter.tasks.login.security_questions_tasks.SecurityQuestionsTask;
import com.co.datacenter.tasks.login.signin.LoginUserTask;
import com.co.datacenter.tasks.pines.FillsFormValuePinTask;
import com.co.datacenter.tasks.pines.data_pines.ClickBtnPayTask;
import com.co.datacenter.tasks.pines.data_pines.ClickMethodPayTask;
import com.co.datacenter.tasks.pines.data_pines.ClickSelectPinAgainTask;
import com.co.datacenter.tasks.pines.select_pines.*;
import com.co.datacenter.tasks.switch_iframe.SwitchToIframeTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Switch;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class AllPinsBuyDefinition {
    @Managed(driver = "Chrome")

    private WebDriver hisBrowser;


    private Actor actor = Actor.named("usuario");

    @Before
    public void setUp() {
        actor.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^user is in paga todo page$")
    public void userIsInPagaTodoPage() {
        actor.wasAbleTo(
                OpenThePage.on(),
                LoginUserTask.on(),
                SecurityQuestionsTask.on()
        );
    }


    @When("^user make a purchase of every pin$")
    public void userMakeAPurchaseOfEveryPin() {
        actor.wasAbleTo(
                SelectPinesTask.on(),
                SwitchToIframeTask.on(),
                Delay.ofMilliseconds(1000),
                SelectCrunchyrollPinTask.on(),
                FillsFormValuePinTask.on(),
                ClickMethodPayTask.on(),
                ClickBtnPayTask.on(),
                Switch.toDefaultContext(),
                ClickSelectPinAgainTask.on(),
                Delay.ofMilliseconds(1000)
        );

        actor.wasAbleTo(
                SwitchToIframeTask.on(),
                Delay.ofMilliseconds(1000),
                SelectDirectvPinTask.on(),
                FillsFormValuePinTask.on(),
                ClickMethodPayTask.on(),
                ClickBtnPayTask.on(),
                Switch.toDefaultContext(),
                ClickSelectPinAgainTask.on(),
                Delay.ofMilliseconds(1000)

        );


        actor.wasAbleTo(
                SwitchToIframeTask.on(),
                Delay.ofMilliseconds(1000),
                SelectFreefirePinTask.on(),
                FillsFormValuePinTask.on(),
                ClickMethodPayTask.on(),
                ClickBtnPayTask.on(),
                Switch.toDefaultContext(),
                ClickSelectPinAgainTask.on(),
                Delay.ofMilliseconds(1000)
        );

        actor.wasAbleTo(
                SwitchToIframeTask.on(),
                Delay.ofMilliseconds(1000),
                SelectImvuPinTask.on(),
                FillsFormValuePinTask.on(),
                ClickMethodPayTask.on(),
                ClickBtnPayTask.on(),
                Switch.toDefaultContext(),
                ClickSelectPinAgainTask.on()
        );

        actor.wasAbleTo(
                SwitchToIframeTask.on(),
                Delay.ofMilliseconds(1000),
                SelectMicrosoftPinTask.on(),
                FillsFormValuePinTask.on(),
                ClickMethodPayTask.on(),
                ClickBtnPayTask.on(),
                Switch.toDefaultContext(),
                ClickSelectPinAgainTask.on()
        );

        actor.wasAbleTo(
                SwitchToIframeTask.on(),
                Delay.ofMilliseconds(1000),
                SelectPlaystationPinTask.on(),
                FillsFormValuePinTask.on(),
                ClickMethodPayTask.on(),
                ClickBtnPayTask.on(),
                Switch.toDefaultContext(),
                ClickSelectPinAgainTask.on()
        );

        actor.wasAbleTo(
                SwitchToIframeTask.on(),
                Delay.ofMilliseconds(1000),
                SelectRazerGoldPinTask.on(),
                FillsFormValuePinTask.on(),
                ClickMethodPayTask.on(),
                ClickBtnPayTask.on(),
                Switch.toDefaultContext(),
                ClickSelectPinAgainTask.on()
        );

        actor.wasAbleTo(
                SwitchToIframeTask.on(),
                Delay.ofMilliseconds(1000),
                SelectRixtyPinTask.on(),
                FillsFormValuePinTask.on(),
                ClickMethodPayTask.on(),
                ClickBtnPayTask.on(),
                Switch.toDefaultContext(),
                ClickSelectPinAgainTask.on()
        );

        actor.wasAbleTo(
                SwitchToIframeTask.on(),
                Delay.ofMilliseconds(1000),
                SelectSpotifyPinTask.on(),
                FillsFormValuePinTask.on(),
                ClickMethodPayTask.on(),
                ClickBtnPayTask.on(),
                Switch.toDefaultContext(),
                ClickSelectPinAgainTask.on()
        );

        actor.wasAbleTo(
                SwitchToIframeTask.on(),
                Delay.ofMilliseconds(1000),
                SelectXboxGamePassPinTask.on(),
                FillsFormValuePinTask.on(),
                ClickMethodPayTask.on(),
                ClickBtnPayTask.on(),
                Switch.toDefaultContext(),
                ClickSelectPinAgainTask.on()
        );

        actor.wasAbleTo(
                SwitchToIframeTask.on(),
                Delay.ofMilliseconds(1000),
                SelectXboxLivePinTask.on(),
                FillsFormValuePinTask.on(),
                ClickMethodPayTask.on(),
                ClickBtnPayTask.on()
        );


    }

    @Then("^he should see a report with the status$")
    public void heShouldSeeAReportWithTheStatus() throws InterruptedException {
        Thread.sleep(10000);
        String confirmationMessage = SuccessfullyOrNotQuestion.SuccesfullyValidation().answeredBy(actor);
        String errorMessage = PinesNoFoundsQuestion.unsuccesfulpurchase().answeredBy(actor);

        if (confirmationMessage.equals("Enviaremos los soportes de esta transacción a tu correo electrónico.")) {
            System.out.println("\n El titulo de validacion es : \n Pago exitoso" + confirmationMessage);
        } else if (errorMessage.equals("Fondos Insuficientes")) {
            System.out.println("Se genera el siguiente mensaje de error : \n Fondos Insuficientes");
        } else {
            System.out.println("Se encontro un error que no se pudo validar");
            throw new AssertionError("No se pudo validar el mensaje de confirmación ni de error.");
        }
    }

}

