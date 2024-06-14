package com.co.datacenter.questions.pines.data_pines;

import com.co.datacenter.userinterfaces.betPagaTripleinterfaces.DataOnePageInterface;
import com.co.datacenter.userinterfaces.pines.data_pines.DataPaymentPinesInterface;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class SuccessfullyOrNotQuestion {
    public static Question<String> SuccesfullyValidation(){
        return actor -> TextContent.of(DataPaymentPinesInterface.QUESTION).viewedBy(actor).asString();

    }
}
