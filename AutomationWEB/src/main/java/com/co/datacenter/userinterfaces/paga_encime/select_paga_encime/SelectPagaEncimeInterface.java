package com.co.datacenter.userinterfaces.paga_encime.select_paga_encime;

import net.serenitybdd.screenplay.targets.Target;

public class SelectPagaEncimeInterface {

    public static Target SCROLL_1 = Target.the("Scroll hasta titulo preparate para ganar con nuestros juegos")
            .locatedBy("//h2[contains(text(), 'Prepárate para ganar')]");

    public static Target SERVICE_PAGA_ENCIME = Target.the("Servicio de paga encime")
            .locatedBy("//a[@id=\"formApuestas:buttonPagaEncoi\"]");
    public static Target TITLE_MI_JUEGO = Target.the("Titulo de validacion MI JUEGO")
            .locatedBy("//a[@id=\"formPagaEncime:j_idt26\"]");


}
