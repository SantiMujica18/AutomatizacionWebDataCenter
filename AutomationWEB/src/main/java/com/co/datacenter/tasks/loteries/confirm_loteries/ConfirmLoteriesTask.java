package com.co.datacenter.tasks.loteries.confirm_loteries;

import com.co.datacenter.userinterfaces.loteries.confirm_loteries.ConfirmLoteriesInterface;
import com.co.datacenter.userinterfaces.loteries.data_loteries.OnePageInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ConfirmLoteriesTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(
                WaitUntil.the(ConfirmLoteriesInterface.SCROLL_1, isVisible()),
                Click.on(ConfirmLoteriesInterface.SCROLL_1),

                WaitUntil.the(ConfirmLoteriesInterface.CHECK_BOX_PAY_LOTTERY,isVisible()),
                Click.on(ConfirmLoteriesInterface.CHECK_BOX_PAY_LOTTERY),

                WaitUntil.the(ConfirmLoteriesInterface.BTN_PAY,isVisible()),
                Click.on(ConfirmLoteriesInterface.BTN_PAY)
        );

    }

    public static ConfirmLoteriesTask on(){
        return instrumented(ConfirmLoteriesTask.class);
    }
}
