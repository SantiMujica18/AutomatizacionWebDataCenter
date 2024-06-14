package com.co.datacenter.questions.maxi_chance.bet_three_figures_maxi_chance;

import com.co.datacenter.userinterfaces.maxi_chance.data_maxi_chance.DataMaxiChanceInterface;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class BetThreeFiguresMaxiChanceQuestion {

    public static Question<String> betThreeFigure(){
        return actor -> TextContent.of(DataMaxiChanceInterface.TITLE_VALIDATION).viewedBy(actor).asString();
    }
}
