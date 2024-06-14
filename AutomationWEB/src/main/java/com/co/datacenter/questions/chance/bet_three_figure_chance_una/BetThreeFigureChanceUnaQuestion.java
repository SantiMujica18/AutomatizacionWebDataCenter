package com.co.datacenter.questions.chance.bet_three_figure_chance_una;

import com.co.datacenter.userinterfaces.chance_tradicional.bet_three_figures_chance_una.BetThreeFigureChanceUnaInterface;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class BetThreeFigureChanceUnaQuestion {

    public static Question<String>betThreeFigureUnaChance(){
        return actor -> TextContent.of(BetThreeFigureChanceUnaInterface.SUCCESSFUL_PAY).viewedBy(actor).asString();
    }
}
