package com.co.datacenter.runners.validation_chance;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/chance/validation_of_min_value_chance.feature",
        glue = "com.co.datacenter.stepsdefinitions.chance.validation_of_min_value",
        tags = "@MinValueChanceSuccessful",
        snippets = SnippetType.CAMELCASE
)
public class MinValueChanceRunner {


}
