package com.co.datacenter.tasks.pines.data_pines;

import com.co.datacenter.userinterfaces.pines.data_pines.DataPaymentPinesInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickCheckBoxDateTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                //WaitUntil.the(DataPaymentPinesInterface.INPUT_SELECT_PIN, isVisible()),
                Click.on(DataPaymentPinesInterface.CHECK_BOX_PERSONAL_DATE)
        );

    }

    public static ClickCheckBoxDateTask on(){
        return instrumented(ClickCheckBoxDateTask.class);
    }
}
