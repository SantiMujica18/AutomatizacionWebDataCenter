package com.co.datacenter.tasks.maxi_chance.maxi_chance_element_frame;

import com.co.datacenter.userinterfaces.maxi_chance.select_maxi_chance.SelectMaxiChanceInterface;
import com.co.datacenter.userinterfaces.super_chance.select_super_chance.SelectSuperChanceInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class MaxiChanceElementIframeTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(SelectMaxiChanceInterface.SCROLL_MAXI_CHANCE, isVisible()),
                Scroll.to((SelectMaxiChanceInterface.SCROLL_MAXI_CHANCE)));

        actor.attemptsTo(
                WaitUntil.the(SelectMaxiChanceInterface.MAXI_CHANCE, isVisible()),
                Click.on((SelectMaxiChanceInterface.MAXI_CHANCE)));


    }

    public static MaxiChanceElementIframeTask on() {
        return instrumented(MaxiChanceElementIframeTask.class);
    }
}
