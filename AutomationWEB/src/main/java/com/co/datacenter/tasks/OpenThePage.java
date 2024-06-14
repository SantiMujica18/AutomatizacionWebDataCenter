package com.co.datacenter.tasks;

import com.co.datacenter.tasks.login.max_screen.ChangeBrowserWindowSize;
import com.co.datacenter.tasks.login.max_screen.ZoomOut;
import com.co.datacenter.userinterfaces.HomePageInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenThePage implements Task {

    @Override
    @Step("{0} Open the page Paga todo")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(new HomePageInterface()),
                Click.on(HomePageInterface.BUTTON_INICIAR_SESION)
        );
    }

    public static OpenThePage on(){
        return instrumented(OpenThePage.class);
    }
}

