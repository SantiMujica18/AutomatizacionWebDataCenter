package com.co.datacenter.tasks.chance_tradicional.flujo_aleatorio;

import com.co.datacenter.tasks.delay.Delay;
import com.co.datacenter.userinterfaces.chance_millonario.confirm_chance_millonario.ConfirmChanceMillonarioInterface;
import com.co.datacenter.userinterfaces.chance_tradicional_web.chance_tradicional_aleatorio.ResumenApuestaInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ResumenApuestaTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(ResumenApuestaInterface.SCROLL3, isVisible()),
                Scroll.to(ResumenApuestaInterface.SCROLL3),
                Delay.ofMilliseconds(1000)

        );
    }
    public static ResumenApuestaTask on() {
        return instrumented(ResumenApuestaTask.class);
    }
}
