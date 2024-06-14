package com.co.datacenter.tasks.super_chance.validation_field_value_empty_super_chance;

import com.co.datacenter.tasks.delay.Delay;
import com.co.datacenter.userinterfaces.super_chance.add_max_super_chance.AddMaxSuperChanceInterface;
import com.co.datacenter.userinterfaces.super_chance.data_super_chance.DataSuperChanceInterface;
import com.co.datacenter.userinterfaces.super_chance.validation_field_value_empty_super_chance.ValueEmptySuperChanceInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.Calendar;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ValueEmptySuperChanceTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
            WaitUntil.the(ValueEmptySuperChanceInterface.TITLE_SCROLL_1, isVisible()),
            Scroll.to(ValueEmptySuperChanceInterface.TITLE_SCROLL_1),
                Delay.ofMilliseconds(2000)
                );

        actor.attemptsTo(
                WaitUntil.the(ValueEmptySuperChanceInterface.LOTTERY_BTN_SELECT, isVisible()),
                Click.on(ValueEmptySuperChanceInterface.LOTTERY_BTN_SELECT),
                Delay.ofMilliseconds(2000)

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
                        WaitUntil.the(ValueEmptySuperChanceInterface.CHECK_BOX_LUN, isVisible()),
                        Click.on((ValueEmptySuperChanceInterface.CHECK_BOX_LUN)),
                        Delay.ofMilliseconds(3000)
                );
                break;
            case 3:
                /*
                actor.attemptsTo(
                        WaitUntil.the(DataSuperChanceInterface.DAY_MAR, isVisible()),
                        Click.on((DataSuperChanceInterface.DAY_MAR)));
                 */

                actor.attemptsTo(
                        WaitUntil.the(ValueEmptySuperChanceInterface.CHECK_BOX_MAR, isVisible()),
                        Click.on((ValueEmptySuperChanceInterface.CHECK_BOX_MAR)),
                        Delay.ofMilliseconds(3000)
                );
                break;
            case 4:
                /*
                actor.attemptsTo(
                        WaitUntil.the(DataSuperChanceInterface.DAY_MIE, isVisible()),
                        Click.on((DataSuperChanceInterface.DAY_MIE)));
                 */

                actor.attemptsTo(
                        WaitUntil.the(ValueEmptySuperChanceInterface.CHECK_BOX_MIE, isVisible()),
                        Click.on((ValueEmptySuperChanceInterface.CHECK_BOX_MIE)),
                        Delay.ofMilliseconds(3000)
                );
                break;
            case 5:
                /*
                actor.attemptsTo(
                        WaitUntil.the(DataSuperChanceInterface.DAY_JUE, isVisible()),
                        Click.on((DataSuperChanceInterface.DAY_JUE)));

                 */

                actor.attemptsTo(
                        WaitUntil.the(ValueEmptySuperChanceInterface.DAY_JUE, isVisible()),
                        Click.on((ValueEmptySuperChanceInterface.CHECK_BOX_JUE)),
                        Delay.ofMilliseconds(3000)
                );
                break;
            case 6:
                /*
                actor.attemptsTo(
                        WaitUntil.the(DataSuperChanceInterface.DAY_VIE, isVisible()),
                        Click.on((DataSuperChanceInterface.DAY_VIE)));

                 */

                actor.attemptsTo(
                        WaitUntil.the(ValueEmptySuperChanceInterface.DAY_VIE, isVisible()),
                        Click.on((ValueEmptySuperChanceInterface.CHECK_BOX_VIE)),
                        Delay.ofMilliseconds(3000)
                );
                break;
            case 7:
                /*
                actor.attemptsTo(
                        WaitUntil.the(DataSuperChanceInterface.DAY_SAB, isVisible()),
                        Click.on((DataSuperChanceInterface.DAY_SAB)));

                 */

                actor.attemptsTo(
                        WaitUntil.the(ValueEmptySuperChanceInterface.DAY_SAB, isVisible()),
                        Click.on((ValueEmptySuperChanceInterface.CHECK_BOX_SAB)),
                        Delay.ofMilliseconds(3000)
                );
                break;
        }


        actor.attemptsTo(
            WaitUntil.the(ValueEmptySuperChanceInterface.BTN_SAVE, isVisible()),
            Click.on(ValueEmptySuperChanceInterface.BTN_SAVE),
                Delay.ofMilliseconds(3000)
        );

        /*
        actor.attemptsTo(
                WaitUntil.the(DataSuperChanceInterface.INPUT_NUM1,isVisible()),
                Click.on(DataSuperChanceInterface.INPUT_NUM1)
        );



        actor.attemptsTo(
                WaitUntil.the(AddMaxSuperChanceInterface.INPUT_NUM1,isVisible()),
                Enter.theValue("4").into(AddMaxSuperChanceInterface.INPUT_NUM1)
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

        //Juego No 1

        actor.attemptsTo(
                WaitUntil.the(ValueEmptySuperChanceInterface.BTN_RANDOM_THREE, isVisible()),
                Click.on(ValueEmptySuperChanceInterface.BTN_RANDOM_THREE),
                Delay.ofMilliseconds(2500)

        );

        actor.attemptsTo(
                WaitUntil.the(ValueEmptySuperChanceInterface.BTN_ADD_GAME, isVisible()),
                Click.on(ValueEmptySuperChanceInterface.BTN_ADD_GAME),
                Delay.ofMilliseconds(3000)

        );

        actor.attemptsTo(
                WaitUntil.the(ValueEmptySuperChanceInterface.BTN_SPECIFIC_VALUE, isVisible()),
                Click.on(ValueEmptySuperChanceInterface.BTN_SPECIFIC_VALUE),
                Delay.ofMilliseconds(3000)

        );

        actor.attemptsTo(
                WaitUntil.the(ValueEmptySuperChanceInterface.BTN_ACCEPT_ADD_GAME, isVisible()),
                Click.on(ValueEmptySuperChanceInterface.BTN_ACCEPT_ADD_GAME),
                Delay.ofMilliseconds(3000)

        );

        //Juego No 2

        actor.attemptsTo(
                WaitUntil.the(ValueEmptySuperChanceInterface.TITLE_SCROLL_1, isVisible()),
                Scroll.to(ValueEmptySuperChanceInterface.TITLE_SCROLL_1),
                Delay.ofMilliseconds(3000)

        );


        actor.attemptsTo(
                WaitUntil.the(ValueEmptySuperChanceInterface.BTN_RANDOM_FOUR, isVisible()),
                Click.on(ValueEmptySuperChanceInterface.BTN_RANDOM_FOUR),
                Delay.ofMilliseconds(2500)

        );

        actor.attemptsTo(
                WaitUntil.the(ValueEmptySuperChanceInterface.SELECT_VALUE_2 , isVisible()),
                Click.on(ValueEmptySuperChanceInterface.SELECT_VALUE_2 ),
                Delay.ofMilliseconds(3000)
        );

        actor.attemptsTo(
                WaitUntil.the(ValueEmptySuperChanceInterface.SELECTED_VALUE_2 , isVisible()),
                Click.on(ValueEmptySuperChanceInterface.SELECTED_VALUE_2 ),
                Delay.ofMilliseconds(3000)

        );

        actor.attemptsTo(
                WaitUntil.the(ValueEmptySuperChanceInterface.BUTTON_NEXT, isVisible()),
                Click.on(ValueEmptySuperChanceInterface.BUTTON_NEXT),
                Delay.ofMilliseconds(3000)

        );

        actor.attemptsTo(
                WaitUntil.the(ValueEmptySuperChanceInterface.BTN_ACCEPT, isVisible()),
                Click.on(ValueEmptySuperChanceInterface.BTN_ACCEPT),
                Delay.ofMilliseconds(3000)

        );



    }
    public static ValueEmptySuperChanceTask on(){
        return instrumented(ValueEmptySuperChanceTask.class);
    }

}
