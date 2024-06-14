package com.co.datacenter.tasks.recargas_app;

import com.co.datacenter.tasks.delay.Delay;
import com.co.datacenter.userinterfaces.recargas_app.RechargeAppInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ConfirmPinTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(RechargeAppInterface.RECHARGE_BALANCE_BUTTON, isVisible()),
                Click.on(RechargeAppInterface.RECHARGE_BALANCE_BUTTON),
                Delay.ofMilliseconds(1000),
                WaitUntil.the(RechargeAppInterface.INPUT_VALUE_RECHARGE, isVisible()),
                Enter.theValue("100000").into(RechargeAppInterface.INPUT_VALUE_RECHARGE),
                Delay.ofMilliseconds(1000),
                Scroll.to(RechargeAppInterface.NEXT_BUTTON),
                Click.on(RechargeAppInterface.NEXT_BUTTON),
                Delay.ofMilliseconds(1000),
                WaitUntil.the(RechargeAppInterface.ALERT_PAY_METHOD, isVisible()),
                Click.on(RechargeAppInterface.ALERT_PAY_METHOD),
                Delay.ofMilliseconds(1000)
        );
        actor.attemptsTo(
                WaitUntil.the(RechargeAppInterface.METODO_PAGO, isEnabled()),
                Scroll.to(RechargeAppInterface.METODO_PAGO),
                Delay.ofMilliseconds(1000),
                WaitUntil.the(RechargeAppInterface.RADIO_BUTTON_PAY, isVisible()),
                Click.on(RechargeAppInterface.RADIO_BUTTON_PAY),
                Delay.ofMilliseconds(1000),
                Scroll.to(RechargeAppInterface.NEXT_BUTTON),
                Click.on(RechargeAppInterface.NEXT_BUTTON)
        );


    }
    public static ConfirmPinTask on(){
        return instrumented(ConfirmPinTask.class);
    }

}

