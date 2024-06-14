package com.co.datacenter.tasks.maxi_chance.data_maxi_chance;

import com.co.datacenter.userinterfaces.maxi_chance.data_maxi_chance.DataMaxiChanceInterface;
import com.co.datacenter.userinterfaces.super_chance.data_super_chance.DataSuperChanceInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import javax.xml.crypto.Data;
import java.util.Calendar;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class DataMaxiChanceTask implements Task {

    public static final String VALUE1 = "1";
    public static final String VALUE2 = "4";

    public static final String VALUE3 = "1";
    public static final String VALUE4 = "0";

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(DataMaxiChanceInterface.TITLE_SCROLL_1, isVisible()),
                Scroll.to(DataMaxiChanceInterface.TITLE_SCROLL_1));

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

        actor.attemptsTo(
                WaitUntil.the(DataMaxiChanceInterface.SELECT_VALUE, isVisible()),
                Click.on(DataMaxiChanceInterface.SELECT_VALUE)
        );

        actor.attemptsTo(
                WaitUntil.the(DataMaxiChanceInterface.SELECTED_VALUE, isVisible()),
                Click.on(DataMaxiChanceInterface.SELECTED_VALUE)
        );

        actor.attemptsTo(
                WaitUntil.the(DataMaxiChanceInterface.BTN_NEXT, isVisible()),
                Click.on(DataMaxiChanceInterface.BTN_NEXT)
        );

    }

        public static DataMaxiChanceTask on(){
        return instrumented(DataMaxiChanceTask.class);
        }

}
