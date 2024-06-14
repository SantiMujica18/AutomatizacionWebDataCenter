package com.co.datacenter.tasks.paga_triple.max_value_paga_triple;

import com.co.datacenter.tasks.delay.Delay;
import com.co.datacenter.tasks.paga_triple.confirm_buy_paga_triple.ConfirmPagaTripleTask;
import com.co.datacenter.userinterfaces.paga_triple.betpagatripleinterfaces.BetTPagaTripleInterFaces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class MaxValueBetTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                WaitUntil.the(BetTPagaTripleInterFaces.RANDOM_NUMBER_1, isVisible()),
                Click.on(BetTPagaTripleInterFaces.RANDOM_NUMBER_1),
                Delay.ofMilliseconds(1000),

                WaitUntil.the(BetTPagaTripleInterFaces.DROPDOWN_1, isVisible()),
                Click.on(BetTPagaTripleInterFaces.DROPDOWN_1),
                Delay.ofMilliseconds(500),

                WaitUntil.the(BetTPagaTripleInterFaces.SELECT_LOTERY, isVisible()),
                Click.on(BetTPagaTripleInterFaces.SELECT_LOTERY),
                Delay.ofMilliseconds(500),

                WaitUntil.the(BetTPagaTripleInterFaces.RANDOM_NUMBER_2, isVisible()),
                Click.on(BetTPagaTripleInterFaces.RANDOM_NUMBER_2),
                Delay.ofMilliseconds(1000),

                WaitUntil.the(BetTPagaTripleInterFaces.DROPDOWN_2, isVisible()),
                Click.on(BetTPagaTripleInterFaces.DROPDOWN_2),
                Delay.ofMilliseconds(500),

                WaitUntil.the(BetTPagaTripleInterFaces.SELECT_LOTERY_2, isVisible()),
                Click.on(BetTPagaTripleInterFaces.SELECT_LOTERY_2),
                Delay.ofMilliseconds(500),

                WaitUntil.the(BetTPagaTripleInterFaces.RANDOM_NUMBER_3, isVisible()),
                Click.on(BetTPagaTripleInterFaces.RANDOM_NUMBER_3),
                Delay.ofMilliseconds(1000),

                WaitUntil.the(BetTPagaTripleInterFaces.DROPDOWN_3, isVisible()),
                Click.on(BetTPagaTripleInterFaces.DROPDOWN_3),
                Delay.ofMilliseconds(500),

                WaitUntil.the(BetTPagaTripleInterFaces.SELECT_LOTERY_3, isVisible()),
                Click.on(BetTPagaTripleInterFaces.SELECT_LOTERY_3),
                Delay.ofMilliseconds(500),

                WaitUntil.the(BetTPagaTripleInterFaces.DROPDOWN_4, isVisible()),
                Click.on(BetTPagaTripleInterFaces.DROPDOWN_4),
                Delay.ofMilliseconds(500),

                WaitUntil.the(BetTPagaTripleInterFaces.SELECT_MAX_VALUE, isVisible()),
                Click.on(BetTPagaTripleInterFaces.SELECT_MAX_VALUE),
                Delay.ofMilliseconds(500),

                WaitUntil.the(BetTPagaTripleInterFaces.BTN_NEXT, isVisible()),
                Click.on(BetTPagaTripleInterFaces.BTN_NEXT),
                Delay.ofMilliseconds(500)

        );

    }

    public static MaxValueBetTask on() {
        return instrumented(MaxValueBetTask.class);
    }
}
