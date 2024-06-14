package com.co.datacenter.tasks.super_astro.validation_min_value;

import com.co.datacenter.tasks.delay.Delay;
import com.co.datacenter.userinterfaces.super_astro.send_super_astro.SendSuperAstroOneInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import java.time.LocalTime;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ValidationMinValueTask implements Task {
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
                    Click.on(SendSuperAstroOneInterface.CHECK_BOX_ASTRO_SOL)
            );

        }else {
            actor.attemptsTo(
                    WaitUntil.the(SendSuperAstroOneInterface.CHECK_BOX_ASTRO_LUNA, isVisible()),
                    Click.on(SendSuperAstroOneInterface.CHECK_BOX_ASTRO_LUNA)
            );

        }

        actor.attemptsTo(
                WaitUntil.the(SendSuperAstroOneInterface.INPUT_VALUE, isVisible()),
                Click.on(SendSuperAstroOneInterface.INPUT_VALUE),
                Hit.the(Keys.NUMPAD5).into(SendSuperAstroOneInterface.INPUT_VALUE),
                Delay.ofMilliseconds(100),
                Hit.the(Keys.NUMPAD0).into(SendSuperAstroOneInterface.INPUT_VALUE)

        );

        actor.attemptsTo(
                WaitUntil.the(SendSuperAstroOneInterface.SCROLL_SELECT_TYPE, isVisible()),
                Scroll.to(SendSuperAstroOneInterface.SCROLL_SELECT_TYPE)
        );

        actor.attemptsTo(
                WaitUntil.the(SendSuperAstroOneInterface.NEXT_BUTTON_AUTOMATIC, isVisible()),
                Click.on(SendSuperAstroOneInterface.NEXT_BUTTON_AUTOMATIC));

        actor.attemptsTo(
                WaitUntil.the(SendSuperAstroOneInterface.NEXT_BUTTON_AUTOMATIC, isVisible()),
                Click.on(SendSuperAstroOneInterface.NEXT_BUTTON_AUTOMATIC));

    }


    public static ValidationMinValueTask on(){
        return instrumented(ValidationMinValueTask.class);
    }
}

