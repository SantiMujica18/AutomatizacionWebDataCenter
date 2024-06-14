package com.co.datacenter.userinterfaces.recarga.confirm_recharge;

import net.serenitybdd.screenplay.targets.Target;

public class ConfirmRechargeInterface {

    //VALIDACION DE LA VENTANA DE PAGO
    public static Target TITLE_MET_PAY = Target.the("Titulo de confirmacion de compra").
            locatedBy("//*[@id=\"mainForm:j_idt36\"]/h1");

    public static Target CHECK_BOX_PAY = Target.the("Checkbox de metodo de pago").
            locatedBy("//span[@class=\"ui-radiobutton-icon ui-icon ui-icon-blank ui-c\"]");
    public static  Target TITLE_INFO_PAY = Target.the("Titulo informacion de pago").
            locatedBy("//*[@id=\"mainForm:idInfoPago\"]/div/h2");
    public static  Target BTN_NEXT_PAY = Target.the("Boton de pagar").
            locatedBy("//button[@id=\"mainForm:j_idt96\"]");
    public static  Target TITLE_SUCCESSFUL_PAY = Target.the("Titulo de pago exitoso").
            locatedBy("//*[@id=\"mainForm:idVentaExitosa\"]/div[1]/span");


    //Titulo Pago con exito


    //Un soporte msj
    //*[@id="mainForm:idVentaExitosa"]/div[2]/span[2]

    //Button aceptar
    //*[@id="mainForm:j_idt422"]/span


}
