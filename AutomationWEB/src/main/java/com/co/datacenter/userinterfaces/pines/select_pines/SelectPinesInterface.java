package com.co.datacenter.userinterfaces.pines.select_pines;

import net.serenitybdd.screenplay.targets.Target;

public class SelectPinesInterface {

    public static Target PAY_PINES = Target.the("Item de pagar pines")
            .locatedBy("//li[@id=\"menuform:sm_paga_pines\"]");

    public static Target WELCOME_PINES = Target.the("Titulo de valdiacion de seleccion de pines")
            .locatedBy("//span[contains(text(), 'Selecciona el')]");
}
