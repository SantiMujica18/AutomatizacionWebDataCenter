package com.co.datacenter.questions.paga_triple.confirm_paga_triple;


import com.co.datacenter.userinterfaces.betPagaTripleinterfaces.DataOnePageInterface;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class ConfirmPagaTripleQuestion {
    public static Question<String> confirmPagaTriple(){
        return actor -> TextContent.of(DataOnePageInterface.QUESTIONS).viewedBy(actor).asString();

    }


}