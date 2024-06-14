package com.co.datacenter.runners.chance_tradicional.flujo_aleatorio;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/chance_tradicional/validar_flujo_basico_aleatorio.feature",
        glue = "com.co.datacenter.stepsdefinitions.chance_tradicional.flujo_aleatorio",
        tags = "",
        snippets = SnippetType.CAMELCASE
)
public class ChanceTradicionalAletorioRunner {
}
