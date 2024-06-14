package com.co.datacenter.questions.login.validation_of_empty_terms;

import com.co.datacenter.userinterfaces.login.validation_of_empty_terms.EmptyTermsInterface;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class EmptyTermsQuestion {

    public static Question<String> emptyTerms() {
        return actor -> TextContent.of(EmptyTermsInterface.TITLE_ALERT).viewedBy(actor).asString();
    }
}
