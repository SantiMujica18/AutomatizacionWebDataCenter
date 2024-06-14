package com.co.datacenter.runners.paga_triple.validations_bets_paga_triple;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(

        features = "src/test/resources/features/paga_triple/validation_no_lotteries_available.feature",
        glue = "com.co.datacenter.stepsdefinitions.paga_triple.validation_no_lotteries",
        tags = "@ValidationNoLotteriesAvailableSuccessful",
        snippets = SnippetType.CAMELCASE

)
public class ValidationNoLotteriesAvailablePagaTripleRunner {
}
