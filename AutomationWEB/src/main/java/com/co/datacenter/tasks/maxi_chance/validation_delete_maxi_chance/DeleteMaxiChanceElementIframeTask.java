package com.co.datacenter.tasks.maxi_chance.validation_delete_maxi_chance;

import com.co.datacenter.tasks.delay.Delay;
import com.co.datacenter.userinterfaces.maxi_chance.select_maxi_chance.SelectMaxiChanceInterface;
import com.co.datacenter.userinterfaces.super_chance.data_super_chance.DataSuperChanceInterface;
import com.co.datacenter.userinterfaces.super_chance.delete_super_chance.DeleteSuperChanceInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class DeleteMaxiChanceElementIframeTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Scroll.to(DeleteSuperChanceInterface.TITULO_VALIDACION),
                WaitUntil.the(DeleteSuperChanceInterface.CHEKBOX_DELETE, isVisible()),
                WaitUntil.the(DeleteSuperChanceInterface.CHEKBOX_DELETE, isEnabled()),
                Click.on(DeleteSuperChanceInterface.CHEKBOX_DELETE),
                Delay.ofMilliseconds(700)
        );
        actor.attemptsTo(
                WaitUntil.the(DeleteSuperChanceInterface.DELETE, isVisible()),
                WaitUntil.the(DeleteSuperChanceInterface.DELETE, isEnabled()),
                Click.on(DeleteSuperChanceInterface.DELETE),
                Delay.ofMilliseconds(700)
        );

    }

    public static DeleteMaxiChanceElementIframeTask on() {
        return instrumented(DeleteMaxiChanceElementIframeTask.class);
    }
}
