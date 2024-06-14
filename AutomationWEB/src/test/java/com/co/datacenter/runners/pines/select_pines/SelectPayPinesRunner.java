package com.co.datacenter.runners.pines.select_pines;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/pines/select_pines.feature",
        glue = "com.co.datacenter.stepsdefinitions.pines.select_pines",
        tags = "@SelectPinesSuccessful",
        snippets = SnippetType.CAMELCASE
)
public class SelectPayPinesRunner {
}
