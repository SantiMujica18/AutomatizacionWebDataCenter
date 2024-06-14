package com.co.datacenter.tasks.pines.data_pines;

import com.co.datacenter.userinterfaces.pines.data_pines.DataPaymentPinesInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class InputCelTask implements Task {

    String cel = "3006593822";

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(DataPaymentPinesInterface.INPUT_NUM_CEL, isVisible()),
                Enter.theValue(cel).into(DataPaymentPinesInterface.INPUT_NUM_CEL)
        );

    }

    public static InputCelTask on(){
        return instrumented(InputCelTask.class);
    }
}
