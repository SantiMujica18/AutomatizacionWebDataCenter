package com.co.datacenter.tasks.combo_millonario.confirm_combo_millonario;

import com.co.datacenter.tasks.delay.Delay;
import com.co.datacenter.userinterfaces.combo_millonario.confirm_combo_millonario.ConfirmComboMillonarioInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ConfirmComboMillonarioTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(ConfirmComboMillonarioInterface.SCROLL_ONE, isVisible()),
                Scroll.to(ConfirmComboMillonarioInterface.SCROLL_ONE),
                Delay.ofMilliseconds(2000),

                WaitUntil.the(ConfirmComboMillonarioInterface.BTN_NEXT_COMBO_MILLONARIO, isVisible()),
                Click.on(ConfirmComboMillonarioInterface.BTN_NEXT_COMBO_MILLONARIO),
                Delay.ofMilliseconds(2000),

                WaitUntil.the(ConfirmComboMillonarioInterface.BTN_ACCEPT_ALERT, isVisible()),
                Click.on(ConfirmComboMillonarioInterface.BTN_ACCEPT_ALERT),
                Delay.ofMilliseconds(2000),

                WaitUntil.the(ConfirmComboMillonarioInterface.CHECK_BOX_PAY_COMBO_MILLONARIO, isVisible()),
                Click.on(ConfirmComboMillonarioInterface.CHECK_BOX_PAY_COMBO_MILLONARIO),
                Delay.ofMilliseconds(2000),

                WaitUntil.the(ConfirmComboMillonarioInterface.BTN_PAY_COMBO_MILLONARIO, isVisible()),
                Click.on(ConfirmComboMillonarioInterface.BTN_PAY_COMBO_MILLONARIO),
                Delay.ofMilliseconds(2000)

        );


    }

    public static ConfirmComboMillonarioTask on(){
        return instrumented(ConfirmComboMillonarioTask.class);
    }
}
