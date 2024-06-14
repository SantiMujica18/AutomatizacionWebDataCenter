package com.co.datacenter.tasks;

import com.co.datacenter.userinterfaces.chance_tradicional.bet_four_figures_chance_spc.BetFourFigureChanceSpcInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class BotonSelectLotterie implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(
                WaitUntil.the(BetFourFigureChanceSpcInterface.SCROLL_1, isVisible()),
                Scroll.to((BetFourFigureChanceSpcInterface.SCROLL_1)));


        actor.attemptsTo(
                WaitUntil.the(BetFourFigureChanceSpcInterface.BTN_SELECT_LOTTERY, isVisible()),
                Click.on((BetFourFigureChanceSpcInterface.BTN_SELECT_LOTTERY)));
    }
    public static BotonSelectLotterie on(){
        return instrumented(BotonSelectLotterie.class);
    }
}
