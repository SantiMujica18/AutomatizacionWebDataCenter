package com.co.datacenter.questions.recharge.select_recharge;

import com.co.datacenter.userinterfaces.recarga.select_recharge.SelectRechargeInterface;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class SelectRechargeQuestion {

    public static Question<String> selectRecharge() {
        return actor -> TextContent.of(SelectRechargeInterface.WELCOME_RECHARGE).viewedBy(actor).asString();
    }
}
