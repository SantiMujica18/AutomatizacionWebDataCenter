package com.co.datacenter.tasks.combo_millonario.data_combo_millonario;

import com.co.datacenter.tasks.delay.Delay;
import com.co.datacenter.userinterfaces.combo_millonario.data_combo_millonario.DataTwoPageComboMillonarioInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class BetFourTwoPageComboMillonarioTask implements Task {

    public final String NUM1 = "1408";

    public final String NUM2 = "1400";

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(DataTwoPageComboMillonarioInterface.INPUNT_1, isVisible()),
                Enter.theValue(NUM1).into(DataTwoPageComboMillonarioInterface.INPUNT_1),
                Delay.ofMilliseconds(2000),

                WaitUntil.the(DataTwoPageComboMillonarioInterface.CLEAN_1, isVisible()),
                Click.on(DataTwoPageComboMillonarioInterface.CLEAN_1),
                Delay.ofMilliseconds(2000),


                WaitUntil.the(DataTwoPageComboMillonarioInterface.INPUNT_1, isVisible()),
                Enter.theValue(NUM1).into(DataTwoPageComboMillonarioInterface.INPUNT_1),
                Delay.ofMilliseconds(2000),


                WaitUntil.the(DataTwoPageComboMillonarioInterface.INPUNT_2, isVisible()),
                Enter.theValue(NUM1).into(DataTwoPageComboMillonarioInterface.INPUNT_2),
                Delay.ofMilliseconds(2000),


                WaitUntil.the(DataTwoPageComboMillonarioInterface.UPDATE_SAME_NUMBER, isVisible()),
                Click.on(DataTwoPageComboMillonarioInterface.UPDATE_SAME_NUMBER),
                Delay.ofMilliseconds(2000),


                WaitUntil.the(DataTwoPageComboMillonarioInterface.ACCEPT_ALERT_SAME_NUMBER, isVisible()),
                Click.on(DataTwoPageComboMillonarioInterface.ACCEPT_ALERT_SAME_NUMBER),
                Delay.ofMilliseconds(2000),


                WaitUntil.the(DataTwoPageComboMillonarioInterface.INPUNT_2, isVisible()),
                Enter.theValue(NUM2).into(DataTwoPageComboMillonarioInterface.INPUNT_2),
                Delay.ofMilliseconds(2000)
        );

        actor.attemptsTo(
                WaitUntil.the(DataTwoPageComboMillonarioInterface.RANDOM_NUM_3, isVisible()),
                Click.on(DataTwoPageComboMillonarioInterface.RANDOM_NUM_3),
                Delay.ofMilliseconds(2000)
        );


        actor.attemptsTo(
                WaitUntil.the(DataTwoPageComboMillonarioInterface.RANDOM_NUM_4, isVisible()),
                Click.on(DataTwoPageComboMillonarioInterface.RANDOM_NUM_4),
                Delay.ofMilliseconds(2000)

        );

        actor.attemptsTo(
                WaitUntil.the(DataTwoPageComboMillonarioInterface.RANDOM_NUM_5, isVisible()),
                Click.on(DataTwoPageComboMillonarioInterface.RANDOM_NUM_5),
                Delay.ofMilliseconds(2000)

        );


        actor.attemptsTo(
                WaitUntil.the(DataTwoPageComboMillonarioInterface.BTN_NEXT, isVisible()),
                Click.on(DataTwoPageComboMillonarioInterface.BTN_NEXT)
        );

    }

    public static BetFourTwoPageComboMillonarioTask on() {
        return instrumented(BetFourTwoPageComboMillonarioTask.class);
    }
}
