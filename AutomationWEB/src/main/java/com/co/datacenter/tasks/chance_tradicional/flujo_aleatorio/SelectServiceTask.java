package com.co.datacenter.tasks.chance_tradicional.flujo_aleatorio;

import com.co.datacenter.tasks.delay.Delay;
import com.co.datacenter.userinterfaces.chance_tradicional_web.chance_tradicional_aleatorio.ComfirmTitleChanceTradicionalInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectServiceTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ComfirmTitleChanceTradicionalInterface.SELECT_PRODUCT),
                Delay.ofMilliseconds(500)
        );
    }
    public static SelectServiceTask on() {
        return instrumented(SelectServiceTask.class);
    }

}