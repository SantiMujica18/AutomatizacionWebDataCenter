package com.co.datacenter.tasks.pines.data_pines;

import com.co.datacenter.userinterfaces.pines.data_pines.DataPaymentPinesInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class InputCorreoTask implements Task {

    String correo = "cupmi009@gmail.com";

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(DataPaymentPinesInterface.CORREO_ELECTRONICO, isVisible()),
                Enter.theValue(correo).into(DataPaymentPinesInterface.CORREO_ELECTRONICO)
        );

    }

    public static InputCorreoTask on(){
        return instrumented(InputCorreoTask.class);
    }
}
