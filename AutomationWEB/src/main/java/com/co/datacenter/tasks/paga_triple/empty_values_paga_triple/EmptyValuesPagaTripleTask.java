package com.co.datacenter.tasks.paga_triple.empty_values_paga_triple;

import com.co.datacenter.tasks.delay.Delay;
import com.co.datacenter.userinterfaces.paga_triple.betpagatripleinterfaces.BetTPagaTripleInterFaces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class EmptyValuesPagaTripleTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
/*
                Click.on(BetTPagaTripleInterFaces.EMPTY_NUMBER_1),
                Delay.ofMilliseconds(1000),
                Click.on(BetTPagaTripleInterFaces.DROPDOWN_1),
                Delay.ofMilliseconds(1000),
                Click.on(BetTPagaTripleInterFaces.EMPTY_LOTTERY_1),
                Delay.ofMilliseconds(1000),
                Click.on(BetTPagaTripleInterFaces.EMPTY_NUMBER_2),
                Delay.ofMilliseconds(1000),
                Click.on(BetTPagaTripleInterFaces.DROPDOWN_2),
                Delay.ofMilliseconds(1000),
                Click.on(BetTPagaTripleInterFaces.EMPTY_LOTTERY_2),
                Delay.ofMilliseconds(1000),
                Click.on(BetTPagaTripleInterFaces.EMPTY_NUMBER_3),
                Delay.ofMilliseconds(1000),
                Click.on(BetTPagaTripleInterFaces.DROPDOWN_3),
                Delay.ofMilliseconds(1000),
                Click.on(BetTPagaTripleInterFaces.EMPTY_LOTTERY_3),
                Delay.ofMilliseconds(1000),
                Click.on(BetTPagaTripleInterFaces.DROPDOWN_4),
                Delay.ofMilliseconds(1000),
                Click.on(BetTPagaTripleInterFaces.EMPTY_VALUE)*/
        );

    }

    public static EmptyValuesPagaTripleTask on (){
        return instrumented(EmptyValuesPagaTripleTask.class);
    }
}