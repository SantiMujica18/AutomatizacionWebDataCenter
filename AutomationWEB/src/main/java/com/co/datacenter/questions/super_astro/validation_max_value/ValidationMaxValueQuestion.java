package com.co.datacenter.questions.super_astro.validation_max_value;

import com.co.datacenter.userinterfaces.super_astro.send_super_astro.SendSuperAstroOneInterface;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class ValidationMaxValueQuestion {

    public static Question<String> validationMaxValue(){
        return actor -> TextContent.of(SendSuperAstroOneInterface.ALERT_VALUE_MAX).viewedBy(actor).asString();
    }
}
