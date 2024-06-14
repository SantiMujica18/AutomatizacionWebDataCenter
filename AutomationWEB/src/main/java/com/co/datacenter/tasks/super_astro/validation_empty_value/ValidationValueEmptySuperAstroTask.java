package com.co.datacenter.tasks.super_astro.validation_empty_value;

import com.co.datacenter.tasks.delay.Delay;
import com.co.datacenter.userinterfaces.super_astro.send_super_astro.SendSuperAstroOneInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.time.LocalTime;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ValidationValueEmptySuperAstroTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(SendSuperAstroOneInterface.AUTOMATIC_TYPE_BET, isVisible()),
                Click.on(SendSuperAstroOneInterface.AUTOMATIC_TYPE_BET)
        );

        LocalTime horaActual = LocalTime.now();
        LocalTime horaCondicional = LocalTime.of(14,05);

        if (horaActual.isBefore(horaCondicional)){

            actor.attemptsTo(
                    WaitUntil.the(SendSuperAstroOneInterface.CHECK_BOX_ASTRO_SOL, isVisible()),
                    Click.on(SendSuperAstroOneInterface.CHECK_BOX_ASTRO_SOL),
                    Delay.ofMilliseconds(500)
            );

        }else {
            actor.attemptsTo(
                    WaitUntil.the(SendSuperAstroOneInterface.CHECK_BOX_ASTRO_LUNA, isVisible()),
                    Click.on(SendSuperAstroOneInterface.CHECK_BOX_ASTRO_LUNA),
                    Delay.ofMilliseconds(500)

            );

        }

        actor.attemptsTo(
                WaitUntil.the(SendSuperAstroOneInterface.SCROLL_SELECT_TYPE, isVisible()),
                Scroll.to(SendSuperAstroOneInterface.SCROLL_SELECT_TYPE)
        );

        actor.attemptsTo(
                WaitUntil.the(SendSuperAstroOneInterface.NEXT_BUTTON_AUTOMATIC, isVisible()),
                Click.on(SendSuperAstroOneInterface.NEXT_BUTTON_AUTOMATIC),
                Delay.ofMilliseconds(500)

        );

    }


    public static ValidationValueEmptySuperAstroTask on(){
        return instrumented(ValidationValueEmptySuperAstroTask.class);
    }
}

