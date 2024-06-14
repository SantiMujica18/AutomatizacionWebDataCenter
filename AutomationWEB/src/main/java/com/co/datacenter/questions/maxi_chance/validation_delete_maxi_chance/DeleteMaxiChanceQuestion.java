package com.co.datacenter.questions.maxi_chance.validation_delete_maxi_chance;


import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class DeleteMaxiChanceQuestion {

    public static Question<Boolean> deleteMaxiChance =
         actor -> (Target.the("disabled button")
                .locatedBy("//button[contains(@aria-disabled, 'true')]")
                .resolveFor(actor)
                .isEnabled());
    }

