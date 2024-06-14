package com.co.datacenter.tasks.login.validation_of_empty_terms;

import com.co.datacenter.userinterfaces.login.validation_of_empty_terms.EmptyTermsInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EmptyTermsTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("frijoizesoinnei-9575@yopmail.com").into(EmptyTermsInterface.USERNAME),
                Enter.theValue("Brayan1234").into(EmptyTermsInterface.PASSWORD),

                Click.on(EmptyTermsInterface.CHECK_BOX_2),
                Click.on(EmptyTermsInterface.CHECK_BOX_3),
                Scroll.to(EmptyTermsInterface.BTN_LOGIN),
                Click.on(EmptyTermsInterface.BTN_LOGIN)
        );

    }
    public static EmptyTermsTask on(){
        return instrumented(EmptyTermsTask.class);
    }
}
