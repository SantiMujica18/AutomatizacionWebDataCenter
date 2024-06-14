package com.co.datacenter.questions.super_chance.select_super_chance;

import com.co.datacenter.userinterfaces.chance_tradicional.select_chance.SelectChanceInterface;
import com.co.datacenter.userinterfaces.super_chance.select_super_chance.SelectSuperChanceInterface;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class SelectSuperChanceQuestion {

    public static Question<String> selectSuperChance() {
        return actor -> TextContent.of(SelectSuperChanceInterface.WELCOME_SUPER_CHANCE).viewedBy(actor).asString();
    }
}
