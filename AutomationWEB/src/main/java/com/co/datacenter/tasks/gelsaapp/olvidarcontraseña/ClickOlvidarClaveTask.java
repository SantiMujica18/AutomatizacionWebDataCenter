package com.co.datacenter.tasks.gelsaapp.olvidarcontraseña;

import com.co.datacenter.userinterfaces.gelsaapp.olvidarcontraseña.OlvidarContraseñaInterface;
import com.co.datacenter.userinterfaces.login.LoginUserUserInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickOlvidarClaveTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(OlvidarContraseñaInterface.LINK_OLVIDAR_CLAVE)
        );

    }
    public static ClickOlvidarClaveTask on(){
        return instrumented(ClickOlvidarClaveTask.class);
    }
}
