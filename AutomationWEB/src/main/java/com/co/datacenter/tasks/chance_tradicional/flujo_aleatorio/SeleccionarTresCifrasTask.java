package com.co.datacenter.tasks.chance_tradicional.flujo_aleatorio;


import com.co.datacenter.tasks.delay.Delay;
import com.co.datacenter.userinterfaces.chance_tradicional_web.chance_tradicional_aleatorio.DatosLoteriaInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public abstract class SeleccionarTresCifrasTask implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(DatosLoteriaInterface.TRES_CIFRAS, isVisible()),
                WaitUntil.the(DatosLoteriaInterface.TRES_CIFRAS, isClickable()),
                Click.on(DatosLoteriaInterface.TRES_CIFRAS),
                Delay.ofMilliseconds(1000),

                Scroll.to(DatosLoteriaInterface.SCROLL2)
        );


    }

    public static SeleccionarTresCifrasTask on () {
        return new SeleccionarTresCifrasTask() {
        };

    }
}

