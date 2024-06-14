package com.co.datacenter.questions.chance.data_chance;

import com.co.datacenter.userinterfaces.chance_tradicional.date_chance.DataChanceInterface;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class DataChanceQuestion {

    public static Question<String> dataChance() {
        return actor -> TextContent.of(DataChanceInterface.CONFIRM_BUY).viewedBy(actor).asString();
    }
}
