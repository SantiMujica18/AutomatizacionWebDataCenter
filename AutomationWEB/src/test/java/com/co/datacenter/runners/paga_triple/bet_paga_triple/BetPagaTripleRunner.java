package com.co.datacenter.runners.paga_triple.bet_paga_triple;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/paga_triple/bet_paga_triple.feature",
        glue = "com.co.datacenter.stepsdefinitions.paga_triple.bet_paga_triple",
        tags = "@BetPagaTripleSuccessful",
        snippets = SnippetType.CAMELCASE
)
public class BetPagaTripleRunner {
}
