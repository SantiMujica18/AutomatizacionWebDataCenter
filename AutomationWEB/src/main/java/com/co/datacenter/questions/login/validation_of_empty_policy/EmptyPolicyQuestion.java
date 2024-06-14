package com.co.datacenter.questions.login.validation_of_empty_policy;

import com.co.datacenter.userinterfaces.login.validation_of_empty_policy.EmptyPolicyInterface;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class EmptyPolicyQuestion {
    public static Question<String> emptyPolicy() {
        return actor -> TextContent.of(EmptyPolicyInterface.TITLE_ALERT).viewedBy(actor).asString();
    }
}
