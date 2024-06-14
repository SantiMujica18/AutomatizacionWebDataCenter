package com.co.datacenter.tasks.admin;

import com.co.datacenter.userinterfaces.admin.select_admin.SelectAdminInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectSetionSettingTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(SelectAdminInterface.SCROLL),
                Click.on(SelectAdminInterface.SETTING_SECTION)
        );

    }

    public static SelectSetionSettingTask on(){
        return instrumented(SelectSetionSettingTask.class);
    }
}
