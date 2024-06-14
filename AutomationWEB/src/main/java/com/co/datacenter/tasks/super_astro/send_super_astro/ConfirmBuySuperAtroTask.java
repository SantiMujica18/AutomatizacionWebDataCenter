package com.co.datacenter.tasks.super_astro.send_super_astro;

import com.co.datacenter.userinterfaces.super_astro.send_super_astro.ConfirmBuySuperAstroInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ConfirmBuySuperAtroTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(ConfirmBuySuperAstroInterface.SCROLL_1, isVisible()),
                Scroll.to(ConfirmBuySuperAstroInterface.SCROLL_1)
        );

        actor.attemptsTo(
                WaitUntil.the(ConfirmBuySuperAstroInterface.CHECK_BOX_PAY, isVisible()),
                Click.on(ConfirmBuySuperAstroInterface.CHECK_BOX_PAY)
        );

        actor.attemptsTo(
                WaitUntil.the(ConfirmBuySuperAstroInterface.SCROLL_2, isVisible()),
                Scroll.to(ConfirmBuySuperAstroInterface.SCROLL_2)
        );

        actor.attemptsTo(
                WaitUntil.the(ConfirmBuySuperAstroInterface.BTN_PAY, isVisible()),
                Click.on(ConfirmBuySuperAstroInterface.BTN_PAY)
        );

        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        /*
        actor.attemptsTo(
                WaitUntil.the(ConfirmBuySuperAstroInterface.BTN_NEW_BET, isVisible()),
                Click.on(ConfirmBuySuperAstroInterface.BTN_NEW_BET)
        );

         */



    }
    public static ConfirmBuySuperAtroTask on(){
        return instrumented(ConfirmBuySuperAtroTask.class);
    }
}
