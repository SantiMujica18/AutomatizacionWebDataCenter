package com.co.datacenter.runners.super_astro.validation_empty_value_field;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/super_astro/validation_empty_value_field.feature",
        glue = "com.co.datacenter.stepsdefinitions.super_astro.validation_empty_value_field",
        tags = "@ValidationEmptyValueSuccessful",
        snippets = SnippetType.CAMELCASE
)
public class ValidationFieldValueEmptySuperAstroRunner {
}
