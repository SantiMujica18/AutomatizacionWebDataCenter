package com.co.datacenter.userinterfaces.chance_millonario.data_chance_millonario;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DataTwoPageChanceMillonarioInterface {

    public static Target INPUT_1 = Target.the("Espacio para primer numero")
            .located(By.id("formChanceMillonario:idFieldNumero1"));

    public static Target INPUT_2 = Target.the("Espacio para numero 2")
            .located(By.id("formChanceMillonario:idFieldNumero2"));



    public static Target SCROLL_1 = Target.the("Scroll hasta Digita tus 5 números")
            .locatedBy("//h2[contains(text(), '3. Digita tus 5 números')]");
    public static Target BTN_RANDOM_1 = Target.the("Boton de numero aleatorio 1")
            .located(By.id("formChanceMillonario:j_idt62"));
    public static Target BTN_RANDOM_2 = Target.the("Boton de numero aleatorio 2")
            .located(By.id("formChanceMillonario:j_idt69"));
    public static Target BTN_RANDOM_3 = Target.the("Boton de numero aleatorio 3")
            .located(By.id("formChanceMillonario:j_idt76"));
    public static Target BTN_RANDOM_4 = Target.the("Boton de numero aleatorio 4")
            .located(By.id("formChanceMillonario:j_idt83"));
    public static Target BTN_RANDOM_5 = Target.the("Boton de numero aleatorio 5")
            .located(By.id("formChanceMillonario:j_idt90"));

    public static Target BTN_NEXT = Target.the("Boton siguente")
            .located(By.id("formChanceMillonario:j_idt288"));

    public static Target WELCOME_TITLE = Target.the("Titulo de validacion Confirmación de compra")
            .locatedBy("//h1[contains(text(), 'Confirmación de compra')]");

    public static Target BTN_CLEAN = Target.the("Boton de limpiar apuesta")
            .located(By.id("formChanceMillonario:j_idt63"));







}
