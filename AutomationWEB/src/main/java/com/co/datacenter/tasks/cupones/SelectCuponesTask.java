package com.co.datacenter.tasks.cupones;


import com.co.datacenter.tasks.confirm_recharge.ConfirmRechargeTask;
import com.co.datacenter.userinterfaces.cupones.CuponesInterface;
import com.co.datacenter.userinterfaces.recarga.confirm_recharge.ConfirmRechargeInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SelectCuponesTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(CuponesInterface.SELECT_CUPONES, isVisible()),
                Click.on(CuponesInterface.SELECT_CUPONES)
        );

    }

    public static SelectCuponesTask on(){
        return instrumented(SelectCuponesTask.class);
    }
}

