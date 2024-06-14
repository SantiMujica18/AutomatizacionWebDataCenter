package com.co.datacenter.interactions.HasMap;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.By;

import java.util.HashMap;

import static net.serenitybdd.screenplay.Tasks.instrumented;


public class ComponentsOfDays implements Interaction {


    @Override
    public <T extends Actor> void performAs(T actor) {
        HashMap<String, By> DAY_LOCATORS = new HashMap<String, By>() {{
            put("DAY_DOM", By.id("//*[@id=\\\"formChance:j_idt42\\\"]/ul/li[1]"));
            put("DAY_LUN", By.id("//*[@id=\\\"formChance:j_idt42\\\"]/ul/li[2]"));
            put("DAY_MAR", By.id("//*[@id=\\\"formChance:j_idt42\\\"]/ul/li[3]"));
            put("DAY_MIE", By.id("//*[@id=\\\"formChance:j_idt42\\\"]/ul/li[4]"));
            put("DAY_JUE", By.id("//*[@id=\\\"formChance:j_idt42\\\"]/ul/li[5]"));
            put("DAY_VIE", By.id("//*[@id=\\\"formChance:j_idt42\\\"]/ul/li[6]"));
            put("DAY_SAB", By.id("//*[@id=\\\"formChance:j_idt42\\\"]/ul/li[7]"));
        }};



    }

}
