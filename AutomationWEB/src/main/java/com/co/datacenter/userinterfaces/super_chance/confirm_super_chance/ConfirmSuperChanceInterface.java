package com.co.datacenter.userinterfaces.super_chance.confirm_super_chance;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ConfirmSuperChanceInterface {



    public static Target CONFIRM_SCROLL_1 = Target.the("Scroll metodo de pago").
            located(By.xpath("//p[@class=\"descCostIva\"]"));

    public static Target CHEKBOX_CONFIRM_SUPER_CHANCE= Target.the("check box de saldo de pago").
            located(By.xpath("//span[@class=\"ui-radiobutton-icon ui-icon ui-icon-blank ui-c\"]"));

    public static Target CONFIRM_SCROLL_2 = Target.the("Scroll metodo de pago").
            located(By.xpath("//*[@id=\"mainForm:idInfoPago\"]/div/h2"));

    public static Target BTN_NEXT_SUPER_CHANCE = Target.the("boton de siguiente").
            located(By.id("//button[@id=\"mainForm:j_idt95\"]"));
    public static Target BTN_PAY_SUPER_CHANCE = Target.the("boton de pagar").
            located(By.id("mainForm:j_idt92"));

    public static Target SUCCESSFUL_PAY_SUPER_CHANCE = Target.the("titulo de venta exitosa").
            located(By.xpath("//span[contains(text(), 'Pago exitoso')]"));
}
