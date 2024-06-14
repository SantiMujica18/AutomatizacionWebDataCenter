package com.co.datacenter.tasks.paga_triple.bet_paga_triple;

import com.co.datacenter.tasks.delay.Delay;
import com.co.datacenter.userinterfaces.paga_triple.betpagatripleinterfaces.BetTPagaTripleInterFaces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.dom4j.datatype.DatatypeElement;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class BetThreeNumberOfTwoFigurePagaTripleTask implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                WaitUntil.the(BetTPagaTripleInterFaces.RANDOM_NUMBER_1, isVisible()),
                Click.on(BetTPagaTripleInterFaces.RANDOM_NUMBER_1),
                Delay.ofMilliseconds(1000),

                WaitUntil.the(BetTPagaTripleInterFaces.DROPDOWN_1, isVisible()),
                Click.on(BetTPagaTripleInterFaces.DROPDOWN_1),
                Delay.ofMilliseconds(1000),



                WaitUntil.the(BetTPagaTripleInterFaces.SELECT_LOTERY, isVisible()),
                Click.on(BetTPagaTripleInterFaces.SELECT_LOTERY),
                Delay.ofMilliseconds(1000),


                WaitUntil.the(BetTPagaTripleInterFaces.RANDOM_NUMBER_2, isVisible()),
                Click.on(BetTPagaTripleInterFaces.RANDOM_NUMBER_2),
                Delay.ofMilliseconds(1000),


                WaitUntil.the(BetTPagaTripleInterFaces.DROPDOWN_2, isVisible()),
                Click.on(BetTPagaTripleInterFaces.DROPDOWN_2),
                Delay.ofMilliseconds(1000),


                WaitUntil.the(BetTPagaTripleInterFaces.SELECT_LOTERY_2, isVisible()),
                Click.on(BetTPagaTripleInterFaces.SELECT_LOTERY_2),
                Delay.ofMilliseconds(1000),


                WaitUntil.the(BetTPagaTripleInterFaces.RANDOM_NUMBER_3, isVisible()),
                Click.on(BetTPagaTripleInterFaces.RANDOM_NUMBER_3),
                Delay.ofMilliseconds(1000),


                WaitUntil.the(BetTPagaTripleInterFaces.DROPDOWN_3, isVisible()),
                Click.on(BetTPagaTripleInterFaces.DROPDOWN_3),
                Delay.ofMilliseconds(1000),


                WaitUntil.the(BetTPagaTripleInterFaces.SELECT_LOTERY_3, isVisible()),
                Click.on(BetTPagaTripleInterFaces.SELECT_LOTERY_3),
                Delay.ofMilliseconds(1000),


                WaitUntil.the(BetTPagaTripleInterFaces.DROPDOWN_4, isVisible()),
                Click.on(BetTPagaTripleInterFaces.DROPDOWN_4),
                Delay.ofMilliseconds(1000),


                WaitUntil.the(BetTPagaTripleInterFaces.SELECT_VALOR, isVisible()),
                Click.on(BetTPagaTripleInterFaces.SELECT_VALOR),
                Delay.ofMilliseconds(1000),


                WaitUntil.the(BetTPagaTripleInterFaces.BTN_NEXT, isVisible()),
                Click.on(BetTPagaTripleInterFaces.BTN_NEXT)



                );

    }

public static BetThreeNumberOfTwoFigurePagaTripleTask on (){
        return instrumented(BetThreeNumberOfTwoFigurePagaTripleTask.class);
    }

}
