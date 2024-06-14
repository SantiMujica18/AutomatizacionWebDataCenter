package com.co.datacenter.tasks.paga_millonario.select_paga_millonario;

import com.co.datacenter.userinterfaces.paga_millonario.select_paga_millonario.SelectPagoMillonarioInterface;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SelectPagaMillonarioTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(SelectPagoMillonarioInterface.SCROLL_CHANCE, isVisible()),
                Scroll.to(SelectPagoMillonarioInterface.SCROLL_CHANCE),

                WaitUntil.the(SelectPagoMillonarioInterface.PAGA_MILLONARIO,isVisible()),
                Click.on(SelectPagoMillonarioInterface.PAGA_MILLONARIO)
        );

    }
    public static SelectPagaMillonarioTask on(){
        return instrumented(SelectPagaMillonarioTask.class);
    }
}
