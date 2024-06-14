package com.co.datacenter.tasks.combo_millonario.data_combo_millonario;

import com.co.datacenter.tasks.delay.Delay;
import com.co.datacenter.userinterfaces.combo_millonario.data_combo_millonario.DataOnePageComboMillonarioInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class BetFourOnePageComboMillonarioTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(DataOnePageComboMillonarioInterface.CHECK_BOX_ONE_LOTTERY, isVisible()),
                Click.on(DataOnePageComboMillonarioInterface.CHECK_BOX_ONE_LOTTERY),
                Delay.ofMilliseconds(2000),

                WaitUntil.the(DataOnePageComboMillonarioInterface.CHECK_BOX_TWO_LOTTERY, isVisible()),
                Click.on(DataOnePageComboMillonarioInterface.CHECK_BOX_TWO_LOTTERY),
                Delay.ofMilliseconds(2000)
        );

        actor.attemptsTo(
                WaitUntil.the(DataOnePageComboMillonarioInterface.SCROLL_1, isVisible()),
                Scroll.to(DataOnePageComboMillonarioInterface.SCROLL_1),
                Delay.ofMilliseconds(2000)
        );

        actor.attemptsTo(
                WaitUntil.the(DataOnePageComboMillonarioInterface.BTN_NEXT, isVisible()),
                Click.on(DataOnePageComboMillonarioInterface.BTN_NEXT),
                Delay.ofMilliseconds(2000)
        );


    }

    public static BetFourOnePageComboMillonarioTask on() {
        return instrumented(BetFourOnePageComboMillonarioTask.class);
    }
}
