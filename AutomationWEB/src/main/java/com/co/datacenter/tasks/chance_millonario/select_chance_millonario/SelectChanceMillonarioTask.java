package com.co.datacenter.tasks.chance_millonario.select_chance_millonario;

import com.co.datacenter.userinterfaces.chance_millonario.select_chance_millonario.SelectChanceMillonarioInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SelectChanceMillonarioTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(SelectChanceMillonarioInterface.SCROLL_1, isVisible()),
                Scroll.to(SelectChanceMillonarioInterface.SCROLL_1)
        );

        actor.attemptsTo(
                WaitUntil.the(SelectChanceMillonarioInterface.CHANCE_MILLONARIO, isVisible()),
                Click.on(SelectChanceMillonarioInterface.CHANCE_MILLONARIO)
        );

    }

    public static SelectChanceMillonarioTask on(){
        return instrumented(SelectChanceMillonarioTask.class);
    }
}
