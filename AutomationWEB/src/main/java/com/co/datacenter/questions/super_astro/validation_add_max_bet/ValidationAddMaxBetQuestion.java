package com.co.datacenter.questions.super_astro.validation_add_max_bet;


import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class ValidationAddMaxBetQuestion {

    public static Question<Boolean> validationAddMaxBet =
         actor -> (Target.the("disabled button")
                .locatedBy("//button[contains(@aria-disabled, 'false')]")
                .resolveFor(actor)
                .isEnabled());
    }

