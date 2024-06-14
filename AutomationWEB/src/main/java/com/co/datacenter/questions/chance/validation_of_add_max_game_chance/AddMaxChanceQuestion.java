package com.co.datacenter.questions.chance.validation_of_add_max_game_chance;


import com.co.datacenter.userinterfaces.chance_tradicional.validation_of_add_max_game_chance.AddMaxChanceInterface;
import net.serenitybdd.screenplay.Question;

import net.serenitybdd.screenplay.questions.TextContent;

public class AddMaxChanceQuestion {
    public static Question<String> addMaxChance() {
        return actor -> TextContent.of(AddMaxChanceInterface.ALERT_MAX_COMPLETE).viewedBy(actor).asString();

    }
}


