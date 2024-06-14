package com.co.datacenter.userinterfaces.cupones;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CuponesInterface {

    public static Target SELECT_CUPONES = Target.the("Seleccionar el servicio de cupones")
            .located(By.id("menuform:sm_cupones"));
    public static Target HISTORIC_CUPONES = Target.the("Boton ver historico")
            .located(By.id("form:j_idt47"));
}
