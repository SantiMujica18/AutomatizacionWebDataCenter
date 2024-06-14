package com.co.datacenter.runners.validation_recharge.all_operators;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/recharge/tigo_recharge.feature",
        glue = "com.co.datacenter.stepsdefinitions.recharge.all_operators.confirm_tigo_recharge",
        tags = "@ConfirmTigoRechargeSuccessful",
        snippets = SnippetType.CAMELCASE
)
public class TigoRechargeDataRunner {
}
