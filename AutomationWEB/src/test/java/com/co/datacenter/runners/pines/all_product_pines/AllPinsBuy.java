package com.co.datacenter.runners.pines.all_product_pines;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/pines/all_pines_validation.feature",
        glue = "com.co.datacenter.stepsdefinitions.pines.all_pines.validate_all_pines",
        tags = "@ValidateAllPinsSuccessfully",
        snippets = SnippetType.CAMELCASE
)
public class AllPinsBuy {

}
