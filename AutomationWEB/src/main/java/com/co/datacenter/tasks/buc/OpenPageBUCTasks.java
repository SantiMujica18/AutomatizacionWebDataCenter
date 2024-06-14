package com.co.datacenter.tasks.buc;


import com.co.datacenter.userinterfaces.buc.HomePageBUCInterfaces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenPageBUCTasks implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(new HomePageBUCInterfaces()));

    }

    public static OpenPageBUCTasks open() {
        return instrumented(OpenPageBUCTasks.class);
    }
}
