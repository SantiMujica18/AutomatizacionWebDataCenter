package com.co.datacenter.stepsdefinitions.recharge.select_operator;



import com.co.datacenter.questions.recharge.select_operator.SelectOperatorQuestion;
import com.co.datacenter.tasks.login.signin.LoginUserTask;
import com.co.datacenter.tasks.OpenThePage;
import com.co.datacenter.tasks.operator_element_iframe.OperatorElementIframeTask;
import com.co.datacenter.tasks.recharge.select_recharge.SelectRechargeTask;
import com.co.datacenter.tasks.switch_iframe.SwitchToIframeTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class SelectOperatorStepDefinition {


    @Managed(driver = "Chrome")

    private WebDriver hisBrowser;

    private Actor Sebas = Actor.named("Sebas");

    @Before
    public void setUp(){
        Sebas.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^Sebastian in the operators page$")
    public void sebastianInTheOperatorsPage() throws InterruptedException {
        Sebas.wasAbleTo(
                OpenThePage.on(),
                LoginUserTask.on()

        );
        Thread.sleep(40000);
          Sebas.wasAbleTo(
                  SelectRechargeTask.on()
        );
    }


    @When("^He select operator claro$")
    public void heSelectOperatorClaro(){
        Sebas.wasAbleTo(
                SwitchToIframeTask.on(),
                OperatorElementIframeTask.on()
        );

    }

    @Then("^He should sees the text REALIZAR RECARGA$")
    public void heShouldSeesTheTextREALIZARRECARGA() {
        System.out.println("Bienvenido a el operador claro ?  \n el titulo de bievenida es: "+ SelectOperatorQuestion.selectOpera().answeredBy(Sebas));
    }



}
