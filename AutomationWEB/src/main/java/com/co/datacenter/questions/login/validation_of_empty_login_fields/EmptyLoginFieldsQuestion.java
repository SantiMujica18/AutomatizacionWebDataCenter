package com.co.datacenter.questions.login.validation_of_empty_login_fields;

import com.co.datacenter.userinterfaces.login.validation_of_empty_login_fields.LoginEmptyFieldsInterface;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class EmptyLoginFieldsQuestion {

    public static Question<String> emptyLoginFields() {
        return actor -> TextContent.of(LoginEmptyFieldsInterface.TITLE_ALERT).viewedBy(actor).asString();
    }
}
