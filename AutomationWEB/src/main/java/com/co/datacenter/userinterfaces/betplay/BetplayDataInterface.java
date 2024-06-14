package com.co.datacenter.userinterfaces.betplay;

import net.serenitybdd.screenplay.targets.Target;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;

public class BetplayDataInterface {

    public static Target RECHARGE_NAV = Target.the("Boton del nav de recargas")
            .located(By.id("menuform:sm_recarga_movil"));
    public static Target IMG_BETPLAY = Target.the("Boton de imagen de betplay")
            .located(By.id("formRecarga:j_idt39:14:j_idt42"));
    public static Target SCROLL_BETPLAY = Target.the("Scroll validacion datos de recarga")
            .located(By.id("formRecarga:wizard_recarga"));
    public static Target BUTTON_SEARCH_CC = Target.the("Boton de busqueda de cedula registrada")
            .located(By.id("formRecarga:iconSearch"));
    public static Target BUTTON_ALERT_SERVICE = Target.the("Boton de validacion si el servicio no esta funcionando")
            .locatedBy("//span[contains(text(), 'Servicio no disponible')]");

}
