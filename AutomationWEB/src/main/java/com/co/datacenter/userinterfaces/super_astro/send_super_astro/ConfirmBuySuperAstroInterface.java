package com.co.datacenter.userinterfaces.super_astro.send_super_astro;

import net.serenitybdd.screenplay.targets.Target;

public class ConfirmBuySuperAstroInterface {

    public static Target SCROLL_1 = Target.the("Scroll hasta titulo datos de compra")
            .locatedBy("//*[@id=\"mainForm:idPanelDatosMain\"]/h2");

    public static Target CHECK_BOX_PAY = Target.the("Check box de metodo de pago")
            .locatedBy("//div[@id='mainForm:opt__1']");

    public static Target BTN_NEXT = Target.the("Boton de siguiente")
            .locatedBy("//button[@id=\"mainForm:j_idt139\"]");

    public static Target TITLE_VALIDATION = Target.the("Titulo de validacion Pago exitoso")
            .locatedBy("//span[contains(text(), 'Pago exitoso')]");
    public static Target TITLE_ALERT_ASTRO_LUNA = Target.the("Alerta por horario")
            .locatedBy("//*[@id=\"formMessagesGlobal:messagesGlobal_container\"]/div/div/div[2]/span");


    public static Target SCROLL_2 = Target.the("Scroll hasta el titulo metodo de pago")
            .locatedBy("//*[@id=\"mainForm:j_idt36\"]/div[3]/div/div[2]/h2");

    public static Target BTN_NEW_BET = Target.the("Boton de nueva apuesta")
            .locatedBy("//button[@id=\"mainForm:j_idt90\"]");

    public static Target BTN_PAY = Target.the("Boton de pagar")
            .locatedBy("//button[@id=\"mainForm:j_idt131\"]");


}


