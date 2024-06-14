package com.co.datacenter.userinterfaces.paga_encime.data_paga_encime;

import net.serenitybdd.screenplay.targets.Target;

public class DataPagaEncimeInterface {

    public static Target ONE_SCROLL = Target.the("Titulo de ¿Como Jugar?").
            locatedBy("//span[contains(text(), '¿CÓMO JUGAR?')]");

    public static Target BTN_SELEC_LOTTERY = Target.the("Boton seleccionar loteria").
            locatedBy("//button[@id=\"formPagaEncime:j_idt37\"]");

    public static Target CHECK_BOX_LOTTERY = Target.the("Check_box de loterias").
            locatedBy("//div[@id=\"formPagaEncime:j_idt44:0:j_idt46\"]");

    public static Target BTN_SAVE_LOTTERY = Target.the("Boton de guardar loteria").
            locatedBy("//button[@id=\"formPagaEncime:j_idt55\"]");

    public static Target INPUT_NUM_1 = Target.the("espacio 1")
            .locatedBy("//input[@id=\"formPagaEncime:j_idt61:0:idFieldNumero1\"]");

    public static Target INPUT_NUM_2 = Target.the("espacio 2")
            .locatedBy("//input[@id=\"formPagaEncime:j_idt61:0:idFieldNumero2\"]");

    public static Target INPUT_NUM_3 = Target.the("espacio 3")
            .locatedBy("//input[@id=\"formPagaEncime:j_idt61:0:idFieldNumero3\"]");

    /*Botones de numero aleatorios*/
    public static Target BTN_RAMDON_THREE = Target.the("Boton aleatorio de 3 cifras").
            locatedBy("//button[@id=\"formPagaEncime:j_idt61:0:j_idt70\"]");

    public static Target BTN_RAMDON_THREE_1 = Target.the("Boton aleatorio de 3 cifras").
            locatedBy("//button[@id=\"formPagaEncime:j_idt61:1:j_idt70\"]");
    public static Target BTN_RAMDON_THREE_2 = Target.the("Boton aleatorio de 3 cifras").
            locatedBy("//button[@id=\"formPagaEncime:j_idt61:2:j_idt70\"]");

    public static Target BTN_RAMDON_THREE_3 = Target.the("Boton aleatorio de 3 cifras").
            locatedBy("//button[@id=\"formPagaEncime:j_idt61:3:j_idt70\"]");



    /* Localizadores de el label valor */

    public static Target SELECT_VALUE = Target.the("seleccion de valor")
            .locatedBy("//label[@id=\"formPagaEncime:j_idt61:0:lstValorDistribuir_label\"]");

    public static Target SELECTED_VALUE = Target.the("valor seleccionado $1800")
            .locatedBy("//li[@id=\"formPagaEncime:j_idt61:0:lstValorDistribuir_1\"]");

    public static Target SELECT_VALUE_1 = Target.the("seleccion de valor")
            .locatedBy("//label[@id=\"formPagaEncime:j_idt61:1:lstValorDistribuir_label\"]");

    public static Target SELECTED_VALUE_1 = Target.the("valor seleccionado $1800")
            .locatedBy("//li[@id=\"formPagaEncime:j_idt61:1:lstValorDistribuir_1\"]");

    public static Target SELECT_VALUE_2 = Target.the("seleccion de valor")
            .locatedBy("//label[@id=\"formPagaEncime:j_idt61:2:lstValorDistribuir_label\"]");

    public static Target SELECTED_VALUE_2 = Target.the("valor seleccionado $1800")
            .locatedBy("//li[@id=\"formPagaEncime:j_idt61:2:lstValorDistribuir_1\"]");

    public static Target SELECT_VALUE_3 = Target.the("seleccion de valor")
            .locatedBy("//label[@id=\"formPagaEncime:j_idt61:3:lstValorDistribuir_label\"]");

    public static Target SELECTED_VALUE_3 = Target.the("valor seleccionado $1800")
            .locatedBy("//li[@id=\"formPagaEncime:j_idt61:3:lstValorDistribuir_1\"]");


    /*Titulo de validacion*/

    public static Target TITLE_CONFIRM_BUY = Target.the("Titulo de confirmacion de compra").
            locatedBy("//h1[contains(text(), 'Confirmación de compra')]");

    public static Target BTN_ADD_BET = Target.the("Boton añadir juego").
            locatedBy("//button[@id=\"formPagaEncime:commandButtonAdicionarJuego\"]");
    public static Target BTN_NEXT_PAGA_ENCIME = Target.the("Boton de siguiente").
            locatedBy("//button[@id=\"formPagaEncime:commandButtonSiguiente\"]");

    public static Target DELETE = Target.the("eliminar juego").
            locatedBy("//a[@id=\"formPagaEncime:j_idt94:0:j_idt102\"]");



    /* Botones de las alertas */

    public static Target ALERT_LOTTERY_EMPTY = Target.the("Boton de aceptar alerta de loteria no seleccionada").
            locatedBy("//button[@id=\"j_idt128\"]");

    public static Target ALERT_ADD_BET = Target.the("Boton de aceptar alerta de agregar apuesta").
            locatedBy("//button[@id=\"j_idt121\"]");

    public static Target ALERT_SPECIFIC_NUM = Target.the("Boton de aceptar alerta de especificar numero apostado").
            locatedBy("//button[@id=\"j_idt126\"]");

    public static Target ALERT_SPECIFIC_VALUE = Target.the("Boton de aceptar alerta de especificar valor apostado").
            locatedBy("//button[@id=\"j_idt127\"]");





}
