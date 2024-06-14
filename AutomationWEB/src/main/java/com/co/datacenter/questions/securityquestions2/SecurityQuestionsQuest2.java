package com.co.datacenter.questions.securityquestions2;

import com.co.datacenter.userinterfaces.login.security_questions2_userinterfaces.SecurityQuestions2Userinterface;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class SecurityQuestionsQuest2 {
    public static Question<String>SecurityQuestions() {

        return actor -> TextContent.of(SecurityQuestions2Userinterface.FINDOURSERVICES).viewedBy(actor).asString();

    }

}
