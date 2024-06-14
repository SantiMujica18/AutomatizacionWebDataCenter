package com.co.datacenter.runners.super_astro.send_super_astro_both_lotteries;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/super_astro/send_super_astro_both_lotteries.feature",
        glue = "com.co.datacenter.stepsdefinitions.super_astro.send_super_astro_both_lotteries",
        tags = "@SendSuperAstroBothLotteriesSuccessful",
        snippets = SnippetType.CAMELCASE
)
public class SendSuperAstroBothLotteriesRunner {
}
