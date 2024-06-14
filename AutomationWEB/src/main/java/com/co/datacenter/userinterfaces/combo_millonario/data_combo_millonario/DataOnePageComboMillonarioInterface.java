package com.co.datacenter.userinterfaces.combo_millonario.data_combo_millonario;

import net.serenitybdd.screenplay.targets.Target;

public class DataOnePageComboMillonarioInterface {

    public static Target SCROLL_1 = Target.the("Scroll hasta el titulo Selecciona las loterías o sorteos con las que jugarás tu número:")
            .locatedBy("//span[contains(text(), 'Selecciona las loterías o sorteos con las que jugarás tu número:')]");


    public static Target CHECK_BOX_ONE_LOTTERY = Target.the("check box de primera loteria")
            .locatedBy("//div[@id=\"formComboMillonario:j_idt47:0:j_idt49\"]");

    public static Target CHECK_BOX_TWO_LOTTERY = Target.the("check box de segunda loteria")
            .locatedBy("//div[@id=\"formComboMillonario:j_idt47:2:j_idt49\"]");

    public static Target BTN_NEXT = Target.the("boton siguiente")
            .locatedBy("//button[@id=\"formComboMillonario:j_idt158\"]");


}
