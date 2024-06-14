package com.co.datacenter.tasks.chance.bet_three_figures_chance_pc;

import com.co.datacenter.tasks.delay.Delay;
import com.co.datacenter.userinterfaces.chance_tradicional.bet_three_figures_chance_pc.BetThreeFigureChancePcInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.Calendar;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class BetThreeFigurePcChanceTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BetThreeFigureChancePcInterface.SCROLL_1, isVisible()),
                Scroll.to((BetThreeFigureChancePcInterface.SCROLL_1))
        );


        actor.attemptsTo(
                WaitUntil.the(BetThreeFigureChancePcInterface.BTN_SELECT_LOTTERY, isVisible()),
                Click.on((BetThreeFigureChancePcInterface.BTN_SELECT_LOTTERY)),
                Delay.ofMilliseconds(500)
        );

        int dayOdWeek = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);

        switch (dayOdWeek) {
            case 1:
                actor.attemptsTo(
                        WaitUntil.the(BetThreeFigureChancePcInterface.DAY_DOM, isVisible()),
                        Click.on((BetThreeFigureChancePcInterface.DAY_DOM)),
                        Delay.ofMilliseconds(1000)
                );
                /*
                actor.attemptsTo(
                    WaitUntil.the(MinValueChanceInterface.C, isVisible()),
                    Click.on((MinValueChanceInterface.CKECK_BOX_LOTTERY)),
                                    Delay.ofMilliseconds(1000)
);

                 */
                break;
            case 2:
                actor.attemptsTo(
                        WaitUntil.the(BetThreeFigureChancePcInterface.DAY_LUN, isVisible()),
                        Click.on((BetThreeFigureChancePcInterface.DAY_LUN)),
                        Delay.ofMilliseconds(1000)
                );

                actor.attemptsTo(
                        WaitUntil.the(BetThreeFigureChancePcInterface.DAY_LUN, isVisible()),
                        Click.on((BetThreeFigureChancePcInterface.CHECK_BOX_LUN)),
                        Delay.ofMilliseconds(1000)
                );
                break;
            case 3:
                actor.attemptsTo(
                        WaitUntil.the(BetThreeFigureChancePcInterface.DAY_MAR, isVisible()),
                        Click.on((BetThreeFigureChancePcInterface.DAY_MAR)),
                        Delay.ofMilliseconds(1000)
                );

                actor.attemptsTo(
                        WaitUntil.the(BetThreeFigureChancePcInterface.DAY_MAR, isVisible()),
                        Click.on((BetThreeFigureChancePcInterface.CHECK_BOX_MAR)),
                        Delay.ofMilliseconds(1000)
                );
                break;
            case 4:
                actor.attemptsTo(
                        WaitUntil.the(BetThreeFigureChancePcInterface.DAY_MIE, isVisible()),
                        Click.on((BetThreeFigureChancePcInterface.DAY_MIE)),
                        Delay.ofMilliseconds(1000)
                );

                actor.attemptsTo(
                        WaitUntil.the(BetThreeFigureChancePcInterface.DAY_MIE, isVisible()),
                        Click.on((BetThreeFigureChancePcInterface.CHECK_BOX_MIE)),
                        Delay.ofMilliseconds(1000)
                );
                break;
            case 5:
                actor.attemptsTo(
                        WaitUntil.the(BetThreeFigureChancePcInterface.DAY_JUE, isVisible()),
                        Click.on((BetThreeFigureChancePcInterface.DAY_JUE)),
                        Delay.ofMilliseconds(1000)
                );

                actor.attemptsTo(
                        WaitUntil.the(BetThreeFigureChancePcInterface.DAY_JUE, isVisible()),
                        Click.on((BetThreeFigureChancePcInterface.CHECK_BOX_JUE)),
                        Delay.ofMilliseconds(1000)
                );
                break;
            case 6:
                actor.attemptsTo(
                        WaitUntil.the(BetThreeFigureChancePcInterface.DAY_VIE, isVisible()),
                        Click.on((BetThreeFigureChancePcInterface.DAY_VIE)),
                        Delay.ofMilliseconds(1000)
                );

                actor.attemptsTo(
                        WaitUntil.the(BetThreeFigureChancePcInterface.DAY_VIE, isVisible()),
                        Click.on((BetThreeFigureChancePcInterface.CHECK_BOX_VIE)),
                        Delay.ofMilliseconds(1000)
                );
                break;
            case 7:
                actor.attemptsTo(
                        WaitUntil.the(BetThreeFigureChancePcInterface.DAY_SAB, isVisible()),
                        Click.on((BetThreeFigureChancePcInterface.DAY_SAB)),
                        Delay.ofMilliseconds(1000)

                );

                actor.attemptsTo(
                        WaitUntil.the(BetThreeFigureChancePcInterface.DAY_SAB, isVisible()),
                        Click.on((BetThreeFigureChancePcInterface.CHECK_BOX_SAB)),
                        Delay.ofMilliseconds(1000)

                );
                break;

        }

        actor.attemptsTo(
                WaitUntil.the(BetThreeFigureChancePcInterface.BTN_ACCEPT_LOTTERY, isVisible()),
                Click.on((BetThreeFigureChancePcInterface.BTN_ACCEPT_LOTTERY)),
                Delay.ofMilliseconds(500)
        );


        actor.attemptsTo(
                WaitUntil.the(BetThreeFigureChancePcInterface.INPUT_NUM, isVisible()),
                Enter.theValue("352").into(BetThreeFigureChancePcInterface.INPUT_NUM),
                Delay.ofMilliseconds(1000)


        );


        actor.attemptsTo(
                WaitUntil.the(BetThreeFigureChancePcInterface.SCROLL_2, isVisible()),
                Scroll.to((BetThreeFigureChancePcInterface.SCROLL_2))

        );

        actor.attemptsTo(
                WaitUntil.the(BetThreeFigureChancePcInterface.CLICK_UPDATE, isVisible()),
                Click.on((BetThreeFigureChancePcInterface.CLICK_UPDATE)),
                Delay.ofMilliseconds(500)


        );
        /*
        actor.attemptsTo(
                WaitUntil.the(BetThreeFigureChancePdInterface.INPUT_PLENO_DIRECTO, isVisible()),
                Click.on((BetThreeFigureChancePdInterface.INPUT_PLENO_DIRECTO)));


        actor.attemptsTo(
                WaitUntil.the(BetThreeFigureChancePdInterface.INPUT_PLENO_DIRECTO, isVisible()),
                Enter.theValue("50000").into(BetThreeFigureChancePdInterface.INPUT_PLENO_DIRECTO));

         */


        actor.attemptsTo(
                WaitUntil.the(BetThreeFigureChancePcInterface.INPUT_PLENO_CONVINADO, isVisible()),
                Click.on((BetThreeFigureChancePcInterface.INPUT_PLENO_CONVINADO)),
                Delay.ofMilliseconds(1000)

        );


        actor.attemptsTo(
                WaitUntil.the(BetThreeFigureChancePcInterface.INPUT_PLENO_CONVINADO, isVisible()),
                Enter.theValue("1400").into(BetThreeFigureChancePcInterface.INPUT_PLENO_CONVINADO),
                Delay.ofMilliseconds(2000)

        );


        actor.attemptsTo(
                WaitUntil.the(BetThreeFigureChancePcInterface.BTN_SIGUIENTE, isVisible()),
                Click.on((BetThreeFigureChancePcInterface.BTN_SIGUIENTE)),
                Delay.ofMilliseconds(2000)

        );


        actor.attemptsTo(
                WaitUntil.the(BetThreeFigureChancePcInterface.SCROLL_4, isVisible()),
                Scroll.to(BetThreeFigureChancePcInterface.SCROLL_4)


        );

        actor.attemptsTo(
                WaitUntil.the(BetThreeFigureChancePcInterface.CHECK_BOX_BALANCE_PAY, isVisible()),
                Click.on(BetThreeFigureChancePcInterface.CHECK_BOX_BALANCE_PAY),
                Delay.ofMilliseconds(500)

        );

        actor.attemptsTo(
                WaitUntil.the(BetThreeFigureChancePcInterface.BTN_NEXT, isVisible()),
                Click.on(BetThreeFigureChancePcInterface.BTN_NEXT),
                Delay.ofMilliseconds(1000)

        );


    }

    public static BetThreeFigurePcChanceTask on() {
        return instrumented(BetThreeFigurePcChanceTask.class);
    }
}
