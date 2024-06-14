package com.co.datacenter.questions.super_astro.select_super_astro;

import com.co.datacenter.userinterfaces.super_astro.select_super_astro.SelectSuperAstroInterface;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class SelectSuperAstroQuestion {

    public static Question<String> selectSuperAstro(){
        return actor -> TextContent.of(SelectSuperAstroInterface.TITLE_WELCOME).viewedBy(actor).asString();
    }
}
