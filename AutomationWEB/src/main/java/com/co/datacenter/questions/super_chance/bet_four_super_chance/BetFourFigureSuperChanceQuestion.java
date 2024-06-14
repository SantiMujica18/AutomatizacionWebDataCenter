package com.co.datacenter.questions.super_chance.bet_four_super_chance;

import com.co.datacenter.userinterfaces.super_chance.bet_four_figures_super_chance.BetFourSuperChanceInterface;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class BetFourFigureSuperChanceQuestion {

    public static Question<String>betFourSuperChance(){
        return actor -> TextContent.of(BetFourSuperChanceInterface.TITLE_WELCOME).viewedBy(actor).asString();
    }
}
