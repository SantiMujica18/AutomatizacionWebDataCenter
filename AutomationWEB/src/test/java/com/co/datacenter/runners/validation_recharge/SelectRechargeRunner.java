package com.co.datacenter.runners.validation_recharge;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/select_recharge.feature",
        glue = "com.co.datacenter.stepsdefinitions.select_recharge",
        tags = "@SendRechargeSuccessful",
        snippets = SnippetType.CAMELCASE
)
public class SelectRechargeRunner {


}
