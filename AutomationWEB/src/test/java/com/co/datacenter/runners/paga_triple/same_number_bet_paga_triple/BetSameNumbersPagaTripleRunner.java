package com.co.datacenter.runners.paga_triple.same_number_bet_paga_triple;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(

        features = "src/test/resources/features/paga_triple/same_numbers_bet_paga_triple.feature",
        glue = "com.co.datacenter.stepsdefinitions.paga_triple.same_number_bet_paga_triple",
        tags = "@SameNumberBetPagaTripleSuccessful",
        snippets = SnippetType.CAMELCASE

)
public class BetSameNumbersPagaTripleRunner {

}
