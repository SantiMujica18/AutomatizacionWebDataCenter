package com.co.datacenter.runners.chance_tradicional.flujo_manual;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/chance_tradicional/validar_flujo_basico_manual.feature",
        glue = "com.co.datacenter.stepsdefinitions.chance_tradicional.flujo_manual",
        tags = "",
        snippets = SnippetType.CAMELCASE
)
public class ChanceTradicionalManualRunner {
}
