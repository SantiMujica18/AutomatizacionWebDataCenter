package com.co.datacenter.tasks.chance.bet_four_figure_chance_spd;

import com.co.datacenter.tasks.delay.Delay;
import com.co.datacenter.userinterfaces.chance_tradicional.bet_four_figure_chance_spd.BetFourFigureChanceSpdInterface;
import cucumber.api.java.hu.De;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.Calendar;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class BetFourFigureSpdChanceTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BetFourFigureChanceSpdInterface.SCROLL_1, isVisible()),
                Scroll.to((BetFourFigureChanceSpdInterface.SCROLL_1))
        );


        actor.attemptsTo(
                WaitUntil.the(BetFourFigureChanceSpdInterface.BTN_SELECT_LOTTERY, isVisible()),
                Click.on((BetFourFigureChanceSpdInterface.BTN_SELECT_LOTTERY)),
                Delay.ofMilliseconds(500)

        );

        int dayOdWeek = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);

        switch (dayOdWeek){
            case 1:
                actor.attemptsTo(
                        WaitUntil.the(BetFourFigureChanceSpdInterface.DAY_DOM, isVisible()),
                        Click.on((BetFourFigureChanceSpdInterface.DAY_DOM)),
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
                        WaitUntil.the(BetFourFigureChanceSpdInterface.DAY_LUN, isVisible()),
                        Click.on((BetFourFigureChanceSpdInterface.DAY_LUN)),
                        Delay.ofMilliseconds(1000)

                );

                actor.attemptsTo(
                        WaitUntil.the(BetFourFigureChanceSpdInterface.DAY_LUN, isVisible()),
                        Click.on((BetFourFigureChanceSpdInterface.CHECK_BOX_LUN)),
                        Delay.ofMilliseconds(1000)

                );
                break;
            case 3:
                actor.attemptsTo(
                        WaitUntil.the(BetFourFigureChanceSpdInterface.DAY_MAR, isVisible()),
                        Click.on((BetFourFigureChanceSpdInterface.DAY_MAR)),
                        Delay.ofMilliseconds(1000)

                );

                actor.attemptsTo(
                        WaitUntil.the(BetFourFigureChanceSpdInterface.DAY_MAR, isVisible()),
                        Click.on((BetFourFigureChanceSpdInterface.CHECK_BOX_MAR)),
                        Delay.ofMilliseconds(1000)

                );
                break;
            case 4:
                actor.attemptsTo(
                        WaitUntil.the(BetFourFigureChanceSpdInterface.DAY_MIE, isVisible()),
                        Click.on((BetFourFigureChanceSpdInterface.DAY_MIE)),
                        Delay.ofMilliseconds(1000)

                );

                actor.attemptsTo(
                        WaitUntil.the(BetFourFigureChanceSpdInterface.DAY_MIE, isVisible()),
                        Click.on((BetFourFigureChanceSpdInterface.CHECK_BOX_MIE)),
                        Delay.ofMilliseconds(1000)

                );
                break;
            case 5:
                actor.attemptsTo(
                        WaitUntil.the(BetFourFigureChanceSpdInterface.DAY_JUE, isVisible()),
                        Click.on((BetFourFigureChanceSpdInterface.DAY_JUE)),
                        Delay.ofMilliseconds(1000)

                );

                actor.attemptsTo(
                        WaitUntil.the(BetFourFigureChanceSpdInterface.DAY_JUE, isVisible()),
                        Click.on((BetFourFigureChanceSpdInterface.CHECK_BOX_JUE)),
                        Delay.ofMilliseconds(1000)

                );
                break;
            case 6:
                actor.attemptsTo(
                        WaitUntil.the(BetFourFigureChanceSpdInterface.DAY_VIE, isVisible()),
                        Click.on((BetFourFigureChanceSpdInterface.DAY_VIE)),
                        Delay.ofMilliseconds(1000)

                );

                actor.attemptsTo(
                        WaitUntil.the(BetFourFigureChanceSpdInterface.DAY_VIE, isVisible()),
                        Click.on((BetFourFigureChanceSpdInterface.CHECK_BOX_VIE)),
                        Delay.ofMilliseconds(1000)

                );
                break;
            case 7:
                actor.attemptsTo(
                        WaitUntil.the(BetFourFigureChanceSpdInterface.DAY_SAB, isVisible()),
                        Click.on((BetFourFigureChanceSpdInterface.DAY_SAB)),
                        Delay.ofMilliseconds(1000)
                );

                actor.attemptsTo(
                        WaitUntil.the(BetFourFigureChanceSpdInterface.DAY_SAB, isVisible()),
                        Click.on((BetFourFigureChanceSpdInterface.CHECK_BOX_SAB)),
                        Delay.ofMilliseconds(1000)
                );
                break;

        }

        actor.attemptsTo(
                WaitUntil.the(BetFourFigureChanceSpdInterface.BTN_ACCEPT_LOTTERY, isVisible()),
                Click.on((BetFourFigureChanceSpdInterface.BTN_ACCEPT_LOTTERY)),
                Delay.ofMilliseconds(500)
        );




        actor.attemptsTo(
                WaitUntil.the(BetFourFigureChanceSpdInterface.INPUT_NUM, isVisible()),
                Enter.theValue("0526").into(BetFourFigureChanceSpdInterface.INPUT_NUM),
                Delay.ofMilliseconds(1000)
        );


        actor.attemptsTo(
                WaitUntil.the(BetFourFigureChanceSpdInterface.SCROLL_2, isVisible()),
                Scroll.to((BetFourFigureChanceSpdInterface.SCROLL_2))
        );

        actor.attemptsTo(
                WaitUntil.the(BetFourFigureChanceSpdInterface.CLICK_UPDATE, isVisible()),
                Click.on((BetFourFigureChanceSpdInterface.CLICK_UPDATE)),
                Delay.ofMilliseconds(500)
        );

        actor.attemptsTo(
                WaitUntil.the(BetFourFigureChanceSpdInterface.INPUT_PLENO_DIRECTO, isVisible()),
                Click.on((BetFourFigureChanceSpdInterface.INPUT_PLENO_DIRECTO)),
                Delay.ofMilliseconds(1000)
        );


        actor.attemptsTo(
                WaitUntil.the(BetFourFigureChanceSpdInterface.INPUT_PLENO_DIRECTO, isVisible()),
                Enter.theValue("1300").into(BetFourFigureChanceSpdInterface.INPUT_PLENO_DIRECTO),
                Delay.ofMilliseconds(2000)

        );
        /*

        actor.attemptsTo(
                WaitUntil.the(BetFourFigureChanceInterface.INPUT_PLENO_CONVINADO, isVisible()),
                Click.on((BetFourFigureChanceInterface.INPUT_PLENO_CONVINADO)));


        actor.attemptsTo(
                WaitUntil.the(BetFourFigureChanceInterface.INPUT_PLENO_CONVINADO, isVisible()),
                Enter.theValue("2500").into(BetFourFigureChanceInterface.INPUT_PLENO_CONVINADO));

         */


        actor.attemptsTo(
                WaitUntil.the(BetFourFigureChanceSpdInterface.BTN_SIGUIENTE, isVisible()),
                Click.on((BetFourFigureChanceSpdInterface.BTN_SIGUIENTE)),
                Delay.ofMilliseconds(500)

        );


        actor.attemptsTo(
                WaitUntil.the(BetFourFigureChanceSpdInterface.SCROLL_4, isVisible()),
                Scroll.to(BetFourFigureChanceSpdInterface.SCROLL_4)
        );

        actor.attemptsTo(
                WaitUntil.the(BetFourFigureChanceSpdInterface.CHECK_BOX_BALANCE_PAY, isVisible()),
                Click.on(BetFourFigureChanceSpdInterface.CHECK_BOX_BALANCE_PAY),
                Delay.ofMilliseconds(1000)

        );

        actor.attemptsTo(
                WaitUntil.the(BetFourFigureChanceSpdInterface.BTN_NEXT, isVisible()),
                Click.on(BetFourFigureChanceSpdInterface.BTN_NEXT),
                Delay.ofMilliseconds(1000)

        );

        /*
        actor.attemptsTo(
                WaitUntil.the(BetFourFigureChanceSpdInterface.BTN_ACCEP, isVisible()),
                Click.on(BetFourFigureChanceSpdInterface.BTN_ACCEP)
        );

         */


    }

    public static BetFourFigureSpdChanceTask on(){
        return instrumented(BetFourFigureSpdChanceTask.class);
    }
}
