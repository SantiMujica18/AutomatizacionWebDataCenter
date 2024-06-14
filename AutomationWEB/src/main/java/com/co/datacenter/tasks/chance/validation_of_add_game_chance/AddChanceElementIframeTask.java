package com.co.datacenter.tasks.chance.validation_of_add_game_chance;

import com.co.datacenter.tasks.delay.Delay;
import com.co.datacenter.userinterfaces.chance_tradicional.validation_of_add_game_chance.AddChanceInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AddChanceElementIframeTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        /*
        actor.attemptsTo(
                WaitUntil.the(AddChanceInterface.SCROLL_1, isVisible()),
                Scroll.to((AddChanceInterface.SCROLL_1)));


        actor.attemptsTo(
                WaitUntil.the(AddChanceInterface.BTN_SELECT_LOTTERY, isVisible()),
                Click.on((AddChanceInterface.BTN_SELECT_LOTTERY)));

        actor.attemptsTo(
                WaitUntil.the(AddChanceInterface.DAY_LOTTERY, isVisible()),
                Click.on((AddChanceInterface.DAY_LOTTERY)));


        actor.attemptsTo(
                WaitUntil.the(AddChanceInterface.CKECK_BOX_LOTTERY, isVisible()),
                Click.on((AddChanceInterface.CKECK_BOX_LOTTERY)));


        actor.attemptsTo(
                WaitUntil.the(AddChanceInterface.BTN_ACCEPT_LOTTERY, isVisible()),
                Click.on((AddChanceInterface.BTN_ACCEPT_LOTTERY)));


         */

        actor.attemptsTo(
                WaitUntil.the(AddChanceInterface.BTN_RANDOM_NUM, isVisible()),
                Click.on(AddChanceInterface.BTN_RANDOM_NUM),
                Delay.ofMilliseconds(1500)
        );

        actor.attemptsTo(
                WaitUntil.the(AddChanceInterface.SCROLL_2, isVisible()),
                Scroll.to((AddChanceInterface.SCROLL_2))
        );

        actor.attemptsTo(
                WaitUntil.the(AddChanceInterface.CLICK_UPDATE, isVisible()),
                Click.on((AddChanceInterface.CLICK_UPDATE)),
                Delay.ofMilliseconds(500)

        );

        actor.attemptsTo(
                WaitUntil.the(AddChanceInterface.INPUT_PLENO_DIRECTO, isVisible()),
                Click.on((AddChanceInterface.INPUT_PLENO_DIRECTO)),
                Delay.ofMilliseconds(1000)
        );


        actor.attemptsTo(
                WaitUntil.the(AddChanceInterface.INPUT_PLENO_DIRECTO, isVisible()),
                Enter.theValue("1000").into(AddChanceInterface.INPUT_PLENO_DIRECTO),
                Delay.ofMilliseconds(1000));

        actor.attemptsTo(
                WaitUntil.the(AddChanceInterface.INPUT_PLENO_CONVINADO, isVisible()),
                Click.on((AddChanceInterface.INPUT_PLENO_CONVINADO)),
                Delay.ofMilliseconds(500));


        actor.attemptsTo(
                WaitUntil.the(AddChanceInterface.INPUT_PLENO_CONVINADO, isVisible()),
                Enter.theValue("2000").into(AddChanceInterface.INPUT_PLENO_CONVINADO),
                Delay.ofMilliseconds(1000));

        actor.attemptsTo(
                WaitUntil.the(AddChanceInterface.BTN_DISTRIBUTE, isVisible()),
                Click.on((AddChanceInterface.BTN_DISTRIBUTE)),
                Delay.ofMilliseconds(500));

        actor.attemptsTo(
                WaitUntil.the(AddChanceInterface.BTN_ACCEPT_DISTRIBUTE, isVisible()),
                Click.on((AddChanceInterface.BTN_ACCEPT_DISTRIBUTE)),
                Delay.ofMilliseconds(500));

        actor.attemptsTo(
                WaitUntil.the(AddChanceInterface.BTN_ADD_GAME, isVisible()),
                Click.on((AddChanceInterface.BTN_ADD_GAME)),
                Delay.ofMilliseconds(500));


        /*
        actor.attemptsTo(
                WaitUntil.the(MaxValueChanceInterface.BTN_SIGUIENTE, isVisible()),
                Click.on((MaxValueChanceInterface.BTN_SIGUIENTE)));

         */


    }

    public static AddChanceElementIframeTask on() {
        return instrumented(AddChanceElementIframeTask.class);
    }
}
