package com.co.datacenter.tasks.switch_iframe;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Switch;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SwitchToIframeTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Switch.toFrame("idFramePagina"));

    }

    public static SwitchToIframeTask on() {
        return instrumented(SwitchToIframeTask.class);
    }
}
