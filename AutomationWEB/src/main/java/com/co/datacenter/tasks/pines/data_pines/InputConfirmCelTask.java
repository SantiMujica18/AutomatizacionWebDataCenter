package com.co.datacenter.tasks.pines.data_pines;

import com.co.datacenter.userinterfaces.pines.data_pines.DataPaymentPinesInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class InputConfirmCelTask implements Task {

    String cel = "3009489302";

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(DataPaymentPinesInterface.CONFIRM_NUM_CEL, isVisible()),
                Enter.theValue(cel).into(DataPaymentPinesInterface.CONFIRM_NUM_CEL)
        );

    }

    public static InputConfirmCelTask on(){
        return instrumented(InputConfirmCelTask.class);
    }
}
