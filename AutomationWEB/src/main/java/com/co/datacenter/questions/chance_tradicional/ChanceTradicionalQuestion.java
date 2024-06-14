package com.co.datacenter.questions.chance_tradicional;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.datacenter.userinterfaces.chance_tradicional_web.chance_tradicional_aleatorio.ResumenApuestaInterface.PAGO_EXITOSO;


public class ChanceTradicionalQuestion implements Question<Boolean>{

    @Override
    public Boolean answeredBy(Actor actor) {
        return PAGO_EXITOSO.resolveFor(actor).isVisible();
    }

    public static ChanceTradicionalQuestion validacionPago() {
        return new ChanceTradicionalQuestion();
    }
}
