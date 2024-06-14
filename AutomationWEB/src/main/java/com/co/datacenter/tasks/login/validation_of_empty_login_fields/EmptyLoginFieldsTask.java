package com.co.datacenter.tasks.login.validation_of_empty_login_fields;

import com.co.datacenter.userinterfaces.login.validation_of_empty_login_fields.LoginEmptyFieldsInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EmptyLoginFieldsTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("").into(LoginEmptyFieldsInterface.USERNAME),
                Enter.theValue("").into(LoginEmptyFieldsInterface.PASSWORD),
                Scroll.to(LoginEmptyFieldsInterface.BTN_LOGIN),
                Click.on(LoginEmptyFieldsInterface.BTN_LOGIN),
                Scroll.to(LoginEmptyFieldsInterface.USERNAME)
        );

    }
    public static EmptyLoginFieldsTask on(){
        return instrumented(EmptyLoginFieldsTask.class);
    }
}
