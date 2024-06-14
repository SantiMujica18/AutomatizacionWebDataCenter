package com.co.datacenter.runners.validation_login;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/validation_of_empty_terms.feature",
        glue = "com.co.datacenter.stepsdefinitions.validation_of_empty_terms",
        tags = "@LoginUserTermsEmpty",
        snippets = SnippetType.CAMELCASE
)
public class EmptyTermsRunner {


}
