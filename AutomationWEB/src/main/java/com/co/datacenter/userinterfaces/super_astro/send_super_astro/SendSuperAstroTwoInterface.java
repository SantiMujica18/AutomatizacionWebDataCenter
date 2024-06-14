package com.co.datacenter.userinterfaces.super_astro.send_super_astro;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SendSuperAstroTwoInterface {

    public static Target SCROLL_1 = Target.the("scroll titulo MI JUEGO")
            .locatedBy(("//*[@id=\"formSuperAstro:j_idt33\"]"));

    public static Target BTN_RANDOM = Target.the("Boton de numero aleatorio")
            .locatedBy("//button[@id=\"formSuperAstro:numeroAleatorio\"]");

    public static Target SELECT_SIGN = Target.the("Seleccionar el signo")
            .locatedBy("//label[@id=\"formSuperAstro:lstSignos_label\"]");

    public static Target SELECT_VALUE_SIGN = Target.the("seleccionar valor del signo")
            .locatedBy("//*[@id=\"formSuperAstro:lstSignos_3\"]");



    public static Target INPUT_VALUE = Target.the("Campo de valor de apuesta")
            .locatedBy("//input[@id=\"formSuperAstro:valorApuestaManual\"]");

    public static Target BTN_BET = Target.the("Boton de apostar")
            .locatedBy("//button[@id=\"formSuperAstro:idSiguiente\"]");

    public static Target TITLE_VALIDATION_TRUE = Target.the("Titulo de confirmar compra")
            .locatedBy("//*[@id=\"mainForm:j_idt37\"]/h1");
    /*
    public static Target INPUT_NUM = Target.the("input del numero apostar")
            .located(By.id("//input[@id=\"formSuperAstro:idFieldNumero\"]"));
    */

    //Localizador para validacion de agregar la cantidad maxima de apuestas

    public static Target BUTTON_ADD = Target.the("Boton de agregar apuesta")
            .locatedBy("//button[@id=\"formSuperAstro:addApuesta\"]");

    public static Target SELECT_VALUE_SIGN_2 = Target.the("seleccionar valor del signo tauro")
            .locatedBy("//*[@id=\"formSuperAstro:lstSignos_1\"]");

    public static Target SELECT_VALUE_SIGN_3 = Target.the("seleccionar valor del signo cancer")
            .locatedBy("//*[@id=\"formSuperAstro:lstSignos_4\"]");

    public static Target SELECT_VALUE_SIGN_4 = Target.the("seleccionar valor del signo cancer")
            .locatedBy("//*[@id=\"formSuperAstro:lstSignos_5\"]");

    //localizador para eliminar apuesta

    public static Target TITLE_SHOW = Target.the("Titulo de MOSTRAR").
            locatedBy("//h2[contains(text(), '5. Digita el valor de tu apuesta')]");

    public static Target DELETE = Target.the("titulo de eliminar").
            locatedBy("//a[@id=\"formSuperAstro:j_idt89:0:j_idt110\"]");


}
