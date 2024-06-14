package com.co.datacenter.runners.cupones;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/cupones/select_cupones.feature",
        glue = "com.co.datacenter.stepsdefinitions.cupones",
        tags = "@SelectCuponesSuccessfully",
        snippets = SnippetType.CAMELCASE
)
public class SelectCuponesRunner {
}
