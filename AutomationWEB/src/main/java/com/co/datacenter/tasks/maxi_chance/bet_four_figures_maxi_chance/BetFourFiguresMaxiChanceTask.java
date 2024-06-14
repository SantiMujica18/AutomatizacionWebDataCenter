package com.co.datacenter.tasks.maxi_chance.bet_four_figures_maxi_chance;

import com.co.datacenter.userinterfaces.maxi_chance.data_maxi_chance.DataMaxiChanceInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class BetFourFiguresMaxiChanceTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        try {
            actor.attemptsTo(

                    WaitUntil.the(DataMaxiChanceInterface.TITLE_SCROLL_1, isVisible()),
                    Scroll.to(DataMaxiChanceInterface.TITLE_SCROLL_1),


                    WaitUntil.the(DataMaxiChanceInterface.BTN_SELEC_LOTTERY,isVisible()),
                    Click.on(DataMaxiChanceInterface.BTN_SELEC_LOTTERY),


                    WaitUntil.the(DataMaxiChanceInterface.CHECK_BOX_LOTTERY, isVisible()),
                    Click.on(DataMaxiChanceInterface.CHECK_BOX_LOTTERY),


                    WaitUntil.the(DataMaxiChanceInterface.BTN_SAVE_LOTTERY, isVisible()),
                    Click.on(DataMaxiChanceInterface.BTN_SAVE_LOTTERY),


                    WaitUntil.the(DataMaxiChanceInterface.BTN_RAMDON_FOUR, isVisible()),
                    Click.on(DataMaxiChanceInterface.BTN_RAMDON_FOUR));


                    Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

            actor.attemptsTo(
                    WaitUntil.the(DataMaxiChanceInterface.SELECT_VALUE, isVisible()),
                    Click.on(DataMaxiChanceInterface.SELECT_VALUE),

                    WaitUntil.the(DataMaxiChanceInterface.SELECTED_VALUE, isVisible()),
                    Click.on(DataMaxiChanceInterface.SELECTED_VALUE),


                    WaitUntil.the(DataMaxiChanceInterface.BTN_NEXT, isVisible()),
                    Click.on(DataMaxiChanceInterface.BTN_NEXT));



    }

    public static BetFourFiguresMaxiChanceTask on(){
        return instrumented(BetFourFiguresMaxiChanceTask.class);
    }
}
