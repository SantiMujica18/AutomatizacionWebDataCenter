package com.co.datacenter.userinterfaces.admin.data_admin;

import net.serenitybdd.screenplay.targets.Target;

public class DataAdminInterface {

    public static Target INPUT_DOCUMENT = Target.the("Input para documento")
            .locatedBy("//input[@id=\"numeroDocumento\"]");

    public static Target INPUT_SETTINGS = Target.the("Label de ajustes")
            .locatedBy("//label[@id=\"inputEmpresa_label\"]");

    public static Target VALUE_INCREASE = Target.the("Valor de aumentar")
            .locatedBy("//li[@data-label=\"Aumentar\"]");

    public static Target VALUE_DECREASE = Target.the("Valor de disminuir")
            .locatedBy("//li[@data-label=\"Disminuir\"]");

    public static Target VALUE = Target.the("Input valor")
            .locatedBy("//input[@id=\"valor\"]");

    public static Target BTN_PROCESS = Target.the("Boton de procesar")
            .locatedBy("//button[@id=\"j_idt54\"]");

    public static Target BTN_CLEAN = Target.the("Boton de clean")
            .locatedBy("//button[@id=\"j_idt55\"]");

    public static Target BTN_ALERT_1 = Target.the("Boton de alerta de el numero de cedula y valor son obligatorios")
            .locatedBy("//*[@id=\"buttonErrorDialog\"]");

    public static Target LABEL_TITLE= Target.the("Boton de alerta de el numero de cedula y valor son obligatorios")
            .locatedBy("//label[@for=\"inputPinEstado\"]");


    public static Target RESPONSE_QUESTION = Target.the("Titulo de validacion")
            .locatedBy("//span[contains(text(), \"Cambio Realizado exitosamente\")]");
    public static Target SCROLL = Target.the("Scroll hasta mensaje informativo")
            .locatedBy("//span[@id=\"j_idt24_title\"]");



}
