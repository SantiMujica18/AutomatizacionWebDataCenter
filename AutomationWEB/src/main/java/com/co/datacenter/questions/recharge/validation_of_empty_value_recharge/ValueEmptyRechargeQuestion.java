package com.co.datacenter.questions.recharge.validation_of_empty_value_recharge;

import com.co.datacenter.userinterfaces.login.validation_of_empty_value.ValueEmptyRechargeInterface;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class ValueEmptyRechargeQuestion {
    public static Question<String> emptyValue() {
        return actor -> TextContent.of(ValueEmptyRechargeInterface.TITLE_ALERT).viewedBy(actor).asString();
    }
}
