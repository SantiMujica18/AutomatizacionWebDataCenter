package com.co.datacenter.tasks.admin;

import com.co.datacenter.userinterfaces.admin.select_admin.SelectAdminInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectSectionAdminTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SelectAdminInterface.ADMINSTRATION_SECTION)
        );

    }

    public static SelectSectionAdminTask on(){
        return instrumented(SelectSectionAdminTask.class);
    }
}
