package com.co.datacenter.tasks.betplay;

import com.co.datacenter.tasks.admin.SelectSetionSettingTask;
import com.co.datacenter.tasks.delay.Delay;
import com.co.datacenter.userinterfaces.admin.select_admin.SelectAdminInterface;
import com.co.datacenter.userinterfaces.betplay.BetplayDataInterface;
import cucumber.api.java.lt.Bet;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ConfirmRechargeBetplayTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BetplayDataInterface.IMG_BETPLAY, isVisible()),
                Click.on(BetplayDataInterface.IMG_BETPLAY),
                Delay.ofMilliseconds(1000),
                Scroll.to(BetplayDataInterface.SCROLL_BETPLAY),
                Delay.ofMilliseconds(1000),
                Click.on(BetplayDataInterface.BUTTON_SEARCH_CC),
                Delay.ofMilliseconds(1000)
        );

    }

    public static ConfirmRechargeBetplayTask on(){
        return instrumented(ConfirmRechargeBetplayTask.class);
    }
}

