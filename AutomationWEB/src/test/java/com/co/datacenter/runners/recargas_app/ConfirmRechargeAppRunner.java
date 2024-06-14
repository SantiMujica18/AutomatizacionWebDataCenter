package com.co.datacenter.runners.recargas_app;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/recargas_app/confirm_recharge_app.feature",
        glue = "com.co.datacenter.stepsdefinitions.recargas_app.confirm_recharge",
        tags = "@ConfirmRechargeSuccessfully",
        snippets = SnippetType.CAMELCASE
)
public class ConfirmRechargeAppRunner {
}
