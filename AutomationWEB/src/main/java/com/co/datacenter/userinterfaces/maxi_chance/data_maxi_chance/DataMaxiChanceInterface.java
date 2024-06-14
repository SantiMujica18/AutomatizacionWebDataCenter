package com.co.datacenter.userinterfaces.maxi_chance.data_maxi_chance;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DataMaxiChanceInterface {

    public static Target TITLE_SCROLL_1 = Target.the("Titulo de ¿Como Jugar?").
            locatedBy("//span[contains(text(), '¿CÓMO JUGAR?')]");

    public static Target BTN_SELEC_LOTTERY = Target.the("Boton seleccionar loteria").
            locatedBy("//button[@id=\"formChance:j_idt41\"]");

    public static Target CHECK_BOX_LOTTERY = Target.the("Check_box de loterias").
            locatedBy("//div[@id=\"formChance:j_idt52:0:j_idt54\"]");

    public static Target BTN_SAVE_LOTTERY = Target.the("//button[@id=\"formChance:j_idt63\"]").
            locatedBy("//button[@id=\"formChance:j_idt63\"]");

    public static Target INPUT_NUM_1 = Target.the("espacio 1")
            .locatedBy("//input[@id=\"formChance:j_idt70:0:idFieldNumero1\"]");

    public static Target INPUT_NUM_2 = Target.the("espacio 2")
            .locatedBy("//input[@id=\"formChance:j_idt70:0:idFieldNumero2\"]");

    public static Target INPUT_NUM_3 = Target.the("espacio 3")
            .locatedBy("//input[@id=\"formChance:j_idt70:0:idFieldNumero3\"]");

    public static Target INPUT_NUM_4 = Target.the("espacio 4")
            .locatedBy("//input[@id=\"formChance:j_idt70:0:idFieldNumero4\"]");


    public static Target INPUT_NUM_1_1 = Target.the("espacio 1")
            .locatedBy("//input[@id=\"formChance:j_idt70:1:idFieldNumero1\"]");

    public static Target INPUT_NUM_2_2 = Target.the("espacio 2")
            .locatedBy("//input[@id=\"formChance:j_idt70:1:idFieldNumero2\"]");

    public static Target INPUT_NUM_3_3 = Target.the("espacio 3")
            .locatedBy("//input[@id=\"formChance:j_idt70:1:idFieldNumero3\"]");

    public static Target INPUT_NUM_4_4 = Target.the("espacio 4")
            .locatedBy("//input[@id=\"formChance:j_idt70:1:idFieldNumero4\"]");

    public static Target INPUT_NUM_1_1_1 = Target.the("espacio 1")
            .locatedBy("//input[@id=\"formChance:j_idt70:2:idFieldNumero1\"]");

    public static Target INPUT_NUM_2_2_2 = Target.the("espacio 2")
            .locatedBy("//input[@id=\"formChance:j_idt70:2:idFieldNumero2\"]");

    public static Target INPUT_NUM_3_3_3 = Target.the("espacio 3")
            .locatedBy("//input[@id=\"formChance:j_idt70:2:idFieldNumero3\"]");

    public static Target INPUT_NUM_4_4_4 = Target.the("espacio 4")
            .locatedBy("//input[@id=\"formChance:j_idt70:2:idFieldNumero4\"]");

    public static Target INPUT_NUM_1_1_1_1 = Target.the("espacio 1")
            .locatedBy("//input[@id=\"formChance:j_idt70:3:idFieldNumero1\"]");

    public static Target INPUT_NUM_2_2_2_2 = Target.the("espacio 2")
            .locatedBy("//input[@id=\"formChance:j_idt70:3:idFieldNumero2\"]");

    public static Target INPUT_NUM_3_3_3_3 = Target.the("espacio 3")
            .locatedBy("//input[@id=\"formChance:j_idt70:3:idFieldNumero3\"]");

    public static Target INPUT_NUM_4_4_4_4 = Target.the("espacio 4")
            .locatedBy("//label[@id=\"formChance:j_idt70:1:lstValorDistribuir_label\"]");




    public static Target SELECT_VALUE = Target.the("seleccion de valor")
            .locatedBy("//label[@id=\"formChance:j_idt70:0:lstValorDistribuir_label\"]");


    public static Target SELECTED_VALUE = Target.the("valor seleccionado $1200")
            .locatedBy("//li[@id=\"formChance:j_idt70:0:lstValorDistribuir_1\"]");

    public static Target BTN_RAMDON_FOUR = Target.the("Boton aleatorio de 4 cifras").
            locatedBy("//button[@id=\"formChance:j_idt70:0:j_idt80\"]");

    public static Target BTN_RAMDON_THREE = Target.the("Boton aleatorio de 3 cifras").
            locatedBy("//button[@name='formChance:j_idt70:0:j_idt82']");
    //button[@id="formChance:j_idt70:0:j_idt81"]
    public static Target BTN_ADD_GAME= Target.the("Boton de agregar juego").
            locatedBy("//button[@id=\"formChance:commandButtonAdicionarJuego\"]");

    public static Target INPUT_DELETE = Target.the("Check box para seleccionar juego").
            locatedBy("//input[@id=\"formChance:j_idt278:0:selectBooleanCheckBoxJuego\"]");

    public static Target DELETE = Target.the("eliminar juego").
            locatedBy("//*[contains(text(), 'Eliminar')]");

    public static Target BTN_NEXT = Target.the("Boton de siguiente").
            locatedBy("//button[@id=\"formChance:commandButtonSiguiente\"]");

    public static Target TITLE_VALIDATION = Target.the("Titulo de confirmacion de compra").
            locatedBy("//h1[contains(text(), 'Confirmación de compra')]");

    // ---------------- Localizadores Add maximum bets ----------------------------------------//


    public static Target BTN_RAMDON_FOUR_1 = Target.the("Boton aleatorio de 4 cifras").
            locatedBy("//button[@id=\"formChance:j_idt70:1:j_idt80\"]");

    public static Target SELECT_VALUE_1 = Target.the("seleccion de valor")
            .locatedBy("//label[@id=\"formChance:j_idt70:1:lstValorDistribuir_label\"]");

    public static Target SELECTED_VALUE_1 = Target.the("valor seleccionado $1200")
            .locatedBy("//li[@id=\"formChance:j_idt70:1:lstValorDistribuir_1\"]");

    public static Target BTN_RAMDON_FOUR_2 = Target.the("Boton aleatorio de 4 cifras").
            locatedBy("//button[@id=\"formChance:j_idt70:2:j_idt80\"]");

    public static Target SELECT_VALUE_2 = Target.the("seleccion de valor")
            .locatedBy("//label[@id=\"formChance:j_idt70:2:lstValorDistribuir_label\"]");

    public static Target SELECTED_VALUE_2 = Target.the("valor seleccionado $1200")
            .locatedBy("//li[@id=\"formChance:j_idt70:2:lstValorDistribuir_1\"]");


    public static Target BTN_RAMDON_FOUR_3 = Target.the("Boton aleatorio de 4 cifras").
            locatedBy("//button[@id=\"formChance:j_idt70:3:j_idt80\"]");

    public static Target SELECT_VALUE_3 = Target.the("seleccion de valor")
            .locatedBy("//label[@id=\"formChance:j_idt70:3:lstValorDistribuir_label\"]");

    public static Target SELECTED_VALUE_3 = Target.the("valor seleccionado $1200")
            .locatedBy("//li[@id=\"formChance:j_idt70:3:lstValorDistribuir_1\"]");




    // ---------------- Localizadores de ventanas emergentes validaciones ------------------- //


    //Especificar Valor Apostado para Juego Anterior
    public static Target BTN_ACCEP_VALUE_EMPTY = Target.the("Boton de aceptar validacion campo de valor vacio").
           locatedBy("//button[@id=\"j_idt369\"]");

    public static Target VALIDATION_TITLE_VALUE_EMPTY = Target.the("Titulo de validacion campo de valor vacio").
            locatedBy("//span[contains(text(), 'Especificar Valor Apostado para Juego Anterior')]");



    //Informacion Adicion Juego
    public static Target BTN_ACCEP_ADDITIONAL_INFO = Target.the("Boton de aceptar informacion adicional").
            locatedBy("//button[@id=\"j_idt364\"]");

    public static Target VALIDATION_TITLE_ADDITIONAL_INFO = Target.the("Boton de aceptar informacion adicional").
            locatedBy("//span[contains(text(), 'Informacion Adicion Juego')]");


    //Aviso Advertencia Seleccionar Loterias primero
    public static Target BTN_ACCEP_VALIDATION_DAY_LOTTERIES= Target.the("Boton de aceptar validacion de dia y loterias ").
            locatedBy("//button[@id=\"j_idt370\"]");

    public static Target VALIDATION_TITLE_DAY_LOTTERIES= Target.the("titulo de validacion de dia y loterias ").
            locatedBy("//span[contains(text(), 'Validación día y Loterias Número Aleatorio')]");


    //Especificar Número de Juego Anterior
    public static Target BTN_ACCEP_SPECIFY_NUM = Target.the("Boton de aceptar validacion de especificar numero de juego anterios").
            locatedBy("//button[@id=\"j_idt368\"]");

    public static Target VALIDATION_TITLE_SPECIFY_NUM = Target.the("titulo de validacion de especificar numero de juego anterios").
            locatedBy("//span[contains(text(), 'Especificar Número de Juego Anterior')]");


    //Máximo 5 Numeros
    public static Target BTN_ACCEP_MAX_NUM = Target.the("Boton de aceptar validacion de maximo 5 numeros apostados").
            locatedBy("//button[@id='j_idt367']");
                                       //button[@id="j_idt351"]
    public static Target VALIDATION_TITLE_MAX_NUM = Target.the("Titulo de validacion de maximo 5 numeros apostados").
            locatedBy("//span[contains(text(), 'Máximo 5 Numeros')]");

    //No se pudo completar la transaccion.

    public static Target ALERT_NOT_TO_COMPLET = Target.the("Alerta de no se pudo completar la transaccion").
            locatedBy(
                    "//span[contains(text(), 'Debes seleccionar un método de pago para realizar esta transacción')]");
                    //span[contains(text(), 'No se pudo completar la transaccion.')]

    public static Target BTN_PREVIOUS_PAGE = Target.the("Boton de anterior").
            locatedBy("//button[@id=\"mainForm:j_idt99\"]");


    public static Target BTN_ACCEPT_NOTIFICACTION = Target.the("Boton de aceptar notificacion").
            locatedBy("//button[@id=\"mainForm:j_idt418\"]");














































}
