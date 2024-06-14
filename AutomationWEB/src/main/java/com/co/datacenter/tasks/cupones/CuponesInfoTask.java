package com.co.datacenter.tasks.cupones;

import com.co.datacenter.userinterfaces.cupones.CuponesInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CuponesInfoTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(CuponesInterface.HISTORIC_CUPONES, isVisible()),
                Click.on(CuponesInterface.HISTORIC_CUPONES)
        );

    }

    public static CuponesInfoTask on(){
        return instrumented(CuponesInfoTask.class);
    }
}

