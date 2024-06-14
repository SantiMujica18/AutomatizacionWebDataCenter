package com.co.datacenter.tasks.login.validation_of_empty_password;


import com.co.datacenter.userinterfaces.login.validation_of_empty_password.EmptyPasswordInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EmptyPasswordTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue("frijoizesoinnei-9575@yopmail.com").into(EmptyPasswordInterface.USERNAME),
                Enter.theValue("").into(EmptyPasswordInterface.PASSWORD),
                /*
                Click.on(EmptyPasswordInterface.CHECK_BOX_1),
                Click.on(EmptyPasswordInterface.CHECK_BOX_2),
                Click.on(EmptyPasswordInterface.CHECK_BOX_3),
                 */

                Scroll.to(EmptyPasswordInterface.BTN_LOGIN),
                Click.on(EmptyPasswordInterface.BTN_LOGIN)
                );



    }
    public static EmptyPasswordTask on(){
        return instrumented(EmptyPasswordTask.class);
    }
}
