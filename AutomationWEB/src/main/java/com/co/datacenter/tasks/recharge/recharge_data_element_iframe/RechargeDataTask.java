package com.co.datacenter.tasks.recharge.recharge_data_element_iframe;

import com.co.datacenter.tasks.delay.Delay;
import com.co.datacenter.userinterfaces.recarga.recharge_data.RechargeDataInterface;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class RechargeDataTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
                actor.attemptsTo(
                        WaitUntil.the(RechargeDataInterface.TITLE_REHCARGE_DATA, isVisible())
                );

                actor.attemptsTo(
                        Enter.theValue("3222123288").into(RechargeDataInterface.INPUT_CELLPHONE_NUM),
                        Delay.ofMilliseconds(1000)
                );

                actor.attemptsTo(
                        Click.on(RechargeDataInterface.SELECT_PACKAGE),
                        Delay.ofMilliseconds(1000)
                );

                actor.attemptsTo(
                        Click.on(RechargeDataInterface.VALUE_PACKAGE),
                        Delay.ofMilliseconds(1000)
                );

                actor.attemptsTo(
                        Click.on(RechargeDataInterface.BTN_NEXT_RECHARGE_DATE),
                        Delay.ofMilliseconds(1000)
                );

                actor.attemptsTo(
                        Click.on(RechargeDataInterface.BTN_ALERT),
                        Delay.ofMilliseconds(1000)
                );

                actor.attemptsTo(
                        Click.on(RechargeDataInterface.SELECT_PACKAGE),
                        Delay.ofMilliseconds(1000)
                );

                actor.attemptsTo(
                        Click.on(RechargeDataInterface.VALUE_PACKAGE_x2),
                        Delay.ofMilliseconds(1000)
                );

                actor.attemptsTo(
                        Click.on(RechargeDataInterface.BTN_NEXT_RECHARGE_DATE),
                        Delay.ofMilliseconds(1000)
                );


    }

    public static RechargeDataTask on(){
        return instrumented(RechargeDataTask.class);
    }
}
