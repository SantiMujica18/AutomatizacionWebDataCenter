package com.co.datacenter.runners.super_chance;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/super_chance/select_super_chance.feature",
        glue = "com.co.datacenter.stepsdefinitions.super_chance.select_super_chance",
        tags = "@SelectSuperChanceSuccessful",
        snippets = SnippetType.CAMELCASE
)
public class SelectSuperChanceRunner {


}
