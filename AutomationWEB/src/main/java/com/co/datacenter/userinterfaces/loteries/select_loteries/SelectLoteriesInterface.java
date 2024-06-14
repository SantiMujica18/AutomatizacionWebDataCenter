package com.co.datacenter.userinterfaces.loteries.select_loteries;

import net.serenitybdd.screenplay.targets.Target;

public class SelectLoteriesInterface {

    public static Target SCROLL_ONE = Target.the("Scroll hasta servicio de loterias")
            .locatedBy("//a[@id=\"j_idt31\"]");

    public static Target LOTERIES_SERVICE = Target.the("Scroll hasta servicio de loterias")
            .locatedBy("//a[@id=\"j_idt53\"]");


    public static Target TITLE_VALIDATION = Target.the("Scroll hasta servicio de recargas")
            .locatedBy("//a[@id=\"j_idt23:j_idt33\"]");



}
