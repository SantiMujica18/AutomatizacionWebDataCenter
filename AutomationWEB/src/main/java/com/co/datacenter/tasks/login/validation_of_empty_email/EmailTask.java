package com.co.datacenter.tasks.login.validation_of_empty_email;

import com.co.datacenter.userinterfaces.login.validation_of_empty_email.EmailInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EmailTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("").into(EmailInterface.USERNAME),
                Enter.theValue("Brayan1234").into(EmailInterface.PASSWORD),
                /*
                Click.on(EmailInterface.CHECK_BOX_1),
                Click.on(EmailInterface.CHECK_BOX_2),
                Click.on(EmailInterface.CHECK_BOX_3),
                 */
                Scroll.to(EmailInterface.BTN_LOGIN),
                Click.on(EmailInterface.BTN_LOGIN)
        );

    }

    public static EmailTask on(){
        return instrumented(EmailTask.class);
    }
}
