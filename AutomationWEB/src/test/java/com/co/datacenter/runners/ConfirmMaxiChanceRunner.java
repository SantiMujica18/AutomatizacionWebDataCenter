package com.co.datacenter.runners;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/maxi_chance/confirm_buy_maxi_chance.feature",
        glue = "com.co.datacenter.stepsdefinitions.maxi_chance.confirm_buy_maxi_chance",
        tags = "@ConfirmMaxiChanceSuccessful"
)
public class ConfirmMaxiChanceRunner {
}
