package com.co.datacenter.tasks.admin.admin_data;

import com.co.datacenter.userinterfaces.admin.data_admin.DataAdminInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EnterDocumentTask implements Task {

    private final String DOCUMENT = "1094956106";
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(DOCUMENT).into(DataAdminInterface.INPUT_DOCUMENT)
        );

    }
    public static EnterDocumentTask on(){
        return instrumented(EnterDocumentTask.class);
    }
}
