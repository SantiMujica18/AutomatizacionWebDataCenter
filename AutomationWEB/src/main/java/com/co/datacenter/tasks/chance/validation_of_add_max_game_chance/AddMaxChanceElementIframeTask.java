package com.co.datacenter.tasks.chance.validation_of_add_max_game_chance;

import com.co.datacenter.tasks.delay.Delay;
import com.co.datacenter.userinterfaces.chance_tradicional.validation_of_add_max_game_chance.AddMaxChanceInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AddMaxChanceElementIframeTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        /*

        actor.attemptsTo(
                WaitUntil.the(AddMaxChanceInterface.SCROLL_1, isVisible()),
                Scroll.to((AddMaxChanceInterface.SCROLL_1)));


        actor.attemptsTo(
                WaitUntil.the(AddMaxChanceInterface.BTN_SELECT_LOTTERY, isVisible()),
                Click.on((AddMaxChanceInterface.BTN_SELECT_LOTTERY)));

        actor.attemptsTo(
                WaitUntil.the(AddMaxChanceInterface.DAY_LOTTERY, isVisible()),
                Click.on((AddMaxChanceInterface.DAY_LOTTERY)));


        actor.attemptsTo(
                WaitUntil.the(AddMaxChanceInterface.CKECK_BOX_LOTTERY, isVisible()),
                Click.on((AddMaxChanceInterface.CKECK_BOX_LOTTERY)));


        actor.attemptsTo(
                WaitUntil.the(AddMaxChanceInterface.BTN_ACCEPT_LOTTERY, isVisible()),
                Click.on((AddMaxChanceInterface.BTN_ACCEPT_LOTTERY)));



         */

        actor.attemptsTo(
                WaitUntil.the(AddMaxChanceInterface.SCROLL_1, isVisible()),
                Scroll.to((AddMaxChanceInterface.SCROLL_1)));

        actor.attemptsTo(
                WaitUntil.the(AddMaxChanceInterface.BTN_RANDOM_NUM, isVisible()),
                Click.on(AddMaxChanceInterface.BTN_RANDOM_NUM),
                Delay.ofMilliseconds(2000)
        );


        actor.attemptsTo(
                WaitUntil.the(AddMaxChanceInterface.SCROLL_2, isVisible()),
                Scroll.to((AddMaxChanceInterface.SCROLL_2)),
                Delay.ofMilliseconds(1000)
        );

        actor.attemptsTo(
                WaitUntil.the(AddMaxChanceInterface.CLICK_UPDATE, isVisible()),
                Click.on((AddMaxChanceInterface.CLICK_UPDATE)),
                Delay.ofMilliseconds(1000)
        );

        actor.attemptsTo(
                WaitUntil.the(AddMaxChanceInterface.INPUT_PLENO_DIRECTO, isVisible()),
                Click.on((AddMaxChanceInterface.INPUT_PLENO_DIRECTO)),
                Delay.ofMilliseconds(1000)

        );


        actor.attemptsTo(
                WaitUntil.the(AddMaxChanceInterface.INPUT_PLENO_DIRECTO, isVisible()),
                Enter.theValue("10000").into(AddMaxChanceInterface.INPUT_PLENO_DIRECTO),
                Delay.ofMilliseconds(1000)

        );

        actor.attemptsTo(
                WaitUntil.the(AddMaxChanceInterface.INPUT_PLENO_CONVINADO, isVisible()),
                Click.on((AddMaxChanceInterface.INPUT_PLENO_CONVINADO)),
                Delay.ofMilliseconds(1000)

        );


        actor.attemptsTo(
                WaitUntil.the(AddMaxChanceInterface.INPUT_PLENO_CONVINADO, isVisible()),
                Enter.theValue("2000").into(AddMaxChanceInterface.INPUT_PLENO_CONVINADO),
                Delay.ofMilliseconds(1000)

        );

        actor.attemptsTo(
                WaitUntil.the(AddMaxChanceInterface.BTN_DISTRIBUTE, isVisible()),
                Click.on((AddMaxChanceInterface.BTN_DISTRIBUTE)),
                Delay.ofMilliseconds(1000)

        );

        actor.attemptsTo(
                WaitUntil.the(AddMaxChanceInterface.BTN_ACCEPT_DISTRIBUTE, isVisible()),
                Click.on((AddMaxChanceInterface.BTN_ACCEPT_DISTRIBUTE)),
                Delay.ofMilliseconds(1000)

        );

        actor.attemptsTo(
                WaitUntil.the(AddMaxChanceInterface.BTN_ADD_GAME, isVisible()),
                Click.on((AddMaxChanceInterface.BTN_ADD_GAME)),
                Delay.ofMilliseconds(1000)

        );

        //Hace scroll up y vuelve a seleccionar el modo random 2

        actor.attemptsTo(
                Scroll.to((AddMaxChanceInterface.SCROLL_1)));

        actor.attemptsTo(
                WaitUntil.the(AddMaxChanceInterface.BTN_RANDOM_NUM, isVisible()),
                Click.on(AddMaxChanceInterface.BTN_RANDOM_NUM),
                Delay.ofMilliseconds(1000)
        );



        actor.attemptsTo(
                WaitUntil.the(AddMaxChanceInterface.SCROLL_2, isVisible()),
                Scroll.to((AddMaxChanceInterface.SCROLL_2))
        );

        actor.attemptsTo(
                WaitUntil.the(AddMaxChanceInterface.CLICK_UPDATE, isVisible()),
                Click.on((AddMaxChanceInterface.CLICK_UPDATE)),
                Delay.ofMilliseconds(1000)

        );

        actor.attemptsTo(
                WaitUntil.the(AddMaxChanceInterface.INPUT_PLENO_DIRECTO, isVisible()),
                Click.on((AddMaxChanceInterface.INPUT_PLENO_DIRECTO)),
                Delay.ofMilliseconds(1000)

        );


        actor.attemptsTo(
                WaitUntil.the(AddMaxChanceInterface.INPUT_PLENO_DIRECTO, isVisible()),
                Enter.theValue("8000").into(AddMaxChanceInterface.INPUT_PLENO_DIRECTO),
                Delay.ofMilliseconds(1000)

        );

        actor.attemptsTo(
                WaitUntil.the(AddMaxChanceInterface.INPUT_PLENO_CONVINADO, isVisible()),
                Click.on((AddMaxChanceInterface.INPUT_PLENO_CONVINADO)),
                Delay.ofMilliseconds(1000)

        );


        actor.attemptsTo(
                WaitUntil.the(AddMaxChanceInterface.INPUT_PLENO_CONVINADO, isVisible()),
                Enter.theValue("5000").into(AddMaxChanceInterface.INPUT_PLENO_CONVINADO),
                Delay.ofMilliseconds(1000)

        );

        actor.attemptsTo(
                WaitUntil.the(AddMaxChanceInterface.BTN_DISTRIBUTE, isVisible()),
                Click.on((AddMaxChanceInterface.BTN_DISTRIBUTE)),
                Delay.ofMilliseconds(1000)

        );

        actor.attemptsTo(
                WaitUntil.the(AddMaxChanceInterface.BTN_ACCEPT_DISTRIBUTE, isVisible()),
                Click.on((AddMaxChanceInterface.BTN_ACCEPT_DISTRIBUTE)),
                Delay.ofMilliseconds(1000)

        );

        actor.attemptsTo(
                WaitUntil.the(AddMaxChanceInterface.BTN_ADD_GAME, isVisible()),
                Click.on((AddMaxChanceInterface.BTN_ADD_GAME)),
                Delay.ofMilliseconds(1000)

        );

        //Hace scroll up y vuelve a seleccionar el modo random 3

        actor.attemptsTo(
                Scroll.to((AddMaxChanceInterface.SCROLL_1))
        );

        actor.attemptsTo(
                WaitUntil.the(AddMaxChanceInterface.BTN_RANDOM_NUM, isVisible()),
                Click.on(AddMaxChanceInterface.BTN_RANDOM_NUM),
                Delay.ofMilliseconds(1000)
        );


        actor.attemptsTo(
                Scroll.to((AddMaxChanceInterface.SCROLL_2)));

        actor.attemptsTo(
                WaitUntil.the(AddMaxChanceInterface.CLICK_UPDATE, isVisible()),
                Click.on((AddMaxChanceInterface.CLICK_UPDATE)),
                Delay.ofMilliseconds(1000)

        );

        actor.attemptsTo(
                WaitUntil.the(AddMaxChanceInterface.INPUT_PLENO_DIRECTO, isVisible()),
                Click.on((AddMaxChanceInterface.INPUT_PLENO_DIRECTO)),
                Delay.ofMilliseconds(1000)

        );


        actor.attemptsTo(
                WaitUntil.the(AddMaxChanceInterface.INPUT_PLENO_DIRECTO, isVisible()),
                Enter.theValue("8400").into(AddMaxChanceInterface.INPUT_PLENO_DIRECTO),
                Delay.ofMilliseconds(1000)


        );

        actor.attemptsTo(
                WaitUntil.the(AddMaxChanceInterface.INPUT_PLENO_CONVINADO, isVisible()),
                Click.on((AddMaxChanceInterface.INPUT_PLENO_CONVINADO)),
                Delay.ofMilliseconds(1000)

        );


        actor.attemptsTo(
                WaitUntil.the(AddMaxChanceInterface.INPUT_PLENO_CONVINADO, isVisible()),
                Enter.theValue("7500").into(AddMaxChanceInterface.INPUT_PLENO_CONVINADO),
                Delay.ofMilliseconds(1000)

        );

        actor.attemptsTo(
                WaitUntil.the(AddMaxChanceInterface.BTN_DISTRIBUTE, isVisible()),
                Click.on((AddMaxChanceInterface.BTN_DISTRIBUTE)),
                Delay.ofMilliseconds(1000)

        );

        actor.attemptsTo(
                WaitUntil.the(AddMaxChanceInterface.BTN_ACCEPT_DISTRIBUTE, isVisible()),
                Click.on((AddMaxChanceInterface.BTN_ACCEPT_DISTRIBUTE)),
                Delay.ofMilliseconds(1000)

        );

        actor.attemptsTo(
                WaitUntil.the(AddMaxChanceInterface.BTN_ADD_GAME, isVisible()),
                Click.on((AddMaxChanceInterface.BTN_ADD_GAME)),
                Delay.ofMilliseconds(1000)

        );

        //Hace scroll up y vuelve a seleccionar el modo random 4

        actor.attemptsTo(
                WaitUntil.the(AddMaxChanceInterface.SCROLL_1, isVisible()),
                Scroll.to((AddMaxChanceInterface.SCROLL_1)),
                Delay.ofMilliseconds(1000)

        );

        actor.attemptsTo(
                WaitUntil.the(AddMaxChanceInterface.BTN_RANDOM_NUM, isVisible()),
                Click.on(AddMaxChanceInterface.BTN_RANDOM_NUM),
                Delay.ofMilliseconds(1000)
        );


        actor.attemptsTo(
                WaitUntil.the(AddMaxChanceInterface.SCROLL_2, isVisible()),
                Scroll.to((AddMaxChanceInterface.SCROLL_2)),
                Delay.ofMilliseconds(1000)

        );

        actor.attemptsTo(
                WaitUntil.the(AddMaxChanceInterface.CLICK_UPDATE, isVisible()),
                Click.on((AddMaxChanceInterface.CLICK_UPDATE)),
                Delay.ofMilliseconds(1000)

        );

        actor.attemptsTo(
                WaitUntil.the(AddMaxChanceInterface.INPUT_PLENO_DIRECTO, isVisible()),
                Click.on((AddMaxChanceInterface.INPUT_PLENO_DIRECTO)),
                Delay.ofMilliseconds(1000)

        );


        actor.attemptsTo(
                WaitUntil.the(AddMaxChanceInterface.INPUT_PLENO_DIRECTO, isVisible()),
                Enter.theValue("11000").into(AddMaxChanceInterface.INPUT_PLENO_DIRECTO),
                Delay.ofMilliseconds(1000)

        );

        actor.attemptsTo(
                WaitUntil.the(AddMaxChanceInterface.INPUT_PLENO_CONVINADO, isVisible()),
                Click.on((AddMaxChanceInterface.INPUT_PLENO_CONVINADO)),
                Delay.ofMilliseconds(1000)

        );


        actor.attemptsTo(
                WaitUntil.the(AddMaxChanceInterface.INPUT_PLENO_CONVINADO, isVisible()),
                Enter.theValue("800").into(AddMaxChanceInterface.INPUT_PLENO_CONVINADO),
                Delay.ofMilliseconds(1000)

        );

        actor.attemptsTo(
                WaitUntil.the(AddMaxChanceInterface.BTN_DISTRIBUTE, isVisible()),
                Click.on((AddMaxChanceInterface.BTN_DISTRIBUTE)),
                Delay.ofMilliseconds(1000)

        );

        actor.attemptsTo(
                WaitUntil.the(AddMaxChanceInterface.BTN_ACCEPT_DISTRIBUTE, isVisible()),
                Click.on((AddMaxChanceInterface.BTN_ACCEPT_DISTRIBUTE)),
                Delay.ofMilliseconds(1000)

        );

        actor.attemptsTo(
                WaitUntil.the(AddMaxChanceInterface.BTN_ADD_GAME, isVisible()),
                Click.on((AddMaxChanceInterface.BTN_ADD_GAME)),
                Delay.ofMilliseconds(1000)

        );

        //Hace scroll up y vuelve a seleccionar el modo random 5

        actor.attemptsTo(
                WaitUntil.the(AddMaxChanceInterface.SCROLL_1, isVisible()),
                Scroll.to((AddMaxChanceInterface.SCROLL_1))
        );

        actor.attemptsTo(
                WaitUntil.the(AddMaxChanceInterface.BTN_RANDOM_NUM, isVisible()),
                Click.on(AddMaxChanceInterface.BTN_RANDOM_NUM),
                Delay.ofMilliseconds(1000)

        );


        actor.attemptsTo(
                WaitUntil.the(AddMaxChanceInterface.SCROLL_2, isVisible()),
                Scroll.to((AddMaxChanceInterface.SCROLL_2))
        );

        actor.attemptsTo(
                WaitUntil.the(AddMaxChanceInterface.CLICK_UPDATE, isVisible()),
                Click.on((AddMaxChanceInterface.CLICK_UPDATE)),
                Delay.ofMilliseconds(1000)

        );

        actor.attemptsTo(
                WaitUntil.the(AddMaxChanceInterface.INPUT_PLENO_DIRECTO, isVisible()),
                Click.on((AddMaxChanceInterface.INPUT_PLENO_DIRECTO)),
                Delay.ofMilliseconds(1000)
        );


        actor.attemptsTo(
                WaitUntil.the(AddMaxChanceInterface.INPUT_PLENO_DIRECTO, isVisible()),
                Enter.theValue("400").into(AddMaxChanceInterface.INPUT_PLENO_DIRECTO),
                Delay.ofMilliseconds(1000)
        );

        actor.attemptsTo(
                WaitUntil.the(AddMaxChanceInterface.INPUT_PLENO_CONVINADO, isVisible()),
                Click.on((AddMaxChanceInterface.INPUT_PLENO_CONVINADO)),
                Delay.ofMilliseconds(1000)
        );


        actor.attemptsTo(
                WaitUntil.the(AddMaxChanceInterface.INPUT_PLENO_CONVINADO, isVisible()),
                Enter.theValue("13500").into(AddMaxChanceInterface.INPUT_PLENO_CONVINADO),
                Delay.ofMilliseconds(1000)
        );

        actor.attemptsTo(
                WaitUntil.the(AddMaxChanceInterface.BTN_DISTRIBUTE, isVisible()),
                Click.on((AddMaxChanceInterface.BTN_DISTRIBUTE)),
                Delay.ofMilliseconds(1000)
        );

        actor.attemptsTo(
                WaitUntil.the(AddMaxChanceInterface.BTN_ACCEPT_DISTRIBUTE, isVisible()),
                Click.on((AddMaxChanceInterface.BTN_ACCEPT_DISTRIBUTE)),
                Delay.ofMilliseconds(1000)
        );

        actor.attemptsTo(
                WaitUntil.the(AddMaxChanceInterface.BTN_ADD_GAME, isVisible()),
                Click.on((AddMaxChanceInterface.BTN_ADD_GAME)),
                Delay.ofMilliseconds(1000)
        );

        //Hace scroll up y vuelve a seleccionar el modo random 6
/*
        actor.attemptsTo(
                WaitUntil.the(AddMaxChanceInterface.SCROLL_1, isVisible()),
                Scroll.to((AddMaxChanceInterface.SCROLL_1)));

        actor.attemptsTo(
                WaitUntil.the(AddMaxChanceInterface.BTN_RANDOM_NUM, isVisible()),
                Click.on(AddMaxChanceInterface.BTN_RANDOM_NUM));

        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        actor.attemptsTo(
                WaitUntil.the(AddMaxChanceInterface.SCROLL_2, isVisible()),
                Scroll.to((AddMaxChanceInterface.SCROLL_2)));

        actor.attemptsTo(
                WaitUntil.the(AddMaxChanceInterface.CLICK_UPDATE, isVisible()),
                Click.on((AddMaxChanceInterface.CLICK_UPDATE)));

        actor.attemptsTo(
                WaitUntil.the(AddMaxChanceInterface.INPUT_PLENO_DIRECTO, isVisible()),
                Click.on((AddMaxChanceInterface.INPUT_PLENO_DIRECTO)));


        actor.attemptsTo(
                WaitUntil.the(AddMaxChanceInterface.INPUT_PLENO_DIRECTO, isVisible()),
                Enter.theValue("1400").into(AddMaxChanceInterface.INPUT_PLENO_DIRECTO));

        actor.attemptsTo(
                WaitUntil.the(AddMaxChanceInterface.INPUT_PLENO_CONVINADO, isVisible()),
                Click.on((AddMaxChanceInterface.INPUT_PLENO_CONVINADO)));


        actor.attemptsTo(
                WaitUntil.the(AddMaxChanceInterface.INPUT_PLENO_CONVINADO, isVisible()),
                Enter.theValue("10500").into(AddMaxChanceInterface.INPUT_PLENO_CONVINADO));

        actor.attemptsTo(
                WaitUntil.the(AddMaxChanceInterface.BTN_DISTRIBUTE, isVisible()),
                Click.on((AddMaxChanceInterface.BTN_DISTRIBUTE)));

        actor.attemptsTo(
                WaitUntil.the(AddMaxChanceInterface.BTN_ACCEPT_DISTRIBUTE, isVisible()),
                Click.on((AddMaxChanceInterface.BTN_ACCEPT_DISTRIBUTE)));

        actor.attemptsTo(
                WaitUntil.the(AddMaxChanceInterface.BTN_ADD_GAME, isVisible()),
                Click.on((AddMaxChanceInterface.BTN_ADD_GAME)));



 */


        /*
        actor.attemptsTo(
                WaitUntil.the(MaxValueChanceInterface.BTN_SIGUIENTE, isVisible()),
                Click.on((MaxValueChanceInterface.BTN_SIGUIENTE)));

         */


    }

    public static AddMaxChanceElementIframeTask on() {
        return instrumented(AddMaxChanceElementIframeTask.class);
    }
}
