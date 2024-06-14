package com.co.datacenter.tasks.pines;

import com.co.datacenter.tasks.delay.Delay;
import com.co.datacenter.tasks.pines.data_pines.ClickBtnAcceptAlertTask;
import com.co.datacenter.userinterfaces.pines.data_pines.DataPaymentPinesInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class FillsFormValuePinTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(DataPaymentPinesInterface.INPUT_SELECT_PIN, isVisible()),
                Click.on(DataPaymentPinesInterface.INPUT_SELECT_PIN),
                Delay.ofMilliseconds(500),
                WaitUntil.the(DataPaymentPinesInterface.VALUE_CUPON, isVisible()),
                Click.on(DataPaymentPinesInterface.VALUE_CUPON),
                Delay.ofMilliseconds(500),
                WaitUntil.the(DataPaymentPinesInterface.CHECK_BOX_PERSONAL_DATE,isVisible()),
                Click.on(DataPaymentPinesInterface.CHECK_BOX_PERSONAL_DATE),
                Delay.ofMilliseconds(500),
                Click.on(DataPaymentPinesInterface.BTN_NEXT),
                Delay.ofMilliseconds(500)
                );

    }

    public static FillsFormValuePinTask on(){
        return instrumented(FillsFormValuePinTask.class);
    }
}


