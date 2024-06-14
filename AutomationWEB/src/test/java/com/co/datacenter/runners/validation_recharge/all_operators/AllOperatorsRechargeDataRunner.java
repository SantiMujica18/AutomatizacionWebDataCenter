package com.co.datacenter.runners.validation_recharge.all_operators;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/recharge/all_operators_validation.feature",
        glue = "com.co.datacenter.stepsdefinitions.recharge.all_operators.confirm_all_operators_recharge",
        tags = "@ValidateAllOperatorsSuccessfully",
        snippets = SnippetType.CAMELCASE
)

public class AllOperatorsRechargeDataRunner {
}
