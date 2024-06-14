package com.co.datacenter.questions.maxi_chance.data_maxi_chance;

import com.co.datacenter.userinterfaces.maxi_chance.data_maxi_chance.DataMaxiChanceInterface;
import com.co.datacenter.userinterfaces.maxi_chance.select_maxi_chance.SelectMaxiChanceInterface;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class DataMaxiChanceQuestion {

    public static Question<String> dataMaxiChance(){
        return actor -> TextContent.of(DataMaxiChanceInterface.TITLE_VALIDATION).viewedBy(actor).asString();
    }
}
