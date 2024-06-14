package com.co.datacenter.tasks.recharge.validation_of_empty_select_payment;

import com.co.datacenter.tasks.delay.Delay;
import com.co.datacenter.userinterfaces.login.validation_of_empty_select_payment.SelectEmptyPaymentInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SelectEmptyPaymentTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(SelectEmptyPaymentInterface.TITLE_MET_PAY, isVisible())

        );
        actor.attemptsTo(
                WaitUntil.the(SelectEmptyPaymentInterface.TITLE_INFO_PAY, isVisible())
        );
        actor.attemptsTo(
                Click.on(SelectEmptyPaymentInterface.BTN_NEXT_PAY),
                Delay.ofMilliseconds(1000)
        );
        actor.attemptsTo(
                Click.on(SelectEmptyPaymentInterface.BTN_ACEPT_ALERT),
                Delay.ofMilliseconds(1000)

        );
    }

    public static SelectEmptyPaymentTask on(){
        return instrumented(SelectEmptyPaymentTask.class);
    }

}
