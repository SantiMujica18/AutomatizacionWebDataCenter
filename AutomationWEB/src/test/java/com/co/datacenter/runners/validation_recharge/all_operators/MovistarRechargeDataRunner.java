package com.co.datacenter.runners.validation_recharge.all_operators;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/recharge/movistar_recharge.feature",
        glue = "com.co.datacenter.stepsdefinitions.recharge.all_operators.confirm_movistar_recharge",
        tags = "@ConfirmMovistarRechargeSuccessful",
        snippets = SnippetType.CAMELCASE
)
public class MovistarRechargeDataRunner {
}
