package com.co.datacenter.tasks.chance.validation_of_delete_game_chance;

import com.co.datacenter.tasks.delay.Delay;
import com.co.datacenter.userinterfaces.chance_tradicional.validation_of_delete_game_chance.DeleteChanceInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class DeleteChanceElementIframeTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(
                Scroll.to(DeleteChanceInterface.SCROLL_1),
                Delay.ofMilliseconds(1000),
                Click.on(DeleteChanceInterface.BTN_RANDOM_NUM),
                Delay.ofMilliseconds(2000)
        );




        actor.attemptsTo(
                WaitUntil.the(DeleteChanceInterface.SCROLL_2, isVisible()),
                Scroll.to((DeleteChanceInterface.SCROLL_2)),
                Delay.ofMilliseconds(1000)
        );


        actor.attemptsTo(
                WaitUntil.the(DeleteChanceInterface.CLICK_UPDATE, isVisible()),
                Click.on((DeleteChanceInterface.CLICK_UPDATE)),
                Delay.ofMilliseconds(1000)

        );

        actor.attemptsTo(
                WaitUntil.the(DeleteChanceInterface.INPUT_PLENO_DIRECTO, isVisible()),
                Click.on((DeleteChanceInterface.INPUT_PLENO_DIRECTO)),
                Delay.ofMilliseconds(1000)

        );


        actor.attemptsTo(
                WaitUntil.the(DeleteChanceInterface.INPUT_PLENO_DIRECTO, isVisible()),
                Enter.theValue("10000").into(DeleteChanceInterface.INPUT_PLENO_DIRECTO),
                Delay.ofMilliseconds(1000)

        );

        actor.attemptsTo(
                WaitUntil.the(DeleteChanceInterface.INPUT_PLENO_CONVINADO, isVisible()),
                Click.on((DeleteChanceInterface.INPUT_PLENO_CONVINADO)),
                Delay.ofMilliseconds(1000)

        );


        actor.attemptsTo(
                WaitUntil.the(DeleteChanceInterface.INPUT_PLENO_CONVINADO, isVisible()),
                Enter.theValue("2000").into(DeleteChanceInterface.INPUT_PLENO_CONVINADO),
                Delay.ofMilliseconds(2000)

        );

        actor.attemptsTo(
                Click.on((DeleteChanceInterface.BTN_DISTRIBUTE)),
                Delay.ofMilliseconds(1500)

        );

        actor.attemptsTo(
                Click.on((DeleteChanceInterface.BTN_ACCEPT_DISTRIBUTE)),
                Delay.ofMilliseconds(1000)

        );

        actor.attemptsTo(
                WaitUntil.the(DeleteChanceInterface.BTN_ADD_GAME, isVisible()),
                Click.on((DeleteChanceInterface.BTN_ADD_GAME)),
                Delay.ofMilliseconds(1000)

        );

        actor.attemptsTo(
                WaitUntil.the(DeleteChanceInterface.SCROLL_1, isVisible()),
                Scroll.to((DeleteChanceInterface.SCROLL_1))


        );


        actor.attemptsTo(
                WaitUntil.the(DeleteChanceInterface.BTN_DELETE, isVisible()),
                Click.on((DeleteChanceInterface.BTN_DELETE)),
                Delay.ofMilliseconds(1000)

        );



        /*
        actor.attemptsTo(
                WaitUntil.the(MaxValueChanceInterface.BTN_SIGUIENTE, isVisible()),
                Click.on((MaxValueChanceInterface.BTN_SIGUIENTE)));

         */


    }

    public static DeleteChanceElementIframeTask on() {
        return instrumented(DeleteChanceElementIframeTask.class);
    }
}
