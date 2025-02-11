package com.co.datacenter.tasks.recharge.select_recharge;

import com.co.datacenter.userinterfaces.recarga.select_operator.SelectOperatorInterface;
import com.co.datacenter.userinterfaces.recarga.select_recharge.SelectRechargeInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SelectUnicornRechargeTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(SelectOperatorInterface.UNICORN, isVisible()),
                Click.on(SelectOperatorInterface.UNICORN)
        );


    }

    public static SelectUnicornRechargeTask on(){
        return instrumented(SelectUnicornRechargeTask.class);
    }

}
