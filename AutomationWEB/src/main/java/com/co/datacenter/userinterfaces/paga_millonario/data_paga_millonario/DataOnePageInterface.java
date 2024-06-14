package com.co.datacenter.userinterfaces.paga_millonario.data_paga_millonario;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DataOnePageInterface {

    public static Target CHECK_BOX_THREE = Target.the("Checkbox de tres cifras")
            .locatedBy("//*[@id=\"formPagaMillonario:modalidad\"]/div/div[1]/div/div[2]/span");
    public static Target CHECK_BOX_FOUR = Target.the("Checkbox de cuatro cifras")
            .locatedBy("//*[@id=\"formPagaMillonario:modalidad\"]/div/div[2]/div/div[2]/span");
    public static Target SCROLL_ONE = Target.the("Scroll hasta titulo 3 cifras")
            .locatedBy("//label[@id=\"formPagaMillonario:j_idt38\"]");
    public static Target FIRST_LOTTERY = Target.the("Checkbox de primer loteria")
            .located(By.id("formPagaMillonario:j_idt52:6:j_idt54"));
    public static Target SECONT_LOTTERY = Target.the("Checkbox de segunda loteria")
            .located(By.id("formPagaMillonario:j_idt52:0:j_idt54"));

    public static Target BTN_NEXT = Target.the("Boton de siguiente")
            .locatedBy("//button[@id=\"formPagaMillonario:j_idt329\"]");
}
