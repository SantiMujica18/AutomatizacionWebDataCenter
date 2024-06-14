package com.co.datacenter.questions.paga_millonario.confirm_buy_paga_millonario;

import com.co.datacenter.userinterfaces.chance_millonario.confirm_chance_millonario.ConfirmChanceMillonarioInterface;
import com.co.datacenter.userinterfaces.paga_millonario.confirm_paga_millonario.ConfirmPagaMillonarioInterface;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class ConfirmPagaMillonarioQuestion {

    public static Question<String> confirmPagaMillonario() {
        return actor -> TextContent.of(ConfirmPagaMillonarioInterface.TITLE_VALIDATION).viewedBy(actor).asString();
    }
}
