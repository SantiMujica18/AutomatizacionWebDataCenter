package com.co.datacenter.runners.maxi_chance.validation_lottery_empty_maxi_chance;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/maxi_chance/validation_lottery_empty_maxi_chance.feature",
        glue = "com.co.datacenter.stepsdefinitions.maxi_chance.validation_lottery_empty_maxi_chance",
        tags = "@LotteryEmptyMaxiChanceSuccessful"
)
public class LotteryEmptyMaxiChanceRunner {
}
