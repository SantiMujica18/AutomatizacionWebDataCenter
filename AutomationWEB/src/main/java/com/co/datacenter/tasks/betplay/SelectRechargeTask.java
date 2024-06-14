package com.co.datacenter.tasks.betplay;

import com.co.datacenter.tasks.delay.Delay;
import com.co.datacenter.userinterfaces.betplay.BetplayDataInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SelectRechargeTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BetplayDataInterface.RECHARGE_NAV, isVisible()),
                Click.on(BetplayDataInterface.RECHARGE_NAV),
                Delay.ofMilliseconds(1000)
        );

}
    public static SelectRechargeTask on(){
        return instrumented(SelectRechargeTask.class);
    }
}
