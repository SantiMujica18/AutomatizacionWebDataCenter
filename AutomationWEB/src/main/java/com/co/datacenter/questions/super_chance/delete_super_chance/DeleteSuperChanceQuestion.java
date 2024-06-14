package com.co.datacenter.questions.super_chance.delete_super_chance;


import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class DeleteSuperChanceQuestion {

    public static Question<Boolean> deleteSuperChance =
         actor -> (Target.the("disabled button")
                .locatedBy("//button[contains(@aria-disabled, 'true')]")
                .resolveFor(actor)
                .isEnabled());
    }

