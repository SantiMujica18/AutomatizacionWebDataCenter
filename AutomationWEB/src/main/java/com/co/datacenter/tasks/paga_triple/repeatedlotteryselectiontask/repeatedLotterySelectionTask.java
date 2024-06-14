package com.co.datacenter.tasks.paga_triple.repeatedlotteryselectiontask;


import com.co.datacenter.tasks.delay.Delay;
import com.co.datacenter.userinterfaces.paga_triple.repeatedlotteryselectionpagatripleuserinterface.repeatedLottery;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class repeatedLotterySelectionTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                WaitUntil.the(repeatedLottery.FIRST_NUMBER, isVisible()),
                Click.on(repeatedLottery.FIRST_NUMBER),
                Delay.ofMilliseconds(1000),

                WaitUntil.the(repeatedLottery.DROPDOWN_1, isVisible()),
                Click.on(repeatedLottery.DROPDOWN_1),
                Delay.ofMilliseconds(500),


                WaitUntil.the(repeatedLottery.SELECT_LOTERY, isVisible()),
                Click.on(repeatedLottery.SELECT_LOTERY),
                Delay.ofMilliseconds(500),


                WaitUntil.the(repeatedLottery.TWO_NUMBER, isVisible()),
                Click.on(repeatedLottery.TWO_NUMBER),
                Delay.ofMilliseconds(1000),


                WaitUntil.the(repeatedLottery.DROPDOWN_2, isVisible()),
                Click.on(repeatedLottery.DROPDOWN_2),
                Delay.ofMilliseconds(500),


                WaitUntil.the(repeatedLottery.SELECT_LOTERY_2, isVisible()),
                Click.on(repeatedLottery.SELECT_LOTERY_2),
                Delay.ofMilliseconds(500),


                WaitUntil.the(repeatedLottery.THREE_NUMBER, isVisible()),
                Click.on(repeatedLottery.THREE_NUMBER),
                Delay.ofMilliseconds(1000),

                WaitUntil.the(repeatedLottery.DROPDOWN_3, isVisible()),
                Click.on(repeatedLottery.DROPDOWN_3),
                Delay.ofMilliseconds(500),


                WaitUntil.the(repeatedLottery.SELECT_LOTERY_3, isVisible()),
                Click.on(repeatedLottery.SELECT_LOTERY_3),
                Delay.ofMilliseconds(500),


                WaitUntil.the(repeatedLottery.DROPDOWN_4, isVisible()),
                Click.on(repeatedLottery.DROPDOWN_4),
                Delay.ofMilliseconds(500),


                WaitUntil.the(repeatedLottery.SELECT_VALOR, isVisible()),
                Click.on(repeatedLottery.SELECT_VALOR),
                Delay.ofMilliseconds(1000),


                WaitUntil.the(repeatedLottery.BTN_NEXT, isVisible()),
                Click.on(repeatedLottery.BTN_NEXT),
                Delay.ofMilliseconds(500)

                //Delay.ofMilliseconds(5000)
        );
    }

    public static repeatedLotterySelectionTask on() {
        return instrumented(repeatedLotterySelectionTask.class);
    }

}
