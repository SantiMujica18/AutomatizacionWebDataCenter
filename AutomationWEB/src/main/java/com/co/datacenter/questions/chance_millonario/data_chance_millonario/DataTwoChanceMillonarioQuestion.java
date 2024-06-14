package com.co.datacenter.questions.chance_millonario.data_chance_millonario;

import com.co.datacenter.userinterfaces.chance_millonario.data_chance_millonario.DataOnePageChanceMillonarioInterface;
import com.co.datacenter.userinterfaces.chance_millonario.data_chance_millonario.DataTwoPageChanceMillonarioInterface;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class DataTwoChanceMillonarioQuestion {

    public static Question<String> dataTwoChanceMillonario() {
        return actor -> TextContent.of(DataTwoPageChanceMillonarioInterface.WELCOME_TITLE).viewedBy(actor).asString();
    }
}
