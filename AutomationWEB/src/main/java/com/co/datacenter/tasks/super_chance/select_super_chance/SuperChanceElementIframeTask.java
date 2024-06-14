package com.co.datacenter.tasks.super_chance.select_super_chance;

import com.co.datacenter.userinterfaces.super_chance.select_super_chance.SelectSuperChanceInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SuperChanceElementIframeTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(SelectSuperChanceInterface.SCROLL_SUPER_CHANCE, isVisible()),
                Scroll.to((SelectSuperChanceInterface.SCROLL_SUPER_CHANCE)));

        actor.attemptsTo(
                WaitUntil.the(SelectSuperChanceInterface.SUPER_CHANCE, isVisible()),
                Click.on((SelectSuperChanceInterface.SUPER_CHANCE)));
    }

    public static SuperChanceElementIframeTask on() {
        return instrumented(SuperChanceElementIframeTask.class);
    }
}
