package com.co.datacenter.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)

@CucumberOptions(
        features = "src/test/resources/features/super_chance/confirm_buy_super_chance.feature",
        glue = "com.co.datacenter.stepsdefinitions.super_chance.confirm_buy_super_chance",
        tags = "@ConfirmSuperChanceSuccessful",
        snippets = SnippetType.CAMELCASE
)
public class ConfimSuperChanceRunner {

}
