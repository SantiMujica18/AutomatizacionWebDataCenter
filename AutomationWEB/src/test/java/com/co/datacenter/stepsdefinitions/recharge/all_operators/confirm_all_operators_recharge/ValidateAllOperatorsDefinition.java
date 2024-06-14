package com.co.datacenter.stepsdefinitions.recharge.all_operators.confirm_all_operators_recharge;

import com.co.datacenter.questions.pines.data_pines.SuccessfullyOrNotQuestion;
import com.co.datacenter.questions.pines.pines_no_founds.PinesNoFoundsQuestion;
import com.co.datacenter.tasks.OpenThePage;
import com.co.datacenter.tasks.confirm_recharge.ConfirmRechargeTask;
import com.co.datacenter.tasks.login.security_questions_tasks.SecurityQuestionsTask;
import com.co.datacenter.tasks.login.signin.LoginUserTask;
import com.co.datacenter.tasks.recharge.data_recharge.ClickSelectRechargeAgainTask;
import com.co.datacenter.tasks.recharge.recharge_data_element_iframe.RechargeDataTask;
import com.co.datacenter.tasks.recharge.select_recharge.*;
import com.co.datacenter.tasks.recharge.validation_of_empty_data_recharge.DataRechargeEmptyTask;
import com.co.datacenter.tasks.recharge.validation_of_empty_select_payment.SelectEmptyPaymentTask;
import com.co.datacenter.tasks.recharge.validation_of_empty_value_recharge.ValueEmptyRechargeTask;
import com.co.datacenter.tasks.recharge.validations_operators_no_included.DataRechargeEspecificOperatorsTask;
import com.co.datacenter.tasks.switch_iframe.SwitchToIframeTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Switch;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ValidateAllOperatorsDefinition {
    @Managed(driver = "Chrome")

    private WebDriver hisBrowser;

    private Actor User = Actor.named("Sebas");

    @Before
    public void setUp(){
        User.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^User sign in paga todo$")
    public void userSignInPagaTodo() {
        User.wasAbleTo(
                OpenThePage.on(),
                LoginUserTask.on(),
                SecurityQuestionsTask.on()
        );
    }
    @When("^user make all recharges of operators$")
    public void userMakeAllRechargesOfOperators() {
        User.wasAbleTo(
                SelectRechargeTask.on(),
                SwitchToIframeTask.on(),
                SelectAvantelRechargeTask.on(),
                DataRechargeEmptyTask.on(),
                ValueEmptyRechargeTask.on(),
                RechargeDataTask.on(),
                SelectEmptyPaymentTask.on(),
                ConfirmRechargeTask.on(),
                Switch.toDefaultContext(),
                ClickSelectRechargeAgainTask.on()
        );

        User.wasAbleTo(
                SwitchToIframeTask.on(),
                SelectClaroRechargeTask.on(),
                DataRechargeEmptyTask.on(),
                ValueEmptyRechargeTask.on(),
                RechargeDataTask.on(),
                SelectEmptyPaymentTask.on(),
                ConfirmRechargeTask.on(),
                Switch.toDefaultContext(),
                ClickSelectRechargeAgainTask.on()
        );

        User.wasAbleTo(
                SwitchToIframeTask.on(),
                SelectEtbRechargeTask.on(),
                DataRechargeEmptyTask.on(),
                ValueEmptyRechargeTask.on(),
                RechargeDataTask.on(),
                SelectEmptyPaymentTask.on(),
                ConfirmRechargeTask.on(),
                Switch.toDefaultContext(),
                ClickSelectRechargeAgainTask.on()
        );
        User.wasAbleTo(
                SwitchToIframeTask.on(),
                SelectExitoRechargeTask.on(),
                DataRechargeEmptyTask.on(),
                ValueEmptyRechargeTask.on(),
                RechargeDataTask.on(),
                SelectEmptyPaymentTask.on(),
                ConfirmRechargeTask.on(),
                Switch.toDefaultContext(),
                ClickSelectRechargeAgainTask.on()
        );
        User.wasAbleTo(
                SwitchToIframeTask.on(),
                SelectFlashRechargeTask.on(),
                DataRechargeEspecificOperatorsTask.on(),
                SelectEmptyPaymentTask.on(),
                ConfirmRechargeTask.on(),
                Switch.toDefaultContext(),
                ClickSelectRechargeAgainTask.on()
        );

        User.wasAbleTo(
                SwitchToIframeTask.on(),
                SelectKalleyRechargeTask.on(),
                DataRechargeEmptyTask.on(),
                ValueEmptyRechargeTask.on(),
                RechargeDataTask.on(),
                SelectEmptyPaymentTask.on(),
                ConfirmRechargeTask.on(),
                Switch.toDefaultContext(),
                ClickSelectRechargeAgainTask.on()
        );

        User.wasAbleTo(
                SwitchToIframeTask.on(),
                SelectMovistarRechargeTask.on(),
                DataRechargeEmptyTask.on(),
                ValueEmptyRechargeTask.on(),
                RechargeDataTask.on(),
                SelectEmptyPaymentTask.on(),
                ConfirmRechargeTask.on(),
                Switch.toDefaultContext(),
                ClickSelectRechargeAgainTask.on()
        );

        User.wasAbleTo(
                SwitchToIframeTask.on(),
                SelectTigoRechargeTask.on(),
                DataRechargeEmptyTask.on(),
                ValueEmptyRechargeTask.on(),
                RechargeDataTask.on(),
                SelectEmptyPaymentTask.on(),
                ConfirmRechargeTask.on(),
                Switch.toDefaultContext(),
                ClickSelectRechargeAgainTask.on()
        );

        User.wasAbleTo(
                SwitchToIframeTask.on(),
                SelectUnicornRechargeTask.on(),
                DataRechargeEspecificOperatorsTask.on(),
                SelectEmptyPaymentTask.on(),
                ConfirmRechargeTask.on(),
                Switch.toDefaultContext(),
                ClickSelectRechargeAgainTask.on()
        );
        User.wasAbleTo(
                SwitchToIframeTask.on(),
                SelectVirginRechargeTask.on(),
                DataRechargeEspecificOperatorsTask.on(),
                SelectEmptyPaymentTask.on(),
                ConfirmRechargeTask.on(),
                Switch.toDefaultContext(),
                ClickSelectRechargeAgainTask.on()
        );
        User.wasAbleTo(
                SwitchToIframeTask.on(),
                SelectWingsRechargeTask.on(),
                DataRechargeEmptyTask.on(),
                ValueEmptyRechargeTask.on(),
                RechargeDataTask.on(),
                SelectEmptyPaymentTask.on(),
                ConfirmRechargeTask.on(),
                Switch.toDefaultContext(),
                ClickSelectRechargeAgainTask.on()
        );
        User.wasAbleTo(
                SwitchToIframeTask.on(),
                SelectWomRechargeTask.on(),
                DataRechargeEmptyTask.on(),
                ValueEmptyRechargeTask.on(),
                RechargeDataTask.on(),
                SelectEmptyPaymentTask.on(),
                ConfirmRechargeTask.on()
        );


    }

    @Then("^user will have validate all operators$")
    public void userWillHaveValidateAllOperators() throws InterruptedException {
        Thread.sleep(10000);
        String confirmationMessage = SuccessfullyOrNotQuestion.SuccesfullyValidation().answeredBy(User);
        String errorMessage = PinesNoFoundsQuestion.unsuccesfulpurchase().answeredBy(User);

        if (confirmationMessage.equals("Enviaremos los soportes de esta transacción a tu correo electrónico.")) {
            System.out.println("\n El titulo de validacion es : \n Pago exitoso" + confirmationMessage);
        } else if (errorMessage.equals("Fondos Insuficientes")) {
            System.out.println("Se encontro un error");
        } else {
            System.out.println("Se encontro un error que no se pudo validar");
            throw new AssertionError("No se pudo validar el mensaje de confirmación ni de error.");
        }
    }

}
