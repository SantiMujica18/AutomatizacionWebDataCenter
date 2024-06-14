package com.co.datacenter.questions.loteries.confirm_loteries;

import com.co.datacenter.userinterfaces.chance_tradicional.confirm_buy_chance.ConfirmChanceInterface;
import com.co.datacenter.userinterfaces.loteries.confirm_loteries.ConfirmLoteriesInterface;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class ConfirmLoteriesQuestion {

    public static Question<String>confirmLottery(){
        return actor -> TextContent.of(ConfirmLoteriesInterface.TITLE_CONFIRM_BUY).viewedBy(actor).asString();
    }
}
