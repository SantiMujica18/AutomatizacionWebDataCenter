package com.co.datacenter.runners.loteries.select_loteries;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/loteries/select_loteries.feature",
        glue = "com.co.datacenter.stepsdefinitions.loteries.select_loteries",
        tags = "@SelectLoteriesSuccessful",
        snippets = SnippetType.CAMELCASE
)
public class SelectLoteriesRunner {


}
