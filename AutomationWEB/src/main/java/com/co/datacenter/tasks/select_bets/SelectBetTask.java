package com.co.datacenter.tasks.select_bets;

import com.co.datacenter.userinterfaces.select_bets.SelectBetsInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SelectBetTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SelectBetsInterface.BETS)
        );

    }

    public static SelectBetTask on(){
        return instrumented(SelectBetTask.class);
    }
}
