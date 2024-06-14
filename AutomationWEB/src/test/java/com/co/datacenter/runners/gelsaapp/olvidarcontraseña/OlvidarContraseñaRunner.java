package com.co.datacenter.runners.gelsaapp.olvidarcontraseña;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/gelsaapp/olvidar_contraseña.feature",
        glue = "com.co.datacenter.stepsdefinitions.gelsaapp.olvidarcontraseña",
        tags = "@SendTokenSuccessful",
        snippets = SnippetType.CAMELCASE
)
public class OlvidarContraseñaRunner {


}
