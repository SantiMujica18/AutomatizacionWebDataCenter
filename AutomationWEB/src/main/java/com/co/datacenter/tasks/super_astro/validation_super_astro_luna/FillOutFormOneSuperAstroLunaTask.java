package com.co.datacenter.tasks.super_astro.validation_super_astro_luna;

import com.co.datacenter.userinterfaces.super_astro.send_super_astro.SendSuperAstroOneInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class FillOutFormOneSuperAstroLunaTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(SendSuperAstroOneInterface.AUTOMATIC_TYPE_BET, isVisible()),
                Click.on(SendSuperAstroOneInterface.AUTOMATIC_TYPE_BET)
        );


        actor.attemptsTo(
                WaitUntil.the(SendSuperAstroOneInterface.CHECK_BOX_ASTRO_LUNA, isVisible()),
                Click.on(SendSuperAstroOneInterface.CHECK_BOX_ASTRO_LUNA)
        );



        actor.attemptsTo(
                WaitUntil.the(SendSuperAstroOneInterface.INPUT_VALUE, isVisible()),
                Enter.theValue("1000").into(SendSuperAstroOneInterface.INPUT_VALUE)

        );
        /*
        actor.attemptsTo(
                WaitUntil.the(SendSuperAstroOneInterface.SCROLL_SELECT_TYPE, isVisible()),
                Scroll.to(SendSuperAstroOneInterface.SCROLL_SELECT_TYPE)
        );

         */

        actor.attemptsTo(
                WaitUntil.the(SendSuperAstroOneInterface.NEXT_BUTTON_AUTOMATIC, isVisible()),
                Click.on(SendSuperAstroOneInterface.NEXT_BUTTON_AUTOMATIC));

        actor.attemptsTo(
                WaitUntil.the(SendSuperAstroOneInterface.NEXT_BUTTON_AUTOMATIC, isVisible()),
                Click.on(SendSuperAstroOneInterface.NEXT_BUTTON_AUTOMATIC));

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }


    public static FillOutFormOneSuperAstroLunaTask on(){
        return instrumented(FillOutFormOneSuperAstroLunaTask.class);
    }
}
