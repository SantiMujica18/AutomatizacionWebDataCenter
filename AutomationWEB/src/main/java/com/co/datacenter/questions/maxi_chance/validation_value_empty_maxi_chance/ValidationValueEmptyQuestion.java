package com.co.datacenter.questions.maxi_chance.validation_value_empty_maxi_chance;

import com.co.datacenter.userinterfaces.maxi_chance.data_maxi_chance.DataMaxiChanceInterface;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class ValidationValueEmptyQuestion {

    public static Question<String> valueEmpty(){
        return actor -> TextContent.of(DataMaxiChanceInterface.VALIDATION_TITLE_VALUE_EMPTY).viewedBy(actor).asString();
    }
}
