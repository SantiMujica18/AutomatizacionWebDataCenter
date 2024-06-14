package com.co.datacenter.userinterfaces.admin.select_admin;

import net.serenitybdd.screenplay.targets.Target;

public class SelectAdminInterface {

    public static Target ADMINSTRATION_SECTION = Target.the("apartado de administracion")
            .locatedBy("//li[@id=\"j_idt17:sm_leftmenu_0\"]");

    public static Target SETTING_SECTION = Target.the("apartado de ajustes")
            .locatedBy("//a[contains(text(),\" Ajustes\")]");

    public static Target SCROLL = Target.the("Titulo de scroll 1")
            .locatedBy("//a[contains(text(),\" Reservas\")]");

    public static Target CLEAN_BALANCE = Target.the("apartado de ajustes")
            .locatedBy("//li[@id=\"j_idt17:sm_leftmenu_0_7_0\"]");

    public static Target VALIDATION_TITLE = Target.the("Titulo de validacion Borrado de saldos")
            .locatedBy("//h1[contains(text(), \"Borrado de Saldos\")]");


}
