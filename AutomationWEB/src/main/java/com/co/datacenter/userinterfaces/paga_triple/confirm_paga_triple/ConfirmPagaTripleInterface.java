package com.co.datacenter.userinterfaces.paga_triple.confirm_paga_triple;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.targets.Target;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;

public class ConfirmPagaTripleInterface  {

    public static Target PAYMENT_METHOD= Target.the("radio BUtton de metodo apuesta ")
            .locatedBy("//div[@id='mainForm:opt__1']");

    public static Target BTN_NEXT = Target.the("Boton de siguiente")
            .locatedBy("//button[@id='mainForm:j_idt138']");
    public static Target BTN_NEW_BET = Target.the("Boton para realizar una nueva apuesta")
            .locatedBy("//button[@id='mainForm:j_idt97']");
    public static Target SCROLL = Target.the("Div para realizar scroll")
            .locatedBy("//div[@id=\"mainForm:j_idt34\"]");

}
