package com.co.datacenter.tasks.chance.confirm_chance;

import com.co.datacenter.tasks.chance.bet_four_figures_chance_spc.BetFourFigureSpcChanceTask;
import com.co.datacenter.tasks.delay.Delay;
import com.co.datacenter.userinterfaces.chance_tradicional.bet_four_figures_chance_spc.BetFourFigureChanceSpcInterface;
import com.co.datacenter.userinterfaces.chance_tradicional.confirm_buy_chance.ConfirmChanceInterface;
import cucumber.api.java.hu.De;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.seleniumhq.jetty9.server.Authentication;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ReturnBetServiceTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(BetFourFigureChanceSpcInterface.NAV_APUESTA, isVisible()),
                Click.on(BetFourFigureChanceSpcInterface.NAV_APUESTA),
                Delay.ofMilliseconds(500)
        );

    }

    public static ConfirmChanceTask on(){
        return instrumented(ConfirmChanceTask.class);
    }
}
