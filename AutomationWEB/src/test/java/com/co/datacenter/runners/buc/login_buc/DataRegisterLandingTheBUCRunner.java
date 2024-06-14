package com.co.datacenter.runners.buc.login_buc;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(

        features = "src/test/resources/features/buc/loginbuc/login_buc.feature",
        glue = "com.co.datacenter.stepsdefinitions.buc.login_buc",
        tags = "@RegisterUserData",
        snippets = SnippetType.CAMELCASE
)
public class DataRegisterLandingTheBUCRunner {
}