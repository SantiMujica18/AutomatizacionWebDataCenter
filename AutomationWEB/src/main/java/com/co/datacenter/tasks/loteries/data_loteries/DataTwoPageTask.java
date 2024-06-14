package com.co.datacenter.tasks.loteries.data_loteries;

import com.co.datacenter.userinterfaces.loteries.data_loteries.OnePageInterface;
import com.co.datacenter.userinterfaces.loteries.data_loteries.TwoPageInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class DataTwoPageTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(
                WaitUntil.the(TwoPageInterface.BTN_RANDOM, isVisible()),
                Click.on(TwoPageInterface.BTN_RANDOM)

        );
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        actor.wasAbleTo(
                WaitUntil.the(OnePageInterface.BUTTON_NEXT,isVisible()),
                Click.on(OnePageInterface.BUTTON_NEXT)
        );


    }

    public static DataTwoPageTask on(){
        return instrumented(DataTwoPageTask.class);
    }
}
