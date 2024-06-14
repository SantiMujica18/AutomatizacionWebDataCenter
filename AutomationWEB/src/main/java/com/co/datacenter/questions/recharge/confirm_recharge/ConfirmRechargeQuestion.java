package com.co.datacenter.questions.recharge.confirm_recharge;

import com.co.datacenter.userinterfaces.recarga.confirm_recharge.ConfirmRechargeInterface;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class ConfirmRechargeQuestion {

    public static Question<String>confirmRecharge(){
        return actor -> TextContent.of(ConfirmRechargeInterface.TITLE_SUCCESSFUL_PAY).viewedBy(actor).asString();
    }
}
