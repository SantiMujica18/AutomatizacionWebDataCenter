package com.co.datacenter.tasks.paga_triple.confirm_buy_paga_triple;

import com.co.datacenter.tasks.delay.Delay;
import com.co.datacenter.userinterfaces.paga_triple.confirm_paga_triple.ConfirmPagaTripleInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ConfirmAndNewBetPagaTripleTask implements Task {

    @Override

    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                WaitUntil.the(ConfirmPagaTripleInterface.PAYMENT_METHOD, isVisible()),
                Click.on(ConfirmPagaTripleInterface.PAYMENT_METHOD),
                Delay.ofMilliseconds(2500),
                Scroll.to(ConfirmPagaTripleInterface.SCROLL),
                WaitUntil.the(ConfirmPagaTripleInterface.BTN_NEXT,isVisible()),
                Click.on(ConfirmPagaTripleInterface.BTN_NEXT),
                Delay.ofMilliseconds(5000),
                WaitUntil.the(ConfirmPagaTripleInterface.BTN_NEW_BET,isVisible()),
                Click.on(ConfirmPagaTripleInterface.BTN_NEW_BET)
        );
    }
    public static ConfirmAndNewBetPagaTripleTask on () {
        return instrumented(ConfirmAndNewBetPagaTripleTask.class);
    }


}


