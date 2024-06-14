package com.co.datacenter.tasks.maxi_chance.validation_lottery_empty_maxi_chance;

import com.co.datacenter.tasks.delay.Delay;
import com.co.datacenter.userinterfaces.maxi_chance.data_maxi_chance.DataMaxiChanceInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import javax.xml.crypto.Data;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LotteryEmptyMaxiChanceTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                WaitUntil.the(DataMaxiChanceInterface.BTN_RAMDON_FOUR, isVisible()),
                Click.on(DataMaxiChanceInterface.BTN_RAMDON_FOUR),
                Delay.ofMilliseconds(500)
        );
        actor.attemptsTo(
                WaitUntil.the(DataMaxiChanceInterface.BTN_ACCEP_VALIDATION_DAY_LOTTERIES, isVisible()),
                Click.on(DataMaxiChanceInterface.BTN_ACCEP_VALIDATION_DAY_LOTTERIES));



    }

    public static LotteryEmptyMaxiChanceTask on(){
        return instrumented(LotteryEmptyMaxiChanceTask.class);
    }
}
