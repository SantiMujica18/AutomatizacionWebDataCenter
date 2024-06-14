package com.co.datacenter.userinterfaces.chance_millonario.confirm_chance_millonario;

import net.serenitybdd.screenplay.targets.Target;

public class ConfirmChanceMillonarioInterface{

    public static Target SCROLL_1 =Target.the("Scroll hasta el titulo Número apostado")
            .locatedBy("//p[contains(text(), 'Número apostado')]");

    public static Target CHECK_BOX_PAY =Target.the("Check box ")
            .locatedBy("//span[@class=\"ui-radiobutton-icon ui-icon ui-icon-blank ui-c\"]");

    public static Target BTN_NEXT =Target.the("Boton de siguiente")
            .locatedBy("//button[@class=\"ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-left RedButton MarginRight ui-button-text-icon-right\"]");

    public static Target TITLE_WELCOME =Target.the("Titulo de validacion de compra")
            .locatedBy("//span[contains(text(), 'Pago exitoso')]");

}
