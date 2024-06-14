package com.co.datacenter.runners.paga_encime.data_paga_encime;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/paga_encime/data_paga_encime.feature",
        glue = "com.co.datacenter.stepsdefinitions.paga_encime.data_paga_encime",
        tags = "@DataPagaEncimeSuccessful",
        snippets = SnippetType.CAMELCASE
)
public class DataPagaEncimeRunner {


}
