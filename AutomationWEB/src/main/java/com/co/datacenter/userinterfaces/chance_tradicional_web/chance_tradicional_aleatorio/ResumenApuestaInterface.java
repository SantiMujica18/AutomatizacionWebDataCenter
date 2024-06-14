package com.co.datacenter.userinterfaces.chance_tradicional_web.chance_tradicional_aleatorio;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ResumenApuestaInterface {

    public static Target SCROLL3 = Target.the("Datos de la apuesta")
            .located(By.id("mainForm:j_idt36"));

    public static Target SCROLL_PAGAR = Target.the("Busca el metodo de pago")
            .locatedBy("//span[contains(text(), 'Valor total')]");

    public static Target CHECK_BOX_METODO_PAGO = Target.the("Selecciona el metodo de pago")
            .located(By.id("mainForm:opt__1"));

    public static Target PAGAR = Target.the("Pagar")
            .located(By.id("mainForm:j_idt98"));

    public static Target PAGO_EXITOSO = Target.the("Pagar")
            .locatedBy("//span[contains(text(), 'Pago exitoso')]");


}
