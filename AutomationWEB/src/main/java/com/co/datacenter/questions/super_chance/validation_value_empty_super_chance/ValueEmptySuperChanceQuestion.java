package com.co.datacenter.questions.super_chance.validation_value_empty_super_chance;

import com.co.datacenter.userinterfaces.super_chance.add_max_super_chance.AddMaxSuperChanceInterface;
import com.co.datacenter.userinterfaces.super_chance.validation_field_value_empty_super_chance.ValueEmptySuperChanceInterface;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class ValueEmptySuperChanceQuestion {

    public static Question<String>valueEmptySuperChance(){
        return actor -> TextContent.of(ValueEmptySuperChanceInterface.TITLE_VALIDATION).viewedBy(actor).asString();
    }
}
