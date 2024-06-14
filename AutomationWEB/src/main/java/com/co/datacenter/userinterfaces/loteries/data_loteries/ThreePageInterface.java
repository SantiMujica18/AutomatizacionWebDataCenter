package com.co.datacenter.userinterfaces.loteries.data_loteries;

import net.serenitybdd.screenplay.targets.Target;

public class ThreePageInterface {

    public static Target SELECT_SERIE = Target.the("seleccionar la serie")
            .locatedBy("//label[@id=\"j_idt23:field_serie_label\"]");

    public static Target VALUE_SERIE = Target.the("valor de serie seleccionado")
            .locatedBy("//li[@id=\"j_idt23:field_serie_1\"]");

    public static Target SELECT_FRACTIONS = Target.the("seleccionar fracciones")
            .locatedBy("//label[@id=\"j_idt23:field_fraccion_label\"]");

    public static Target VALUE_FRACTIONS = Target.the("seleccionar fracciones")
            .locatedBy("//li[@id=\"j_idt23:field_fraccion_1\"]");

    public static Target BTN_SIGUIENTE = Target.the("Boton siguiente")
            .locatedBy("//button[@id=\"j_idt23:j_idt292\"]");

    public static Target TITLE_CONFIRMATION_BUY = Target.the("Titulo de confirmacion")
            .locatedBy("//h1[contains(text(), 'Confirmación de compra')]");










}
