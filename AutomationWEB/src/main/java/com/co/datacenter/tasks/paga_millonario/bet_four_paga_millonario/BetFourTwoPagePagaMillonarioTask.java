package com.co.datacenter.tasks.paga_millonario.bet_four_paga_millonario;

import com.co.datacenter.tasks.delay.Delay;
import com.co.datacenter.userinterfaces.paga_millonario.data_paga_millonario.DataOnePageInterface;
import com.co.datacenter.userinterfaces.paga_millonario.data_paga_millonario.DataTwoPagaInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class BetFourTwoPagePagaMillonarioTask implements Task {

    public final String NUMBERONE = "0526";
    public final String NUMBERTWO = "0526";
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(DataTwoPagaInterface.INPUT_1, isVisible()),
                Enter.theValue(NUMBERONE).into(DataTwoPagaInterface.INPUT_1),
                Delay.ofMilliseconds(500),

                WaitUntil.the(DataTwoPagaInterface.BTN_CLEAN, isVisible()),
                Click.on(DataTwoPagaInterface.BTN_CLEAN),
                Delay.ofMilliseconds(500),



                WaitUntil.the(DataTwoPagaInterface.INPUT_1, isVisible()),
                Enter.theValue(NUMBERONE).into(DataTwoPagaInterface.INPUT_1),
                Delay.ofMilliseconds(500),


                WaitUntil.the(DataTwoPagaInterface.INPUT_2, isVisible()),
                Enter.theValue(NUMBERTWO).into(DataTwoPagaInterface.INPUT_2),
                Delay.ofMilliseconds(500),


                WaitUntil.the(DataTwoPagaInterface.UPDATE_CLEAN,isVisible()),
                Click.on(DataTwoPagaInterface.UPDATE_CLEAN),
                Delay.ofMilliseconds(500),


                WaitUntil.the(DataTwoPagaInterface.BTN_ALERT_SAME_NUMBER, isVisible()),
                Click.on(DataTwoPagaInterface.BTN_ALERT_SAME_NUMBER),
                Delay.ofMilliseconds(500)

                );

        actor.attemptsTo(
                WaitUntil.the(DataTwoPagaInterface.BTN_RANDOM_2_FOUR, isVisible()),
                Click.on(DataTwoPagaInterface.BTN_RANDOM_2_FOUR),
                Delay.ofMilliseconds(1000)
        );
        actor.attemptsTo(
                WaitUntil.the(DataTwoPagaInterface.BTN_RANDOM_3_FOUR, isVisible()),
                Click.on(DataTwoPagaInterface.BTN_RANDOM_3_FOUR),
                Delay.ofMilliseconds(1000)
        );

        actor.attemptsTo(
                WaitUntil.the(DataTwoPagaInterface.BTN_RANDOM_4_FOUR, isVisible()),
                Click.on(DataTwoPagaInterface.BTN_RANDOM_4_FOUR),
                Delay.ofMilliseconds(1000)
        );

        actor.attemptsTo(
                WaitUntil.the(DataTwoPagaInterface.BTN_RANDOM_5_FOUR, isVisible()),
                Click.on(DataTwoPagaInterface.BTN_RANDOM_5_FOUR),
                Delay.ofMilliseconds(1000)
        );


        actor.attemptsTo(
                WaitUntil.the(DataTwoPagaInterface.BTN_NEXT_2, isVisible()),
                Click.on(DataTwoPagaInterface.BTN_NEXT_2)
        );



    }
    public static BetFourTwoPagePagaMillonarioTask on(){
        return instrumented(BetFourTwoPagePagaMillonarioTask.class);
    }
}
