package com.co.datacenter.tasks.admin.openthepageadmin;

import com.co.datacenter.userinterfaces.HomeAdminPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenThePageAdmin implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(new HomeAdminPage()));
    }

    public static OpenThePageAdmin open(){
        return instrumented(OpenThePageAdmin.class);
    }
}
