package com.co.datacenter.runners.Chance_millonario_runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)

@CucumberOptions(
        features = "src/test/resources/features/chance_millonario/confirm_buy_chance_millonario.feature",
        glue = "com.co.datacenter.stepsdefinitions.chance_millonario.confirm_chance_millonario",
        tags = "@ConfirmChanceMillonarioSuccessful",
        snippets = SnippetType.CAMELCASE
)
public class ConfimChanceMillonarioRunner {

}
