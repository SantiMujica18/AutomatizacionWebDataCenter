package com.co.datacenter.runners.paga_triple.validation_missing_lottery_paga_triple;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(

        features = "src/test/resources/features/paga_triple/validation_missing_lottery.feature",
        glue = "com.co.datacenter.stepsdefinitions.paga_triple.validation_missing_lottery",
        tags = "@MissingLoteryPagaTripleValidation",
        snippets = SnippetType.CAMELCASE

)
public class ValidationMissingLotteryPagaTripleRunner {

}
