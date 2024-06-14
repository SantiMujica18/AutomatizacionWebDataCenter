package com.co.datacenter.tasks.pines.data_pines;

import com.co.datacenter.userinterfaces.pines.data_pines.DataPaymentPinesInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ClickBtnAcceptAlertTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(DataPaymentPinesInterface.BTN_ACCEPT_ALERT, isVisible()),
                Click.on(DataPaymentPinesInterface.BTN_ACCEPT_ALERT)
        );

    }

    public static ClickBtnAcceptAlertTask on(){
        return instrumented(ClickBtnAcceptAlertTask.class);
    }
}
