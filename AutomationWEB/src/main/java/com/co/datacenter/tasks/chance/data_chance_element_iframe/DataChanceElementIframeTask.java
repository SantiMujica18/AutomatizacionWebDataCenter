package com.co.datacenter.tasks.chance.data_chance_element_iframe;

import com.co.datacenter.tasks.delay.Delay;
import com.co.datacenter.userinterfaces.chance_tradicional.date_chance.DataChanceInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class DataChanceElementIframeTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(DataChanceInterface.SCROLL_1, isVisible()),
                Scroll.to((DataChanceInterface.SCROLL_1)));

        actor.attemptsTo(
                WaitUntil.the(DataChanceInterface.INPUT_NUM, isVisible()),
                Enter.theValue("0526").into(DataChanceInterface.INPUT_NUM),
                Delay.ofMilliseconds(1000));


        actor.attemptsTo(
                WaitUntil.the(DataChanceInterface.SCROLL_2, isVisible()),
                Scroll.to((DataChanceInterface.SCROLL_2)));

        actor.attemptsTo(
                WaitUntil.the(DataChanceInterface.CLICK_UPDATE, isVisible()),
                Click.on((DataChanceInterface.CLICK_UPDATE)),
                Delay.ofMilliseconds(1000));

        actor.attemptsTo(
                WaitUntil.the(DataChanceInterface.INPUT_PLENO_DIRECTO, isVisible()),
                Click.on((DataChanceInterface.INPUT_PLENO_DIRECTO)),
                Delay.ofMilliseconds(1000));


        actor.attemptsTo(
                WaitUntil.the(DataChanceInterface.INPUT_PLENO_DIRECTO, isVisible()),
                Enter.theValue("500").into(DataChanceInterface.INPUT_PLENO_DIRECTO),
                Delay.ofMilliseconds(1000));

        actor.attemptsTo(
                WaitUntil.the(DataChanceInterface.INPUT_PLENO_CONVINADO, isVisible()),
                Click.on((DataChanceInterface.INPUT_PLENO_CONVINADO)),
                Delay.ofMilliseconds(1000));


        actor.attemptsTo(
                WaitUntil.the(DataChanceInterface.INPUT_PLENO_CONVINADO, isVisible()),
                Click.on(DataChanceInterface.INPUT_PLENO_CONVINADO),
                Enter.theValue("500").into(DataChanceInterface.INPUT_PLENO_CONVINADO),
                Delay.ofMilliseconds(500),
                Hit.the(Keys.ENTER).into(DataChanceInterface.INPUT_PLENO_CONVINADO),
                Delay.ofMilliseconds(500)
                );


        actor.attemptsTo(
                Click.on((DataChanceInterface.BTN_SIGUIENTE)),
                Delay.ofMilliseconds(1000));



    }

    public static DataChanceElementIframeTask on() {
        return instrumented(DataChanceElementIframeTask.class);
    }
}
