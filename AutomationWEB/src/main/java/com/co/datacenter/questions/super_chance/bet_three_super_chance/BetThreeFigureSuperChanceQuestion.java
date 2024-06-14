package com.co.datacenter.questions.super_chance.bet_three_super_chance;

import com.co.datacenter.userinterfaces.chance_tradicional.bet_three_figures_chance_pd.BetThreeFigureChancePdInterface;
import com.co.datacenter.userinterfaces.super_chance.bet_three_figures_super_chance.BetThreeSuperChanceInterface;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class BetThreeFigureSuperChanceQuestion {

    public static Question<String>betThreeSuperChance(){
        return actor -> TextContent.of(BetThreeSuperChanceInterface.TITLE_WELCOME).viewedBy(actor).asString();
    }
}
