package com.co.datacenter.questions.paga_triple.paga_triple_no_credit;

import com.co.datacenter.userinterfaces.betPagaTripleinterfaces.DataOnePageInterface;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class PagaTripleNoFoundsQuestion {

    public static Question<String> PagaTripleNoFounds() {
        return actor -> TextContent.of(DataOnePageInterface.QUESTIONS2).viewedBy(actor).asString();
    }
}
