package com.co.datacenter.questions.super_astro.validation_empty_value_field;

import com.co.datacenter.userinterfaces.super_astro.send_super_astro.SendSuperAstroOneInterface;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class EmptyValueFieldQuestion {

    public static Question<String> validationEmptyValueField(){
        return actor -> TextContent.of(SendSuperAstroOneInterface.ALERT_VALIDATION_FIELD_VALUE).viewedBy(actor).asString();
    }
}
