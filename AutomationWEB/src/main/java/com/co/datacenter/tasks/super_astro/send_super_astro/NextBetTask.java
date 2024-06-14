package com.co.datacenter.tasks.super_astro.send_super_astro;

import com.co.datacenter.userinterfaces.super_astro.send_super_astro.ConfirmBuySuperAstroInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class NextBetTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(ConfirmBuySuperAstroInterface.BTN_NEW_BET, isVisible()),
                Click.on(ConfirmBuySuperAstroInterface.BTN_NEW_BET)
        );
    }

    public static NextBetTask on(){
        return instrumented(NextBetTask.class);
    }
}
