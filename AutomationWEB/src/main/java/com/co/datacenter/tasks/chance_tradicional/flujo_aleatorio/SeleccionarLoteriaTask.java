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

public class SeleccionarLoteriaTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                WaitUntil.the(DatosLoteriaInterface.LOTERIA,isVisible()),
                Click.on(DatosLoteriaInterface.LOTERIA),

                WaitUntil.the(DatosLoteriaInterface.CAFETE, isVisible()),
                WaitUntil.the(DatosLoteriaInterface.CAFETE, isClickable()),
                Click.on(DatosLoteriaInterface.CAFETE),
                Delay.ofMilliseconds(1000),

                WaitUntil.the(DatosLoteriaInterface.SCROLL, isVisible()),
                Scroll.to(DatosLoteriaInterface.SCROLL),
                Delay.ofMilliseconds(1000),

                WaitUntil.the(DatosLoteriaInterface.ACEPTAR_LOTERIA, isVisible()),
                WaitUntil.the(DatosLoteriaInterface.ACEPTAR_LOTERIA, isClickable()),
                Click.on(DatosLoteriaInterface.ACEPTAR_LOTERIA),
                Delay.ofMilliseconds(1000)

                );
    }
    public static SeleccionarLoteriaTask on () {return new SeleccionarLoteriaTask();}
}
