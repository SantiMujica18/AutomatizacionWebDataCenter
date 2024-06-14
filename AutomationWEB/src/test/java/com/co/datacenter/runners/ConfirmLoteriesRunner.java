package com.co.datacenter.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/loteries/confirm_buy_loteries.feature",
        glue = "com.co.datacenter.stepsdefinitions.loteries.confirm_loteries",
        tags = "@ConfirmLotterySuccessful",
        snippets = SnippetType.CAMELCASE
)
public class ConfirmLoteriesRunner {

}
