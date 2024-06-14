package com.co.datacenter.questions.paga_millonario.data_paga_millonario;

import com.co.datacenter.userinterfaces.paga_millonario.data_paga_millonario.DataTwoPagaInterface;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class DataTwoPagaMillonarioQuestion {

    public static Question<String> dataPagesPagaMillonario(){
        return actor -> TextContent.of(DataTwoPagaInterface.TITLE_VALIDATION).viewedBy(actor).asString();
    }
}
