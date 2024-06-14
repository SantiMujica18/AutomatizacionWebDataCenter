package com.co.datacenter.questions.super_astro.send_super_astro_manual;

import com.co.datacenter.userinterfaces.super_astro.send_super_astro.SendSuperAstroTwoInterface;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class FillOutFormTwoSuperAstroSolQuestion {

    public static Question<String> fillOutFormTwo(){
        return actor -> TextContent.of(SendSuperAstroTwoInterface.TITLE_VALIDATION_TRUE).viewedBy(actor).asString();
    }
}
