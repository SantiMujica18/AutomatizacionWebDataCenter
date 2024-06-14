package com.co.datacenter.runners.admin.data_second_admin;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(

        features = "src/test/resources/features/data_second_admin",
        glue = "com.co.datacenter.stepsdefinitions.data_second_admin",
        tags = "@SecondSuccessfulBalanceAdjustment",
        snippets = SnippetType.CAMELCASE
)
public class SecondDataAdminRunner {
}
