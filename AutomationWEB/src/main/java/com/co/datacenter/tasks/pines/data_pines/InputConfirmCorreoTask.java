package com.co.datacenter.tasks.pines.data_pines;

import com.co.datacenter.userinterfaces.pines.data_pines.DataPaymentPinesInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class InputConfirmCorreoTask implements Task {

    String correo = "cupmi009@gmail.com";

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                //WaitUntil.the(DataPaymentPinesInterface.INPUT_SELECT_PIN, isVisible()),
                Enter.theValue(correo).into(DataPaymentPinesInterface.CONFIRM_CORREO_ELECTRONICO)
        );

    }

    public static InputConfirmCorreoTask on(){
        return instrumented(InputConfirmCorreoTask.class);
    }
}
