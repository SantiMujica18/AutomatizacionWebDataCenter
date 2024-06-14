package com.co.datacenter.questions.super_astro.send_super_astro_manual;

import com.co.datacenter.userinterfaces.super_astro.send_super_astro.ConfirmBuySuperAstroInterface;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class ConfirmBuySuperAstroQuestion {

    public static Question<String> confirmBuySuperAstro(){
        return actor -> TextContent.of(ConfirmBuySuperAstroInterface.TITLE_VALIDATION).viewedBy(actor).asString();
    }
}
