package com.co.datacenter.questions.pines.select_pines;

import com.co.datacenter.userinterfaces.loteries.select_loteries.SelectLoteriesInterface;
import com.co.datacenter.userinterfaces.pines.select_pines.SelectPinesInterface;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class SelectPinesQuestion {

    public static Question<String> selectPines() {
        return actor -> TextContent.of(SelectPinesInterface.WELCOME_PINES).viewedBy(actor).asString();
    }
}
