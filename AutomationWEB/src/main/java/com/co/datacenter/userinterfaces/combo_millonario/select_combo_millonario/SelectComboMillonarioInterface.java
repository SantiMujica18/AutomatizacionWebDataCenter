package com.co.datacenter.userinterfaces.combo_millonario.select_combo_millonario;

import net.serenitybdd.screenplay.targets.Target;

public class SelectComboMillonarioInterface {

    public static Target SCROLL_CHANCE= Target.the("scroll para seleccionar combo millonario").
            locatedBy("//a[@id=\"formApuestas:buttonChance\"]");

    public static Target SELECT_COMBO_MILLONARIO= Target.the("servicio de combo millonario").
            locatedBy("//a[@id=\"formApuestas:buttonComboMillonario\"]");

    public static Target WELCOME_COMBO_MILLONARIO = Target.the("titulo de bienvenida").
            locatedBy(("//a[@id=\"formComboMillonario:j_idt26\"]"));


}
