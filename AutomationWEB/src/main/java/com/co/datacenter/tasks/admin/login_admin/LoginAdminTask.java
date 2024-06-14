package com.co.datacenter.tasks.admin.login_admin;

import com.co.datacenter.userinterfaces.HomeAdminPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoginAdminTask implements Task {

    final String USER = "datacenter@dcsas.com.co";
    final String PASSWORD = "12345";


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(USER).into(HomeAdminPage.INPUT_NAME),
                Enter.theValue(PASSWORD).into(HomeAdminPage.INPUT_PASSWORD)
        );


    }


    public static LoginAdminTask on(){
        return instrumented(LoginAdminTask.class);
    }
}
