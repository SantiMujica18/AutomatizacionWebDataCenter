package com.co.datacenter.questions.chance.bet_three_figures_chance_pta;

import com.co.datacenter.userinterfaces.chance_tradicional.bet_three_figures_chance_pta.BetThreeFigureChancePtaInterface;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class BetThreeFigureChancePtaQuestion {

    public static Question<String>betThreeFigurePtaChance(){
        return actor -> TextContent.of(BetThreeFigureChancePtaInterface.SUCCESSFUL_PAY).viewedBy(actor).asString();
    }
}
