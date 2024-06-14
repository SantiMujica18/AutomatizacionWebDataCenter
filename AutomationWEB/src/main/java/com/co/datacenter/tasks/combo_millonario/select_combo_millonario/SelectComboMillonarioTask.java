package com.co.datacenter.tasks.combo_millonario.select_combo_millonario;

import com.co.datacenter.userinterfaces.combo_millonario.select_combo_millonario.SelectComboMillonarioInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SelectComboMillonarioTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                WaitUntil.the(SelectComboMillonarioInterface.SCROLL_CHANCE, isVisible()),
                Scroll.to(SelectComboMillonarioInterface.SCROLL_CHANCE),

                WaitUntil.the(SelectComboMillonarioInterface.SELECT_COMBO_MILLONARIO, isVisible()),
                Click.on(SelectComboMillonarioInterface.SELECT_COMBO_MILLONARIO)
        );


    }

    public static SelectComboMillonarioTask on(){
        return instrumented(SelectComboMillonarioTask.class);
    }
}
