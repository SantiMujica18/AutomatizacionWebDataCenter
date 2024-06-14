package com.co.datacenter.questions.chance_millonario.clean_chance_millonario;


import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class CleanChanceMillonarioQuestion {

    public static Question<Boolean> cleanChanceMillonario =
         actor -> (Target.the("disabled button")
                .locatedBy("//button[contains(@aria-disabled, 'true')]")
                .resolveFor(actor)
                .isEnabled());
    }

