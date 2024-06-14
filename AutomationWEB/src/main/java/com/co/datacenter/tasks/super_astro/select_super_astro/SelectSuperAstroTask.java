package com.co.datacenter.tasks.super_astro.select_super_astro;

import com.co.datacenter.userinterfaces.super_astro.select_super_astro.SelectSuperAstroInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SelectSuperAstroTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(SelectSuperAstroInterface.SCROLL_SUPER_CHANCE, isVisible()),
                Scroll.to(SelectSuperAstroInterface.SCROLL_SUPER_CHANCE)
        );

        actor.attemptsTo(WaitUntil.the(SelectSuperAstroInterface.SUPER_ASTRO, isVisible()),
                Click.on(SelectSuperAstroInterface.SUPER_ASTRO)
        );


    }
    public static SelectSuperAstroTask on(){
        return instrumented(SelectSuperAstroTask.class);
    }
}
