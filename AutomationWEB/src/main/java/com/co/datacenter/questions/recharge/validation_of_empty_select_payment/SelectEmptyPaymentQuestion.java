package com.co.datacenter.questions.recharge.validation_of_empty_select_payment;


import com.co.datacenter.userinterfaces.login.validation_of_empty_select_payment.SelectEmptyPaymentInterface;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class SelectEmptyPaymentQuestion {
    public static Question<String> emptyMethod() {
        return actor -> TextContent.of(SelectEmptyPaymentInterface.TITLE_ALERT).viewedBy(actor).asString();
    }
}
