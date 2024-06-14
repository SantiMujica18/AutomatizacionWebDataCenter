package com.co.datacenter.questions.recharge.select_operator;

import com.co.datacenter.userinterfaces.recarga.select_operator.SelectOperatorInterface;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class SelectOperatorQuestion {

    public static Question<String> selectOpera() {
        return actor -> TextContent.of(SelectOperatorInterface.WELCOME_OPERATOR).viewedBy(actor).asString();
    }
}
