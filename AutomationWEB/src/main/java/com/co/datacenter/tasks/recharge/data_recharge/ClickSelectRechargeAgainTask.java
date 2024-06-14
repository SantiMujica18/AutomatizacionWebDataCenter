package com.co.datacenter.tasks.recharge.data_recharge;

import com.co.datacenter.tasks.delay.Delay;
import com.co.datacenter.tasks.pines.data_pines.ClickSelectPinAgainTask;
import com.co.datacenter.userinterfaces.pines.data_pines.DataPaymentPinesInterface;
import com.co.datacenter.userinterfaces.recarga.select_recharge.SelectRechargeInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class ClickSelectRechargeAgainTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(SelectRechargeInterface.RECHARGE_MENU, isVisible()),
                Click.on(SelectRechargeInterface.RECHARGE_MENU),
                Delay.ofMilliseconds(2000)
        );

    }
    public static ClickSelectRechargeAgainTask on(){
        return instrumented(ClickSelectRechargeAgainTask.class);
    }
}

