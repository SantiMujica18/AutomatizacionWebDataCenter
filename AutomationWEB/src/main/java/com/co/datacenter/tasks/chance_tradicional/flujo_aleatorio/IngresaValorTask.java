package com.co.datacenter.tasks.chance_tradicional.flujo_aleatorio;

import com.co.datacenter.tasks.delay.Delay;
import com.co.datacenter.userinterfaces.chance_tradicional_web.chance_tradicional_aleatorio.DatosLoteriaInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class IngresaValorTask implements Task {


    public static String valor_apuesta;

    public IngresaValorTask(String valor_apuesta) {
        this.valor_apuesta = valor_apuesta;

    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                WaitUntil.the(DatosLoteriaInterface.SELECT_UNA, isVisible()),
                Enter.theValue(valor_apuesta).into(DatosLoteriaInterface.SELECT_UNA),
                WaitUntil.the(DatosLoteriaInterface.SELECT_UNA, isClickable()),
                Click.on(DatosLoteriaInterface.SELECT_UNA),
                Click.on(DatosLoteriaInterface.SELECT_UNA),
                Delay.ofMilliseconds(2000),

                WaitUntil.the(DatosLoteriaInterface.BOTON_SELECCIONAR, isVisible()),
                WaitUntil.the(DatosLoteriaInterface.BOTON_SELECCIONAR, isClickable()),
                Click.on(DatosLoteriaInterface.BOTON_SELECCIONAR),
                Delay.ofMilliseconds(500)

        );
    }
    public static IngresaValorTask in(String valor_apuesta) {
        return new IngresaValorTask(valor_apuesta);
    }
}
