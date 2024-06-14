package com.co.datacenter.tasks.chance_millonario.clean_chance_millonario;

import com.co.datacenter.userinterfaces.chance_millonario.data_chance_millonario.DataTwoPageChanceMillonarioInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CleanBetChanceMillonarioTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(DataTwoPageChanceMillonarioInterface.BTN_CLEAN, isVisible()),
                Click.on(DataTwoPageChanceMillonarioInterface.BTN_CLEAN)
        );

    }
    public static CleanBetChanceMillonarioTask on(){
        return instrumented(CleanBetChanceMillonarioTask.class);
    }
}
