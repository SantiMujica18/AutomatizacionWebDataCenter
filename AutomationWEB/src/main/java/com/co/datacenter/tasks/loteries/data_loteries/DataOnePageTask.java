package com.co.datacenter.tasks.loteries.data_loteries;

import com.co.datacenter.userinterfaces.loteries.data_loteries.OnePageInterface;
import com.co.datacenter.userinterfaces.paga_millonario.data_paga_millonario.DataOnePageInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class DataOnePageTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(
                WaitUntil.the(OnePageInterface.CHECK_BOX_LOTERY, isVisible()),
                Click.on(OnePageInterface.CHECK_BOX_LOTERY),

                WaitUntil.the(OnePageInterface.BUTTON_NEXT,isVisible()),
                Click.on(OnePageInterface.BUTTON_NEXT)
        );

    }

    public static DataOnePageTask on(){
        return instrumented(DataOnePageTask.class);
    }
}
