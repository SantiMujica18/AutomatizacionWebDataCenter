package com.co.datacenter.questions.chance.bet_three_figures_chance_pc;

import com.co.datacenter.userinterfaces.chance_tradicional.bet_three_figures_chance_pc.BetThreeFigureChancePcInterface;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class BetThreeFigureChancePcQuestion {

    public static Question<String>betThreeFigurePcChance(){
        return actor -> TextContent.of(BetThreeFigureChancePcInterface.SUCCESSFUL_PAY).viewedBy(actor).asString();
    }
}
