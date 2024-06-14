package com.co.datacenter.tasks.buc.register_buc;

import com.co.datacenter.tasks.delay.Delay;
import com.co.datacenter.userinterfaces.buc.HomePageBUCInterfaces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class ValidationEmptyValuesTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(HomePageBUCInterfaces.REGISTER_BUTTON),
                WaitUntil.the(HomePageBUCInterfaces.REGISTER_BUTTON,isVisible()),
                Click.on(HomePageBUCInterfaces.REGISTER_BUTTON),
                Delay.ofMilliseconds(500),
                Scroll.to(HomePageBUCInterfaces.FIRST_ERROR_MESSAGE),
                Delay.ofMilliseconds(2000),
                WaitUntil.the(HomePageBUCInterfaces.FIRST_ERROR_MESSAGE, containsText("Requerido")),
                Delay.ofMilliseconds(500),
                WaitUntil.the(HomePageBUCInterfaces.SECOND_ERROR_MESSAGE, containsText("Requerido")),
                Delay.ofMilliseconds(500),
                WaitUntil.the(HomePageBUCInterfaces.THIRD_ERROR_MESSAGE, containsText("Requerido")),
                Delay.ofMilliseconds(500),
                Scroll.to(HomePageBUCInterfaces.FOURTH_ERROR_MESSAGE),
                WaitUntil.the(HomePageBUCInterfaces.FOURTH_ERROR_MESSAGE, containsText("Requerido")),
                Delay.ofMilliseconds(500),
                WaitUntil.the(HomePageBUCInterfaces.FIFTH_ERROR_MESSAGE, containsText("Requerido")),
                Delay.ofMilliseconds(500),
                WaitUntil.the(HomePageBUCInterfaces.SIXTH_ERROR_MESSAGE, containsText("Requerido")),
                Delay.ofMilliseconds(500),
                WaitUntil.the(HomePageBUCInterfaces.SEVENTH_ERROR_MESSAGE, containsText("Requerido")),
                Delay.ofMilliseconds(500),
                WaitUntil.the(HomePageBUCInterfaces.EIGHTH_ERROR_MESSAGE, containsText("Requerido")),
                Delay.ofMilliseconds(500),
                WaitUntil.the(HomePageBUCInterfaces.NINTH_ERROR_MESSAGE, containsText("Requerido")),
                Delay.ofMilliseconds(500),
                WaitUntil.the(HomePageBUCInterfaces.TENTH_ERROR_MESSAGE, containsText("Requerido")),
                Delay.ofMilliseconds(500),
                WaitUntil.the(HomePageBUCInterfaces.ELEVENTH_ERROR_MESSAGE, containsText("Requerido")),
                Delay.ofMilliseconds(500),
                Scroll.to(HomePageBUCInterfaces.TWELFTH_ERROR_MESSAGE),
                WaitUntil.the(HomePageBUCInterfaces.TWELFTH_ERROR_MESSAGE, containsText("Requerido")),
                Delay.ofMilliseconds(500),
                WaitUntil.the(HomePageBUCInterfaces.THIRTEENTH_ERROR_MESSAGE, containsText("Requerido")),
                Delay.ofMilliseconds(500),
                WaitUntil.the(HomePageBUCInterfaces.FOURTEENTH_ERROR_MESSAGE, containsText("Requerido")),
                Delay.ofMilliseconds(500),
                WaitUntil.the(HomePageBUCInterfaces.FIFTEENTH_ERROR_MESSAGE, containsText("Requerido")),
                Click.on(HomePageBUCInterfaces.RESIDENCE_ADDRESS),
                Delay.ofMilliseconds(500),
                Click.on(HomePageBUCInterfaces.BTN_SAVE_ADDRESS),
                Delay.ofMilliseconds(500),
                WaitUntil.the(HomePageBUCInterfaces.RESIDENCE_ADDRESS_TITTLE, isVisible()),
                Delay.ofMilliseconds(500),
                WaitUntil.the(HomePageBUCInterfaces.SIXTEENTH_ERROR_MESSAGE, isVisible()),
                Delay.ofMilliseconds(500),
                WaitUntil.the(HomePageBUCInterfaces.SEVENTEENTH_ERROR_MESSAGE, isVisible()),
                Delay.ofMilliseconds(500),
                WaitUntil.the(HomePageBUCInterfaces.EIGHTEENTH_ERROR_MESSAGE, isVisible()),
                Delay.ofMilliseconds(500),
                WaitUntil.the(HomePageBUCInterfaces.NINETEENTH_ERROR_MESSAGE, isVisible()),
                Delay.ofMilliseconds(500),
                Click.on(HomePageBUCInterfaces.CHECK_ADD_DETAILS),
                Delay.ofMilliseconds(500),
                Click.on(HomePageBUCInterfaces.BTN_SAVE_ADDRESS),
                Delay.ofMilliseconds(500),
                WaitUntil.the(HomePageBUCInterfaces.TWENTIETH_ERROR_MESSAGE, isVisible()),
                Click.on(HomePageBUCInterfaces.CLOSE_DETAILS_WINDOW),
                Delay.ofMilliseconds(500)
                );


    }

    public static ValidationEmptyValuesTask on() {
        return instrumented(ValidationEmptyValuesTask.class);
    }
}
