package com.co.datacenter.runners.validation_recharge;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/validation_of_empty_value_recharge.feature",
        glue = "com.co.datacenter.stepsdefinitions.validation_of_empty_value_recharge",
        tags = "@ValueRechargeEmpty",
        snippets = SnippetType.CAMELCASE
)
public class ValueEmptyRechargeRunner {


}
