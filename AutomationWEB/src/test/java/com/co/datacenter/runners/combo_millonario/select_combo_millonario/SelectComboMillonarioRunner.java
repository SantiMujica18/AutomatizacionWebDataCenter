package com.co.datacenter.runners.combo_millonario.select_combo_millonario;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/combo_millonario/select_combo_millonario.feature",
        glue = "com.co.datacenter.stepsdefinitions.combo_millonario.select_combo_millonario",
        tags = "@SelectComboMillonarioSuccessful",
        snippets = SnippetType.CAMELCASE
)
public class SelectComboMillonarioRunner {


}
