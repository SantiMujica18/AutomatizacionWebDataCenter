package com.co.datacenter.tasks.paga_triple.incomplete_number_bet_paga_triple;

import com.co.datacenter.tasks.delay.Delay;
import com.co.datacenter.tasks.paga_triple.confirm_buy_paga_triple.ConfirmPagaTripleTask;
import com.co.datacenter.userinterfaces.paga_triple.betpagatripleinterfaces.BetTPagaTripleInterFaces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class IncompleteNumberBetTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                WaitUntil.the(BetTPagaTripleInterFaces.FIRST_NUMBER, isVisible()),
                Enter.theValue("7").into(BetTPagaTripleInterFaces.FIRST_NUMBER),
                Delay.ofMilliseconds(2000),

                WaitUntil.the(BetTPagaTripleInterFaces.DROPDOWN_1, isVisible()),
                Click.on(BetTPagaTripleInterFaces.DROPDOWN_1),
                Delay.ofMilliseconds(500),

                WaitUntil.the(BetTPagaTripleInterFaces.SELECT_LOTERY, isVisible()),
                Click.on(BetTPagaTripleInterFaces.SELECT_LOTERY),
                Delay.ofMilliseconds(500),

                WaitUntil.the(BetTPagaTripleInterFaces.RANDOM_NUMBER_2, isVisible()),
                Enter.theValue("7").into(BetTPagaTripleInterFaces.SECOND_NUMBER),
                Delay.ofMilliseconds(2000),

                WaitUntil.the(BetTPagaTripleInterFaces.DROPDOWN_2, isVisible()),
                Click.on(BetTPagaTripleInterFaces.DROPDOWN_2),
                Delay.ofMilliseconds(500),

                WaitUntil.the(BetTPagaTripleInterFaces.SELECT_LOTERY_2, isVisible()),
                Click.on(BetTPagaTripleInterFaces.SELECT_LOTERY_2),
                Delay.ofMilliseconds(500),

                WaitUntil.the(BetTPagaTripleInterFaces.RANDOM_NUMBER_3, isVisible()),
                Enter.theValue("7").into(BetTPagaTripleInterFaces.THIRD_NUMBER),
                Delay.ofMilliseconds(2000),

                WaitUntil.the(BetTPagaTripleInterFaces.DROPDOWN_3, isVisible()),
                Click.on(BetTPagaTripleInterFaces.DROPDOWN_3),
                Delay.ofMilliseconds(500),

                WaitUntil.the(BetTPagaTripleInterFaces.SELECT_LOTERY_3, isVisible()),
                Click.on(BetTPagaTripleInterFaces.SELECT_LOTERY_3),
                Delay.ofMilliseconds(500),

                WaitUntil.the(BetTPagaTripleInterFaces.DROPDOWN_4, isVisible()),
                Click.on(BetTPagaTripleInterFaces.DROPDOWN_4),
                Delay.ofMilliseconds(500),

                WaitUntil.the(BetTPagaTripleInterFaces.SELECT_VALOR, isVisible()),
                Click.on(BetTPagaTripleInterFaces.SELECT_VALOR),
                Delay.ofMilliseconds(500),

                WaitUntil.the(BetTPagaTripleInterFaces.BTN_NEXT, isVisible()),
                Click.on(BetTPagaTripleInterFaces.BTN_NEXT),
                Delay.ofMilliseconds(500)


                );

    }


    public static IncompleteNumberBetTask on() {
        return instrumented(IncompleteNumberBetTask.class);
    }
}

