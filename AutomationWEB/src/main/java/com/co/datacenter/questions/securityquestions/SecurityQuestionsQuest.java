package com.co.datacenter.questions.securityquestions;


import com.co.datacenter.userinterfaces.login.security_questions_userinterfaces.SecurityQuestionsUserinterface;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class SecurityQuestionsQuest {

    public static Question<String> SecurityQuestions() {

        return actor -> TextContent.of(SecurityQuestionsUserinterface.FINDOURSERVICESHERE).viewedBy(actor).asString();

    }
}
