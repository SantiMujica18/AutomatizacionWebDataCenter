package com.co.datacenter.userinterfaces.combo_millonario.data_combo_millonario;

import net.serenitybdd.screenplay.targets.Target;

public class DataTwoPageComboMillonarioInterface {

    public static Target INPUNT_1= Target.the("Primer campo de numero")
            .locatedBy("//input[@id=\"formComboMillonario:idFieldNumero1\"]");

    public static Target RANDOM_NUM_1= Target.the("Boton de random primer numero")
            .locatedBy("//button[@id=\"formComboMillonario:j_idt60\"]");

    public static Target CLEAN_1= Target.the("Boton de Limpiar primer numero")
            .locatedBy("//button[@id=\"formComboMillonario:j_idt61\"]");



    public static Target INPUNT_2= Target.the("Segundo campo de numero")
            .locatedBy("//input[@id=\"formComboMillonario:idFieldNumero2\"]");


    public static Target RANDOM_NUM_2= Target.the("Boton de ramdom segundo numero")
            .locatedBy("//button[@id=\"formComboMillonario:j_idt67\"]");


    public static Target CLEAN_2= Target.the("Boton de Limpiar segundo numero")
            .locatedBy("//button[@id=\"formComboMillonario:j_idt68\"]");

    public static Target UPDATE_SAME_NUMBER= Target.the("Click en el titulo para mostrar alerta de numero iguales")
            .locatedBy("//h2[contains(text(), '3. Digita tus 5 números, cada uno de cuatro cifras')]");

    public static Target ACCEPT_ALERT_SAME_NUMBER= Target.the("Boton de aceptar alerta numeros iguales")
            .locatedBy("//button[@id=\"formComboMillonario:j_idt34\"]");


    public static Target RANDOM_NUM_3= Target.the("Boton de ramdom tercer numero")
            .locatedBy("//button[@id=\"formComboMillonario:j_idt74\"]");

    public static Target RANDOM_NUM_4= Target.the("Boton de ramdom cuarto numero")
            .locatedBy("//button[@id=\"formComboMillonario:j_idt81\"]");
    public static Target RANDOM_NUM_5= Target.the("Boton de ramdom quinto numero")
            .locatedBy("//button[@id=\"formComboMillonario:j_idt88\"]");

    public static Target BTN_NEXT= Target.the("Boton de siguiente")
            .locatedBy("//button[@id=\"formComboMillonario:j_idt159\"]");

    public static Target TITLE_VALIDATION= Target.the("Titulo de validacion Confirmación de compra")
            .locatedBy("//h1[contains(text(), 'Confirmación de compra')]");














    //button[@id="formComboMillonario:j_idt159"]








}
