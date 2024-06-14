package com.co.datacenter.tasks.super_chance.data_super_chance;

import com.co.datacenter.tasks.delay.Delay;
import com.co.datacenter.userinterfaces.chance_tradicional.bet_four_figure_chance_spd.BetFourFigureChanceSpdInterface;
import com.co.datacenter.userinterfaces.super_chance.data_super_chance.DataSuperChanceInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.Calendar;
import java.util.Random;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class DataSuperChanceTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(DataSuperChanceInterface.TITLE_SCROLL_1, isVisible()),
                Scroll.to(DataSuperChanceInterface.TITLE_SCROLL_1));

        actor.attemptsTo(
                WaitUntil.the(DataSuperChanceInterface.LOTTERY_BTN_SELECT, isVisible()),
                Click.on(DataSuperChanceInterface.LOTTERY_BTN_SELECT)
        );


        int dayWeek = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);

        switch (dayWeek) {
            case 1:
                /*
                actor.attemptsTo(
                        WaitUntil.the(DataSuperChanceInterface.DAY_DOM, isVisible()),
                        Click.on((DataSuperChanceInterface.DAY_DOM)));

                 */
                break;
            case 2:
                /*
                actor.attemptsTo(
                        WaitUntil.the(DataSuperChanceInterface.DAY_LUN, isVisible()),
                        Click.on((DataSuperChanceInterface.DAY_LUN)));

                 */

                actor.attemptsTo(
                        WaitUntil.the(DataSuperChanceInterface.CHECK_BOX_LUN, isVisible()),
                        Click.on((DataSuperChanceInterface.CHECK_BOX_LUN)),
                        Delay.ofMilliseconds(500)
                );
                break;
            case 3:
                /*
                actor.attemptsTo(
                        WaitUntil.the(DataSuperChanceInterface.DAY_MAR, isVisible()),
                        Click.on((DataSuperChanceInterface.DAY_MAR)));
                 */

                actor.attemptsTo(
                        WaitUntil.the(DataSuperChanceInterface.CHECK_BOX_MAR, isVisible()),
                        Click.on((DataSuperChanceInterface.CHECK_BOX_MAR)),
                        Delay.ofMilliseconds(500)
                );
                break;
            case 4:
                /*
                actor.attemptsTo(
                        WaitUntil.the(DataSuperChanceInterface.DAY_MIE, isVisible()),
                        Click.on((DataSuperChanceInterface.DAY_MIE)));
                 */

                actor.attemptsTo(
                        WaitUntil.the(DataSuperChanceInterface.CHECK_BOX_MIE, isVisible()),
                        Click.on((DataSuperChanceInterface.CHECK_BOX_MIE)),
                        Delay.ofMilliseconds(500)
                );
                break;
            case 5:
                /*
                actor.attemptsTo(
                        WaitUntil.the(DataSuperChanceInterface.DAY_JUE, isVisible()),
                        Click.on((DataSuperChanceInterface.DAY_JUE)));

                 */

                actor.attemptsTo(
                        WaitUntil.the(DataSuperChanceInterface.DAY_JUE, isVisible()),
                        Click.on((DataSuperChanceInterface.CHECK_BOX_JUE)),
                        Delay.ofMilliseconds(500)
                );
                break;
            case 6:
                /*
                actor.attemptsTo(
                        WaitUntil.the(DataSuperChanceInterface.DAY_VIE, isVisible()),
                        Click.on((DataSuperChanceInterface.DAY_VIE)));

                 */

                actor.attemptsTo(
                        WaitUntil.the(DataSuperChanceInterface.DAY_VIE, isVisible()),
                        Click.on((DataSuperChanceInterface.CHECK_BOX_VIE)),
                        Delay.ofMilliseconds(500)
                );
                break;
            case 7:
                /*
                actor.attemptsTo(
                        WaitUntil.the(DataSuperChanceInterface.DAY_SAB, isVisible()),
                        Click.on((DataSuperChanceInterface.DAY_SAB)));

                 */

                actor.attemptsTo(
                        WaitUntil.the(DataSuperChanceInterface.DAY_SAB, isVisible()),
                        Click.on((DataSuperChanceInterface.CHECK_BOX_SAB)),
                        Delay.ofMilliseconds(500)
                );
                break;
        }


        actor.attemptsTo(
                WaitUntil.the(DataSuperChanceInterface.BTN_SAVE, isVisible()),
                Click.on(DataSuperChanceInterface.BTN_SAVE),
                Delay.ofMilliseconds(500)
        );

        /*
        actor.attemptsTo(
                WaitUntil.the(DataSuperChanceInterface.INPUT_NUM1,isVisible()),
                Click.on(DataSuperChanceInterface.INPUT_NUM1)
        );

         */

        actor.attemptsTo(
                WaitUntil.the(DataSuperChanceInterface.INPUT_NUM1, isVisible()),
                WaitUntil.the(DataSuperChanceInterface.INPUT_NUM1, isEnabled()),
                Enter.theValue("4").into(DataSuperChanceInterface.INPUT_NUM1),
                Delay.ofMilliseconds(500)
        );
        actor.attemptsTo(
                WaitUntil.the(DataSuperChanceInterface.INPUT_NUM2, isVisible()),
                WaitUntil.the(DataSuperChanceInterface.INPUT_NUM2, isEnabled()),
                Enter.theValue("2").into(DataSuperChanceInterface.INPUT_NUM2),
                Delay.ofMilliseconds(500)

        );
        actor.attemptsTo(
                WaitUntil.the(DataSuperChanceInterface.INPUT_NUM3, isVisible()),
                WaitUntil.the(DataSuperChanceInterface.INPUT_NUM3, isEnabled()),
                Enter.theValue("3").into(DataSuperChanceInterface.INPUT_NUM3),
                Delay.ofMilliseconds(500)

        );
        actor.attemptsTo(
                WaitUntil.the(DataSuperChanceInterface.INPUT_NUM4, isVisible()),
                WaitUntil.the(DataSuperChanceInterface.INPUT_NUM4, isEnabled()),
                Enter.theValue("4").into(DataSuperChanceInterface.INPUT_NUM4),
                Delay.ofMilliseconds(500)

        );

        actor.attemptsTo(
                WaitUntil.the(DataSuperChanceInterface.SELECT_VALUE, isVisible()),
                Click.on(DataSuperChanceInterface.SELECT_VALUE),
                Delay.ofMilliseconds(500)

        );

        actor.attemptsTo(
                WaitUntil.the(DataSuperChanceInterface.SELECTED_VALUE, isVisible()),
                Click.on(DataSuperChanceInterface.SELECTED_VALUE),
                Delay.ofMilliseconds(500)

        );

        actor.attemptsTo(
                WaitUntil.the(DataSuperChanceInterface.BUTTON_NEXT, isVisible()),
                Click.on(DataSuperChanceInterface.BUTTON_NEXT),
                Delay.ofMilliseconds(500)
        );


    }

    public static DataSuperChanceTask on() {
        return instrumented(DataSuperChanceTask.class);
    }

}
