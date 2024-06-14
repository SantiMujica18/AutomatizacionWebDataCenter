package com.co.datacenter.runners.admin.login_admin;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(

        features = "src/test/resources/features/login_admin",
        glue = "com.co.datacenter.stepsdefinitions.login_admin",
        tags = "@LoginAdminSuccessful",
        snippets = SnippetType.CAMELCASE
)
public class LoginAdminRunner {
}
