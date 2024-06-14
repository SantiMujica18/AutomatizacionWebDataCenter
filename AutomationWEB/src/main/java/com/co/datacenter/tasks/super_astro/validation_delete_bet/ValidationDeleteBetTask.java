package com.co.datacenter.tasks.super_astro.validation_delete_bet;

import com.co.datacenter.userinterfaces.super_astro.send_super_astro.SendSuperAstroTwoInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ValidationDeleteBetTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(
                WaitUntil.the(SendSuperAstroTwoInterface.TITLE_SHOW, isVisible()),
                Click.on(SendSuperAstroTwoInterface.TITLE_SHOW)
        );

        actor.attemptsTo(
                WaitUntil.the(SendSuperAstroTwoInterface.DELETE, isVisible()),
                Click.on(SendSuperAstroTwoInterface.DELETE)
        );


    }

    public static ValidationDeleteBetTask on(){
        return instrumented(ValidationDeleteBetTask.class);
    }
}
