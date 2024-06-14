package com.co.datacenter.questions.recharge.validation_of_empty_data_recharge;


import com.co.datacenter.userinterfaces.recarga.validation_of_empty_data_recharge.DataRechargeEmptyInterface;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class DataRechargeEmptyQuestion {

    public static Question<String> emptyData() {
        return actor -> TextContent.of(DataRechargeEmptyInterface.TITLE_ALERT).viewedBy(actor).asString();
    }
}
