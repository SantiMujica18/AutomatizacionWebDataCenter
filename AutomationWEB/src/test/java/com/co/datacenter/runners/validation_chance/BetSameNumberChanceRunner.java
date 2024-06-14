package com.co.datacenter.runners.validation_chance;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/validation_bet_same_number_chance.feature",
        glue = "com.co.datacenter.stepsdefinitions.chance.validation_bet_same_number_chance.BetSameNumberChanceDefinition",
        tags = "@BetSameNumberChanceSuccessful",
        snippets = SnippetType.CAMELCASE
)
public class BetSameNumberChanceRunner {


}
