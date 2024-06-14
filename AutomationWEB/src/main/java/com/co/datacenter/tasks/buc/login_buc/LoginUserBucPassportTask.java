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

public class LoginUserBucPassportTask implements Task {
    Random random = new Random();
    String randomDocumentNumber = generateRandomLetters(3) + (1000 + random.nextInt(9000));
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(HomePageBUCInterfaces.DOCUMENT_TYPE, isVisible()),
                Click.on(HomePageBUCInterfaces.BUTONN_ARROW),
                Delay.ofMilliseconds(100),
                Click.on(HomePageBUCInterfaces.CITIZENSHIP_CARD_PASSPORT),
                Enter.theValue(randomDocumentNumber).into(HomePageBUCInterfaces.DOCUMENT_NUMBER),
                Click.on(HomePageBUCInterfaces.VALIDATE_DATA),
                Delay.ofMilliseconds(1000)
        );
    }
    public static LoginUserBucPassportTask on(){return instrumented(LoginUserBucPassportTask.class);
    }
    private String generateRandomLetters(int length) {
        StringBuilder randomLetters = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char randomChar = (char) (random.nextInt(26) + 'A');
            randomLetters.append(randomChar);
        }
        return randomLetters.toString();
    }
}
