package com.co.datacenter.questions.paga_triple.selec_paga_triple;

import com.co.datacenter.userinterfaces.paga_triple.select_paga_triple.SelectPagaTripleInterface;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;
public class SelectPagaTripleQuestion {

    public static Question<String> SelectPagaTriple() {
        return actor -> TextContent.of(SelectPagaTripleInterface.WELCOME_PAGA_TRIPLE).viewedBy(actor).asString();
    }
}
