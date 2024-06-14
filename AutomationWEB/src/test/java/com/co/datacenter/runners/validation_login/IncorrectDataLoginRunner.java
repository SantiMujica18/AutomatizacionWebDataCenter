package com.co.datacenter.runners.validation_login;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/validation_of_incorrect_data_login.feature",
        glue = "com.co.datacenter.stepsdefinitions.validation_of_incorrect_data_login",
        tags = "@LoginUserIncorrectData",
        snippets = SnippetType.CAMELCASE
)
public class IncorrectDataLoginRunner {


}
