package com.co.datacenter.tasks.chance.validation_bet_same_number_chance;

import com.co.datacenter.tasks.delay.Delay;
import com.co.datacenter.userinterfaces.chance_tradicional.validation_bet_same_number_chance.BetSameNumberInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class BetSameNumberChanceElementIframeTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        /*
        actor.attemptsTo(
                WaitUntil.the(BetSameNumberInterface.SCROLL_1, isVisible()),
                Scroll.to((BetSameNumberInterface.SCROLL_1)));


        actor.attemptsTo(
                WaitUntil.the(BetSameNumberInterface.BTN_SELECT_LOTTERY, isVisible()),
                Click.on((BetSameNumberInterface.BTN_SELECT_LOTTERY)));

        actor.attemptsTo(
                WaitUntil.the(BetSameNumberInterface.DAY_LOTTERY, isVisible()),
                Click.on((BetSameNumberInterface.DAY_LOTTERY)));


        actor.attemptsTo(
                WaitUntil.the(BetSameNumberInterface.CKECK_BOX_LOTTERY, isVisible()),
                Click.on((BetSameNumberInterface.CKECK_BOX_LOTTERY)));


        actor.attemptsTo(
                WaitUntil.the(BetSameNumberInterface.BTN_ACCEPT_LOTTERY, isVisible()),
                Click.on((BetSameNumberInterface.BTN_ACCEPT_LOTTERY)));


         */
        actor.attemptsTo(
                WaitUntil.the(BetSameNumberInterface.SCROLL_1, isVisible()),
                Scroll.to((BetSameNumberInterface.SCROLL_1)),
                Delay.ofMilliseconds(1000)


        );


        actor.attemptsTo(
                WaitUntil.the(BetSameNumberInterface.BUTTON_GENERATE_NUM, isVisible()),
                Click.on(BetSameNumberInterface.BUTTON_GENERATE_NUM),
                Delay.ofMilliseconds(1000)

        );


        actor.attemptsTo(
                WaitUntil.the(BetSameNumberInterface.SCROLL_2, isVisible()),
                Scroll.to((BetSameNumberInterface.SCROLL_2)),
                Delay.ofMilliseconds(1000)

        );

        actor.attemptsTo(
                WaitUntil.the(BetSameNumberInterface.CLICK_UPDATE, isVisible()),
                Click.on((BetSameNumberInterface.CLICK_UPDATE)),
                Delay.ofMilliseconds(1000)

        );

        actor.attemptsTo(
                WaitUntil.the(BetSameNumberInterface.INPUT_PLENO_DIRECTO, isVisible()),
                Click.on((BetSameNumberInterface.INPUT_PLENO_DIRECTO)),
                Delay.ofMilliseconds(1000)

        );


        actor.attemptsTo(
                WaitUntil.the(BetSameNumberInterface.INPUT_PLENO_DIRECTO, isVisible()),
                Enter.theValue("500").into(BetSameNumberInterface.INPUT_PLENO_DIRECTO),
                Delay.ofMilliseconds(1000)

        );

        actor.attemptsTo(
                WaitUntil.the(BetSameNumberInterface.INPUT_PLENO_CONVINADO, isVisible()),
                Click.on((BetSameNumberInterface.INPUT_PLENO_CONVINADO)),
                Delay.ofMilliseconds(1000)

        );


        actor.attemptsTo(
                WaitUntil.the(BetSameNumberInterface.INPUT_PLENO_CONVINADO, isVisible()),
                Enter.theValue("500").into(BetSameNumberInterface.INPUT_PLENO_CONVINADO),
                Delay.ofMilliseconds(1000)

        );


        actor.attemptsTo(
                WaitUntil.the(BetSameNumberInterface.BTN_ADD_GAME, isVisible()),
                Click.on((BetSameNumberInterface.BTN_ADD_GAME)),
                Delay.ofMilliseconds(1000)

        );


        actor.attemptsTo(
                WaitUntil.the(BetSameNumberInterface.SCROLL_1, isVisible()),
                Scroll.to((BetSameNumberInterface.SCROLL_1)),
                Delay.ofMilliseconds(1000)

        );

        actor.attemptsTo(
                WaitUntil.the(BetSameNumberInterface.INPUT_NUM, isVisible()),
                Enter.theValue("0814").into(BetSameNumberInterface.INPUT_NUM),
                Delay.ofMilliseconds(1000)

        );


        actor.attemptsTo(
                WaitUntil.the(BetSameNumberInterface.SCROLL_2, isVisible()),
                Scroll.to((BetSameNumberInterface.SCROLL_2))

        );

        actor.attemptsTo(
                WaitUntil.the(BetSameNumberInterface.CLICK_UPDATE, isVisible()),
                Click.on((BetSameNumberInterface.CLICK_UPDATE)),
                Delay.ofMilliseconds(1000)

        );

        actor.attemptsTo(
                WaitUntil.the(BetSameNumberInterface.INPUT_PLENO_DIRECTO, isVisible()),
                Click.on((BetSameNumberInterface.INPUT_PLENO_DIRECTO)),
                Delay.ofMilliseconds(1000)
        );


        actor.attemptsTo(
                WaitUntil.the(BetSameNumberInterface.INPUT_PLENO_DIRECTO, isVisible()),
                Enter.theValue("2050").into(BetSameNumberInterface.INPUT_PLENO_DIRECTO),
                Delay.ofMilliseconds(1000)

        );

        actor.attemptsTo(
                WaitUntil.the(BetSameNumberInterface.INPUT_PLENO_CONVINADO, isVisible()),
                Click.on((BetSameNumberInterface.INPUT_PLENO_CONVINADO)),
                Delay.ofMilliseconds(1000)

        );


        actor.attemptsTo(
                WaitUntil.the(BetSameNumberInterface.INPUT_PLENO_CONVINADO, isVisible()),
                Enter.theValue("2050").into(BetSameNumberInterface.INPUT_PLENO_CONVINADO),
                Delay.ofMilliseconds(2000)

        );

        actor.attemptsTo(
                Click.on((BetSameNumberInterface.BTN_ADD_GAME)),
                Delay.ofMilliseconds(1000)

        );

        /*
        actor.attemptsTo(
                WaitUntil.the(BetSameNumberInterface.BTN_SIGUIENTE, isVisible()),
                Click.on((BetSameNumberInterface.BTN_SIGUIENTE)));
         */



    }

    public static BetSameNumberChanceElementIframeTask on() {
        return instrumented(BetSameNumberChanceElementIframeTask.class);
    }
}
