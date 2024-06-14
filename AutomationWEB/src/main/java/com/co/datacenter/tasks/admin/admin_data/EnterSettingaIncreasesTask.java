package com.co.datacenter.tasks.admin.admin_data;

import com.co.datacenter.userinterfaces.admin.data_admin.DataAdminInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EnterSettingaIncreasesTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DataAdminInterface.VALUE_INCREASE)
        );
    }
    public static EnterSettingaIncreasesTask on(){
        return instrumented(EnterSettingaIncreasesTask.class);
    }
}
