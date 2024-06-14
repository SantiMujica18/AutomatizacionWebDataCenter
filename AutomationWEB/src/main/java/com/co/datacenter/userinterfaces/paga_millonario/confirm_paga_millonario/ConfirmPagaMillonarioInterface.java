package com.co.datacenter.userinterfaces.paga_millonario.confirm_paga_millonario;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ConfirmPagaMillonarioInterface {

    public static Target SCROLL_1 = Target.the("Scroll 1 en hasta el titulo Número apostado")
            .locatedBy("//div[@id=\"mainForm:j_idt31\"]");

    public static Target CHECK_BOX_PAY = Target.the("Check box de pagar mi saldo")
            .locatedBy("//div[@id=\"mainForm:opt__1\"]");

    public static Target BTN_NEXT = Target.the("Boton de siguiente")
            //.locatedBy("//button[@id=\"mainForm:j_idt90\"]");
            .located(By.id("mainForm:j_idt82"));

    public static Target BTN_NEW_BET = Target.the("Boton para realizar una nueva apuesta")
            .locatedBy("//button[@id='mainForm:j_idt97']");

    public static Target BTN_ACCEPT_VALDIATION = Target.the("Boton de siguiente")
            //.locatedBy("//button[@id=\"mainForm:j_idt427\"]");
            .located(By.id("mainForm:j_idt420"));

    public static Target TITLE_VALIDATION = Target.the("Titulo de validacion de pago exitoso")
            .locatedBy("//span[contains(text(), 'Pago exitoso')]");



}
