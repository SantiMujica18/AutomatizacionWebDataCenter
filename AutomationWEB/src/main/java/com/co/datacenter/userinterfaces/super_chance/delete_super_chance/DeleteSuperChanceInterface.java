package com.co.datacenter.userinterfaces.super_chance.delete_super_chance;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DeleteSuperChanceInterface {





    public static Target CHEKBOX_DELETE= Target.the("check box de seleccionar juego a eliminar").
            located(By.xpath("//input[@id=\"formChance:j_idt294:0:selectBooleanCheckBoxJuego\"]"));
    public static Target TITULO_VALIDACION = Target.the("Titulo de validacion de las loterias o sorteos")
            .locatedBy("//h2[contains(text(), '1. Seleccione las Loterías o sorteos')]");

    public static Target DELETE = Target.the("eliminar e icono").
            located(By.xpath("//div[contains(text(), 'Eliminar')]"));


}
