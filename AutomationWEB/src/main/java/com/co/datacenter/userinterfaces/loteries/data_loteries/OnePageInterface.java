package com.co.datacenter.userinterfaces.loteries.data_loteries;

import net.serenitybdd.screenplay.targets.Target;

public class OnePageInterface {

    public static Target CHECK_BOX_LOTERY = Target.the("Check box de la loteria")
            .locatedBy("//div[@id=\"j_idt23:j_idt47:0:j_idt49\"]");

    public static Target BUTTON_NEXT = Target.the("boton de siguiente")
            .locatedBy("//button[@id=\"j_idt23:j_idt291\"]");


}
