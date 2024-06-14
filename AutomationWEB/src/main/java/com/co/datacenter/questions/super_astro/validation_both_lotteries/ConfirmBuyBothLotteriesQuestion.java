package com.co.datacenter.questions.super_astro.validation_both_lotteries;

import com.co.datacenter.userinterfaces.super_astro.send_super_astro.ConfirmBuySuperAstroInterface;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class ConfirmBuyBothLotteriesQuestion {

    public static Question<String> confirmBuySuperAstroBothLotteries(){
        return actor -> TextContent.of(ConfirmBuySuperAstroInterface.TITLE_VALIDATION).viewedBy(actor).asString();
    }
}
