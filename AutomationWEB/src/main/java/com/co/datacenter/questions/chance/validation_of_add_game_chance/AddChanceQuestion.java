package com.co.datacenter.questions.chance.validation_of_add_game_chance;

import com.co.datacenter.userinterfaces.chance_tradicional.validation_of_add_game_chance.AddChanceInterface;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class AddChanceQuestion {

    public static Question<String> addChance() {
        return actor -> TextContent.of(AddChanceInterface.ALERT_ADD_GAME).viewedBy(actor).asString();
    }
}
