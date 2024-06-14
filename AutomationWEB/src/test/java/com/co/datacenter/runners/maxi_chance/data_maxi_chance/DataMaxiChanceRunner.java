package com.co.datacenter.runners.maxi_chance.data_maxi_chance;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/maxi_chance/data_maxi_chance.feature",
        glue = "com.co.datacenter.stepsdefinitions.maxi_chance.data_maxi_chance",
        tags = "@DataMaxiChanceSuccessful",
        snippets = SnippetType.CAMELCASE
)
public class DataMaxiChanceRunner {


}
