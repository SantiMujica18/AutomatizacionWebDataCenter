package com.co.datacenter.questions.maxi_chance.validation_of_add_max_maxi_chance;

import com.co.datacenter.tasks.delay.Delay;
import com.co.datacenter.userinterfaces.maxi_chance.data_maxi_chance.DataMaxiChanceInterface;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class ValidationAddMaxQuestion {

    public static Question<String> addMaxNumbers(){
        Delay.ofMilliseconds(10000);
        return actor -> TextContent.of(DataMaxiChanceInterface.VALIDATION_TITLE_MAX_NUM).viewedBy(actor).asString();
    }
}
