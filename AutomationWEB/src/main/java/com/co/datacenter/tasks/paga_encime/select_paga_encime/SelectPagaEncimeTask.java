package com.co.datacenter.tasks.paga_encime.select_paga_encime;

import com.co.datacenter.userinterfaces.loteries.select_loteries.SelectLoteriesInterface;
import com.co.datacenter.userinterfaces.paga_encime.select_paga_encime.SelectPagaEncimeInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SelectPagaEncimeTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(SelectPagaEncimeInterface.SCROLL_1, isVisible()),
                Scroll.to(SelectPagaEncimeInterface.SCROLL_1),

                WaitUntil.the(SelectPagaEncimeInterface.SERVICE_PAGA_ENCIME, isVisible()),
                Click.on(SelectPagaEncimeInterface.SERVICE_PAGA_ENCIME)
        );

    }

    public static SelectPagaEncimeTask on(){
        return instrumented(SelectPagaEncimeTask.class);
    }
}
