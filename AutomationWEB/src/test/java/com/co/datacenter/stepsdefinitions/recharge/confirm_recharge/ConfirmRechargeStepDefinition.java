package com.co.datacenter.stepsdefinitions.recharge.confirm_recharge;

import com.co.datacenter.questions.recharge.confirm_recharge.ConfirmRechargeQuestion;
import com.co.datacenter.tasks.login.security_questions_tasks.SecurityQuestionsTask;
import com.co.datacenter.tasks.login.signin.LoginUserTask;
import com.co.datacenter.tasks.login.validation_of_empty_briefcase.BriefCaseTask;
import com.co.datacenter.tasks.login.validation_of_empty_email.EmailTask;
import com.co.datacenter.tasks.login.validation_of_empty_login_fields.EmptyLoginFieldsTask;
import com.co.datacenter.tasks.login.validation_of_empty_password.EmptyPasswordTask;
import com.co.datacenter.tasks.login.validation_of_empty_policy.EmptyPolicyTask;
import com.co.datacenter.tasks.login.validation_of_empty_terms.EmptyTermsTask;
import com.co.datacenter.tasks.login.validation_of_incorrect_data_login.IncorrectDataLoginTask;
import com.co.datacenter.tasks.OpenThePage;
import com.co.datacenter.tasks.confirm_recharge.ConfirmRechargeTask;
import com.co.datacenter.tasks.operator_element_iframe.OperatorElementIframeTask;
import com.co.datacenter.tasks.recharge.recharge_data_element_iframe.RechargeDataTask;
import com.co.datacenter.tasks.recharge.select_recharge.SelectRechargeTask;
import com.co.datacenter.tasks.recharge.validation_of_empty_data_recharge.DataRechargeEmptyTask;
import com.co.datacenter.tasks.recharge.validation_of_empty_select_payment.SelectEmptyPaymentTask;
import com.co.datacenter.tasks.recharge.validation_of_empty_value_recharge.ValueEmptyRechargeTask;
import com.co.datacenter.tasks.switch_iframe.SwitchToIframeTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class ConfirmRechargeStepDefinition {

    @Managed(driver = "Chrome")

    private WebDriver hisBrowser;

    private Actor Sebas = Actor.named("Sebas");

    @Before
    public void setUp(){
        System.out.println("Se inicia el chrome driver");
        Sebas.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^Sebastian in the Confirm recharge page$")
    public void sebastianInTheConfirmRechargePage() {
        System.out.println("Abre la pagina chaxtest");
        Sebas.wasAbleTo(
                OpenThePage.on()
               //EmptyLoginFieldsTask.on(),
                //IncorrectDataLoginTask.on()
        );
        System.out.println("abrio chaxtest");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Sebas.wasAbleTo(
                //EmptyPasswordTask.on(),
                //EmailTask.on()
        );
        Sebas.wasAbleTo(
                //EmptyTermsTask.on(),
                //BriefCaseTask.on()
                //EmptyPolicyTask.on()
        );
        Sebas.wasAbleTo(
        LoginUserTask.on());
        System.out.println("Se autentica el usuario");
        try {
            Thread.sleep(40000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Sebas.wasAbleTo(
                SecurityQuestionsTask.on()
        );
        Sebas.wasAbleTo(
                SelectRechargeTask.on(),
                SwitchToIframeTask.on(),
                OperatorElementIframeTask.on()

        );
        Sebas.wasAbleTo(
                DataRechargeEmptyTask.on(),
                ValueEmptyRechargeTask.on(),
                RechargeDataTask.on()
        );
        Sebas.wasAbleTo(
                SelectEmptyPaymentTask.on()
        );
    }

    @When("^He check confirm recharge$")
    public void heCheckConfirmRecharge() {
        Sebas.wasAbleTo(
                ConfirmRechargeTask.on()
        );
    }

    @Then("^He should sees the text Fondos Insuficientes$")
    public void heShouldSeesTheTextFondosInsuficientes() {
        System.out.println("Successful pay ? \n Titulo de respuesta del envio es: "+ ConfirmRechargeQuestion.confirmRecharge().answeredBy(Sebas));
    }
}