package com.co.datacenter.questions.super_chance.add_max_super_chance;

import com.co.datacenter.userinterfaces.super_chance.add_max_super_chance.AddMaxSuperChanceInterface;
import com.co.datacenter.userinterfaces.super_chance.validation_min_value_super_chance.MinValueSuperChanceInterface;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class AddMaxSuperChanceQuestion {

    public static Question<String>addMaxSuperChance(){
        return actor -> TextContent.of(AddMaxSuperChanceInterface.TITLE_WELCOME).viewedBy(actor).asString();
    }
}
