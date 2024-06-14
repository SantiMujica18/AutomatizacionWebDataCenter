package com.co.datacenter.tasks.maxi_chance.bet_three_figures_maxi_chance;

import com.co.datacenter.tasks.delay.Delay;
import com.co.datacenter.userinterfaces.maxi_chance.data_maxi_chance.DataMaxiChanceInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class BetThreeFiguresMaxiChanceTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(

                    WaitUntil.the(DataMaxiChanceInterface.TITLE_SCROLL_1, isVisible()),
                    Scroll.to(DataMaxiChanceInterface.TITLE_SCROLL_1),
                    Delay.ofMilliseconds(1000)

                    );

                    actor.attemptsTo(

                            WaitUntil.the(DataMaxiChanceInterface.SELECT_VALUE, isVisible()),
                            Click.on(DataMaxiChanceInterface.SELECT_VALUE),

                            WaitUntil.the(DataMaxiChanceInterface.SELECTED_VALUE, isVisible()),
                            Click.on(DataMaxiChanceInterface.SELECTED_VALUE),

                            WaitUntil.the(DataMaxiChanceInterface.BTN_RAMDON_THREE, isVisible()),
                            Click.on(DataMaxiChanceInterface.BTN_RAMDON_THREE),
                            Delay.ofMilliseconds(2000),

                            WaitUntil.the(DataMaxiChanceInterface.BTN_NEXT, isVisible()),
                            Click.on(DataMaxiChanceInterface.BTN_NEXT),
                            Delay.ofMilliseconds(1000)

                            );



        }

        public static BetThreeFiguresMaxiChanceTask on () {
            return instrumented(BetThreeFiguresMaxiChanceTask.class);
        }
    }
