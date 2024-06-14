package com.co.datacenter.runners.betplay;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/betplay/confirm_recharge_beplay.feature",
        glue = "com.co.datacenter.stepsdefinitions.betplay.confirm_betplay",
        tags = "@ConfirmRechargeSuccessfully",
        snippets = SnippetType.CAMELCASE
)

public class ConfirmBetplayRunner {

}
