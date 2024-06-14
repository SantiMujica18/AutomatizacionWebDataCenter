package com.co.datacenter.questions.loteries.select_loteries;

import com.co.datacenter.userinterfaces.loteries.select_loteries.SelectLoteriesInterface;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class SelectLoteriesQuestion {

    public static Question<String> selectLoteries(){
        return actor -> TextContent.of(SelectLoteriesInterface.TITLE_VALIDATION).viewedBy(actor).asString();
    }
}
