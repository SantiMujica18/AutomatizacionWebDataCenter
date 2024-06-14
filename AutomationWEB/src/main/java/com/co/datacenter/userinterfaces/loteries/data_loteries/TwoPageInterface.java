package com.co.datacenter.userinterfaces.loteries.data_loteries;

import net.serenitybdd.screenplay.targets.Target;

public class TwoPageInterface {

    public static Target INPUT_NUM = Target.the("Espacio para numero apostar")
            .locatedBy("//input[@id=\"j_idt23:idFieldNumero\"]");

    public static Target BTN_RANDOM = Target.the("Espacio para numero apostar")
            .locatedBy("//button[@id=\"j_idt23:j_idt78\"]");



}
