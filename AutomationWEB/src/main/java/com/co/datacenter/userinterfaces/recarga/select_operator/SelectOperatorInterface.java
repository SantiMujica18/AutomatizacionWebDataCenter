package com.co.datacenter.userinterfaces.recarga.select_operator;

import net.serenitybdd.screenplay.targets.Target;



public class SelectOperatorInterface {

    public static Target WELCOME_OPERATOR = Target.the("titulo de bienvenida").
            locatedBy("//*[@id=\"formRecarga:j_idt30\"]");

    //SELECTORES DE LOS OPERADORES
    public static Target CLARO= Target.the("operador claro").
            locatedBy("//*[@id=\"formRecarga:j_idt48:1:j_idt53\"]");
    public static Target MOVISTAR = Target.the("Operador Movistar")
            .locatedBy("//a[@id='formRecarga:j_idt48:0:j_idt51']");
    public static Target TIGO = Target.the("Operador Tigo")
            .locatedBy("//a[@id='formRecarga:j_idt48:2:j_idt51']");
    public static Target AVANTEL = Target.the("Operador Avantel")
            .locatedBy("//a[@id='formRecarga:j_idt48:5:j_idt51']");
    public static Target ETB = Target.the("Operador Etb")
            .locatedBy("//a[@id='formRecarga:j_idt48:6:j_idt51']");
    public static Target EXITO = Target.the("Operador Exito")
            .locatedBy("//a[@id='formRecarga:j_idt48:7:j_idt51']");
    public static Target VIRGIN = Target.the("Operador Virgin")
            .locatedBy("//a[@id='formRecarga:j_idt48:8:j_idt51']");
    public static Target FLASH = Target.the("Operador Flash")
            .locatedBy("//a[@id='formRecarga:j_idt48:9:j_idt51']");
    public static Target WINGS = Target.the("Operador Wings")
            .locatedBy("//a[@id='formRecarga:j_idt48:10:j_idt51']");
    public static Target WOM = Target.the("Operador Wom")
            .locatedBy("//a[@id='formRecarga:j_idt48:11:j_idt51']");
    public static Target KALLEY = Target.the("Operador Kalley")
            .locatedBy("//a[@id='formRecarga:j_idt48:12:j_idt51']");
    public static Target UNICORN = Target.the("Operador Unicorn")
            .locatedBy("//a[@id='formRecarga:j_idt48:13:j_idt51']");
    public static Target CELULARES = Target.the("titulo celulares").
            locatedBy("//*[@id=\"formRecarga:wizard_recarga_content\"]/div/div[2]/li/div[1]/div[1]/h3");



}
