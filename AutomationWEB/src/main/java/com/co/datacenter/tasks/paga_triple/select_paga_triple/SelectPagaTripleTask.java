package com.co.datacenter.tasks.paga_triple.select_paga_triple;

import com.co.datacenter.tasks.delay.Delay;
import com.co.datacenter.tasks.paga_triple.select_paga_triple.SelectPagaTripleTask;
import com.co.datacenter.userinterfaces.paga_triple.select_paga_triple.SelectPagaTripleInterface;
import com.co.datacenter.userinterfaces.select_bets.SelectBetsInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SelectPagaTripleTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                WaitUntil.the(SelectPagaTripleInterface.LOTERY_PAGA_TRIPLE,isVisible()),
                Click.on(SelectPagaTripleInterface.LOTERY_PAGA_TRIPLE)
        );
    }
    public static SelectPagaTripleTask on(){
        return instrumented(SelectPagaTripleTask.class);
    }
}

