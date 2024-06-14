package com.co.datacenter.tasks.gelsaapp.openthepagegelsaapp;

import com.co.datacenter.userinterfaces.HomeAdminPage;
import com.co.datacenter.userinterfaces.gelsaapp.olvidarcontraseña.OlvidarContraseñaInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenThePageGelsaApp implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(new OlvidarContraseñaInterface()));
    }

    public static OpenThePageGelsaApp open(){
        return instrumented(OpenThePageGelsaApp.class);
    }
}
