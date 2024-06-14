package com.co.datacenter.tasks.chance.validation_of_max_value_chance;

import com.co.datacenter.tasks.delay.Delay;
import com.co.datacenter.userinterfaces.chance_tradicional.bet_four_figure_chance_spd.BetFourFigureChanceSpdInterface;
import com.co.datacenter.userinterfaces.chance_tradicional.validation_of_max_value_chance.MaxValueChanceInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.Calendar;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class MaxValueChanceElementIframeTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(
                WaitUntil.the(MaxValueChanceInterface.BUTTON_GENERATE_NUM, isVisible()),
                Click.on(MaxValueChanceInterface.BUTTON_GENERATE_NUM),
                Delay.ofMilliseconds(1000)
        );


        actor.attemptsTo(
                WaitUntil.the(MaxValueChanceInterface.CLICK_UPDATE, isVisible()),
                Click.on((MaxValueChanceInterface.CLICK_UPDATE)),
                Delay.ofMilliseconds(1000)

        );

        actor.attemptsTo(
                WaitUntil.the(MaxValueChanceInterface.INPUT_PLENO_DIRECTO, isVisible()),
                Click.on((MaxValueChanceInterface.INPUT_PLENO_DIRECTO)),
                Enter.theValue("1000000").into(MaxValueChanceInterface.INPUT_PLENO_DIRECTO),
                Delay.ofMilliseconds(1000)

        );


        /*actor.attemptsTo(
                WaitUntil.the(MaxValueChanceInterface.INPUT_PLENO_DIRECTO, isVisible()),
                Enter.theValue("1000000").into(MaxValueChanceInterface.INPUT_PLENO_DIRECTO));*/

        actor.attemptsTo(
                WaitUntil.the(MaxValueChanceInterface.INPUT_PLENO_CONVINADO, isVisible()),
                Click.on((MaxValueChanceInterface.INPUT_PLENO_CONVINADO)),
                Enter.theValue("1000000").into(MaxValueChanceInterface.INPUT_PLENO_CONVINADO),
                Delay.ofMilliseconds(2000)

        );


        /*actor.attemptsTo(
                WaitUntil.the(MaxValueChanceInterface.BTN_SIGUIENTE, isVisible()),
                Click.on((MaxValueChanceInterface.BTN_SIGUIENTE)));*/


       /*try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/


        /*actor.attemptsTo(
                WaitUntil.the(MaxValueChanceInterface.INPUT_PLENO_CONVINADO, isVisible()),
                Enter.theValue("1000000").into(MaxValueChanceInterface.INPUT_PLENO_CONVINADO));*/


        actor.attemptsTo(
                //WaitUntil.the(MaxValueChanceInterface.ALERT_TITLE_VALUENOTALLOWED, isVisible()),
                Click.on(MaxValueChanceInterface.SCROLL_3),
                Delay.ofMilliseconds(1000)

        );

        actor.attemptsTo(
                WaitUntil.the(MaxValueChanceInterface.SELECT_1, isVisible()),
                Click.on(MaxValueChanceInterface.SELECT_1),
                Delay.ofMilliseconds(1000),


                WaitUntil.the(MaxValueChanceInterface.SELECT_PRICE, isVisible()),
                Click.on(MaxValueChanceInterface.SELECT_PRICE),
                Delay.ofMilliseconds(2000)

        );

        actor.attemptsTo(
                WaitUntil.the(MaxValueChanceInterface.BUTTON_PRICE_ACEPT, isVisible()),
                Click.on(MaxValueChanceInterface.BUTTON_PRICE_ACEPT),
                Delay.ofMilliseconds(1000)

        );

        actor.attemptsTo(
                WaitUntil.the(MaxValueChanceInterface.BTN_SIGUIENTE, isVisible()),
                Click.on((MaxValueChanceInterface.BTN_SIGUIENTE)),
                Delay.ofMilliseconds(1000)

        );


    }

    public static MaxValueChanceElementIframeTask on() {
        return instrumented(MaxValueChanceElementIframeTask.class);
    }
}
