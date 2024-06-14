package com.co.datacenter.runners.validation_chance;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/chance/select_chance.feature",
        glue = "com.co.datacenter.stepsdefinitions.chance.select_chance",
        tags = "@SelectChanceSuccessful",
        snippets = SnippetType.CAMELCASE
)
public class SelectChanceRunner {


}
