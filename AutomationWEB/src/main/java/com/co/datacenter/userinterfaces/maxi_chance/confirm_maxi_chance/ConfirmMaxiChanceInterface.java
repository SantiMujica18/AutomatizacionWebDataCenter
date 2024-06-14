package com.co.datacenter.userinterfaces.maxi_chance.confirm_maxi_chance;

import net.serenitybdd.screenplay.targets.Target;

public class ConfirmMaxiChanceInterface {

    public  static Target SCROLL_1 = Target.the("Scroll hasta el titulo Total Apuesta").
            locatedBy("//span[contains(text(), 'Total Apuesta')]");

    public static Target CHECK_PAY = Target.the("Check box de metodo de pago").
            locatedBy("//div[@id='mainForm:opt__1']");
                               //div[@id="mainForm:opt_22500"]
    public static Target BTN_PAY = Target.the("Boton de pagar").
            locatedBy("//button[@class=\"ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-left RedButton MarginRight ui-button-text-icon-right\"]");

    public static Target TITLE_VALIDATION = Target.the("Titulo de validacion de apuesta Pago exitoso").
            locatedBy("//span[contains(text(), 'Pago exitoso')]");

    public static Target BTN_ACCEPT = Target.the("Boton de aceptar el soporte").
            locatedBy("//button[@id=\"mainForm:j_idt413\"]");
}
