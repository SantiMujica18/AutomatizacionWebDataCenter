package com.co.datacenter.tasks.paga_encime.data_paga_encime;

import com.co.datacenter.tasks.delay.Delay;
import com.co.datacenter.userinterfaces.paga_encime.data_paga_encime.DataPagaEncimeInterface;
import cucumber.api.java.hu.De;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class DataPagaEncimeTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(DataPagaEncimeInterface.ONE_SCROLL, isVisible()),
                Scroll.to(DataPagaEncimeInterface.ONE_SCROLL),
                Delay.ofMilliseconds(2000),

                WaitUntil.the(DataPagaEncimeInterface.BTN_RAMDON_THREE, isVisible()),
                Click.on(DataPagaEncimeInterface.BTN_RAMDON_THREE),
                Delay.ofMilliseconds(2000),


                WaitUntil.the(DataPagaEncimeInterface.ALERT_LOTTERY_EMPTY, isVisible()),
                Click.on(DataPagaEncimeInterface.ALERT_LOTTERY_EMPTY),
                Delay.ofMilliseconds(2000),


                WaitUntil.the(DataPagaEncimeInterface.BTN_SELEC_LOTTERY, isVisible()),
                Click.on(DataPagaEncimeInterface.BTN_SELEC_LOTTERY),
                Delay.ofMilliseconds(2000),


                WaitUntil.the(DataPagaEncimeInterface.CHECK_BOX_LOTTERY, isVisible()),
                Click.on(DataPagaEncimeInterface.CHECK_BOX_LOTTERY),
                Delay.ofMilliseconds(2000),


                WaitUntil.the(DataPagaEncimeInterface.BTN_SAVE_LOTTERY, isVisible()),
                Click.on(DataPagaEncimeInterface.BTN_SAVE_LOTTERY),
                Delay.ofMilliseconds(2000),


                WaitUntil.the(DataPagaEncimeInterface.BTN_RAMDON_THREE, isVisible()),
                Click.on(DataPagaEncimeInterface.BTN_RAMDON_THREE),
                Delay.ofMilliseconds(1500)
        );


        actor.attemptsTo(
                WaitUntil.the(DataPagaEncimeInterface.BTN_ADD_BET, isVisible()),
                Click.on(DataPagaEncimeInterface.BTN_ADD_BET),
                Delay.ofMilliseconds(2000),


                WaitUntil.the(DataPagaEncimeInterface.ALERT_SPECIFIC_VALUE, isVisible()),
                Click.on(DataPagaEncimeInterface.ALERT_SPECIFIC_VALUE),
                Delay.ofMilliseconds(2000),

                WaitUntil.the(DataPagaEncimeInterface.ALERT_ADD_BET, isVisible()),
                Click.on(DataPagaEncimeInterface.ALERT_ADD_BET),
                Delay.ofMilliseconds(2000)

                );

        actor.attemptsTo(
                WaitUntil.the(DataPagaEncimeInterface.ONE_SCROLL, isVisible()),
                Scroll.to(DataPagaEncimeInterface.ONE_SCROLL),
                Delay.ofMilliseconds(2000)

        );

        actor.attemptsTo(
                WaitUntil.the(DataPagaEncimeInterface.DELETE, isVisible()),
                Click.on(DataPagaEncimeInterface.DELETE),
                Delay.ofMilliseconds(2000)
        );

        actor.attemptsTo(
                WaitUntil.the(DataPagaEncimeInterface.BTN_RAMDON_THREE, isVisible()),
                Click.on(DataPagaEncimeInterface.BTN_RAMDON_THREE),
                Delay.ofMilliseconds(2000)
        );


        actor.attemptsTo(
                WaitUntil.the(DataPagaEncimeInterface.SELECT_VALUE, isVisible()),
                Click.on(DataPagaEncimeInterface.SELECT_VALUE),
                Delay.ofMilliseconds(2000),


                WaitUntil.the(DataPagaEncimeInterface.SELECTED_VALUE, isVisible()),
                Click.on(DataPagaEncimeInterface.SELECTED_VALUE),
                Delay.ofMilliseconds(2000)

        );

        actor.attemptsTo(
                WaitUntil.the(DataPagaEncimeInterface.BTN_ADD_BET, isVisible()),
                Click.on(DataPagaEncimeInterface.BTN_ADD_BET),
                Delay.ofMilliseconds(2000)

        );

        actor.attemptsTo(
                WaitUntil.the(DataPagaEncimeInterface.ALERT_ADD_BET, isVisible()),
                Click.on(DataPagaEncimeInterface.ALERT_ADD_BET),
                Delay.ofMilliseconds(2000)

        );


        actor.attemptsTo(
                WaitUntil.the(DataPagaEncimeInterface.BTN_RAMDON_THREE_1, isVisible()),
                Click.on(DataPagaEncimeInterface.BTN_RAMDON_THREE_1),
                Delay.ofMilliseconds(2000)

        );

        actor.attemptsTo(
                WaitUntil.the(DataPagaEncimeInterface.SELECT_VALUE_1, isVisible()),
                Click.on(DataPagaEncimeInterface.SELECT_VALUE_1),
                Delay.ofMilliseconds(2000),


                WaitUntil.the(DataPagaEncimeInterface.SELECTED_VALUE_1, isVisible()),
                Click.on(DataPagaEncimeInterface.SELECTED_VALUE_1),
                Delay.ofMilliseconds(2000)

        );

        actor.attemptsTo(
                WaitUntil.the(DataPagaEncimeInterface.BTN_ADD_BET, isVisible()),
                Click.on(DataPagaEncimeInterface.BTN_ADD_BET),
                Delay.ofMilliseconds(2000)

        );


        actor.attemptsTo(
                WaitUntil.the(DataPagaEncimeInterface.BTN_RAMDON_THREE_2, isVisible()),
                Click.on(DataPagaEncimeInterface.BTN_RAMDON_THREE_2),
                Delay.ofMilliseconds(1500)

        );
        actor.attemptsTo(
                WaitUntil.the(DataPagaEncimeInterface.SELECT_VALUE_2, isVisible()),
                Click.on(DataPagaEncimeInterface.SELECT_VALUE_2),
                Delay.ofMilliseconds(2000),


                WaitUntil.the(DataPagaEncimeInterface.SELECTED_VALUE_2, isVisible()),
                Click.on(DataPagaEncimeInterface.SELECTED_VALUE_2),
                Delay.ofMilliseconds(2000)

        );

        actor.attemptsTo(
                WaitUntil.the(DataPagaEncimeInterface.BTN_ADD_BET, isVisible()),
                Click.on(DataPagaEncimeInterface.BTN_ADD_BET),
                Delay.ofMilliseconds(2000)

        );


        actor.attemptsTo(
                WaitUntil.the(DataPagaEncimeInterface.BTN_RAMDON_THREE_3, isVisible()),
                Click.on(DataPagaEncimeInterface.BTN_RAMDON_THREE_3),
                Delay.ofMilliseconds(1500)

        );


        actor.attemptsTo(
                WaitUntil.the(DataPagaEncimeInterface.SELECT_VALUE_3, isVisible()),
                Click.on(DataPagaEncimeInterface.SELECT_VALUE_3),
                Delay.ofMilliseconds(2000),

                WaitUntil.the(DataPagaEncimeInterface.SELECTED_VALUE_3, isVisible()),
                Click.on(DataPagaEncimeInterface.SELECTED_VALUE_3),
                Delay.ofMilliseconds(2000)

        );

        actor.attemptsTo(
                WaitUntil.the(DataPagaEncimeInterface.ONE_SCROLL, isVisible()),
                Scroll.to(DataPagaEncimeInterface.ONE_SCROLL));

        actor.attemptsTo(
                WaitUntil.the(DataPagaEncimeInterface.DELETE, isVisible()),
                Click.on(DataPagaEncimeInterface.DELETE),
                Delay.ofMilliseconds(2000),


                WaitUntil.the(DataPagaEncimeInterface.DELETE, isVisible()),
                Click.on(DataPagaEncimeInterface.DELETE),
                Delay.ofMilliseconds(2000),

                WaitUntil.the(DataPagaEncimeInterface.DELETE, isVisible()),
                Click.on(DataPagaEncimeInterface.DELETE),
                Delay.ofMilliseconds(2000)

        );

        actor.attemptsTo(
                WaitUntil.the(DataPagaEncimeInterface.BTN_NEXT_PAGA_ENCIME, isVisible()),
                Click.on(DataPagaEncimeInterface.BTN_NEXT_PAGA_ENCIME)
        );


    }

    public static DataPagaEncimeTask on() {
        return instrumented(DataPagaEncimeTask.class);
    }
}
