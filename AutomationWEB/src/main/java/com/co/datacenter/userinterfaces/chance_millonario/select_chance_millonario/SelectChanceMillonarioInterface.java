package com.co.datacenter.userinterfaces.chance_millonario.select_chance_millonario;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SelectChanceMillonarioInterface {

    public static Target SCROLL_1 = Target.the("Scroll hasta servicio chance tradicional").
            located(By.id("formApuestas:buttonChance"));

    public static Target CHANCE_MILLONARIO = Target.the("Servicio de chance tradicional").
            located(By.id("formApuestas:buttonChanceMillonario"));

    public static Target WELCOME_CHANCE_MILLONARIO = Target.the("Titulo de validacion").
            located(By.id("formChanceMillonario:j_idt26"));

}
