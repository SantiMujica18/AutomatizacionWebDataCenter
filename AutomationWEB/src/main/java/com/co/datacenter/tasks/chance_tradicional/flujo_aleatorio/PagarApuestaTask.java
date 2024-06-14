package com.co.datacenter.tasks.chance_tradicional.flujo_aleatorio;

import com.co.datacenter.tasks.delay.Delay;
import com.co.datacenter.userinterfaces.chance_tradicional_web.chance_tradicional_aleatorio.ResumenApuestaInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public abstract class PagarApuestaTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(


                WaitUntil.the(ResumenApuestaInterface.CHECK_BOX_METODO_PAGO,isVisible()),
                WaitUntil.the(ResumenApuestaInterface.CHECK_BOX_METODO_PAGO, isClickable()),
                Click.on(ResumenApuestaInterface.CHECK_BOX_METODO_PAGO),
                Delay.ofMilliseconds(1000),

                WaitUntil.the(ResumenApuestaInterface.SCROLL_PAGAR, isVisible()),
                Scroll.to(ResumenApuestaInterface.SCROLL_PAGAR),
                Delay.ofMilliseconds(1000),

                WaitUntil.the(ResumenApuestaInterface.PAGAR,isVisible()),
                WaitUntil.the(ResumenApuestaInterface.PAGAR, isClickable()),
                Click.on(ResumenApuestaInterface.PAGAR),
                Delay.ofMilliseconds(5000)
        );

    }
    public static PagarApuestaTask on() {
        return instrumented(PagarApuestaTask.class);
    }
}

