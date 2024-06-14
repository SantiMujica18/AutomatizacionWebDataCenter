package com.co.datacenter.questions.chance.validation_of_max_value_chance;

import com.co.datacenter.userinterfaces.chance_tradicional.validation_of_max_value_chance.MaxValueChanceInterface;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class MaxValueChanceQuestion {

    public static Question<String> maxValueChance() {
        return actor -> TextContent.of(MaxValueChanceInterface.ALERT_TITLE).viewedBy(actor).asString();
    }
}
