package com.co.datacenter.tasks.maxi_chance.confirm_maxi_chance;

import com.co.datacenter.userinterfaces.maxi_chance.data_maxi_chance.DataMaxiChanceInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import javax.xml.crypto.Data;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class PreviousPageMaxiChanceTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(DataMaxiChanceInterface.BTN_PREVIOUS_PAGE, isVisible()),
                Click.on(DataMaxiChanceInterface.BTN_PREVIOUS_PAGE)
        );

    }
    public static PreviousPageMaxiChanceTask on(){
        return instrumented(PreviousPageMaxiChanceTask.class);
    }
}
