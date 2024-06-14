package com.co.datacenter.userinterfaces.paga_triple.select_paga_triple;

import net.serenitybdd.screenplay.targets.Target;

public class SelectPagaTripleInterface {

    /*public static Target BEST= Target.the("servicio de apuestas").
            locatedBy("//div[@class='Container50 Responsive50 OvHidden juegaGana']");*/
    public static Target LOTERY_PAGA_TRIPLE= Target.the("Titulo para ganar con nuestros juegos").
            locatedBy("//span[contains(text(),'Triple')]");


    public static Target WELCOME_PAGA_TRIPLE = Target.the("titulo de bienvenida").
            locatedBy(("//div[@id='formChance:j_idt190']"));
}
