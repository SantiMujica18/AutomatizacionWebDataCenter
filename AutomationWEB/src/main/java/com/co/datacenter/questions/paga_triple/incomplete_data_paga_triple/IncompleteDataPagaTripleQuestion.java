package com.co.datacenter.questions.paga_triple.incomplete_data_paga_triple;

import com.co.datacenter.userinterfaces.betPagaTripleinterfaces.DataOnePageInterface;
import com.co.datacenter.userinterfaces.paga_triple.confirm_paga_triple.ConfirmPagaTripleInterface;
import com.co.datacenter.userinterfaces.paga_triple.incomplete_data_paga_triple.IncompleteNumberPagaTripleInterface;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class IncompleteDataPagaTripleQuestion {

    public static Question<String> IncompleteDataPagaTriple() {
        return actor -> TextContent.of(IncompleteNumberPagaTripleInterface.QUESTION_MISSING_NUMBER).viewedBy(actor).asString();

    }
}
