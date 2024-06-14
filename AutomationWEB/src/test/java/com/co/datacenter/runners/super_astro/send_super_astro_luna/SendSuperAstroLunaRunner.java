package com.co.datacenter.runners.super_astro.send_super_astro_luna;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/super_astro/send_super_astro_lun.feature",
        glue = "com.co.datacenter.stepsdefinitions.super_astro.send_super_astro_luna",
        tags = "@SendSuperAstroLunSuccessful",
        snippets = SnippetType.CAMELCASE
)
public class SendSuperAstroLunaRunner {
}
