package com.co.datacenter.tasks.chance_tradicional.flujo_manual;

import com.co.datacenter.tasks.chance_tradicional.flujo_aleatorio.IngresaValorTask;
import com.co.datacenter.tasks.delay.Delay;
import com.co.datacenter.userinterfaces.chance_tradicional_web.chance_tradicional_aleatorio.DatosLoteriaInterface;
import com.co.datacenter.userinterfaces.chance_tradicional_web.chance_tradicional_manual.IngresarNumeroApuestaInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class IngresaApuestaTask implements Task {


    public static String numero_apuesta;

    public IngresaApuestaTask(String numero_apuesta) {
        this.numero_apuesta = numero_apuesta;

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                
                WaitUntil.the(IngresarNumeroApuestaInterface.CLICK_VALOR, isClickable()),
                WaitUntil.the(IngresarNumeroApuestaInterface.CLICK_VALOR,isClickable()),
                Click.on(IngresarNumeroApuestaInterface.CLICK_VALOR),

                WaitUntil.the(IngresarNumeroApuestaInterface.NUMERO_APUESTA, isVisible()),
                WaitUntil.the(IngresarNumeroApuestaInterface.NUMERO_APUESTA, isClickable()),
                Enter.theValue(numero_apuesta).into(IngresarNumeroApuestaInterface.NUMERO_APUESTA),
                Click.on(IngresarNumeroApuestaInterface.NUMERO_APUESTA),
                Delay.ofMilliseconds(1000)

        );
    }

    public static IngresaApuestaTask in(String numero_apuesta) {
        return new IngresaApuestaTask(numero_apuesta);
    }
}

