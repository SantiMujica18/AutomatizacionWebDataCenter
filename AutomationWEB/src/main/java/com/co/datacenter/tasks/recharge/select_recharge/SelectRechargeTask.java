package com.co.datacenter.tasks.recharge.select_recharge;

import com.co.datacenter.userinterfaces.recarga.select_recharge.SelectRechargeInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectRechargeTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SelectRechargeInterface.RECHARGE)
        );


    }

    public static SelectRechargeTask on(){
        return instrumented(SelectRechargeTask.class);
    }
}
