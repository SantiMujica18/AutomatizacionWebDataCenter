package com.co.datacenter.tasks.maxi_chance.confirm_maxi_chance;

import com.co.datacenter.tasks.delay.Delay;
import com.co.datacenter.userinterfaces.maxi_chance.confirm_maxi_chance.ConfirmMaxiChanceInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ConfirmMaxiChanceTask implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(ConfirmMaxiChanceInterface.SCROLL_1, isVisible()),
                Scroll.to(ConfirmMaxiChanceInterface.SCROLL_1)
        );

        actor.attemptsTo(
                WaitUntil.the(ConfirmMaxiChanceInterface.CHECK_PAY, isVisible()),
                Click.on(ConfirmMaxiChanceInterface.CHECK_PAY),
                Delay.ofMilliseconds(1000)
        );

        actor.attemptsTo(
                WaitUntil.the(ConfirmMaxiChanceInterface.BTN_PAY, isVisible()),
                Click.on(ConfirmMaxiChanceInterface.BTN_PAY)
        );

    }

    public static ConfirmMaxiChanceTask on() {
        return instrumented(ConfirmMaxiChanceTask.class);
    }
}
