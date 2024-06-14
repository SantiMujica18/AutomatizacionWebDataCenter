package com.co.datacenter.tasks.super_chance.bet_four_super_chance;

import com.co.datacenter.tasks.delay.Delay;
import com.co.datacenter.userinterfaces.super_chance.bet_four_figures_super_chance.BetFourSuperChanceInterface;
import com.co.datacenter.userinterfaces.super_chance.bet_three_figures_super_chance.BetThreeSuperChanceInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.dom4j.datatype.DatatypeElement;

import java.util.Calendar;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class BetFourSuperChanceTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
            WaitUntil.the(BetFourSuperChanceInterface.TITLE_SCROLL_1, isVisible()),
            Scroll.to(BetFourSuperChanceInterface.TITLE_SCROLL_1));

        actor.attemptsTo(
                WaitUntil.the(BetFourSuperChanceInterface.LOTTERY_BTN_SELECT, isVisible()),
                Click.on(BetFourSuperChanceInterface.LOTTERY_BTN_SELECT)
        );



        int dayWeek = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);

        switch(dayWeek){
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
                        WaitUntil.the(BetFourSuperChanceInterface.CHECK_BOX_LUN, isVisible()),
                        Click.on((BetFourSuperChanceInterface.CHECK_BOX_LUN)),
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
                        WaitUntil.the(BetFourSuperChanceInterface.CHECK_BOX_MAR, isVisible()),
                        Click.on((BetFourSuperChanceInterface.CHECK_BOX_MAR)),
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
                        WaitUntil.the(BetFourSuperChanceInterface.CHECK_BOX_MIE, isVisible()),
                        Click.on((BetFourSuperChanceInterface.CHECK_BOX_MIE)),
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
                        WaitUntil.the(BetFourSuperChanceInterface.DAY_JUE, isVisible()),
                        Click.on((BetFourSuperChanceInterface.CHECK_BOX_JUE)),
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
                        WaitUntil.the(BetFourSuperChanceInterface.DAY_VIE, isVisible()),
                        Click.on((BetFourSuperChanceInterface.CHECK_BOX_VIE)),
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
                        WaitUntil.the(BetFourSuperChanceInterface.DAY_SAB, isVisible()),
                        Click.on((BetFourSuperChanceInterface.CHECK_BOX_SAB)),
                        Delay.ofMilliseconds(500)
                );
                break;
        }


        actor.attemptsTo(
            WaitUntil.the(BetFourSuperChanceInterface.BTN_SAVE, isVisible()),
            Click.on(BetFourSuperChanceInterface.BTN_SAVE),
                Delay.ofMilliseconds(500)
        );

        /*
        actor.attemptsTo(
                WaitUntil.the(DataSuperChanceInterface.INPUT_NUM1,isVisible()),
                Click.on(DataSuperChanceInterface.INPUT_NUM1)
        );

         */

        /*

        actor.attemptsTo(
                WaitUntil.the(DataSuperChanceInterface.INPUT_NUM1,isVisible()),
                Enter.theValue("4").into(DataSuperChanceInterface.INPUT_NUM1)
        );
        actor.attemptsTo(
                WaitUntil.the(DataSuperChanceInterface.INPUT_NUM2,isVisible()),
                Enter.theValue("2").into(DataSuperChanceInterface.INPUT_NUM2)
        );
        actor.attemptsTo(
                WaitUntil.the(DataSuperChanceInterface.INPUT_NUM3,isVisible()),
                Enter.theValue("3").into(DataSuperChanceInterface.INPUT_NUM3)
        );
        actor.attemptsTo(
                WaitUntil.the(DataSuperChanceInterface.INPUT_NUM4,isVisible()),
                Enter.theValue("4").into(DataSuperChanceInterface.INPUT_NUM4)
        );

         */

        actor.attemptsTo(
                WaitUntil.the(BetFourSuperChanceInterface.BTN_RANDOM_FOUR, isVisible()),
                Click.on(BetFourSuperChanceInterface.BTN_RANDOM_FOUR),
                Delay.ofMilliseconds(2500)
        );

        actor.attemptsTo(
                WaitUntil.the(BetFourSuperChanceInterface.SELECT_VALUE, isVisible()),
                Click.on(BetFourSuperChanceInterface.SELECT_VALUE),
                Delay.ofMilliseconds(500)

        );

        actor.attemptsTo(
                WaitUntil.the(BetFourSuperChanceInterface.SELECTED_VALUE, isVisible()),
                Click.on(BetFourSuperChanceInterface.SELECTED_VALUE),
                Delay.ofMilliseconds(500)

        );



        actor.attemptsTo(
                WaitUntil.the(BetFourSuperChanceInterface.BUTTON_NEXT, isVisible()),
                Click.on(BetFourSuperChanceInterface.BUTTON_NEXT),
                Delay.ofMilliseconds(500)

        );


    }
    public static BetFourSuperChanceTask on(){
        return instrumented(BetFourSuperChanceTask.class);
    }

}
