package com.co.datacenter.runners.pines.data_pines;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/pines/data_pin.feature",
        glue = "com.co.datacenter.stepsdefinitions.pines.data_pines",
        tags = "@SuccessfulPinPayment",
        snippets = SnippetType.CAMELCASE
)
public class DataPayPinesRunner {
}
