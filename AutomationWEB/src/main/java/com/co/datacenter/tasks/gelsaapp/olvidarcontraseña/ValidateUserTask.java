package com.co.datacenter.tasks.gelsaapp.olvidarcontraseña;

import com.co.datacenter.userinterfaces.gelsaapp.olvidarcontraseña.OlvidarContraseñaInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ValidateUserTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue("SanSebitas").into(OlvidarContraseñaInterface.INPUT_USER)
        );

    }
    public static ValidateUserTask on(){
        return instrumented(ValidateUserTask.class);
    }
}
