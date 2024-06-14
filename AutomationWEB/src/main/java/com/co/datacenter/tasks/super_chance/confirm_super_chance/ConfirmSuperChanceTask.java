package com.co.datacenter.tasks.super_chance.confirm_super_chance;

import com.co.datacenter.tasks.delay.Delay;
import com.co.datacenter.userinterfaces.chance_tradicional.confirm_buy_chance.ConfirmChanceInterface;
import com.co.datacenter.userinterfaces.super_chance.confirm_super_chance.ConfirmSuperChanceInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ConfirmSuperChanceTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(ConfirmSuperChanceInterface.CONFIRM_SCROLL_1, isVisible()),
                Scroll.to(ConfirmSuperChanceInterface.CONFIRM_SCROLL_1

        ));

        actor.attemptsTo(
                WaitUntil.the(ConfirmSuperChanceInterface.CHEKBOX_CONFIRM_SUPER_CHANCE, isVisible()),
                Click.on(ConfirmSuperChanceInterface.CHEKBOX_CONFIRM_SUPER_CHANCE),
                Delay.ofMilliseconds(500)
        );


        actor.attemptsTo(
                WaitUntil.the(ConfirmSuperChanceInterface.BTN_PAY_SUPER_CHANCE,isVisible()),
                Click.on(ConfirmSuperChanceInterface.BTN_PAY_SUPER_CHANCE),
                Delay.ofMilliseconds(5000)
        );

    }

    public static ConfirmSuperChanceTask on(){
        return instrumented(ConfirmSuperChanceTask.class);
    }
}
