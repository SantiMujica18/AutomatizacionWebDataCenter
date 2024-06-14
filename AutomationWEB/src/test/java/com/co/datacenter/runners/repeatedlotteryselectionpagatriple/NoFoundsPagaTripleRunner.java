package com.co.datacenter.runners.repeatedlotteryselectionpagatriple;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/paga_triple/confirm_buy_paga_triple.feature",
        glue = "com.co.datacenter.stepsdefinitions.paga_triple.no_founds_paga_triple",
        tags = "@ConfirmPagaTripleUnsuccessful",
        snippets = SnippetType.CAMELCASE

)
public class NoFoundsPagaTripleRunner {

}
