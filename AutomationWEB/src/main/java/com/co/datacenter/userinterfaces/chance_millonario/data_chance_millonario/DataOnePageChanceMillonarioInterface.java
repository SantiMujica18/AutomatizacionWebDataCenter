package com.co.datacenter.userinterfaces.chance_millonario.data_chance_millonario;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DataOnePageChanceMillonarioInterface {

    public static Target CHECK_BOX_FIGURES = Target.the("Check box valor y modalidad de juego").
            locatedBy("//span[@class=\"ui-radiobutton-icon ui-icon ui-icon-blank ui-c\"]");

    public static Target SCROLL_1 = Target.the("Scroll hasta title 4 Cifras").
            located(By.id("formChanceMillonario:j_idt38"));

    public static Target CHECK_BOX_LOTTERY_1 = Target.the("Check box de loteria uno").
            located(By.id("formChanceMillonario:j_idt49:0:j_idt51"));

    public static Target CHECK_BOX_LOTTERY_2 = Target.the("Check box de loteria dos").
            located(By.id("formChanceMillonario:j_idt49:3:j_idt51"));

    public static Target BTN_NEXT = Target.the("Boton siguiente").
            located(By.id("formChanceMillonario:j_idt287"));

    public static Target TITLE_WELCOM = Target.the("Titulo de confirmacion Digita tus 5 números")
            .locatedBy("//h2[contains(text(), '3. Digita tus 5 números')]");


}

