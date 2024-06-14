package com.co.datacenter.questions.super_chance.validation_min_value_super_chance;

import com.co.datacenter.userinterfaces.super_chance.validation_min_value_super_chance.MinValueSuperChanceInterface;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class MinValueSuperChanceQuestion {

    public static Question<String>minValueSuperChance(){
        return actor -> TextContent.of(MinValueSuperChanceInterface.TITLE_WELCOME).viewedBy(actor).asString();
    }
}
