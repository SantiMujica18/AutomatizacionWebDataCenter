package com.co.datacenter.tasks.login.validation_of_empty_briefcase;

import com.co.datacenter.userinterfaces.login.validation_of_empty_briefcase.BriefCaseInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BriefCaseTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue("frijoizesoinnei-9575@yopmail.com").into(BriefCaseInterface.USERNAME),
                Enter.theValue("Brayan1234").into(BriefCaseInterface.PASSWORD),
                Click.on(BriefCaseInterface.CHECK_BOX_1),
                Click.on(BriefCaseInterface.CHECK_BOX_3),
                Scroll.to(BriefCaseInterface.BTN_LOGIN),
                Click.on(BriefCaseInterface.BTN_LOGIN)
        );



    }
    public static BriefCaseTask on(){
        return instrumented(BriefCaseTask.class);
    }
}

