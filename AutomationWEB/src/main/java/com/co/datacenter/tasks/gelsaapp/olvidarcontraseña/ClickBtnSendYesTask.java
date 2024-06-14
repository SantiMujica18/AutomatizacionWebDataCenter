package com.co.datacenter.tasks.gelsaapp.olvidarcontraseña;

import com.co.datacenter.userinterfaces.gelsaapp.olvidarcontraseña.OlvidarContraseñaInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickBtnSendYesTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(OlvidarContraseñaInterface.BTN_CONFIRMATION_YES)
        );

    }
    public static ClickBtnSendYesTask on(){
        return instrumented(ClickBtnSendYesTask.class);
    }
}
