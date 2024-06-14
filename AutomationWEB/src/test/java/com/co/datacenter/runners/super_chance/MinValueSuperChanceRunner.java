package com.co.datacenter.runners.super_chance;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/super_chance/validation_of_min_value_super_chance.feature",
        glue = "com.co.datacenter.stepsdefinitions.super_chance.validation_min_value_super_chance",
        tags = "@MinValueSuperChanceSuccessful",
        snippets = SnippetType.CAMELCASE
)
public class MinValueSuperChanceRunner {


}
