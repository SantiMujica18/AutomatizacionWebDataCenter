package com.co.datacenter.runners.admin.questionsecurity2;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(

        features = "src/test/resources/features/login/securityQuestion.feature",
        glue ="com.co.datacenter.stepsdefinitions.login.validationquestionsecurityandcomputerlog",
        tags = "@SecurityQuestions2",
        snippets = SnippetType.CAMELCASE
)
public class SecurityQuestionRunner2 {

}
