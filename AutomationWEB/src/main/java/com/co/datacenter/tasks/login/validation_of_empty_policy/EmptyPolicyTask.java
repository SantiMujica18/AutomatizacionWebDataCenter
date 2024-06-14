package com.co.datacenter.tasks.login.validation_of_empty_policy;

import com.co.datacenter.userinterfaces.login.validation_of_empty_policy.EmptyPolicyInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EmptyPolicyTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("frijoizesoinnei-9575@yopmail.com").into(EmptyPolicyInterface.USERNAME),
                Enter.theValue("Brayan1234").into(EmptyPolicyInterface.PASSWORD),

                Click.on(EmptyPolicyInterface.CHECK_BOX_1),
                Click.on(EmptyPolicyInterface.CHECK_BOX_2),

                Scroll.to(EmptyPolicyInterface.BTN_LOGIN),
                Click.on(EmptyPolicyInterface.BTN_LOGIN)
        );

    }
    public static EmptyPolicyTask on(){
        return instrumented(EmptyPolicyTask.class);
    }
}
