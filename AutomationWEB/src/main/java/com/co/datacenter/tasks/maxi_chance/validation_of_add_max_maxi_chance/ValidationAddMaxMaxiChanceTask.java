package com.co.datacenter.tasks.maxi_chance.validation_of_add_max_maxi_chance;

import com.co.datacenter.tasks.delay.Delay;
import com.co.datacenter.userinterfaces.maxi_chance.data_maxi_chance.DataMaxiChanceInterface;
import cucumber.api.java.it.Data;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ValidationAddMaxMaxiChanceTask implements Task {

    public static final String VALUE1 = "1";
    public static final String VALUE2 = "4";

    public static final String VALUE3 = "1";
    public static final String VALUE4 = "0";

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(DataMaxiChanceInterface.BTN_RAMDON_FOUR, isVisible()),
                WaitUntil.the(DataMaxiChanceInterface.BTN_RAMDON_FOUR, isEnabled()),
                Click.on(DataMaxiChanceInterface.BTN_RAMDON_FOUR),
                Delay.ofMilliseconds(1000)
        );
        actor.attemptsTo(
                WaitUntil.the(DataMaxiChanceInterface.SELECT_VALUE, isVisible()),
                WaitUntil.the(DataMaxiChanceInterface.SELECT_VALUE, isEnabled()),
                Click.on(DataMaxiChanceInterface.SELECT_VALUE)
        );

        actor.attemptsTo(
                WaitUntil.the(DataMaxiChanceInterface.SELECTED_VALUE, isVisible()),
                WaitUntil.the(DataMaxiChanceInterface.SELECTED_VALUE, isEnabled()),
                Click.on(DataMaxiChanceInterface.SELECTED_VALUE)

        );
        actor.attemptsTo(
                WaitUntil.the(DataMaxiChanceInterface.BTN_ADD_GAME, isVisible()),
                WaitUntil.the(DataMaxiChanceInterface.BTN_ADD_GAME, isEnabled()),
                Click.on(DataMaxiChanceInterface.BTN_ADD_GAME),
                Delay.ofMilliseconds(500)
        );

        actor.attemptsTo(
                WaitUntil.the(DataMaxiChanceInterface.BTN_ACCEP_ADDITIONAL_INFO, isVisible()),
                WaitUntil.the(DataMaxiChanceInterface.BTN_ACCEP_ADDITIONAL_INFO, isEnabled()),
                Click.on(DataMaxiChanceInterface.BTN_ACCEP_ADDITIONAL_INFO)
        );


        //Num 2

        actor.attemptsTo(
                WaitUntil.the(DataMaxiChanceInterface.BTN_RAMDON_FOUR_1, isVisible()),
                WaitUntil.the(DataMaxiChanceInterface.BTN_RAMDON_FOUR_1, isEnabled()),
                Click.on(DataMaxiChanceInterface.BTN_RAMDON_FOUR_1),
                Delay.ofMilliseconds(1000)
        );




        actor.attemptsTo(
                WaitUntil.the(DataMaxiChanceInterface.SELECT_VALUE_1, isVisible()),
                WaitUntil.the(DataMaxiChanceInterface.SELECT_VALUE_1, isEnabled()),
                Click.on(DataMaxiChanceInterface.SELECT_VALUE_1)

        );

        actor.attemptsTo(
                WaitUntil.the(DataMaxiChanceInterface.SELECTED_VALUE_1, isVisible()),
                WaitUntil.the(DataMaxiChanceInterface.SELECTED_VALUE, isEnabled()),
                Click.on(DataMaxiChanceInterface.SELECTED_VALUE_1)

        );

        actor.attemptsTo(
                WaitUntil.the(DataMaxiChanceInterface.BTN_ADD_GAME, isVisible()),
                WaitUntil.the(DataMaxiChanceInterface.BTN_ADD_GAME, isEnabled()),
                Click.on(DataMaxiChanceInterface.BTN_ADD_GAME),
                Delay.ofMilliseconds(500)

        );

        // Num 3

        actor.attemptsTo(
                WaitUntil.the(DataMaxiChanceInterface.BTN_RAMDON_FOUR_2, isVisible()),
                WaitUntil.the(DataMaxiChanceInterface.BTN_RAMDON_FOUR_2, isEnabled()),
                Click.on(DataMaxiChanceInterface.BTN_RAMDON_FOUR_2),
                Delay.ofMilliseconds(1000)
        );



        actor.attemptsTo(
                WaitUntil.the(DataMaxiChanceInterface.SELECT_VALUE_2, isVisible()),
                WaitUntil.the(DataMaxiChanceInterface.SELECT_VALUE_2, isEnabled()),
                Click.on(DataMaxiChanceInterface.SELECT_VALUE_2)

        );

        actor.attemptsTo(
                WaitUntil.the(DataMaxiChanceInterface.SELECTED_VALUE_2, isVisible()),
                WaitUntil.the(DataMaxiChanceInterface.SELECT_VALUE_2, isEnabled()),
                Click.on(DataMaxiChanceInterface.SELECTED_VALUE_2)

        );

        actor.attemptsTo(
                WaitUntil.the(DataMaxiChanceInterface.BTN_ADD_GAME, isVisible()),
                WaitUntil.the(DataMaxiChanceInterface.BTN_ADD_GAME, isEnabled()),

                Click.on(DataMaxiChanceInterface.BTN_ADD_GAME),
                Delay.ofMilliseconds(500)

        );

        //Num 4

        actor.attemptsTo(
                WaitUntil.the(DataMaxiChanceInterface.BTN_RAMDON_FOUR_3, isVisible()),
                WaitUntil.the(DataMaxiChanceInterface.BTN_RAMDON_FOUR_3, isEnabled()),
                Click.on(DataMaxiChanceInterface.BTN_RAMDON_FOUR_3),
                Delay.ofMilliseconds(1500)
        );


        actor.attemptsTo(
                WaitUntil.the(DataMaxiChanceInterface.SELECT_VALUE_3, isVisible()),
                WaitUntil.the(DataMaxiChanceInterface.SELECT_VALUE_3, isEnabled()),
                Click.on(DataMaxiChanceInterface.SELECT_VALUE_3)
        );

        actor.attemptsTo(
                WaitUntil.the(DataMaxiChanceInterface.SELECTED_VALUE_3, isVisible()),
                WaitUntil.the(DataMaxiChanceInterface.SELECTED_VALUE_3, isEnabled()),
                Click.on(DataMaxiChanceInterface.SELECTED_VALUE_3)
        );

        actor.attemptsTo(
                WaitUntil.the(DataMaxiChanceInterface.BTN_ADD_GAME, isVisible()),
                WaitUntil.the(DataMaxiChanceInterface.BTN_ADD_GAME, isEnabled()),

                Click.on(DataMaxiChanceInterface.BTN_ADD_GAME),
                Delay.ofMilliseconds(500),

                WaitUntil.the(DataMaxiChanceInterface.BTN_ACCEP_MAX_NUM, isVisible()),
                WaitUntil.the(DataMaxiChanceInterface.BTN_ACCEP_MAX_NUM, isEnabled()),

                Click.on(DataMaxiChanceInterface.BTN_ACCEP_MAX_NUM),
                Delay.ofMilliseconds(500)
        );


    }

    public static ValidationAddMaxMaxiChanceTask on() {
        return instrumented(ValidationAddMaxMaxiChanceTask.class);
    }

}
