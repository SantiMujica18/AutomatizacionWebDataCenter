package com.co.datacenter.tasks.super_astro.send_super_astro;

import com.co.datacenter.tasks.delay.Delay;
import com.co.datacenter.userinterfaces.super_astro.send_super_astro.SendSuperAstroTwoInterface;
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

public class FillOutFormTwoSuperAstroTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(SendSuperAstroTwoInterface.SCROLL_1, isVisible()),
                Scroll.to(SendSuperAstroTwoInterface.SCROLL_1)
        );

        actor.attemptsTo(
                WaitUntil.the(SendSuperAstroTwoInterface.BTN_RANDOM, isVisible()),
                Click.on(SendSuperAstroTwoInterface.BTN_RANDOM),
                Delay.ofMilliseconds(1000)
        );
        actor.attemptsTo(
                WaitUntil.the(SendSuperAstroTwoInterface.SELECT_SIGN, isVisible()),
                Click.on(SendSuperAstroTwoInterface.SELECT_SIGN)
        );

        actor.attemptsTo(
                WaitUntil.the(SendSuperAstroTwoInterface.SELECT_VALUE_SIGN, isVisible()),
                Click.on(SendSuperAstroTwoInterface.SELECT_VALUE_SIGN)
        );


        actor.attemptsTo(
                WaitUntil.the(SendSuperAstroTwoInterface.INPUT_VALUE, isVisible()),
                Click.on(SendSuperAstroTwoInterface.INPUT_VALUE),
                Hit.the(Keys.BACK_SPACE).into(SendSuperAstroTwoInterface.INPUT_VALUE),
                Delay.ofMilliseconds(500),
                Hit.the(Keys.NUMPAD1).into(SendSuperAstroTwoInterface.INPUT_VALUE),
                Delay.ofMilliseconds(100),
                Hit.the(Keys.NUMPAD0).into(SendSuperAstroTwoInterface.INPUT_VALUE),
                Delay.ofMilliseconds(100),
                Hit.the(Keys.NUMPAD0).into(SendSuperAstroTwoInterface.INPUT_VALUE),
                Delay.ofMilliseconds(100),
                Hit.the(Keys.NUMPAD0).into(SendSuperAstroTwoInterface.INPUT_VALUE)
        );

        actor.attemptsTo(
                WaitUntil.the(SendSuperAstroTwoInterface.BTN_BET, isVisible()),
                Click.on(SendSuperAstroTwoInterface.BTN_BET)
        );

    }

    public static FillOutFormTwoSuperAstroTask on(){
        return instrumented(FillOutFormTwoSuperAstroTask.class);
    }
}
