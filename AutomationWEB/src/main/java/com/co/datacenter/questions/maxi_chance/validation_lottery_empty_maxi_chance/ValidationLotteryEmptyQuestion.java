package com.co.datacenter.questions.maxi_chance.validation_lottery_empty_maxi_chance;

import com.co.datacenter.userinterfaces.maxi_chance.data_maxi_chance.DataMaxiChanceInterface;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class ValidationLotteryEmptyQuestion {

    public static Question<String> lotteryEmpty(){
        return actor -> TextContent.of(DataMaxiChanceInterface.VALIDATION_TITLE_DAY_LOTTERIES).viewedBy(actor).asString();
    }
}
