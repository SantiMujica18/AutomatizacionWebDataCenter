package com.co.datacenter.runners.chance_millonario.clean_chance_millonario;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/chance_millonario/clean_bet_maxi_chance.feature",
        glue = "com.co.datacenter.stepsdefinitions.chance_millonario.clean_bet_chance_millonario",
        tags = "@CleanChanceMillonarioSuccessful",
        snippets = SnippetType.CAMELCASE
)
public class CleanChanceMillonarioRunner {
}
