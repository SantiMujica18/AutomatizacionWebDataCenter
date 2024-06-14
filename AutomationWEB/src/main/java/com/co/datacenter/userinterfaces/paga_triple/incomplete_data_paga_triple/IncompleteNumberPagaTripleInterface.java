package com.co.datacenter.userinterfaces.paga_triple.incomplete_data_paga_triple;

import net.serenitybdd.screenplay.targets.Target;

public class IncompleteNumberPagaTripleInterface {

        public static Target FIRST_NUMBER = Target.the("Boton de numero aleatorio 1")
                .locatedBy("//button[@id='formChance:j_idt66']");

        public static Target DROPDOWN_1 = Target.the("Boton de deplegable 1")
                .locatedBy("//label[@id='formChance:idLoteria1_label']");

        public static Target SELECT_LOTERY = Target.the("Seleccion loteria 1")
                .locatedBy("//li[@id='formChance:idLoteria1_1']");

        public static Target TWO_NUMBER = Target.the("Boton de numero aleatorio 2")
                .locatedBy("//button[@id='formChance:j_idt106']");

        public static Target DROPDOWN_2 = Target.the("Boton de deplegable 2")
                .locatedBy("//label[@id='formChance:idLoteria2_label']");

        public static Target SELECT_LOTERY_2 = Target.the("Seleccion loteria 2")
                .locatedBy("//li[@id='formChance:idLoteria2_2']");

        public static Target THREE_NUMBER = Target.the("Boton de numero aleatorio 3")
                .locatedBy("//button[@id='formChance:j_idt146']");

        public static Target DROPDOWN_3 = Target.the("Boton de deplegable 2")
                .locatedBy("//label[@id='formChance:idLoteria3_label']");

        public static Target SELECT_LOTERY_3 = Target.the("Seleccion loteria 3")
                .locatedBy("//li[@id='formChance:idLoteria3_3']");


        public static Target DROPDOWN_4 = Target.the("Boton desplegable precio ")
                .locatedBy("//label[@id='formChance:idSelectValorApuesta_label']");

        public static Target SELECT_VALOR = Target.the("Seleccionar precio")
                .locatedBy("//li[@id='formChance:idSelectValorApuesta_2']");

        public static Target SELECT_MAX_VALUE = Target.the("Seleccionar valor maximo apuesta")
                .locatedBy("//li[@id='formChance:idSelectValorApuesta_14']");

        public static Target SELECT_MIN_VALUE = Target.the("Seleccionar precio")
                .locatedBy("//li[@id='formChance:idSelectValorApuesta_1']");

        public static Target BTN_NEXT = Target.the("Boton siguiente")
                .locatedBy("//button[@id='formChance:j_idt269']");

        public static Target QUESTION_MISSING_NUMBER = Target.the("Question de pregunta: Falta un numero")
                .locatedBy("//span[@class='ui-message-error-detail']");

    }

