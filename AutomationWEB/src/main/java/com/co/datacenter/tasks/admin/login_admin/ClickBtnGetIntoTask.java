package com.co.datacenter.tasks.admin.login_admin;

import com.co.datacenter.userinterfaces.HomeAdminPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickBtnGetIntoTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomeAdminPage.BTN_GET_INTO)
        );

    }

    public static ClickBtnGetIntoTask on(){
        return instrumented(ClickBtnGetIntoTask.class);
    }
}
