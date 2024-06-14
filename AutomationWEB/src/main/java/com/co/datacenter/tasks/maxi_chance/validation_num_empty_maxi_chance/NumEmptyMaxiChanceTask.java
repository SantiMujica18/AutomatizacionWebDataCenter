package com.co.datacenter.tasks.maxi_chance.validation_num_empty_maxi_chance;

import com.co.datacenter.tasks.delay.Delay;
import com.co.datacenter.userinterfaces.maxi_chance.data_maxi_chance.DataMaxiChanceInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class NumEmptyMaxiChanceTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(DataMaxiChanceInterface.TITLE_SCROLL_1, isVisible()),
                Scroll.to(DataMaxiChanceInterface.TITLE_SCROLL_1));

                /*
                WaitUntil.the(DataMaxiChanceInterface.BTN_SELEC_LOTTERY,isVisible()),
                Click.on(DataMaxiChanceInterface.BTN_SELEC_LOTTERY),


                WaitUntil.the(DataMaxiChanceInterface.CHECK_BOX_LOTTERY, isVisible()),
                Click.on(DataMaxiChanceInterface.CHECK_BOX_LOTTERY),


                WaitUntil.the(DataMaxiChanceInterface.BTN_SAVE_LOTTERY, isVisible()),
                Click.on(DataMaxiChanceInterface.BTN_SAVE_LOTTERY));

                 */

        actor.attemptsTo(
                WaitUntil.the(DataMaxiChanceInterface.SELECT_VALUE, isVisible()),
                Click.on(DataMaxiChanceInterface.SELECT_VALUE));

        actor.attemptsTo(
                WaitUntil.the(DataMaxiChanceInterface.SELECTED_VALUE, isVisible()),
                Click.on(DataMaxiChanceInterface.SELECTED_VALUE)
        );

        actor.attemptsTo(
                WaitUntil.the(DataMaxiChanceInterface.BTN_ADD_GAME, isVisible()),
                Click.on(DataMaxiChanceInterface.BTN_ADD_GAME),
                Delay.ofMilliseconds(500)
        );


        actor.attemptsTo(
                WaitUntil.the(DataMaxiChanceInterface.BTN_ACCEP_SPECIFY_NUM, isVisible()),
                Click.on(DataMaxiChanceInterface.BTN_ACCEP_SPECIFY_NUM),
                Delay.ofMilliseconds(500)
        );

        actor.attemptsTo(
                WaitUntil.the(DataMaxiChanceInterface.BTN_ACCEP_ADDITIONAL_INFO, isVisible()),
                Click.on(DataMaxiChanceInterface.BTN_ACCEP_ADDITIONAL_INFO)
        );


    }

    public static NumEmptyMaxiChanceTask on() {
        return instrumented(NumEmptyMaxiChanceTask.class);
    }
}
