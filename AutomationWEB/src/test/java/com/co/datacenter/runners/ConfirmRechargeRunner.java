package com.co.datacenter.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/recharge/confirm_recharge.feature",
        glue = "com.co.datacenter.stepsdefinitions.recharge.confirm_recharge",
        tags = "@ConfirmBuySuccessful",
        snippets = SnippetType.CAMELCASE
)
public class ConfirmRechargeRunner {

}
