package com.co.datacenter.tasks.maxi_chance.confirm_maxi_chance;

import com.co.datacenter.userinterfaces.maxi_chance.data_maxi_chance.DataMaxiChanceInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AcceptMaxiChanceTask  implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
         actor.attemptsTo(
                 WaitUntil.the(DataMaxiChanceInterface.BTN_ACCEPT_NOTIFICACTION, isVisible()),
                 Click.on(DataMaxiChanceInterface.BTN_ACCEPT_NOTIFICACTION)
         );

    }

    public static AcceptMaxiChanceTask on(){
        return instrumented(AcceptMaxiChanceTask.class);
    }
}
