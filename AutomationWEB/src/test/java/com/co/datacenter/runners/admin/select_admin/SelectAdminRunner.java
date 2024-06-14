package com.co.datacenter.runners.admin.select_admin;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(

        features = "src/test/resources/features/select_admin",
        glue = "com.co.datacenter.stepsdefinitions.select_admin",
        tags = "@SelectAdministration",
        snippets = SnippetType.CAMELCASE
)
public class SelectAdminRunner {
}
