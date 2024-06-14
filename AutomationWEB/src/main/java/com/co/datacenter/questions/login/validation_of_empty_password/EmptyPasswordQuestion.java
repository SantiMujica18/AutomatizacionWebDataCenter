package com.co.datacenter.questions.login.validation_of_empty_password;

import com.co.datacenter.userinterfaces.login.validation_of_empty_password.EmptyPasswordInterface;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class EmptyPasswordQuestion {
    public static Question<String> emptyPassword() {
        return actor -> TextContent.of(EmptyPasswordInterface.TITLE_ALERT).viewedBy(actor).asString();
    }
}
