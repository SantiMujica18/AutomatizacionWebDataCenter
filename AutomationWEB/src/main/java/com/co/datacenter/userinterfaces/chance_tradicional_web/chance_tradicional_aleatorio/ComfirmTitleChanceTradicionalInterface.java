package com.co.datacenter.userinterfaces.chance_tradicional_web.chance_tradicional_aleatorio;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ComfirmTitleChanceTradicionalInterface {
    public static Target SELECT_PRODUCT = Target.the("Seleccionar el titulo de apuestas")
            .located(By.id("formApuestas:buttonChance"));
}
