package com.co.datacenter.tasks.login.signin;
import com.co.datacenter.tasks.delay.Delay;
import com.co.datacenter.userinterfaces.login.LoginUserUserInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LoginUserTask implements Task {
    @Step("{0} Sebas login to successful")
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(LoginUserUserInterface.USERNAME, isVisible()),
                Enter.theValue("david.mujica@dcsas.com.co").into(LoginUserUserInterface.USERNAME),
                Enter.theValue("Mujica321").into(LoginUserUserInterface.PASSWORD),
                Click.on(LoginUserUserInterface.CHECK_BOX_1),
                Click.on(LoginUserUserInterface.CHECK_BOX_2),
                Click.on(LoginUserUserInterface.CHECK_BOX_3),
                Scroll.to(LoginUserUserInterface.BTN_LOGIN),
                Click.on(LoginUserUserInterface.BTN_LOGIN),
                Delay.ofMilliseconds(7000)
        );
        if (LoginUserUserInterface.SESSION.resolveFor(actor).isVisible()) {
            actor.attemptsTo(
                    WaitUntil.the(LoginUserUserInterface.SESSION, isVisible()),
                    WaitUntil.the(LoginUserUserInterface.SESSION, isEnabled()),
                    Click.on(LoginUserUserInterface.SESSION),
                    Delay.ofMilliseconds(15000)
            );
            }
        }

        public static LoginUserTask on () {
            return instrumented(LoginUserTask.class);
        }
    }

