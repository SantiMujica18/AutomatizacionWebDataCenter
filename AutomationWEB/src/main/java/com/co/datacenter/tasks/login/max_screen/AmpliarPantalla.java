package com.co.datacenter.tasks.login.max_screen;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AmpliarPantalla implements Task {

    private final int width;
    private final int height;

    public AmpliarPantalla(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public static Performable a(int width, int height) {
        return instrumented(AmpliarPantalla.class, width, height);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ChangeBrowserWindowSize.to(width, height)
        );
    }

}




