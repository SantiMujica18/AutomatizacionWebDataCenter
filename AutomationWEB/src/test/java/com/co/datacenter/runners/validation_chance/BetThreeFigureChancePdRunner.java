package com.co.datacenter.runners.validation_chance;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/chance/bet_three_figures_chance_pd.feature",
        glue = "com.co.datacenter.stepsdefinitions.chance.bet_three_figures_chance_pd",
        tags = "@BetThreeFigureChancePdSuccessful",
        snippets = SnippetType.CAMELCASE
)
public class BetThreeFigureChancePdRunner {


}
