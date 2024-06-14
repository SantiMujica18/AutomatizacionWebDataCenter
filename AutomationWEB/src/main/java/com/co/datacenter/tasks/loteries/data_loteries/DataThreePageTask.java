package com.co.datacenter.tasks.loteries.data_loteries;

import com.co.datacenter.userinterfaces.loteries.data_loteries.OnePageInterface;
import com.co.datacenter.userinterfaces.loteries.data_loteries.ThreePageInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class DataThreePageTask implements Task{
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(ThreePageInterface.SELECT_SERIE,isVisible()),
                Click.on(ThreePageInterface.SELECT_SERIE),

                WaitUntil.the(ThreePageInterface.VALUE_SERIE,isVisible()),
                Click.on(ThreePageInterface.VALUE_SERIE),

                WaitUntil.the(ThreePageInterface.SELECT_FRACTIONS,isVisible()),
                Click.on(ThreePageInterface.SELECT_FRACTIONS),

                WaitUntil.the(ThreePageInterface.VALUE_FRACTIONS,isVisible()),
                Click.on(ThreePageInterface.VALUE_FRACTIONS),

                WaitUntil.the(ThreePageInterface.BTN_SIGUIENTE,isVisible()),
                Click.on(ThreePageInterface.BTN_SIGUIENTE)

        );

    }

    public static DataThreePageTask on(){
        return instrumented(DataThreePageTask.class);
    }
}
