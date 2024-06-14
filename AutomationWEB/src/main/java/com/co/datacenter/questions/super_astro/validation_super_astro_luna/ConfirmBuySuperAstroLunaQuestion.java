package com.co.datacenter.questions.super_astro.validation_super_astro_luna;

import com.co.datacenter.userinterfaces.super_astro.send_super_astro.ConfirmBuySuperAstroInterface;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class ConfirmBuySuperAstroLunaQuestion {

    public static Question<String> confirmBuySuperAstroLuna(){
        return actor -> TextContent.of(ConfirmBuySuperAstroInterface.TITLE_ALERT_ASTRO_LUNA).viewedBy(actor).asString();
    }
}
