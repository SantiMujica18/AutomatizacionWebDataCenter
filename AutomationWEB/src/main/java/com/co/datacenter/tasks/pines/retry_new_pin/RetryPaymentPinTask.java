package com.co.datacenter.tasks.pines.retry_new_pin;

import com.co.datacenter.tasks.pines.FillsFormValuePinTask;
import com.co.datacenter.userinterfaces.pines.data_pines.DataPaymentPinesInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class RetryPaymentPinTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(DataPaymentPinesInterface.CLOSE_BUTTON,isVisible()),
                Click.on(DataPaymentPinesInterface.CLOSE_BUTTON)

        );

    }

    public static RetryPaymentPinTask on(){
        return instrumented(RetryPaymentPinTask.class);
    }
}



