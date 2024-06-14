package com.co.datacenter.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)

@CucumberOptions(
        features = "src/test/resources/features/paga_millonario/confirm_buy_paga_millonario.feature",
        glue = "com.co.datacenter.stepsdefinitions.paga_millonario",
        tags = "@ConfirmPagaMillonarioSuccessful",
        snippets = SnippetType.CAMELCASE
)
public class ConfimPagaMillonarioRunner {

}
