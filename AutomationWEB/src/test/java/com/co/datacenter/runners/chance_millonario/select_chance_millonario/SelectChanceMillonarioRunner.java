package com.co.datacenter.runners.chance_millonario.select_chance_millonario;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/chance_millonario/select_chance_millonario.feature",
        glue = "com.co.datacenter.stepsdefinitions.chance_millonario.select_chance_millonario",
        tags = "@SelectChanceMillonarioSuccessful",
        snippets = SnippetType.CAMELCASE
)
public class SelectChanceMillonarioRunner {


}
