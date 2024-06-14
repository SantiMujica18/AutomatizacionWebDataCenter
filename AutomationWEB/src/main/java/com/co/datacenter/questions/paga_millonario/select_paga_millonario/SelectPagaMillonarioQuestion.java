package com.co.datacenter.questions.paga_millonario.select_paga_millonario;

import com.co.datacenter.userinterfaces.paga_millonario.select_paga_millonario.SelectPagoMillonarioInterface;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class SelectPagaMillonarioQuestion {

    public static Question<String> selectPagaMillonario(){
        return actor -> TextContent.of(SelectPagoMillonarioInterface.WELCOME_PAGA_MILLONARIO).viewedBy(actor).asString();
    }
}
