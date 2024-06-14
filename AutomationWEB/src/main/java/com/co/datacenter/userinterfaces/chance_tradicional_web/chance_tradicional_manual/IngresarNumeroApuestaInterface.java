package com.co.datacenter.userinterfaces.chance_tradicional_web.chance_tradicional_manual;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class IngresarNumeroApuestaInterface {

    public static Target CLICK_VALOR = Target.the("Seleccionar por segunda ves el input del valor")
            .located(By.id("f"));
    public static Target NUMERO_APUESTA = Target.the("Seleccionar una uña")
            .located(By.id("formChance:idFieldNumero"));

}
