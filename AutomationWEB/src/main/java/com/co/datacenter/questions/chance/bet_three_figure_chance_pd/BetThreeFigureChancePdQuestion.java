package com.co.datacenter.questions.chance.bet_three_figure_chance_pd;

import com.co.datacenter.userinterfaces.chance_tradicional.bet_three_figures_chance_pd.BetThreeFigureChancePdInterface;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class BetThreeFigureChancePdQuestion {

    public static Question<String>betThreeFigurePdChance(){
        return actor -> TextContent.of(BetThreeFigureChancePdInterface.SUCCESSFUL_PAY).viewedBy(actor).asString();
    }
}
