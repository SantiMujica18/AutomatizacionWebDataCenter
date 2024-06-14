package com.co.datacenter.questions.pines.data_pines;

import com.co.datacenter.userinterfaces.pines.data_pines.DataPaymentPinesInterface;
import com.co.datacenter.userinterfaces.pines.select_pines.SelectPinesInterface;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class DataPinesQuestion {

    public static Question<String> paymentSuccessful() {
        return actor -> TextContent.of(DataPaymentPinesInterface.SUCCESSFUL_TRANSACTION).viewedBy(actor).asString();
    }
}
