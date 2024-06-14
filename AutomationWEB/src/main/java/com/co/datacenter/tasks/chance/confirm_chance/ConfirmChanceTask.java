package com.co.datacenter.tasks.chance.confirm_chance;

import com.co.datacenter.userinterfaces.chance_tradicional.confirm_buy_chance.ConfirmChanceInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ConfirmChanceTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(ConfirmChanceInterface.SCROLL_1, isVisible()),
                Scroll.to(ConfirmChanceInterface.SCROLL_1)

        );

        actor.attemptsTo(
                WaitUntil.the(ConfirmChanceInterface.CHECK_BOX_BALANCE_PAY, isVisible()),
                Click.on(ConfirmChanceInterface.CHECK_BOX_BALANCE_PAY)
        );

        actor.attemptsTo(
                WaitUntil.the(ConfirmChanceInterface.BTN_NEXT, isVisible()),
                Click.on(ConfirmChanceInterface.BTN_NEXT)
        );

    }

    public static ConfirmChanceTask on(){
        return instrumented(ConfirmChanceTask.class);
    }
}
