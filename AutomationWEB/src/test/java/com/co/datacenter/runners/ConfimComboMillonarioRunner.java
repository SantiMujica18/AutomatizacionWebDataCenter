package com.co.datacenter.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)

@CucumberOptions(
        features = "src/test/resources/features/combo_millonario/confirm_buy_combo_millonario.feature",
        glue = "com.co.datacenter.stepsdefinitions.combo_millonario.confirm_combo_millonario",
        tags = "@ConfirmComboMillonarioSuccessful",
        snippets = SnippetType.CAMELCASE
)
public class ConfimComboMillonarioRunner {

}
