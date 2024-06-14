package com.co.datacenter.tasks.pines.select_pines;

import com.co.datacenter.userinterfaces.pines.data_pines.DataPaymentPinesInterface;
import com.co.datacenter.userinterfaces.pines.select_pines.SelectPinesInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SelectSpotifyPinTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(SelectPinesInterface.WELCOME_PINES, isVisible()),
                Scroll.to(SelectPinesInterface.WELCOME_PINES)
        );

        actor.attemptsTo(
                WaitUntil.the(DataPaymentPinesInterface.SPOTIFY_PRODUCT, isVisible()),
                Click.on(DataPaymentPinesInterface.SPOTIFY_PRODUCT)
        );


    }

    public static SelectSpotifyPinTask on(){return instrumented(SelectSpotifyPinTask.class);}

}
