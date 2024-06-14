package com.co.datacenter.userinterfaces.login.validation_of_empty_select_payment;


import net.serenitybdd.screenplay.targets.Target;

public class SelectEmptyPaymentInterface {
    public static Target TITLE_MET_PAY = Target.the("Titulo de confirmacion de compra").
            locatedBy("//*[@id=\"mainForm:j_idt36\"]/h1");

    public static Target CHECK_BOX_PAY = Target.the("Checkbox de metodo de pago").
            locatedBy("//div[@id=\"mainForm:opt__1\"]");
    public static  Target TITLE_INFO_PAY = Target.the("Titulo informacion de pago").
            locatedBy("//*[@id=\"mainForm:idInfoPago\"]/div/h2");
    public static  Target BTN_NEXT_PAY = Target.the("Boton de siguiente").
            locatedBy("//button[@class=\"ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-left RedButton MarginRight ui-button-text-icon-right\"]");

    public static  Target TITLE_ALERT = Target.the("Titulo de alerta").
            locatedBy("//*[@id=\"mainForm:idErrorMedioPago\"]/div[1]/span");
    public static  Target BTN_ACEPT_ALERT = Target.the("boton de aceptar alerta").
            locatedBy("//button[@id=\"mainForm:j_idt434\"]");

}
