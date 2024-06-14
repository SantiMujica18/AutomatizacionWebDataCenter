package com.co.datacenter.questions.chance_millonario.select_chance_millonario;

import com.co.datacenter.userinterfaces.chance_millonario.select_chance_millonario.SelectChanceMillonarioInterface;
import com.co.datacenter.userinterfaces.maxi_chance.select_maxi_chance.SelectMaxiChanceInterface;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class SelectChanceMillonarioQuestion {

    public static Question<String> selectChanceMillonario() {
        return actor -> TextContent.of(SelectChanceMillonarioInterface.WELCOME_CHANCE_MILLONARIO).viewedBy(actor).asString();
    }
}
