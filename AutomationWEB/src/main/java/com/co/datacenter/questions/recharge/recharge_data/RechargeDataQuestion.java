package com.co.datacenter.questions.recharge.recharge_data;

import com.co.datacenter.userinterfaces.recarga.recharge_data.RechargeDataInterface;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class RechargeDataQuestion {
    public static Question<String> confirmRecharge() {
        return actor -> TextContent.of(RechargeDataInterface.TITLE_CONFIRM).viewedBy(actor).asString();
    }
}
