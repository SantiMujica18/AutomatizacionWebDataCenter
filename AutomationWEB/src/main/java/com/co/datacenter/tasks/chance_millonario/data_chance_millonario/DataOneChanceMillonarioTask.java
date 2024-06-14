package com.co.datacenter.tasks.chance_millonario.data_chance_millonario;

import com.co.datacenter.tasks.delay.Delay;
import com.co.datacenter.userinterfaces.chance_millonario.data_chance_millonario.DataOnePageChanceMillonarioInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class DataOneChanceMillonarioTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                WaitUntil.the(DataOnePageChanceMillonarioInterface.CHECK_BOX_FIGURES, isVisible()),
                Click.on(DataOnePageChanceMillonarioInterface.CHECK_BOX_FIGURES),
                Delay.ofMilliseconds(2000),

                WaitUntil.the(DataOnePageChanceMillonarioInterface.SCROLL_1, isVisible()),
                Scroll.to(DataOnePageChanceMillonarioInterface.SCROLL_1),

                WaitUntil.the(DataOnePageChanceMillonarioInterface.CHECK_BOX_LOTTERY_1, isVisible()),
                Click.on(DataOnePageChanceMillonarioInterface.CHECK_BOX_LOTTERY_1),
                Delay.ofMilliseconds(2000),

                WaitUntil.the(DataOnePageChanceMillonarioInterface.CHECK_BOX_LOTTERY_2,isVisible()),
                Click.on(DataOnePageChanceMillonarioInterface.CHECK_BOX_LOTTERY_2),
                Delay.ofMilliseconds(2000),

                WaitUntil.the(DataOnePageChanceMillonarioInterface.BTN_NEXT, isVisible()),
                Click.on(DataOnePageChanceMillonarioInterface.BTN_NEXT),
                Delay.ofMilliseconds(2000)
        );

    }

    public static DataOneChanceMillonarioTask on(){
        return instrumented(DataOneChanceMillonarioTask.class);
    }
}
