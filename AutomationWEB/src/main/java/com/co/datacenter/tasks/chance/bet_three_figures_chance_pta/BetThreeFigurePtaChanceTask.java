package com.co.datacenter.tasks.chance.bet_three_figures_chance_pta;

import com.co.datacenter.tasks.delay.Delay;
import com.co.datacenter.userinterfaces.chance_tradicional.bet_three_figures_chance_pta.BetThreeFigureChancePtaInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.Calendar;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class BetThreeFigurePtaChanceTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BetThreeFigureChancePtaInterface.SCROLL_1, isVisible()),
                Scroll.to((BetThreeFigureChancePtaInterface.SCROLL_1)),
                Delay.ofMilliseconds(1000));


        actor.attemptsTo(
                WaitUntil.the(BetThreeFigureChancePtaInterface.BTN_SELECT_LOTTERY, isVisible()),
                Click.on((BetThreeFigureChancePtaInterface.BTN_SELECT_LOTTERY)),
                Delay.ofMilliseconds(1000));

        int dayOdWeek = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);

        switch (dayOdWeek){
            case 1:
                actor.attemptsTo(
                        WaitUntil.the(BetThreeFigureChancePtaInterface.DAY_DOM, isVisible()),
                        Click.on((BetThreeFigureChancePtaInterface.DAY_DOM)),
                        Delay.ofMilliseconds(1000));
                /*
                actor.attemptsTo(
                    WaitUntil.the(MinValueChanceInterface.C, isVisible()),
                    Click.on((MinValueChanceInterface.CKECK_BOX_LOTTERY)));

                 */
                break;
            case 2:
                actor.attemptsTo(
                        WaitUntil.the(BetThreeFigureChancePtaInterface.DAY_LUN, isVisible()),
                        Click.on((BetThreeFigureChancePtaInterface.DAY_LUN)),
                        Delay.ofMilliseconds(1000));

                actor.attemptsTo(
                        WaitUntil.the(BetThreeFigureChancePtaInterface.DAY_LUN, isVisible()),
                        Click.on((BetThreeFigureChancePtaInterface.CHECK_BOX_LUN)),
                        Delay.ofMilliseconds(1000));
                break;
            case 3:
                actor.attemptsTo(
                        WaitUntil.the(BetThreeFigureChancePtaInterface.DAY_MAR, isVisible()),
                        Click.on((BetThreeFigureChancePtaInterface.DAY_MAR)),
                        Delay.ofMilliseconds(1000));

                actor.attemptsTo(
                        WaitUntil.the(BetThreeFigureChancePtaInterface.DAY_MAR, isVisible()),
                        Click.on((BetThreeFigureChancePtaInterface.CHECK_BOX_MAR)),
                        Delay.ofMilliseconds(1000));
                break;
            case 4:
                actor.attemptsTo(
                        WaitUntil.the(BetThreeFigureChancePtaInterface.DAY_MIE, isVisible()),
                        Click.on((BetThreeFigureChancePtaInterface.DAY_MIE)),
                        Delay.ofMilliseconds(1000));

                actor.attemptsTo(
                        WaitUntil.the(BetThreeFigureChancePtaInterface.DAY_MIE, isVisible()),
                        Click.on((BetThreeFigureChancePtaInterface.CHECK_BOX_MIE)),
                        Delay.ofMilliseconds(1000));
                break;
            case 5:
                actor.attemptsTo(
                        WaitUntil.the(BetThreeFigureChancePtaInterface.DAY_JUE, isVisible()),
                        Click.on((BetThreeFigureChancePtaInterface.DAY_JUE)),
                        Delay.ofMilliseconds(1000));

                actor.attemptsTo(
                        WaitUntil.the(BetThreeFigureChancePtaInterface.DAY_JUE, isVisible()),
                        Click.on((BetThreeFigureChancePtaInterface.CHECK_BOX_JUE)),
                        Delay.ofMilliseconds(1000)
                );
                break;
            case 6:
                actor.attemptsTo(
                        WaitUntil.the(BetThreeFigureChancePtaInterface.DAY_VIE, isVisible()),
                        Click.on((BetThreeFigureChancePtaInterface.DAY_VIE)),
                        Delay.ofMilliseconds(1000));

                actor.attemptsTo(
                        WaitUntil.the(BetThreeFigureChancePtaInterface.DAY_VIE, isVisible()),
                        Click.on((BetThreeFigureChancePtaInterface.CHECK_BOX_VIE)),
                        Delay.ofMilliseconds(1000)
                );
                break;
            case 7:
                actor.attemptsTo(
                        WaitUntil.the(BetThreeFigureChancePtaInterface.DAY_SAB, isVisible()),
                        Click.on((BetThreeFigureChancePtaInterface.DAY_SAB)),
                        Delay.ofMilliseconds(1000)
                );

                actor.attemptsTo(
                        WaitUntil.the(BetThreeFigureChancePtaInterface.DAY_SAB, isVisible()),
                        Click.on((BetThreeFigureChancePtaInterface.CHECK_BOX_SAB)),
                        Delay.ofMilliseconds(1000)

                );
                break;

        }

        actor.attemptsTo(
                WaitUntil.the(BetThreeFigureChancePtaInterface.BTN_ACCEPT_LOTTERY, isVisible()),
                Click.on((BetThreeFigureChancePtaInterface.BTN_ACCEPT_LOTTERY)),
                Delay.ofMilliseconds(500)
        );




        actor.attemptsTo(
                WaitUntil.the(BetThreeFigureChancePtaInterface.INPUT_NUM, isVisible()),
                Enter.theValue("658").into(BetThreeFigureChancePtaInterface.INPUT_NUM),
                Delay.ofMilliseconds(2000)

        );


        actor.attemptsTo(
                WaitUntil.the(BetThreeFigureChancePtaInterface.SCROLL_2, isVisible()),
                Scroll.to((BetThreeFigureChancePtaInterface.SCROLL_2))
        );

        actor.attemptsTo(
                WaitUntil.the(BetThreeFigureChancePtaInterface.CLICK_UPDATE, isVisible()),
                Click.on((BetThreeFigureChancePtaInterface.CLICK_UPDATE)),
                Delay.ofMilliseconds(500)
        );

        actor.attemptsTo(
                WaitUntil.the(BetThreeFigureChancePtaInterface.INPUT_PATA, isVisible()),
                Click.on((BetThreeFigureChancePtaInterface.INPUT_PATA)),
                Delay.ofMilliseconds(1000)

        );


        actor.attemptsTo(
                WaitUntil.the(BetThreeFigureChancePtaInterface.INPUT_PATA, isVisible()),
                Enter.theValue("1200").into(BetThreeFigureChancePtaInterface.INPUT_PATA),
                Delay.ofMilliseconds(1000)

        );


        /*

        actor.attemptsTo(
                WaitUntil.the(BetThreeFigureChancePdInterface.INPUT_PLENO_CONVINADO, isVisible()),
                Click.on((BetThreeFigureChancePdInterface.INPUT_PLENO_CONVINADO)));


        actor.attemptsTo(
                WaitUntil.the(BetThreeFigureChancePdInterface.INPUT_PLENO_CONVINADO, isVisible()),
                Enter.theValue("2500").into(BetThreeFigureChancePdInterface.INPUT_PLENO_CONVINADO));



         */


        actor.attemptsTo(
                WaitUntil.the(BetThreeFigureChancePtaInterface.BTN_SIGUIENTE, isVisible()),
                Click.on((BetThreeFigureChancePtaInterface.BTN_SIGUIENTE)),
                Delay.ofMilliseconds(500)

        );

        actor.attemptsTo(
                WaitUntil.the(BetThreeFigureChancePtaInterface.SCROLL_4, isVisible()),
                Scroll.to(BetThreeFigureChancePtaInterface.SCROLL_4)

        );

        actor.attemptsTo(
                WaitUntil.the(BetThreeFigureChancePtaInterface.CHECK_BOX_BALANCE_PAY, isVisible()),
                Click.on(BetThreeFigureChancePtaInterface.CHECK_BOX_BALANCE_PAY),
                Delay.ofMilliseconds(1000)
        );

        actor.attemptsTo(
                WaitUntil.the(BetThreeFigureChancePtaInterface.BTN_NEXT, isVisible()),
                Click.on(BetThreeFigureChancePtaInterface.BTN_NEXT),
                Delay.ofMilliseconds(1000)

        );

        /*

        actor.attemptsTo(
                WaitUntil.the(BetThreeFigureChancePtaInterface.BTN_ACCEP, isVisible()),
                Click.on(BetThreeFigureChancePtaInterface.BTN_ACCEP)
        );

         */



    }

    public static BetThreeFigurePtaChanceTask on(){
        return instrumented(BetThreeFigurePtaChanceTask.class);
    }
}
