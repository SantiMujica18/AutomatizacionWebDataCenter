package com.co.datacenter.questions.betplay;

import com.co.datacenter.userinterfaces.betplay.BetplayDataInterface;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class ValidationServiceQuestion {
    public static Question<String> ValidationService(){
        return actor -> TextContent.of(BetplayDataInterface.BUTTON_ALERT_SERVICE).viewedBy(actor).asString();
    }
}
