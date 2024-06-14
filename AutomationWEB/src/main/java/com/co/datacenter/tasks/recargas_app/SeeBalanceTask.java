package com.co.datacenter.tasks.recargas_app;

import com.co.datacenter.tasks.delay.Delay;
import com.co.datacenter.userinterfaces.recargas_app.RechargeAppInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SeeBalanceTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(RechargeAppInterface.BALANCE_BUTTON, isVisible()),
                Click.on(RechargeAppInterface.BALANCE_BUTTON)
                );


    }
    public static SeeBalanceTask on(){
        return instrumented(SeeBalanceTask.class);
    }

}

