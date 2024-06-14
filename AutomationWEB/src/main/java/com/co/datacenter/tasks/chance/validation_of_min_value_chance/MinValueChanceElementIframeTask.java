package com.co.datacenter.tasks.chance.validation_of_min_value_chance;

import com.co.datacenter.tasks.delay.Delay;
import com.co.datacenter.userinterfaces.chance_tradicional.date_chance.DataChanceInterface;
import com.co.datacenter.userinterfaces.chance_tradicional.validation_of_min_value_chance.MinValueChanceInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.Calendar;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class MinValueChanceElementIframeTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(
                WaitUntil.the(MinValueChanceInterface.SCROLL_1, isVisible()),
                Scroll.to((MinValueChanceInterface.SCROLL_1)),
                Delay.ofMilliseconds(1000)

        );


        actor.attemptsTo(
                WaitUntil.the(MinValueChanceInterface.BTN_SELECT_LOTTERY, isVisible()),
                Click.on((MinValueChanceInterface.BTN_SELECT_LOTTERY)),
                Delay.ofMilliseconds(1000)

        );

        int dayOdWeek = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);

        switch (dayOdWeek) {
            case 1:
                actor.attemptsTo(
                        WaitUntil.the(MinValueChanceInterface.DAY_DOM, isVisible()),
                        Click.on((MinValueChanceInterface.DAY_DOM)),
                        Delay.ofMilliseconds(1000)

                );
                /*
                actor.attemptsTo(
                    WaitUntil.the(MinValueChanceInterface.C, isVisible()),
                    Click.on((MinValueChanceInterface.CKECK_BOX_LOTTERY)));

                 */
                break;
            case 2:
                actor.attemptsTo(
                        WaitUntil.the(MinValueChanceInterface.DAY_LUN, isVisible()),
                        Click.on((MinValueChanceInterface.DAY_LUN)),
                        Delay.ofMilliseconds(1000)

                );

                actor.attemptsTo(
                        WaitUntil.the(MinValueChanceInterface.DAY_LUN, isVisible()),
                        Click.on((MinValueChanceInterface.CHECK_BOX_LUN)),
                        Delay.ofMilliseconds(1000)
                );
                break;
            case 3:
                actor.attemptsTo(
                        WaitUntil.the(MinValueChanceInterface.DAY_MAR, isVisible()),
                        Click.on((MinValueChanceInterface.DAY_MAR)),
                        Delay.ofMilliseconds(1000)

                );

                actor.attemptsTo(
                        WaitUntil.the(MinValueChanceInterface.DAY_MAR, isVisible()),
                        Click.on((MinValueChanceInterface.CHECK_BOX_MAR)),
                        Delay.ofMilliseconds(1000)

                );
                break;
            case 4:
                actor.attemptsTo(
                        WaitUntil.the(MinValueChanceInterface.DAY_MIE, isVisible()),
                        Click.on((MinValueChanceInterface.DAY_MIE)),
                        Delay.ofMilliseconds(1000)

                );

                actor.attemptsTo(
                        WaitUntil.the(MinValueChanceInterface.DAY_MIE, isVisible()),
                        Click.on((MinValueChanceInterface.CHECK_BOX_MIE)),
                        Delay.ofMilliseconds(1000)

                );
                break;
            case 5:
                actor.attemptsTo(
                        WaitUntil.the(MinValueChanceInterface.DAY_JUE, isVisible()),
                        Click.on((MinValueChanceInterface.DAY_JUE)),
                        Delay.ofMilliseconds(1000)

                );

                actor.attemptsTo(
                        WaitUntil.the(MinValueChanceInterface.DAY_JUE, isVisible()),
                        Click.on((MinValueChanceInterface.CHECK_BOX_JUE)),
                        Delay.ofMilliseconds(1000)

                );
                break;
            case 6:
                actor.attemptsTo(
                        WaitUntil.the(MinValueChanceInterface.DAY_VIE, isVisible()),
                        Click.on((MinValueChanceInterface.DAY_VIE)),
                        Delay.ofMilliseconds(1000)

                );

                actor.attemptsTo(
                        WaitUntil.the(MinValueChanceInterface.DAY_VIE, isVisible()),
                        Click.on((MinValueChanceInterface.CHECK_BOX_VIE)),
                        Delay.ofMilliseconds(1000)

                );
                break;
            case 7:
                actor.attemptsTo(
                        WaitUntil.the(MinValueChanceInterface.DAY_SAB, isVisible()),
                        Click.on((MinValueChanceInterface.DAY_SAB)),
                        Delay.ofMilliseconds(1000)

                );

                actor.attemptsTo(
                        WaitUntil.the(MinValueChanceInterface.DAY_SAB, isVisible()),
                        Click.on((MinValueChanceInterface.CHECK_BOX_SAB)),
                        Delay.ofMilliseconds(1000)

                );
                break;

        }

        actor.attemptsTo(
                WaitUntil.the(MinValueChanceInterface.BTN_ACCEPT_LOTTERY, isVisible()),
                Click.on((MinValueChanceInterface.BTN_ACCEPT_LOTTERY)),
                Delay.ofMilliseconds(1000)
        );


        actor.attemptsTo(
                WaitUntil.the(MinValueChanceInterface.INPUT_NUM, isVisible()),
                Enter.theValue("0526").into(DataChanceInterface.INPUT_NUM),
                Delay.ofMilliseconds(1000)

        );


        actor.attemptsTo(
                Scroll.to((MinValueChanceInterface.SCROLL_2))
        );

        actor.attemptsTo(
                WaitUntil.the(MinValueChanceInterface.CLICK_UPDATE, isVisible()),
                Click.on((MinValueChanceInterface.CLICK_UPDATE)),
                Delay.ofMilliseconds(1000)

        );

        actor.attemptsTo(
                WaitUntil.the(MinValueChanceInterface.INPUT_PLENO_DIRECTO, isVisible()),
                Click.on((MinValueChanceInterface.INPUT_PLENO_DIRECTO)),
                Delay.ofMilliseconds(1000)

        );


        actor.attemptsTo(
                WaitUntil.the(MinValueChanceInterface.INPUT_PLENO_DIRECTO, isVisible()),
                Enter.theValue("50").into(MinValueChanceInterface.INPUT_PLENO_DIRECTO),
                Delay.ofMilliseconds(1000)

        );

        actor.attemptsTo(
                WaitUntil.the(MinValueChanceInterface.INPUT_PLENO_CONVINADO, isVisible()),
                Click.on((MinValueChanceInterface.INPUT_PLENO_CONVINADO)),
                Delay.ofMilliseconds(1000)

        );


        actor.attemptsTo(
                WaitUntil.the(MinValueChanceInterface.INPUT_PLENO_CONVINADO, isVisible()),
                Enter.theValue("50").into(MinValueChanceInterface.INPUT_PLENO_CONVINADO),
                Delay.ofMilliseconds(1000)

        );


        actor.attemptsTo(
                WaitUntil.the(MinValueChanceInterface.BTN_SIGUIENTE, isVisible()),
                Click.on((MinValueChanceInterface.BTN_SIGUIENTE)),
                Delay.ofMilliseconds(1000)

        );


    }


    public static MinValueChanceElementIframeTask on() {
        return instrumented(MinValueChanceElementIframeTask.class);
    }
}
