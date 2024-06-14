package com.co.datacenter.userinterfaces.super_astro.select_super_astro;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SelectSuperAstroInterface {

    public static Target SUPER_ASTRO = Target.the("Servicio super astro")
            .located(By.id("formApuestas:j_idt68"));
    public static Target SCROLL_SUPER_CHANCE = Target.the("Scroll hasta el servicio super chance")
            .locatedBy("//a[@id='formApuestas:buttonMaxiChance']");

    public static Target TITLE_WELCOME = Target.the("Titulo de MI JUEGO")
            .locatedBy("//a[@id=\"formSuperAstro:j_idt33\"]");
}
