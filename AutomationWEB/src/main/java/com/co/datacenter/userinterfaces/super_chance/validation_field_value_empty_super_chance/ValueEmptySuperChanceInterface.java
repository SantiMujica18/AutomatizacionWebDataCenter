package com.co.datacenter.userinterfaces.super_chance.validation_field_value_empty_super_chance;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ValueEmptySuperChanceInterface {


    public static Target TITLE_SCROLL_1 = Target.the("titulo seleccione loterias o sorteo").
            locatedBy("//span[contains(text(), '¿CÓMO JUGAR?')]");

    public static Target LOTTERY_BTN_SELECT= Target.the("Boton de seleccionar loteria").
            locatedBy("//button[@id=\"formChance:j_idt41\"]");

    public static Target DAY_DOM = Target.the("dia domingo").
            located(By.xpath("//*[@id=\"formChance:tabListaDiasSuperChance\"]/ul/li[1]/a"));

    public static Target CHECK_BOX_DOM = Target.the("loteria del dia domingo").
            located(By.xpath("//*[@id=\"formChance:j_idt52:0:j_idt54\"]/div[2]/span"));


    public static Target DAY_LUN = Target.the("dia lunes").
            located(By.xpath("//*[@id=\"formChance:tabListaDiasSuperChance\"]/ul/li[1]/a"));

    public static Target CHECK_BOX_LUN = Target.the("loteria del dia lunes").
            located(By.xpath("//*[@id=\"formChance:j_idt52:0:j_idt54\"]/div[2]/span"));


    public static Target DAY_MAR = Target.the("dia martes").
            located(By.xpath("//*[@id=\"formChance:tabListaDiasSuperChance\"]/ul/li[2]/a"));

    public static Target CHECK_BOX_MAR = Target.the("loteria del dia martes").
            located(By.xpath("//*[@id=\"formChance:j_idt52:0:j_idt54\"]/div[2]/span"));

    public static Target DAY_MIE = Target.the("dia miercoles").
            located(By.xpath("//*[@id=\"formChance:tabListaDiasSuperChance\"]/ul/li[3]/a"));

    public static Target CHECK_BOX_MIE = Target.the("loteria del dia miercoles").
            located(By.xpath("//*[@id=\"formChance:j_idt52:0:j_idt54\"]/div[2]/span"));

    public static Target DAY_JUE = Target.the("dia jueves").
            located(By.xpath("//*[@id=\"formChance:tabListaDiasSuperChance\"]/ul/li[4]/a"));

    public static Target CHECK_BOX_JUE = Target.the("loteria del dia jueves").
            located(By.xpath("//*[@id=\"formChance:j_idt52:0:j_idt54\"]/div[2]/span"));

    public static Target DAY_VIE = Target.the("dia viernes").
            located(By.xpath("//*[@id=\"formChance:tabListaDiasSuperChance\"]/ul/li[5]/a"));

    public static Target CHECK_BOX_VIE = Target.the("loteria del dia viernes").
            located(By.xpath("//*[@id=\"formChance:j_idt52:0:j_idt54\"]/div[2]/span"));

    public static Target DAY_SAB = Target.the("dia sabado").
            located(By.xpath("//*[@id=\"formChance:tabListaDiasSuperChance\"]/ul/li[6]/a"));

    public static Target CHECK_BOX_SAB = Target.the("loteria del dia sabado").
            located(By.xpath("//*[@id=\"formChance:j_idt52:0:j_idt54\"]/div[2]/span"));

    public static Target BTN_SAVE = Target.the("boton de guardar resumen de juegos")
            .locatedBy("//button[@id=\"formChance:j_idt63\"]");

    public static Target INPUT_NUM_LOTTERY = Target.the("Ingreso de numero")
            .locatedBy("//*[@id=\"formChance:panelVistaJuego\"]/div/div[1]/div/div[1]");

    public static Target INPUT_NUM1 = Target.the("espacio 1")
            .locatedBy("//input[@id=\"formChance:j_idt69:0:idFieldNumero1\"]");

    public static Target INPUT_NUM2 = Target.the("espacio 2")
            .locatedBy("//input[@id=\"formChance:j_idt69:0:idFieldNumero2\"]");

    public static Target INPUT_NUM3 = Target.the("espacio 3")
            .locatedBy("//input[@id=\"formChance:j_idt69:0:idFieldNumero3\"]");

    public static Target INPUT_NUM4 = Target.the("espacio 4")
            .locatedBy("//input[@id=\"formChance:j_idt69:0:idFieldNumero4\"]");
    public static Target SELECT_VALUE = Target.the("seleccion de valor")
            .locatedBy("//label[@id=\"formChance:j_idt70:0:lstValorDistribuir_label\"]");

    public static Target SELECTED_VALUE = Target.the("valor seleccionado")
            .locatedBy("//li[@id=\"formChance:j_idt70:0:lstValorDistribuir_3\"]");

    public static Target TITLE_SCROLL_2 = Target.the("titulo de ingrese el numero")
            .locatedBy("//*[@id=\"formChance:panelVistaJuego\"]/div/h2");

    public static Target BUTTON_NEXT = Target.the("boton de siguiente")
            .locatedBy("//button[@id=\"formChance:commandButtonSiguiente\"]");

    public static Target TITLE_VALIDATION = Target.the("Validacion valor de apuesta")
            .locatedBy("//*[@id=\"dialogoModalAdvertenciaValores\"]/div[2]/span[2]");

    public static Target BTN_RANDOM_THREE = Target.the("boton random de tres cifras")
            .locatedBy("//button[@id='formChance:j_idt70:0:j_idt82']");

    public static Target BTN_ADD_GAME= Target.the("Boton agregar apuesta o adicionar juego")
            .locatedBy("//button[@id=\"formChance:commandButtonAdicionarJuego\"]");


    public static Target BTN_ACCEPT_ADD_GAME= Target.the("boton aceptar agregar juego")
            .locatedBy("//button[@id=\"j_idt364\"]");

    //Apuesta No2
    public static Target BTN_RANDOM_FOUR = Target.the("boton random de tres cifras")
            .locatedBy("//button[@id=\"formChance:j_idt70:1:j_idt82\"]");

    public static Target SELECT_VALUE_2 = Target.the("seleccion de valor")
            .locatedBy("//label[@id=\"formChance:j_idt70:1:lstValorDistribuir_label\"]");

    public static Target SELECTED_VALUE_2 = Target.the("valor seleccionado")
            .locatedBy("//li[@id='formChance:j_idt70:1:lstValorDistribuir_1']");

    //Apuesta No 3
    public static Target BTN_RANDOM_TRHEE_3 = Target.the("boton random de tres cifras")
            .locatedBy("//button[@id=\"formChance:j_idt70:2:j_idt82\"]");

    public static Target SELECT_VALUE_3 = Target.the("seleccion de valor")
            .locatedBy("//label[@id=\"formChance:j_idt69:2:lstValorDistribuir_label\"]");

    public static Target SELECTED_VALUE_3 = Target.the("valor seleccionado")
            .locatedBy("//*[@id=\"formChance:j_idt69:2:lstValorDistribuir_3\"]");


    //Apuesta No 4
    public static Target BTN_RANDOM_FOUR_4 = Target.the("boton random de tres cifras")
            .locatedBy("//button[@id=\"formChance:j_idt70:3:j_idt82\"]");

    public static Target SELECT_VALUE_4 = Target.the("seleccion de valor")
            .locatedBy("//label[@id=\"formChance:j_idt69:3:lstValorDistribuir_label\"]");

    public static Target SELECTED_VALUE_4 = Target.the("valor seleccionado")
            .locatedBy("//*[@id=\"formChance:j_idt69:3:lstValorDistribuir_5\"]");

    //Apuesta No 5
    public static Target BTN_RANDOM_FOUR_5 = Target.the("boton random de tres cifras")
            .locatedBy("//*[@id=\"formChance:j_idt69:4:j_idt81\"]/span");

    public static Target SELECT_VALUE_5 = Target.the("seleccion de valor")
            .locatedBy("//label[@id=\"formChance:j_idt69:4:lstValorDistribuir_label\"]");

    public static Target SELECTED_VALUE_5 = Target.the("valor seleccionado")
            .locatedBy("//*[@id=\"formChance:j_idt69:4:lstValorDistribuir_3\"]");

    public static Target BTN_SPECIFIC_VALUE = Target.the("boton aceptar validacion")
            .locatedBy("//button[@id=\"j_idt369\"]");

    public static Target BTN_ACCEPT = Target.the("boton aceptar validacion")
            .locatedBy("//button[@id='j_idt371']");
}
