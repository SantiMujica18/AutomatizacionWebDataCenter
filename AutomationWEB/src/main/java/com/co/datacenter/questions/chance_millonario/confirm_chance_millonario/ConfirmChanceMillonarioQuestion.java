package com.co.datacenter.questions.chance_millonario.confirm_chance_millonario;

import com.co.datacenter.userinterfaces.chance_millonario.confirm_chance_millonario.ConfirmChanceMillonarioInterface;
import com.co.datacenter.userinterfaces.chance_millonario.data_chance_millonario.DataTwoPageChanceMillonarioInterface;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class ConfirmChanceMillonarioQuestion {

    public static Question<String> confimrChanceMillonario() {
        return actor -> TextContent.of(ConfirmChanceMillonarioInterface.TITLE_WELCOME).viewedBy(actor).asString();
    }
}
