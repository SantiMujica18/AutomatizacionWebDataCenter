package com.co.datacenter.questions.chance.bet_four_figure_chance_spd;

import com.co.datacenter.userinterfaces.chance_tradicional.bet_four_figure_chance_spd.BetFourFigureChanceSpdInterface;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class BetFourFigureChanceSpdQuestion {

    public static Question<String>betFourFigureChance(){
        return actor -> TextContent.of(BetFourFigureChanceSpdInterface.SUCCESSFUL_PAY).viewedBy(actor).asString();
    }
}
