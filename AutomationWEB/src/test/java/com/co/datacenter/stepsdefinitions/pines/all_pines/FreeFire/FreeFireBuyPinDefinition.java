package com.co.datacenter.stepsdefinitions.pines.all_pines.FreeFire;
import com.co.datacenter.questions.pines.data_pines.DataPinesQuestion;
import com.co.datacenter.questions.pines.pines_no_founds.PinesNoFoundsQuestion;
import com.co.datacenter.tasks.OpenThePage;
import com.co.datacenter.tasks.login.security_questions_tasks.SecurityQuestionsTask;
import com.co.datacenter.tasks.login.signin.LoginUserTask;
import com.co.datacenter.tasks.pines.FillsFormValuePinTask;
import com.co.datacenter.tasks.pines.data_pines.ClickBtnPayTask;
import com.co.datacenter.tasks.pines.data_pines.ClickMethodPayTask;
import com.co.datacenter.tasks.pines.select_pines.SelectFreefirePinTask;
import com.co.datacenter.tasks.pines.select_pines.SelectPinesTask;
import com.co.datacenter.tasks.switch_iframe.SwitchToIframeTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class FreeFireBuyPinDefinition {
    @Managed(driver = "Chrome")

    private WebDriver hisBrowser;


    private Actor Sebas = Actor.named("Sebastian");

    @Before
    public void setUp(){
        Sebas.can(BrowseTheWeb.with(hisBrowser));
    }


    @Given("^I'm on the pines service selector$")
    public void iMOnThePinesServiceSelector() throws InterruptedException{
        Sebas.wasAbleTo(
                OpenThePage.on(),
                LoginUserTask.on()
        );
        Sebas.wasAbleTo(
                SecurityQuestionsTask.on()
        );
        Sebas.wasAbleTo(
                SelectPinesTask.on(),
                SwitchToIframeTask.on()
        );   }


    @When("^I select Free fire pin and fill all the form$")
    public void iSelectFreeFirePinAndFillAllTheForm() {
        Sebas.wasAbleTo(
                SelectFreefirePinTask.on(),
                FillsFormValuePinTask.on(),
                ClickMethodPayTask.on(),
                ClickBtnPayTask.on()
        );
    }

    @Then("^He should sees the title Pago exitoso$")
    public void heShouldSeesTheTitlePagoExitoso() throws InterruptedException{
        Thread.sleep(10000);
        System.out.println("El titulo de validacion es el siguiente: Pago exitoso \n" + DataPinesQuestion.paymentSuccessful().answeredBy(Sebas).equals("Pago exitoso"));

    }

}
