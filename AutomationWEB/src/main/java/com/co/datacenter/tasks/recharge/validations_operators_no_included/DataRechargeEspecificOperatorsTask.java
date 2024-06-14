package com.co.datacenter.tasks.recharge.validations_operators_no_included;

import com.co.datacenter.tasks.delay.Delay;
import com.co.datacenter.tasks.recharge.select_recharge.SelectClaroRechargeTask;
import com.co.datacenter.userinterfaces.recarga.recharge_data.RechargeDataInterface;
import com.co.datacenter.userinterfaces.recarga.select_operator.SelectOperatorInterface;
import cucumber.api.java.hu.De;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class DataRechargeEspecificOperatorsTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(RechargeDataInterface.BTN_NEXT_RECHARGE_DATE, isVisible()),
                Click.on(RechargeDataInterface.BTN_NEXT_RECHARGE_DATE),
                Delay.ofMilliseconds(500),
                WaitUntil.the(RechargeDataInterface.INPUT_CELLPHONE_NUM, isVisible()),
                Enter.theValue("3222123288").into(RechargeDataInterface.INPUT_CELLPHONE_NUM),
                Delay.ofMilliseconds(500),
                Click.on(RechargeDataInterface.BTN_NEXT_RECHARGE_DATE),
                Delay.ofMilliseconds(500),
                Enter.theValue("2000").into(RechargeDataInterface.INPUT_RECHARGE_VALUE),
                Delay.ofMilliseconds(500),
                WaitUntil.the(RechargeDataInterface.BTN_ALERT, isVisible()),
                Click.on(RechargeDataInterface.BTN_ALERT),
                Delay.ofMilliseconds(500),
                Enter.theValue("3000").into(RechargeDataInterface.INPUT_RECHARGE_VALUE),
                Delay.ofMilliseconds(500),
                Click.on(RechargeDataInterface.BTN_NEXT_RECHARGE_DATE)
        );


    }
    public static DataRechargeEspecificOperatorsTask on(){
        return instrumented(DataRechargeEspecificOperatorsTask.class);
    }
}


