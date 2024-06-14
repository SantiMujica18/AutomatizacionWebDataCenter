package com.co.datacenter.questions.recharge_app;

import com.co.datacenter.userinterfaces.recarga.confirm_recharge.ConfirmRechargeInterface;
import com.co.datacenter.userinterfaces.recargas_app.RechargeAppInterface;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class ConfirmRechargeAppQuestion {
    public static Question<String> confirmRecharge(){
        return actor -> TextContent.of(RechargeAppInterface.QUESTION_PIN_GENERADO).viewedBy(actor).asString();
    }
}
