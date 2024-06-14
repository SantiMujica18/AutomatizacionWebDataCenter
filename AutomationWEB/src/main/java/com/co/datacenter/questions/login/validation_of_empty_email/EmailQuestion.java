package com.co.datacenter.questions.login.validation_of_empty_email;

import com.co.datacenter.userinterfaces.login.validation_of_empty_email.EmailInterface;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class EmailQuestion {

    public static Question<String> emptyEmail() {
        return actor -> TextContent.of(EmailInterface.TITLE_ALERT).viewedBy(actor).asString();
    }
}
