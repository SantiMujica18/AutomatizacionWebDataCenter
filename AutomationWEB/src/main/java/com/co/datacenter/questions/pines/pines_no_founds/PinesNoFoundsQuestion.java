package com.co.datacenter.questions.pines.pines_no_founds;

import com.co.datacenter.userinterfaces.pines.data_pines.DataPaymentPinesInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class PinesNoFoundsQuestion {
    public static Question<String> unsuccesfulpurchase(){
        return actor -> TextContent.of(DataPaymentPinesInterface.UNSUCCESFUL_TRANSACTION).viewedBy(actor).asString();
    }
}
