package com.co.datacenter.runners.admin.data_admin;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(

        features = "src/test/resources/features/data_admin",
        glue = "com.co.datacenter.stepsdefinitions.data_admin",
        tags = "@SuccessfulBalanceAdjustment",
        snippets = SnippetType.CAMELCASE
)
public class DataAdminRunner {
}
