package com.co.datacenter.tasks.pines.select_pines;

import com.co.datacenter.userinterfaces.pines.select_pines.SelectPinesInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectPinesTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(SelectPinesInterface.PAY_PINES)
        );

    }

    public static SelectPinesTask on(){
        return instrumented(SelectPinesTask.class);
    }
}
