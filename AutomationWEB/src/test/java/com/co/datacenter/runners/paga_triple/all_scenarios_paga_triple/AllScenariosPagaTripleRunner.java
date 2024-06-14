package com.co.datacenter.runners.paga_triple.all_scenarios_paga_triple;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/Paga_triple/all_scenarios_paga_triple.feature",
        glue = "com.co.datacenter.stepsdefinitions.paga_triple.all_scenarios_paga_triple",
        tags = "@ValidateAllScenarios",
        snippets = SnippetType.CAMELCASE)

public class AllScenariosPagaTripleRunner {
}
