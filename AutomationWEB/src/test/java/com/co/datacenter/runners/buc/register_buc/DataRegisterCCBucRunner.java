package com.co.datacenter.runners.buc.register_buc;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(

        features = "src/test/resources/features/buc/registerbuc/register_cc_buc.feature",
        glue = "com.co.datacenter.stepsdefinitions.buc.register_buc",
        tags = "@Signupsuccessfullycc",
        snippets = SnippetType.CAMELCASE
)
public class DataRegisterCCBucRunner {
}
