package com.co.datacenter.tasks.loteries.select_loteries;

import com.co.datacenter.userinterfaces.loteries.select_loteries.SelectLoteriesInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SelectLoteriesTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(SelectLoteriesInterface.LOTERIES_SERVICE, isVisible()),
                Scroll.to(SelectLoteriesInterface.LOTERIES_SERVICE),
                Click.on(SelectLoteriesInterface.LOTERIES_SERVICE)
        );

    }

    public static SelectLoteriesTask on(){
        return instrumented(SelectLoteriesTask.class);
    }
}
