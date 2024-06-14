package com.co.datacenter.runners.validation_recharge;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/validation_of_empty_fields_data_recharge.feature",
        glue = "com.co.datacenter.stepsdefinitions.validation_of_empty_fields_data_recharge",
        tags = "@DataRechargeCellPhoneEmpty",
        snippets = SnippetType.CAMELCASE
)
public class DataRechargeEmptyRunner {


}
