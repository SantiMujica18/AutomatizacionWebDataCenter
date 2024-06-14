package com.co.datacenter.tasks.pines.data_pines;

import com.co.datacenter.userinterfaces.pines.data_pines.DataPaymentPinesInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectInputPinTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                //WaitUntil.the(DataPaymentPinesInterface.INPUT_SELECT_PIN, isVisible()),
                Scroll.to(DataPaymentPinesInterface.SCROLL_TITLE_COMPRA_PINES)
        );

        actor.attemptsTo(
                //WaitUntil.the(DataPaymentPinesInterface.INPUT_SELECT_PIN, isVisible()),
                Click.on(DataPaymentPinesInterface.INPUT_SELECT_PIN)
        );

    }

    public static SelectInputPinTask on(){
        return instrumented(SelectInputPinTask.class);
    }
}
