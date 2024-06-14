package com.co.datacenter.questions.maxi_chance.validation_num_empty_maxi_chance;

import com.co.datacenter.userinterfaces.maxi_chance.data_maxi_chance.DataMaxiChanceInterface;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class ValidationNumEmptyQuestion {

    public static Question<String> numEmpty(){
        return actor -> TextContent.of(DataMaxiChanceInterface.VALIDATION_TITLE_SPECIFY_NUM).viewedBy(actor).asString();
    }
}
