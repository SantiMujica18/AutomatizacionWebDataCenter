package com.co.datacenter.questions.login.validation_of_empty_briefcase;

import com.co.datacenter.userinterfaces.login.validation_of_empty_briefcase.BriefCaseInterface;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class BriefCaseQuestion {

    public static Question<String> emptyBrief() {
        return actor -> TextContent.of(BriefCaseInterface.TITLE_ALERT).viewedBy(actor).asString();
    }
}
