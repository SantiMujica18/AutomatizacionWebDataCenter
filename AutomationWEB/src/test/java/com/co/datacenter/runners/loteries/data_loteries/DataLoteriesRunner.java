package com.co.datacenter.runners.loteries.data_loteries;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/loteries/data_loteries.feature",
        glue = "com.co.datacenter.stepsdefinitions.loteries.data_loteries",
        tags = "@DataLoteriesSuccessful",
        snippets = SnippetType.CAMELCASE
)
public class DataLoteriesRunner {


}
