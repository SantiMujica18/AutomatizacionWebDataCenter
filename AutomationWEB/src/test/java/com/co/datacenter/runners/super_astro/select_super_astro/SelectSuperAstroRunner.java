package com.co.datacenter.runners.super_astro.select_super_astro;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/super_astro/select_super_astro.feature",
        glue = "com.co.datacenter.stepsdefinitions.super_astro.select_super_astro",
        tags = "@SelectSuperAstroSuccessful",
        snippets = SnippetType.CAMELCASE
)
public class SelectSuperAstroRunner {


}
