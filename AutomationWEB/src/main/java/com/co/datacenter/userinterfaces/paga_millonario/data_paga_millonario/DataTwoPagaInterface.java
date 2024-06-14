package com.co.datacenter.userinterfaces.paga_millonario.data_paga_millonario;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DataTwoPagaInterface{

    public static Target BTN_RANDOM_ONE = Target.the("Boton de numero aleatorio 1")
            .locatedBy("//button[@id=\"formPagaMillonario:j_idt65\"]");

    public static Target BTN_RANDOM_TWO = Target.the("Boton de numero aleatorio 2")
            .locatedBy("//button[@id=\"formPagaMillonario:j_idt72\"]");

    public static Target BTN_RANDOM_THREE = Target.the("Boton de numero aleatorio 3")
            .locatedBy("//button[@id=\"formPagaMillonario:j_idt79\"]");


    public static Target BTN_RANDOM_FOUR = Target.the("Boton de numero cuatro 4")
            .locatedBy("//button[@id=\"formPagaMillonario:j_idt86\"]");

    public static Target BTN_RANDOM_FIVE = Target.the("Boton de numero cuatro 5")
            .locatedBy("//button[@id=\"formPagaMillonario:j_idt93\"]");

    public static Target BTN_NEXT = Target.the("Boton de siguiente")
            //.locatedBy("//button[@id=\"formPagaMillonario:j_idt330\"]");
            .located(By.id("formPagaMillonario:j_idt330"));

    public static Target BTN_CLEAN = Target.the("Boton de limpiar")
            .locatedBy("//button[@id=\"formPagaMillonario:j_idt103\"]");

    public static Target TITLE_VALIDATION = Target.the("Titulo de validacion Confirmacion de compra")
            .locatedBy("//h1[contains(text(), 'Confirmación de compra')]");


    //lozalizadores de apuesta con cuatro cifras


    public static Target BTN_RANDOM_1_FOUR= Target.the("Boton de random 1 ")
            .locatedBy("//button[@id=\"formPagaMillonario:j_idt102\"]");

    public static Target BTN_RANDOM_2_FOUR= Target.the("Boton de random 2 ")
            .locatedBy("//button[@id=\"formPagaMillonario:j_idt109\"]");
    public static Target BTN_RANDOM_3_FOUR= Target.the("Boton de random 3 ")
            .locatedBy("//button[@id=\"formPagaMillonario:j_idt116\"]");

    public static Target BTN_RANDOM_4_FOUR= Target.the("Boton de random 4 ")
            .locatedBy("//button[@id=\"formPagaMillonario:j_idt123\"]");

    public static Target BTN_RANDOM_5_FOUR= Target.the("Boton de random 5 ")
            .locatedBy("//button[@id=\"formPagaMillonario:j_idt130\"]");

    public static Target INPUT_1= Target.the("Input de primer numero ")
            .locatedBy("//input[@id=\"formPagaMillonario:idFieldNumero1\"]");

    public static Target INPUT_2= Target.the("Input de segundo numero ")
            .locatedBy("//input[@id=\"formPagaMillonario:idFieldNumero2\"]");



    public static Target BTN_ALERT_SAME_NUMBER= Target.the("Boton de random 5 ")
            .locatedBy("//button[@id=\"formPagaMillonario:j_idt34\"]");

    public static Target UPDATE_CLEAN = Target.the("Click en titulo 3. Digita tus 5 números")
            .locatedBy("//h2[contains(text(), '3. Digita tus 5 números')]");

    public static Target BTN_NEXT_2= Target.the("Boton siguiente 4 cifras")
            .locatedBy("//span[contains(text(), 'Siguiente')]");









    //button[@id="formPagaMillonario:j_idt103"]








}
