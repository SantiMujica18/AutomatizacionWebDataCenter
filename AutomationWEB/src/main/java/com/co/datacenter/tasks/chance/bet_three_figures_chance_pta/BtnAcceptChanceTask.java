package com.co.datacenter.tasks.chance.bet_three_figures_chance_pta;

import com.co.datacenter.tasks.delay.Delay;
import com.co.datacenter.userinterfaces.chance_tradicional.bet_four_figures_chance_spc.BetFourFigureChanceSpcInterface;
import com.co.datacenter.userinterfaces.chance_tradicional.bet_three_figures_chance_pta.BetThreeFigureChancePtaInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class BtnAcceptChanceTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(
                Delay.ofMilliseconds(2000),
                WaitUntil.the(BetFourFigureChanceSpcInterface.BTN_ACCEPT_PAY, isVisible()),
                Click.on(BetFourFigureChanceSpcInterface.BTN_ACCEPT_PAY)
        );



    }

    public static BtnAcceptChanceTask on(){
        return instrumented(BtnAcceptChanceTask.class);
    }
}
