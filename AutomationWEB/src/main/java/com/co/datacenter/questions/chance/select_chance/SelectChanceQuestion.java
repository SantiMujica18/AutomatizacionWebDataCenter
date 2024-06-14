package com.co.datacenter.questions.chance.select_chance;

import com.co.datacenter.userinterfaces.chance_tradicional.select_chance.SelectChanceInterface;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class SelectChanceQuestion {

    public static Question<String> selectChance() {
        return actor -> TextContent.of(SelectChanceInterface.WELCOME_CHANCE).viewedBy(actor).asString();
    }
}
