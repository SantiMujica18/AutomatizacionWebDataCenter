package com.co.datacenter.tasks;

import com.co.datacenter.tasks.admin.login_admin.ClickBtnGetIntoTask;
import com.co.datacenter.userinterfaces.admin.select_admin.SelectAdminInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectCleanBalanceTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SelectAdminInterface.CLEAN_BALANCE)
        );

    }
    public static SelectCleanBalanceTask on(){
        return instrumented(SelectCleanBalanceTask.class);
    }
}
