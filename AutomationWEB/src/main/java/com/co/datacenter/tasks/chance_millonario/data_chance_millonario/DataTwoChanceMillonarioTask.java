package com.co.datacenter.tasks.chance_millonario.data_chance_millonario;

import com.co.datacenter.tasks.delay.Delay;
import com.co.datacenter.userinterfaces.chance_millonario.data_chance_millonario.DataTwoPageChanceMillonarioInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;


import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class DataTwoChanceMillonarioTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {



        actor.attemptsTo(
                //WaitUntil.the(DataTwoPageChanceMillonarioInterface.SCROLL_1, isVisible()),
                //Scroll.to(DataTwoPageChanceMillonarioInterface.SCROLL_1),
                WaitUntil.the(DataTwoPageChanceMillonarioInterface.INPUT_1, isVisible()),
                Enter.theValue("5236").into(DataTwoPageChanceMillonarioInterface.INPUT_1),
                Delay.ofMilliseconds(2000),

                WaitUntil.the(DataTwoPageChanceMillonarioInterface.BTN_CLEAN, isVisible()),
                Click.on(DataTwoPageChanceMillonarioInterface.BTN_CLEAN),
                Delay.ofMilliseconds(500)
                );

            actor.attemptsTo(
                    //WaitUntil.the(DataTwoPageChanceMillonarioInterface.SCROLL_1, isVisible()),
                    //Scroll.to(DataTwoPageChanceMillonarioInterface.SCROLL_1),

                    WaitUntil.the(DataTwoPageChanceMillonarioInterface.BTN_RANDOM_1, isVisible()),
                    WaitUntil.the(DataTwoPageChanceMillonarioInterface.BTN_RANDOM_1, isEnabled()),
                    Click.on(DataTwoPageChanceMillonarioInterface.BTN_RANDOM_1),
                    Delay.ofMilliseconds(5000)

            );
            actor.attemptsTo(
                    WaitUntil.the(DataTwoPageChanceMillonarioInterface.BTN_RANDOM_2, isVisible()),
                    WaitUntil.the(DataTwoPageChanceMillonarioInterface.BTN_RANDOM_2, isEnabled()),
                    Click.on(DataTwoPageChanceMillonarioInterface.BTN_RANDOM_2),
                    Delay.ofMilliseconds(5000)

            );
            actor.attemptsTo(
                    WaitUntil.the(DataTwoPageChanceMillonarioInterface.BTN_RANDOM_3, isVisible()),
                    WaitUntil.the(DataTwoPageChanceMillonarioInterface.BTN_RANDOM_3, isEnabled()),
                    Click.on(DataTwoPageChanceMillonarioInterface.BTN_RANDOM_3),
                    Delay.ofMilliseconds(5000)
            );

            actor.attemptsTo(
                    WaitUntil.the(DataTwoPageChanceMillonarioInterface.BTN_RANDOM_4, isVisible()),
                    WaitUntil.the(DataTwoPageChanceMillonarioInterface.BTN_RANDOM_4, isEnabled()),
                    Click.on(DataTwoPageChanceMillonarioInterface.BTN_RANDOM_4),
                    Delay.ofMilliseconds(5000)
            );

            actor.attemptsTo(
                    WaitUntil.the(DataTwoPageChanceMillonarioInterface.BTN_RANDOM_5, isVisible()),
                    WaitUntil.the(DataTwoPageChanceMillonarioInterface.BTN_RANDOM_5, isEnabled()),
                    Click.on(DataTwoPageChanceMillonarioInterface.BTN_RANDOM_5),
                    Delay.ofMilliseconds(5000)

            );

            actor.attemptsTo(
                    WaitUntil.the(DataTwoPageChanceMillonarioInterface.BTN_NEXT, isVisible()),
                    WaitUntil.the(DataTwoPageChanceMillonarioInterface.BTN_NEXT, isEnabled()),
                    Click.on(DataTwoPageChanceMillonarioInterface.BTN_NEXT),
                    Delay.ofMilliseconds(5000)
            );

    }

    public static DataTwoChanceMillonarioTask on(){
        return instrumented(DataTwoChanceMillonarioTask.class);
    }
}
