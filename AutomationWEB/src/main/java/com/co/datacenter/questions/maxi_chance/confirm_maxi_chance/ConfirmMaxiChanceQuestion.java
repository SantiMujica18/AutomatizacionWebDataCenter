package com.co.datacenter.questions.maxi_chance.confirm_maxi_chance;

import com.co.datacenter.userinterfaces.maxi_chance.confirm_maxi_chance.ConfirmMaxiChanceInterface;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class ConfirmMaxiChanceQuestion {

    public static Question<String > confirmMaxiChance(){
        return actor -> TextContent.of(ConfirmMaxiChanceInterface.TITLE_VALIDATION).viewedBy(actor).asString();
    }
}
