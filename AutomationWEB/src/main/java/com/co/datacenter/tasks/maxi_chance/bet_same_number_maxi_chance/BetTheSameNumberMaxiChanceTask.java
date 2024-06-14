package com.co.datacenter.tasks.maxi_chance.bet_same_number_maxi_chance;

import com.co.datacenter.userinterfaces.maxi_chance.data_maxi_chance.DataMaxiChanceInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.datacenter.tasks.maxi_chance.validation_of_add_max_maxi_chance.ValidationAddMaxMaxiChanceTask.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class BetTheSameNumberMaxiChanceTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                WaitUntil.the(DataMaxiChanceInterface.TITLE_SCROLL_1, isVisible()),
                Scroll.to(DataMaxiChanceInterface.TITLE_SCROLL_1));

        //Num 1

        actor.attemptsTo(
                WaitUntil.the(DataMaxiChanceInterface.BTN_SELEC_LOTTERY,isVisible()),
                Click.on(DataMaxiChanceInterface.BTN_SELEC_LOTTERY));

        actor.attemptsTo(
                WaitUntil.the(DataMaxiChanceInterface.CHECK_BOX_LOTTERY, isVisible()),
                Click.on(DataMaxiChanceInterface.CHECK_BOX_LOTTERY));

        actor.attemptsTo(
                WaitUntil.the(DataMaxiChanceInterface.BTN_SAVE_LOTTERY, isVisible()),
                Click.on(DataMaxiChanceInterface.BTN_SAVE_LOTTERY));




        actor.attemptsTo(
                WaitUntil.the(DataMaxiChanceInterface.INPUT_NUM_1,isVisible()),
                Enter.theValue(VALUE1).into(DataMaxiChanceInterface.INPUT_NUM_1)
        );
        actor.attemptsTo(
                WaitUntil.the(DataMaxiChanceInterface.INPUT_NUM_2,isVisible()),
                Enter.theValue(VALUE2).into(DataMaxiChanceInterface.INPUT_NUM_2)
        );
        actor.attemptsTo(
                WaitUntil.the(DataMaxiChanceInterface.INPUT_NUM_3,isVisible()),
                Enter.theValue(VALUE3).into(DataMaxiChanceInterface.INPUT_NUM_3)
        );
        actor.attemptsTo(
                WaitUntil.the(DataMaxiChanceInterface.INPUT_NUM_4,isVisible()),
                Enter.theValue(VALUE4).into(DataMaxiChanceInterface.INPUT_NUM_4)
        );




        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        actor.attemptsTo(
                WaitUntil.the(DataMaxiChanceInterface.SELECT_VALUE, isVisible()),
                Click.on(DataMaxiChanceInterface.SELECT_VALUE)
        );

        actor.attemptsTo(
                WaitUntil.the(DataMaxiChanceInterface.SELECTED_VALUE, isVisible()),
                Click.on(DataMaxiChanceInterface.SELECTED_VALUE)
        );

        actor.attemptsTo(
                WaitUntil.the(DataMaxiChanceInterface.BTN_ADD_GAME, isVisible()),
                Click.on(DataMaxiChanceInterface.BTN_ADD_GAME)
        );

        actor.attemptsTo(
                WaitUntil.the(DataMaxiChanceInterface.BTN_ACCEP_ADDITIONAL_INFO,isVisible()),
                Click.on(DataMaxiChanceInterface.BTN_ACCEP_ADDITIONAL_INFO)
        );


        //Num 2

        actor.attemptsTo(
                WaitUntil.the(DataMaxiChanceInterface.INPUT_NUM_1_1,isVisible()),
                Enter.theValue(VALUE1).into(DataMaxiChanceInterface.INPUT_NUM_1_1)
        );
        actor.attemptsTo(
                WaitUntil.the(DataMaxiChanceInterface.INPUT_NUM_2_2,isVisible()),
                Enter.theValue(VALUE2).into(DataMaxiChanceInterface.INPUT_NUM_2_2)
        );
        actor.attemptsTo(
                WaitUntil.the(DataMaxiChanceInterface.INPUT_NUM_3_3,isVisible()),
                Enter.theValue(VALUE3).into(DataMaxiChanceInterface.INPUT_NUM_3_3)
        );
        actor.attemptsTo(
                WaitUntil.the(DataMaxiChanceInterface.INPUT_NUM_4_4,isVisible()),
                Enter.theValue(VALUE4).into(DataMaxiChanceInterface.INPUT_NUM_4_4)
        );

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        actor.attemptsTo(
                WaitUntil.the(DataMaxiChanceInterface.SELECT_VALUE_1, isVisible()),
                Click.on(DataMaxiChanceInterface.SELECT_VALUE_1)
        );

        actor.attemptsTo(
                WaitUntil.the(DataMaxiChanceInterface.SELECTED_VALUE_1, isVisible()),
                Click.on(DataMaxiChanceInterface.SELECTED_VALUE_1)
        );

        actor.attemptsTo(
                WaitUntil.the(DataMaxiChanceInterface.BTN_ADD_GAME, isVisible()),
                Click.on(DataMaxiChanceInterface.BTN_ADD_GAME)
        );

        // Num 3

        actor.attemptsTo(
                WaitUntil.the(DataMaxiChanceInterface.INPUT_NUM_1_1_1,isVisible()),
                Enter.theValue(VALUE1).into(DataMaxiChanceInterface.INPUT_NUM_1_1_1)
        );
        actor.attemptsTo(
                WaitUntil.the(DataMaxiChanceInterface.INPUT_NUM_2_2_2,isVisible()),
                Enter.theValue(VALUE2).into(DataMaxiChanceInterface.INPUT_NUM_2_2_2)
        );
        actor.attemptsTo(
                WaitUntil.the(DataMaxiChanceInterface.INPUT_NUM_3_3_3,isVisible()),
                Enter.theValue(VALUE3).into(DataMaxiChanceInterface.INPUT_NUM_3_3_3)
        );
        actor.attemptsTo(
                WaitUntil.the(DataMaxiChanceInterface.INPUT_NUM_4_4_4,isVisible()),
                Enter.theValue(VALUE4).into(DataMaxiChanceInterface.INPUT_NUM_4_4_4)
        );

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        actor.attemptsTo(
                WaitUntil.the(DataMaxiChanceInterface.SELECT_VALUE_2, isVisible()),
                Click.on(DataMaxiChanceInterface.SELECT_VALUE_2)
        );

        actor.attemptsTo(
                WaitUntil.the(DataMaxiChanceInterface.SELECTED_VALUE_2, isVisible()),
                Click.on(DataMaxiChanceInterface.SELECTED_VALUE_2)
        );

        actor.attemptsTo(
                WaitUntil.the(DataMaxiChanceInterface.BTN_ADD_GAME, isVisible()),
                Click.on(DataMaxiChanceInterface.BTN_ADD_GAME)
        );

        //Num 4

        actor.attemptsTo(
                WaitUntil.the(DataMaxiChanceInterface.INPUT_NUM_1_1_1_1,isVisible()),
                Enter.theValue(VALUE1).into(DataMaxiChanceInterface.INPUT_NUM_1_1_1_1)
        );
        actor.attemptsTo(
                WaitUntil.the(DataMaxiChanceInterface.INPUT_NUM_2_2_2_2,isVisible()),
                Enter.theValue(VALUE2).into(DataMaxiChanceInterface.INPUT_NUM_2_2_2_2)
        );
        actor.attemptsTo(
                WaitUntil.the(DataMaxiChanceInterface.INPUT_NUM_3_3_3_3,isVisible()),
                Enter.theValue(VALUE3).into(DataMaxiChanceInterface.INPUT_NUM_3_3_3_3)
        );
        actor.attemptsTo(
                WaitUntil.the(DataMaxiChanceInterface.INPUT_NUM_4_4_4_4,isVisible()),
                Enter.theValue(VALUE4).into(DataMaxiChanceInterface.INPUT_NUM_4_4_4_4)
        );


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        actor.attemptsTo(
                WaitUntil.the(DataMaxiChanceInterface.SELECT_VALUE_3, isVisible()),
                Click.on(DataMaxiChanceInterface.SELECT_VALUE_3)
        );

        actor.attemptsTo(
                WaitUntil.the(DataMaxiChanceInterface.SELECTED_VALUE_3, isVisible()),
                Click.on(DataMaxiChanceInterface.SELECTED_VALUE_3)
        );

        actor.attemptsTo(
                WaitUntil.the(DataMaxiChanceInterface.BTN_NEXT, isVisible()),
                Click.on(DataMaxiChanceInterface.BTN_NEXT)
        );

    }

    public static BetTheSameNumberMaxiChanceTask on(){
        return instrumented(BetTheSameNumberMaxiChanceTask.class);
    }
}
