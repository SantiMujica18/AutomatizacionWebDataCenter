package com.co.datacenter.questions.chance.confirm_chance;

import com.co.datacenter.userinterfaces.chance_tradicional.confirm_buy_chance.ConfirmChanceInterface;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class ConfirmChanceQuestion {

    public static Question<String>confirmChance(){
        return actor -> TextContent.of(ConfirmChanceInterface.SUCCESSFUL_PAY).viewedBy(actor).asString();
    }
}
