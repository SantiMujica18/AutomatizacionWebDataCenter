package com.co.datacenter.questions.loteries.data_loteries;

import com.co.datacenter.userinterfaces.loteries.data_loteries.ThreePageInterface;
import com.co.datacenter.userinterfaces.loteries.select_loteries.SelectLoteriesInterface;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class DataThreePageQuestion {

    public static Question<String> dataThreePage() {
        return actor -> TextContent.of(ThreePageInterface.TITLE_CONFIRMATION_BUY).viewedBy(actor).asString();
    }
}