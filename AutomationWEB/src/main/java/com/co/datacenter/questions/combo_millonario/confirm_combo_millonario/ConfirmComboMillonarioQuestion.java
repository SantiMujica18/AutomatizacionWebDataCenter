package com.co.datacenter.questions.combo_millonario.confirm_combo_millonario;

import com.co.datacenter.userinterfaces.combo_millonario.confirm_combo_millonario.ConfirmComboMillonarioInterface;
import com.co.datacenter.userinterfaces.paga_millonario.confirm_paga_millonario.ConfirmPagaMillonarioInterface;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class ConfirmComboMillonarioQuestion {

    public static Question<String> confirmComboMillonario() {
        return actor -> TextContent.of(ConfirmComboMillonarioInterface.TITLE_VALIDATION_BUY).viewedBy(actor).asString();
    }
}
