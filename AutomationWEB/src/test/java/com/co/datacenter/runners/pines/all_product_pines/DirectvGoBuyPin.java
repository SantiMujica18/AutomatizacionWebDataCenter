package com.co.datacenter.runners.pines.all_product_pines;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/pines/directvgo_pin.feature",
        glue = "com.co.datacenter.stepsdefinitions.pines.all_pines.Directv",
        tags = "@SuccesfulPinPurchase",
        snippets = SnippetType.CAMELCASE
)
public class DirectvGoBuyPin {
}
