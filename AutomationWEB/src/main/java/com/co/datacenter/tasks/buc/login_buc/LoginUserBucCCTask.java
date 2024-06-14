package com.co.datacenter.tasks.buc.login_buc;

import com.co.datacenter.tasks.delay.Delay;
import com.co.datacenter.userinterfaces.buc.HomePageBUCInterfaces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.Random;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LoginUserBucCCTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        Random random = new Random();
        String randomDocumentNumber = String.valueOf(1000000000 + random.nextInt(900000000));

        actor.attemptsTo(
                WaitUntil.the(HomePageBUCInterfaces.DOCUMENT_TYPE, isVisible()),
                Click.on(HomePageBUCInterfaces.DOCUMENT_TYPE),
                Delay.ofMilliseconds(100),
                Click.on(HomePageBUCInterfaces.BUTONN_ARROW),
                Click.on(HomePageBUCInterfaces.CITIZENSHIP_CARD_CC),
                Enter.theValue(randomDocumentNumber).into(HomePageBUCInterfaces.DOCUMENT_NUMBER),
                Click.on(HomePageBUCInterfaces.VALIDATE_DATA),
                Delay.ofMilliseconds(1000)
        );
    }


    public static LoginUserBucCCTask on() {
        return instrumented(LoginUserBucCCTask.class);
    }


}
