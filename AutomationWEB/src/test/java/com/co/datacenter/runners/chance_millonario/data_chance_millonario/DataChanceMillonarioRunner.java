package com.co.datacenter.runners.chance_millonario.data_chance_millonario;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/chance_millonario/data_chance_millonario.feature",
        glue = "com.co.datacenter.stepsdefinitions.chance_millonario.data_chance_millonario",
        tags = "@DataChanceMillonarioSuccessful",
        snippets = SnippetType.CAMELCASE
)
public class DataChanceMillonarioRunner {

}
