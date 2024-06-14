package com.co.datacenter.questions.maxi_chance.bet_the_same_number_maxi_chance;

import com.co.datacenter.userinterfaces.maxi_chance.data_maxi_chance.DataMaxiChanceInterface;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class BetSameNumberMaxiChanceQuestion {

    public static Question<String> betSameNumber(){
        return actor -> TextContent.of(DataMaxiChanceInterface.ALERT_NOT_TO_COMPLET).viewedBy(actor).asString();
    }
}
