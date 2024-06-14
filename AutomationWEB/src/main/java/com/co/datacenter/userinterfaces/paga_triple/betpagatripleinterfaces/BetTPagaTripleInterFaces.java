package com.co.datacenter.userinterfaces.paga_triple.betpagatripleinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BetTPagaTripleInterFaces {

    /*ESCENARIO CONFIRMAR COMPRA*/
    public static Target RANDOM_NUMBER_1 = Target.the("Boton de numero aleatorio 1")
            .locatedBy("//button[@id='formChance:j_idt66']");

    public static Target DROPDOWN_1 = Target.the("Boton de deplegable 1")
            .locatedBy("//label[@id='formChance:idLoteria1_label']");

    public static Target SELECT_LOTERY = Target.the("Seleccion loteria 1")
            .locatedBy("//li[@id='formChance:idLoteria1_1']");
    public static Target RANDOM_NUMBER_2 = Target.the("Usuario coloca numero 2")
            .locatedBy("//button[@id='formChance:j_idt106']");

    public static Target DROPDOWN_2 = Target.the("Boton de deplegable 2")
            .locatedBy("//label[@id='formChance:idLoteria2_label']");

    public static Target SELECT_LOTERY_2 = Target.the("Seleccion loteria 2")
            .locatedBy("//li[@id='formChance:idLoteria2_2']");
    public static Target RANDOM_NUMBER_3 = Target.the("BOTON DE numero aleatorio 1")
            .locatedBy("//button[@id='formChance:j_idt146']");

    public static Target DROPDOWN_3 = Target.the("Boton de deplegable 2")
            .locatedBy("//label[@id='formChance:idLoteria3_label']");

    public static Target SELECT_LOTERY_3 = Target.the("Seleccion loteria 3")
            .locatedBy("//li[@id='formChance:idLoteria3_3']");

    public static Target DROPDOWN_4 = Target.the("Boton desplegable precio ")
            .locatedBy("//label[@id='formChance:idSelectValorApuesta_label']");
    public static Target SELECT_VALOR = Target.the("Seleccionar precio")
            .locatedBy("//li[@id='formChance:idSelectValorApuesta_2']");

    public static Target BTN_NEXT = Target.the("Boton siguiente")
            .locatedBy("//button[@id='formChance:j_idt269']");

    /*ESCENARIO COMPRA CON UN MISMO NUMERO*/



    public static Target FIRST_NUMBER = Target.the("Usuario coloca numero 1")
            .located(By.id("formChance:idField2Numero1"));
    public static Target SECOND_NUMBER = Target.the("Usuario coloca numero 2")
            .located(By.id("formChance:idField2Numero2"));
    public static Target THIRD_NUMBER = Target.the("Usuario coloca numero 3")
            .located(By.id("formChance:idField2Numero3"));

    /* ESCENARIO DAR CLICK EN LIMPIAR*/
    public static Target EMPTY_NUMBER_1 = Target.the("Usuario coloca numero 3")
            .located(By.id("formChance:idField2Numero3"));
    public static Target EMPTY_NUMBER_2 = Target.the("Usuario coloca numero 3")
            .located(By.id("formChance:idField2Numero3"));
    public static Target EMPTY_NUMBER_3 = Target.the("Usuario coloca numero 3")
            .located(By.id("formChance:idField2Numero3"));


    /*ESCENARIO VALOR MAXIMO DE APUESTA*/

    public static Target SELECT_MAX_VALUE = Target.the("Seleccionar valor maximo apuesta")
            .locatedBy("//li[@id='formChance:idSelectValorApuesta_14']");

    /*ESCENARIO VALOR MINIMO DE APUESTA*/
    public static Target SELECT_MIN_VALUE = Target.the("Seleccionar precio")
            .locatedBy("//li[@id='formChance:idSelectValorApuesta_1']");


    /*ESCENARIO LOTERIA REPETIDA*/
    public static Target QUESTIONS = Target.the(" loteria repetida ")
            .locatedBy("//div[@id='formChance:j_idt120']");


}


