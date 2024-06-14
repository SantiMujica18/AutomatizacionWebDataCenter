package com.co.datacenter.questions.maxi_chance.bet_four_figures_maxi_chance;

import com.co.datacenter.userinterfaces.maxi_chance.data_maxi_chance.DataMaxiChanceInterface;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class BetFourFiguresMaxiChanceQuestion {

    public static Question<String> betFourFigure(){
        return actor -> TextContent.of(DataMaxiChanceInterface.TITLE_VALIDATION).viewedBy(actor).asString();
    }
}
