package com.co.datacenter.tasks.admin.admin_data;

import com.co.datacenter.userinterfaces.admin.data_admin.DataAdminInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EnterValueTask implements Task {

    private final String VALUE = "400000";
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(VALUE).into(DataAdminInterface.VALUE)
        );
    }
    public static EnterValueTask on(){
        return instrumented(EnterValueTask.class);
    }
}
