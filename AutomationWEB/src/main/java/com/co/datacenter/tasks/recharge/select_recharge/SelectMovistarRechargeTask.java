package com.co.datacenter.tasks.recharge.select_recharge;

import com.co.datacenter.userinterfaces.recarga.select_operator.SelectOperatorInterface;
import com.co.datacenter.userinterfaces.recarga.select_recharge.SelectRechargeInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SelectMovistarRechargeTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(SelectOperatorInterface.MOVISTAR, isVisible()),
                Click.on(SelectOperatorInterface.MOVISTAR)
        );
    }
    public static SelectMovistarRechargeTask on(){
        return instrumented(SelectMovistarRechargeTask.class);
    }
}