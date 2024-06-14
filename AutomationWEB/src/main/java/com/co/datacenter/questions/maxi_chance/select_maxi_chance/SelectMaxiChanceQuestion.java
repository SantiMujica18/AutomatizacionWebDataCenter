package com.co.datacenter.questions.maxi_chance.select_maxi_chance;

import com.co.datacenter.userinterfaces.maxi_chance.select_maxi_chance.SelectMaxiChanceInterface;
import com.co.datacenter.userinterfaces.super_chance.select_super_chance.SelectSuperChanceInterface;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class SelectMaxiChanceQuestion {

    public static Question<String> selectMaxiChance() {
        return actor -> TextContent.of(SelectMaxiChanceInterface.WELCOME_MAXI_CHANCE).viewedBy(actor).asString();
    }
}
