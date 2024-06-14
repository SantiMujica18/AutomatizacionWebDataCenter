package com.co.datacenter.runners.validation_recharge;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "resources/features/recharge/recharge_data.feature",
        glue = "com.co.datacenter.stepsdefinitions.recharge_data",
        tags = "@fillRechargeDataSuccessful",
        snippets = SnippetType.CAMELCASE
)
public class RechargeDataRunner {


}
