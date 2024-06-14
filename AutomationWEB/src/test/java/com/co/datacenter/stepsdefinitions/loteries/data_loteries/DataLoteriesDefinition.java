package com.co.datacenter.stepsdefinitions.loteries.data_loteries;


import com.co.datacenter.questions.chance.data_chance.DataChanceQuestion;
import com.co.datacenter.questions.loteries.data_loteries.DataThreePageQuestion;
import com.co.datacenter.tasks.OpenThePage;
import com.co.datacenter.tasks.chance.chance_element_iframe.ChanceElementIframeTask;
import com.co.datacenter.tasks.chance.data_chance_element_iframe.DataChanceElementIframeTask;
import com.co.datacenter.tasks.login.signin.LoginUserTask;
import com.co.datacenter.tasks.loteries.data_loteries.DataOnePageTask;
import com.co.datacenter.tasks.loteries.data_loteries.DataThreePageTask;
import com.co.datacenter.tasks.loteries.data_loteries.DataTwoPageTask;
import com.co.datacenter.tasks.loteries.select_loteries.SelectLoteriesTask;
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

public class DataLoteriesDefinition {

    @Managed(driver = "Chrome")
    private WebDriver hisBrowser;
    private Actor Sebas = Actor.named("Sebas");
    @Before
    public void setUp(){
        Sebas.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^Sebastian wants to take a loteries$")
    public void sebastianWantsToTakeALoteries() throws InterruptedException {
        Sebas.wasAbleTo(
                OpenThePage.on(),
                LoginUserTask.on()
        );
        Thread.sleep(40000);
        Sebas.wasAbleTo(
                SwitchToIframeTask.on(),
                SelectLoteriesTask.on()
        );

        Sebas.wasAbleTo(
                DataOnePageTask.on(),
                DataTwoPageTask.on()
        );

    }


    @When("^He insert the data in the form$")
    public void heInsertTheDataInTheForm() {
        Sebas.wasAbleTo(
                DataThreePageTask.on()
        );
    }

    @Then("^He should sees the title Confirmación de compra$")
    public void heShouldSeesTheTitleConfirmaciónDeCompra() {
        System.out.println("Confirmacion de compra ?  \n el titulo de bievenida es: "+ DataThreePageQuestion.dataThreePage().answeredBy(Sebas));

    }


}
