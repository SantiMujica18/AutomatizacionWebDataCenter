package com.co.datacenter.questions.chance.bet_four_figure_chance_spc;

import com.co.datacenter.userinterfaces.chance_tradicional.bet_four_figures_chance_spc.BetFourFigureChanceSpcInterface;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class BetFourFigureChanceSpcQuestion {

    public static Question<String>betFourFigureChanceSpc(){
        return actor -> TextContent.of(BetFourFigureChanceSpcInterface.SUCCESSFUL_PAY).viewedBy(actor).asString();
    }

}
