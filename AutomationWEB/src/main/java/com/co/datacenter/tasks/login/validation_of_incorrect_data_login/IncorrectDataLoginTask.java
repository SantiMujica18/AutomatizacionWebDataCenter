package com.co.datacenter.tasks.login.validation_of_incorrect_data_login;

import com.co.datacenter.userinterfaces.login.validation_of_incorrect_data_login.IncorrectDataLoginInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IncorrectDataLoginTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("frijoizesoinei-9575@yopmail.com").into(IncorrectDataLoginInterface.USERNAME),
                Enter.theValue("Brayan234").into(IncorrectDataLoginInterface.PASSWORD),
                Click.on(IncorrectDataLoginInterface.CHECK_BOX_1),
                Click.on(IncorrectDataLoginInterface.CHECK_BOX_2),
                Click.on(IncorrectDataLoginInterface.CHECK_BOX_3),
                Scroll.to(IncorrectDataLoginInterface.BTN_LOGIN),
                Click.on(IncorrectDataLoginInterface.BTN_LOGIN)
        );



    }
    public static IncorrectDataLoginTask on(){
        return instrumented(IncorrectDataLoginTask.class);
    }
}
