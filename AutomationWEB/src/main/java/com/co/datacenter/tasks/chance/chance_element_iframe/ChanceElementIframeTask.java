package com.co.datacenter.tasks.chance.chance_element_iframe;

import com.co.datacenter.userinterfaces.chance_tradicional.select_chance.SelectChanceInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ChanceElementIframeTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(SelectChanceInterface.SCROLL_CHANCE, isVisible()),
                Scroll.to((SelectChanceInterface.SCROLL_CHANCE)));

        actor.attemptsTo(
                WaitUntil.the(SelectChanceInterface.CHANCE, isVisible()),
                Click.on((SelectChanceInterface.CHANCE)));


    }

    public static ChanceElementIframeTask on() {
        return instrumented(ChanceElementIframeTask.class);
    }
}
