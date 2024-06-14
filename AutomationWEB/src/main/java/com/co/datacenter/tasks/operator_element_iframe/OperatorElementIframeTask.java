package com.co.datacenter.tasks.operator_element_iframe;

import com.co.datacenter.userinterfaces.recarga.select_operator.SelectOperatorInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class OperatorElementIframeTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(SelectOperatorInterface.CELULARES, isVisible()),
                Scroll.to((SelectOperatorInterface.CELULARES)));

        actor.attemptsTo(
                WaitUntil.the(SelectOperatorInterface.CLARO, isVisible()),
                Click.on(SelectOperatorInterface.CLARO)
        );

    }

    public static OperatorElementIframeTask on() {
        return instrumented(OperatorElementIframeTask.class);
    }
}
