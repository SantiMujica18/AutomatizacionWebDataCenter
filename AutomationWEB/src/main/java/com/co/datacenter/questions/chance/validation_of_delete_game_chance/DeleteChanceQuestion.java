package com.co.datacenter.questions.chance.validation_of_delete_game_chance;


import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class DeleteChanceQuestion {

    public static Question<Boolean> deleteChance =
         actor -> (Target.the("disabled button")
                .locatedBy("//button[contains(@aria-disabled, 'true')]")
                .resolveFor(actor)
                .isEnabled());
    }

