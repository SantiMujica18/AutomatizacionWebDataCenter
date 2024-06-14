package com.co.datacenter.questions.chance.validation_bet_same_number_chance;


import com.co.datacenter.userinterfaces.chance_tradicional.validation_bet_same_number_chance.BetSameNumberInterface;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class BetSameNumberChanceQuestion {
    public static Question<String> sameNumberChance() {
        return actor -> TextContent.of(BetSameNumberInterface.ALERT_TITLE).viewedBy(actor).asString();

    }
}


