package com.co.datacenter.userinterfaces.chance_tradicional.confirm_buy_chance;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ConfirmChanceInterface {

    public static Target SCROLL_1 = Target.the("Scroll metodo de pago").
            located(By.xpath("//*[@id=\"mainForm:idPanelDatosMain\"]/p[4]"));

    public static Target CHECK_BOX_BALANCE_PAY = Target.the("check box de saldo de pago").
            located(By.xpath("//div[@id=\"mainForm:opt_22500\"]"));

    public static Target BTN_NEXT = Target.the("boton de siguiente").
            located(By.id("mainForm:j_idt98"));

    public static Target SUCCESSFUL_PAY = Target.the("Scroll metodo de pago").
            located(By.xpath("//*[@id=\"mainForm:idVentaExitosa\"]/div[1]/span"));


}
