package com.co.datacenter.questions.super_astro.send_super_astro_manual;

import com.co.datacenter.userinterfaces.super_astro.send_super_astro.SendSuperAstroOneInterface;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class FillOutFormOneSuperAstroSolQuestion {

    public static Question<String> fillOutFormOne(){
        return actor -> TextContent.of(SendSuperAstroOneInterface.VALIDATION_TITLE).viewedBy(actor).asString();
    }
}
