package com.co.datacenter.tasks.paga_millonario.bet_three_paga_millonario;

import com.co.datacenter.tasks.delay.Delay;
import com.co.datacenter.userinterfaces.paga_millonario.data_paga_millonario.DataOnePageInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class BetThreeOnePagePagaMillonarioTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(DataOnePageInterface.CHECK_BOX_THREE, isVisible()),
                Click.on(DataOnePageInterface.CHECK_BOX_THREE),
                Delay.ofMilliseconds(1000),

                WaitUntil.the(DataOnePageInterface.SCROLL_ONE, isVisible()),
                Scroll.to(DataOnePageInterface.SCROLL_ONE),

                WaitUntil.the(DataOnePageInterface.FIRST_LOTTERY, isVisible()),
                Click.on(DataOnePageInterface.FIRST_LOTTERY),
                Delay.ofMilliseconds(1000),

                WaitUntil.the(DataOnePageInterface.SECONT_LOTTERY, isVisible()),
                Click.on(DataOnePageInterface.SECONT_LOTTERY),
                Delay.ofMilliseconds(1000),

                WaitUntil.the(DataOnePageInterface.BTN_NEXT, isVisible()),
                Click.on(DataOnePageInterface.BTN_NEXT)
        );

    }

    public static BetThreeOnePagePagaMillonarioTask on(){
        return instrumented(BetThreeOnePagePagaMillonarioTask.class);
    }
}
