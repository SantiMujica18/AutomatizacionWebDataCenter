package com.co.datacenter.tasks.super_chance.validation_min_value_super_chance;

import com.co.datacenter.tasks.delay.Delay;
import com.co.datacenter.userinterfaces.super_chance.bet_three_figures_super_chance.BetThreeSuperChanceInterface;
import com.co.datacenter.userinterfaces.super_chance.validation_min_value_super_chance.MinValueSuperChanceInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.Calendar;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class MinValueSuperChanceTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
            WaitUntil.the(MinValueSuperChanceInterface.TITLE_SCROLL_1, isVisible()),
            Scroll.to(MinValueSuperChanceInterface.TITLE_SCROLL_1));
        /*

        actor.attemptsTo(
                WaitUntil.the(MinValueSuperChanceInterface.LOTTERY_BTN_SELECT, isVisible()),
                Click.on(MinValueSuperChanceInterface.LOTTERY_BTN_SELECT)
        );



        int dayWeek = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);

        switch(dayWeek){
            case 1:

                actor.attemptsTo(
                        WaitUntil.the(DataSuperChanceInterface.DAY_DOM, isVisible()),
                        Click.on((DataSuperChanceInterface.DAY_DOM)));


                break;
            case 2:

                actor.attemptsTo(
                        WaitUntil.the(DataSuperChanceInterface.DAY_LUN, isVisible()),
                        Click.on((DataSuperChanceInterface.DAY_LUN)));


                actor.attemptsTo(
                        WaitUntil.the(MinValueSuperChanceInterface.CHECK_BOX_LUN, isVisible()),
                        Click.on((MinValueSuperChanceInterface.CHECK_BOX_LUN)));
                break;
            case 3:

                actor.attemptsTo(
                        WaitUntil.the(DataSuperChanceInterface.DAY_MAR, isVisible()),
                        Click.on((DataSuperChanceInterface.DAY_MAR)));


                actor.attemptsTo(
                        WaitUntil.the(MinValueSuperChanceInterface.CHECK_BOX_MAR, isVisible()),
                        Click.on((MinValueSuperChanceInterface.CHECK_BOX_MAR)));
                break;
            case 4:

                actor.attemptsTo(
                        WaitUntil.the(DataSuperChanceInterface.DAY_MIE, isVisible()),
                        Click.on((DataSuperChanceInterface.DAY_MIE)));


                actor.attemptsTo(
                        WaitUntil.the(MinValueSuperChanceInterface.CHECK_BOX_MIE, isVisible()),
                        Click.on((MinValueSuperChanceInterface.CHECK_BOX_MIE)));
                break;
            case 5:

                actor.attemptsTo(
                        WaitUntil.the(DataSuperChanceInterface.DAY_JUE, isVisible()),
                        Click.on((DataSuperChanceInterface.DAY_JUE)));



                actor.attemptsTo(
                        WaitUntil.the(MinValueSuperChanceInterface.DAY_JUE, isVisible()),
                        Click.on((MinValueSuperChanceInterface.CHECK_BOX_JUE)));
                break;
            case 6:

                actor.attemptsTo(
                        WaitUntil.the(DataSuperChanceInterface.DAY_VIE, isVisible()),
                        Click.on((DataSuperChanceInterface.DAY_VIE)));



                actor.attemptsTo(
                        WaitUntil.the(MinValueSuperChanceInterface.DAY_VIE, isVisible()),
                        Click.on((MinValueSuperChanceInterface.CHECK_BOX_VIE)));
                break;
            case 7:

                actor.attemptsTo(
                        WaitUntil.the(DataSuperChanceInterface.DAY_SAB, isVisible()),
                        Click.on((DataSuperChanceInterface.DAY_SAB)));



                actor.attemptsTo(
                        WaitUntil.the(MinValueSuperChanceInterface.DAY_SAB, isVisible()),
                        Click.on((MinValueSuperChanceInterface.CHECK_BOX_SAB)));
                break;
        }



        actor.attemptsTo(
            WaitUntil.the(MinValueSuperChanceInterface.BTN_SAVE, isVisible()),
            Click.on(MinValueSuperChanceInterface.BTN_SAVE));
            */

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
                WaitUntil.the(MinValueSuperChanceInterface.BTN_RANDOM_FOUR, isVisible()),
                Click.on(MinValueSuperChanceInterface.BTN_RANDOM_FOUR),
                Delay.ofMilliseconds(2500)

        );

        actor.attemptsTo(
                WaitUntil.the(MinValueSuperChanceInterface.SELECT_VALUE, isVisible()),
                Click.on(MinValueSuperChanceInterface.SELECT_VALUE),
                Delay.ofMilliseconds(500)

        );

        actor.attemptsTo(
                WaitUntil.the(MinValueSuperChanceInterface.SELECTED_VALUE, isVisible()),
                Click.on(MinValueSuperChanceInterface.SELECTED_VALUE),
                Delay.ofMilliseconds(500)

        );



        actor.attemptsTo(
                WaitUntil.the(MinValueSuperChanceInterface.BUTTON_NEXT, isVisible()),
                Click.on(MinValueSuperChanceInterface.BUTTON_NEXT),
                Delay.ofMilliseconds(500)

        );


        actor.attemptsTo(
                WaitUntil.the(MinValueSuperChanceInterface.BTN_ACCEPT_ALERT, isVisible()),
                Click.on(MinValueSuperChanceInterface.BTN_ACCEPT_ALERT),
                Delay.ofMilliseconds(500)


        );



    }
    public static MinValueSuperChanceTask on(){
        return instrumented(MinValueSuperChanceTask.class);
    }

}
