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

public class ConfirmPagaTripleTask implements Task {
    @Override

    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(ConfirmPagaTripleInterface.PAYMENT_METHOD),
                Delay.ofMilliseconds(2500),
                Click.on(ConfirmPagaTripleInterface.BTN_NEXT)
        );
    }
        public static ConfirmPagaTripleTask on () {
            return instrumented(ConfirmPagaTripleTask.class);
        }


    }






