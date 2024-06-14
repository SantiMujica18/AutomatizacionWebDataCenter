package com.co.datacenter.tasks.chance.bet_four_figures_chance_spc;

import com.co.datacenter.tasks.delay.Delay;
import com.co.datacenter.userinterfaces.chance_tradicional.bet_four_figure_chance_spd.BetFourFigureChanceSpdInterface;
import com.co.datacenter.userinterfaces.chance_tradicional.bet_four_figures_chance_spc.BetFourFigureChanceSpcInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.Calendar;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class BetFourFigureSpcChanceTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BetFourFigureChanceSpcInterface.SCROLL_1, isVisible()),
                Scroll.to((BetFourFigureChanceSpcInterface.SCROLL_1))
        );


        actor.attemptsTo(
                WaitUntil.the(BetFourFigureChanceSpcInterface.BTN_SELECT_LOTTERY, isVisible()),
                Click.on((BetFourFigureChanceSpcInterface.BTN_SELECT_LOTTERY)),
                Delay.ofMilliseconds(1000)
        );

        int dayOdWeek = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);

        switch (dayOdWeek) {
            case 1:
                actor.attemptsTo(
                        WaitUntil.the(BetFourFigureChanceSpcInterface.DAY_DOM, isVisible()),
                        Click.on((BetFourFigureChanceSpcInterface.DAY_DOM)),
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
                        WaitUntil.the(BetFourFigureChanceSpcInterface.DAY_LUN, isVisible()),
                        Click.on((BetFourFigureChanceSpcInterface.DAY_LUN)),
                        Delay.ofMilliseconds(1000)
                );

                actor.attemptsTo(
                        WaitUntil.the(BetFourFigureChanceSpcInterface.DAY_LUN, isVisible()),
                        Click.on((BetFourFigureChanceSpcInterface.CHECK_BOX_LUN)),
                        Delay.ofMilliseconds(1000)
                );
                break;
            case 3:
                actor.attemptsTo(
                        WaitUntil.the(BetFourFigureChanceSpcInterface.DAY_MAR, isVisible()),
                        Click.on((BetFourFigureChanceSpcInterface.DAY_MAR)),
                        Delay.ofMilliseconds(1000)
                );

                actor.attemptsTo(
                        WaitUntil.the(BetFourFigureChanceSpcInterface.DAY_MAR, isVisible()),
                        Click.on((BetFourFigureChanceSpcInterface.CHECK_BOX_MAR)),
                        Delay.ofMilliseconds(1000)
                )
                ;
                break;
            case 4:
                actor.attemptsTo(
                        WaitUntil.the(BetFourFigureChanceSpcInterface.DAY_MIE, isVisible()),
                        Click.on((BetFourFigureChanceSpcInterface.DAY_MIE)),
                        Delay.ofMilliseconds(1000)
                );

                actor.attemptsTo(
                        WaitUntil.the(BetFourFigureChanceSpcInterface.DAY_MIE, isVisible()),
                        Click.on((BetFourFigureChanceSpcInterface.CHECK_BOX_MIE)),
                        Delay.ofMilliseconds(1000)
                );
                break;
            case 5:
                actor.attemptsTo(
                        WaitUntil.the(BetFourFigureChanceSpcInterface.DAY_JUE, isVisible()),
                        Click.on((BetFourFigureChanceSpcInterface.DAY_JUE)),
                        Delay.ofMilliseconds(1000)
                );

                actor.attemptsTo(
                        WaitUntil.the(BetFourFigureChanceSpcInterface.DAY_JUE, isVisible()),
                        Click.on((BetFourFigureChanceSpcInterface.CHECK_BOX_JUE)),
                        Delay.ofMilliseconds(1000)
                );
                break;
            case 6:
                actor.attemptsTo(
                        WaitUntil.the(BetFourFigureChanceSpcInterface.DAY_VIE, isVisible()),
                        Click.on((BetFourFigureChanceSpcInterface.DAY_VIE)),
                        Delay.ofMilliseconds(1000)
                );

                actor.attemptsTo(
                        WaitUntil.the(BetFourFigureChanceSpcInterface.DAY_VIE, isVisible()),
                        Click.on((BetFourFigureChanceSpcInterface.CHECK_BOX_VIE)),
                        Delay.ofMilliseconds(1000)
                );
                break;
            case 7:
                actor.attemptsTo(
                        WaitUntil.the(BetFourFigureChanceSpcInterface.DAY_SAB, isVisible()),
                        Click.on((BetFourFigureChanceSpcInterface.DAY_SAB)),
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
                WaitUntil.the(BetFourFigureChanceSpcInterface.BTN_ACCEPT_LOTTERY, isVisible()),
                Click.on((BetFourFigureChanceSpcInterface.BTN_ACCEPT_LOTTERY)),
                Delay.ofMilliseconds(1000)
        );


        actor.attemptsTo(
                WaitUntil.the(BetFourFigureChanceSpcInterface.INPUT_NUM, isVisible()),
                Enter.theValue("0526").into(BetFourFigureChanceSpcInterface.INPUT_NUM),
                Delay.ofMilliseconds(1000)
        );


        actor.attemptsTo(
                WaitUntil.the(BetFourFigureChanceSpcInterface.SCROLL_2, isVisible()),
                Scroll.to((BetFourFigureChanceSpcInterface.SCROLL_2))

        );

        actor.attemptsTo(
                WaitUntil.the(BetFourFigureChanceSpcInterface.CLICK_UPDATE, isVisible()),
                Click.on((BetFourFigureChanceSpcInterface.CLICK_UPDATE)),
                Delay.ofMilliseconds(1000)

        );


        actor.attemptsTo(
                WaitUntil.the(BetFourFigureChanceSpcInterface.INPUT_PLENO_COMBINADO, isVisible()),
                Click.on((BetFourFigureChanceSpcInterface.INPUT_PLENO_COMBINADO)),
                Delay.ofMilliseconds(1000)

        );


        actor.attemptsTo(
                WaitUntil.the(BetFourFigureChanceSpcInterface.INPUT_PLENO_COMBINADO, isVisible()),
                Enter.theValue("1150").into(BetFourFigureChanceSpcInterface.INPUT_PLENO_COMBINADO),
                Delay.ofMilliseconds(1000)

        );


        actor.attemptsTo(
                WaitUntil.the(BetFourFigureChanceSpcInterface.BTN_SIGUIENTE, isVisible()),
                Click.on((BetFourFigureChanceSpcInterface.BTN_SIGUIENTE)),
                Delay.ofMilliseconds(1000)

        );


        actor.attemptsTo(
                WaitUntil.the(BetFourFigureChanceSpcInterface.SCROLL_4, isVisible()),
                Scroll.to(BetFourFigureChanceSpcInterface.SCROLL_4)

        );

        actor.attemptsTo(
                WaitUntil.the(BetFourFigureChanceSpcInterface.CHECK_BOX_BALANCE_PAY, isVisible()),
                Click.on(BetFourFigureChanceSpcInterface.CHECK_BOX_BALANCE_PAY),
                Delay.ofMilliseconds(1000)

        );

        actor.attemptsTo(
                WaitUntil.the(BetFourFigureChanceSpcInterface.BTN_NEXT, isVisible()),
                Click.on(BetFourFigureChanceSpcInterface.BTN_NEXT),
                Delay.ofMilliseconds(1000)

        );


    }

    public static BetFourFigureSpcChanceTask on() {
        return instrumented(BetFourFigureSpcChanceTask.class);
    }
}
