package com.co.datacenter.runners.super_astro.validation_min_value;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/super_astro/validation_min_value.feature",
        glue = "com.co.datacenter.stepsdefinitions.super_astro.validation_min_value",
        tags = "@ValidationMinValueSuccessful",
        snippets = SnippetType.CAMELCASE
)
public class ValidationMinValueSuperAstroRunner {
}
