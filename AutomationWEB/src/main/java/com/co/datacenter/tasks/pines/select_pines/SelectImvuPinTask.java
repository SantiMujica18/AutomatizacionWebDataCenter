package com.co.datacenter.tasks.pines.select_pines;

import com.co.datacenter.userinterfaces.pines.data_pines.DataPaymentPinesInterface;
import com.co.datacenter.userinterfaces.pines.select_pines.SelectPinesInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SelectImvuPinTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(SelectPinesInterface.WELCOME_PINES, isVisible()),
                Scroll.to(SelectPinesInterface.WELCOME_PINES)
        );

        actor.attemptsTo(
                WaitUntil.the(DataPaymentPinesInterface.IMVU_PRODUCT, isVisible()),
                Click.on(DataPaymentPinesInterface.IMVU_PRODUCT)
        );


    }

    public static SelectImvuPinTask on(){return instrumented(SelectImvuPinTask.class);
    }

}


