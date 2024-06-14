package com.co.datacenter.tasks.maxi_chance.validation_value_empty_maxi_chance;

import com.co.datacenter.tasks.delay.Delay;
import com.co.datacenter.userinterfaces.maxi_chance.data_maxi_chance.DataMaxiChanceInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import javax.xml.crypto.Data;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ValueEmptyMaxiChanceTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(DataMaxiChanceInterface.TITLE_SCROLL_1, isVisible()),
                Scroll.to(DataMaxiChanceInterface.TITLE_SCROLL_1),


                WaitUntil.the(DataMaxiChanceInterface.BTN_SELEC_LOTTERY, isVisible()),
                WaitUntil.the(DataMaxiChanceInterface.BTN_SELEC_LOTTERY, isEnabled()),
                Click.on(DataMaxiChanceInterface.BTN_SELEC_LOTTERY),


                WaitUntil.the(DataMaxiChanceInterface.CHECK_BOX_LOTTERY, isVisible()),
                WaitUntil.the(DataMaxiChanceInterface.CHECK_BOX_LOTTERY, isEnabled()),

                Click.on(DataMaxiChanceInterface.CHECK_BOX_LOTTERY),


                WaitUntil.the(DataMaxiChanceInterface.BTN_SAVE_LOTTERY, isVisible()),
                WaitUntil.the(DataMaxiChanceInterface.BTN_SAVE_LOTTERY, isEnabled()),

                Click.on(DataMaxiChanceInterface.BTN_SAVE_LOTTERY),


                WaitUntil.the(DataMaxiChanceInterface.BTN_RAMDON_THREE, isVisible()),
                WaitUntil.the(DataMaxiChanceInterface.BTN_RAMDON_THREE, isEnabled()),

                Click.on(DataMaxiChanceInterface.BTN_RAMDON_THREE),
                Delay.ofMilliseconds(2000)

        );


        actor.attemptsTo(
                WaitUntil.the(DataMaxiChanceInterface.BTN_ADD_GAME, isVisible()),
                WaitUntil.the(DataMaxiChanceInterface.BTN_ADD_GAME, isEnabled()),
                Click.on(DataMaxiChanceInterface.BTN_ADD_GAME),
                Delay.ofMilliseconds(500)
        );


        actor.attemptsTo(
                WaitUntil.the(DataMaxiChanceInterface.BTN_ACCEP_VALUE_EMPTY, isVisible()),
                WaitUntil.the(DataMaxiChanceInterface.BTN_ACCEP_VALUE_EMPTY, isEnabled()),
                Click.on(DataMaxiChanceInterface.BTN_ACCEP_VALUE_EMPTY),
                Delay.ofMilliseconds(500)

        );

        actor.attemptsTo(
                WaitUntil.the(DataMaxiChanceInterface.BTN_ACCEP_ADDITIONAL_INFO, isVisible()),
                WaitUntil.the(DataMaxiChanceInterface.BTN_ACCEP_ADDITIONAL_INFO, isEnabled()),

                Click.on(DataMaxiChanceInterface.BTN_ACCEP_ADDITIONAL_INFO),
                Delay.ofMilliseconds(500)

        );
    }

    public static ValueEmptyMaxiChanceTask on() {
        return instrumented(ValueEmptyMaxiChanceTask.class);
    }
}
