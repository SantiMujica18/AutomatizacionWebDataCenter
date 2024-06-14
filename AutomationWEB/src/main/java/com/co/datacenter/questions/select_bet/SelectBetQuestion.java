package com.co.datacenter.questions.select_bet;

import com.co.datacenter.userinterfaces.select_bets.SelectBetsInterface;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class SelectBetQuestion {

    public static Question<String> selectBut() {
        return actor -> TextContent.of(SelectBetsInterface.WELCOME_BET).viewedBy(actor).asString();
    }
}
