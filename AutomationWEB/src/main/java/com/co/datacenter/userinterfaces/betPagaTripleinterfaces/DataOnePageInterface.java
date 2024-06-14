package com.co.datacenter.userinterfaces.betPagaTripleinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DataOnePageInterface {



    public static Target BTN_NEXT = Target.the("Boton siguiente")
            .locatedBy("//button[@id='formChance:j_idt269']");

    public static Target CONFIRM_BUY = Target.the(" titulo de pregunta ")
            .locatedBy("//h1[contains(text(), 'Confirmación de compra')]");

    public static Target QUESTIONS = Target.the(" titulo de pregunta ")
            .locatedBy("//span[contains(text(), 'Enviaremos los soportes de esta transacción a tu correo electrónico.')]");

    public static Target QUESTIONS2 = Target.the(" titulo de pregunta ")
            .locatedBy("//span[contains(text(), 'Fondos Insuficientes')]");




}
