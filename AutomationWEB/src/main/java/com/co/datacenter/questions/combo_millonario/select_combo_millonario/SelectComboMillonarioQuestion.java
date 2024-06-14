package com.co.datacenter.questions.combo_millonario.select_combo_millonario;

import com.co.datacenter.userinterfaces.combo_millonario.select_combo_millonario.SelectComboMillonarioInterface;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class SelectComboMillonarioQuestion {

    public static Question<String> selectComboMillonario(){
        return actor -> TextContent.of(SelectComboMillonarioInterface.WELCOME_COMBO_MILLONARIO).viewedBy(actor).asString();
    }
}
