package com.co.datacenter.userinterfaces.chance_tradicional_web.chance_tradicional_aleatorio;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DatosLoteriaInterface {
    public static Target SCROLL = Target.the("Seleccionar loteria")
            .locatedBy("//h2[contains(text(), '1. Seleccione las Loterías o sorteos' )]");
    public static Target LOTERIA = Target.the("Seleccionar loteria")
            .located(By.id("formChance:j_idt40"));
    public static Target CAFETE = Target.the("Seleccionar loteria")
            .located(By.id("formChance:j_idt42:4:j_idt50:1:j_idt52"));
    public static Target ACEPTAR_LOTERIA = Target.the("Seleccionar loteria")
            .located(By.id("formChance:j_idt57"));
    public static Target TRES_CIFRAS = Target.the("Seleccionar aleatorio de 3 cifras")
            .located(By.id("formChance:j_idt70"));
    public static Target SCROLL2 = Target.the("Scroll hasta Seleccione una o varias modalidades y escribe el valor de tu apuesta")
            .locatedBy("//h2[contains(text(),'3. Seleccione una o varias modalidades y escribe el valor de tu apuesta')]");
    public static Target SELECT_UNA = Target.the("Seleccionar una uña")
            .located(By.id("formChance:j_idt89"));
    public static Target BOTON_SELECCIONAR = Target.the("Seleecionar el boton de siguiente")
            .located(By.id("formChance:j_idt318"));
}