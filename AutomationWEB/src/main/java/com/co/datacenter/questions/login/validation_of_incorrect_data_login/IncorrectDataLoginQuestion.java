package com.co.datacenter.questions.login.validation_of_incorrect_data_login;

import com.co.datacenter.userinterfaces.login.validation_of_incorrect_data_login.IncorrectDataLoginInterface;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class IncorrectDataLoginQuestion {
    public static Question<String> incorrectData() {
        return actor -> TextContent.of(IncorrectDataLoginInterface.TITLE_ALERT).viewedBy(actor).asString();
    }
}
