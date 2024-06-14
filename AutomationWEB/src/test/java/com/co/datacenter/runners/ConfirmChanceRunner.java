package com.co.datacenter.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/chance/confirm_buy_chance.feature",
        glue = "com.co.datacenter.stepsdefinitions.chance.confirm_buy_chance",
        tags = "@ConfirmChanceSuccessful",
        snippets = SnippetType.CAMELCASE
)
public class ConfirmChanceRunner {
}
