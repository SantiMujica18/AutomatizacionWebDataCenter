package com.co.datacenter.userinterfaces.loteries.confirm_loteries;

import net.serenitybdd.screenplay.targets.Target;

public class ConfirmLoteriesInterface {

    public static Target SCROLL_1 = Target.the("Scroll hasta * (Valor fracción x Cantidad de fracciones) - IVA ")
            .locatedBy("//span[contains(text(), '* (Valor fracción x Cantidad de fracciones) - IVA')]");

    public static Target CHECK_BOX_PAY_LOTTERY = Target.the("Checkbox de metodo de pago")
            .locatedBy("//span[@class=\"ui-radiobutton-icon ui-icon ui-icon-blank ui-c\"]");

    public static Target BTN_PAY = Target.the("Boton de pagar")
            .locatedBy("//button[@id=\"mainForm:j_idt110\"]");

    public static Target TITLE_CONFIRM_BUY = Target.the("titulo de confirmacion de compra")
            .locatedBy("//span[contains(text(), 'Pago exitoso')]");




}
