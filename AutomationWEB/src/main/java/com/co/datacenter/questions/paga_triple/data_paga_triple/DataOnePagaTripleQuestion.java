package com.co.datacenter.questions.paga_triple.data_paga_triple;

import com.co.datacenter.userinterfaces.betPagaTripleinterfaces.DataOnePageInterface;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class DataOnePagaTripleQuestion {

    public static Question<String> DataOnePagaTriple() {
        return actor -> TextContent.of(DataOnePageInterface.CONFIRM_BUY).viewedBy(actor).asString();

    }
}
