package com.co.datacenter.runners.validation_login;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/validation_of_empty_briefcase.feature",
        glue = "com.co.datacenter.stepsdefinitions.validation_of_empty_briefcase",
        tags = "@LoginUserBriefCaseEmpty",
        snippets = SnippetType.CAMELCASE
)
public class BriefCaseRunner {


}
