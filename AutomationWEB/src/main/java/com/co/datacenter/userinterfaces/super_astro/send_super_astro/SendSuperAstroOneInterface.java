package com.co.datacenter.userinterfaces.super_astro.send_super_astro;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SendSuperAstroOneInterface {

    public static Target SCROLL_SELECT_TYPE = Target.the("Scroll titulo MI JUEGO")
            .locatedBy("//a[@id=\"formSuperAstro:j_idt33\"]");

    public static Target MANUAL_TYPE_BET = Target.the("Check box de apuesta manual")
            .locatedBy("//*[@id=\"formSuperAstro:idTipoApuesta\"]/div/div[1]/div/div[2]/span");

    public static Target CHECK_BOX_ASTRO_SOL = Target.the("Check box loteria super astro sol")
            .locatedBy("//label[contains(text(), 'SUPER astro SOL')]");

    public static Target NEXT_BUTTON = Target.the("Boton de siguiente")
            .locatedBy("//button[@id=\"formSuperAstro:idSiguienteManual\"]");

    public static Target VALIDATION_TITLE = Target.the("titulo de validacion Resumen de juego")
            .locatedBy("//*[@id=\"formSuperAstro\"]/div/div[3]/div[3]/div[1]/span");


    // Localizadores utilizados para astro luna


    public static Target AUTOMATIC_TYPE_BET = Target.the("Check box de automatica")
            .locatedBy("//*[@id=\"formSuperAstro:idTipoApuesta\"]/div/div[2]/div/div[2]/span");
    public static Target CHECK_BOX_ASTRO_LUNA = Target.the("Check box de astro luna")
            .locatedBy("//label[contains(text(), 'SUPER astro LUNA')]");

    public static Target INPUT_VALUE = Target.the("Input de valor de apuesta")
            .located(By.id("formSuperAstro:valorApuesta"));

    public static Target NEXT_BUTTON_AUTOMATIC = Target.the("Boton de siguiente")
            .locatedBy("//button[@id=\"formSuperAstro:idSiguiente\"]");


    //Localizador de ambas loterias

    public static Target CHECK_BOX_BOTH_LOTTERIES = Target.the("check box de ambas loterias")
            .locatedBy("//*[@id=\"formSuperAstro:idSorteo\"]/div/div[3]/div/div[2]/span");

    //Localizador para campo de valor vacio

    public static Target ALERT_VALIDATION_FIELD_VALUE = Target.the("Alerta de validacion de valor")
            .locatedBy("//*[@id=\"formSuperAstro:j_idt76\"]/span[2]");


    //Localizador validacion valor minimo

    public static Target ALERT_VALUE_MIN = Target.the("Titulo de alerta de valor minimo")
            .locatedBy("//*[@id=\"formSuperAstro:j_idt76\"]/span[2]");


    //Localizador validacion valor maximo

    public static Target ALERT_VALUE_MAX = Target.the("Titulo de alerta de valor maximo")
            .locatedBy("//*[@id=\"formSuperAstro:j_idt76\"]/span[2]");






    /*
    public static Target BTN_RANDOM = Target.the("Boton de numero aleatorio")
            .locatedBy(("//button[@id=\"formSuperAstro:numeroAleatorio\"]"));



    public static Target SCROLL_VALUE = Target.the("sacroll titulo digita el valor de la apuesta")
            .locatedBy("//*[@id=\"formSuperAstro\"]/div/div[3]/div[2]/div[3]/h2");
    //*[@id="formSuperAstro"]/div/div[3]/div[2]/div[5]/h2

    public static Target INPUT_VALUE = Target.the("sacroll titulo digita el valor de la apuesta")
            .locatedBy("//input[@id=\"formSuperAstro:valorApuesta\"]");
     */








}
