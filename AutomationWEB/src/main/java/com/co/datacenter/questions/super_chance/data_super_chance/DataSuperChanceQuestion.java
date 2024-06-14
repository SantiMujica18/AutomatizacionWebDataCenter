package com.co.datacenter.questions.super_chance.data_super_chance;

import com.co.datacenter.userinterfaces.super_chance.data_super_chance.DataSuperChanceInterface;
import com.co.datacenter.userinterfaces.super_chance.select_super_chance.SelectSuperChanceInterface;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class DataSuperChanceQuestion {

    public static Question<String> dataSuperChance() {
        return actor -> TextContent.of(DataSuperChanceInterface.TITLE_WELCOME).viewedBy(actor).asString();
    }
}
