package com.co.datacenter.questions.super_astro.validation_min_value;

import com.co.datacenter.userinterfaces.super_astro.send_super_astro.ConfirmBuySuperAstroInterface;
import com.co.datacenter.userinterfaces.super_astro.send_super_astro.SendSuperAstroOneInterface;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class ValidationMinValueQuestion {

    public static Question<String> validationMinValue(){
        return actor -> TextContent.of(SendSuperAstroOneInterface.ALERT_VALUE_MIN).viewedBy(actor).asString();
    }
}
