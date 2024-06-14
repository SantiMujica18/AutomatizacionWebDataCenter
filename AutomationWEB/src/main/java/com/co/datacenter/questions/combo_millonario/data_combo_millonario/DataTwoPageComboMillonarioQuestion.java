package com.co.datacenter.questions.combo_millonario.data_combo_millonario;

import com.co.datacenter.userinterfaces.combo_millonario.data_combo_millonario.DataTwoPageComboMillonarioInterface;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class DataTwoPageComboMillonarioQuestion {

    public static Question<String> dataTwoPageComboMillonario(){
        return actor -> TextContent.of(DataTwoPageComboMillonarioInterface.TITLE_VALIDATION).viewedBy(actor).asString();
    }
}
