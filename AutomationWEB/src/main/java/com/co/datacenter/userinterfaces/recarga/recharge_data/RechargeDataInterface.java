package com.co.datacenter.userinterfaces.recarga.recharge_data;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RechargeDataInterface {

    public static Target TITLE_REHCARGE_DATA = Target.the("realizar recarga").
            locatedBy("//*[@id=\"formRecarga:j_idt30\"]");

    public static Target INPUT_CELLPHONE_NUM = Target.the("numero de celular").
            locatedBy("//input[@id=\"formRecarga:field_celular\"]");

    public static Target SELECT_PACKAGE = Target.the("seleccion de paquete").
            locatedBy("//label[@id=\"formRecarga:j_idt85_label\"]");

    public static Target VALUE_PACKAGE = Target.the("valor del paquete").
            locatedBy("//*[@id=\"formRecarga:j_idt85_1\"]");

    public static Target BTN_NEXT_RECHARGE_DATE = Target.the("valor del paquete").
            locatedBy("//button[@id=\"formRecarga:wizard_recarga_next\"]");

    public static Target TITLE_CONFIRM = Target.the("titulo de confirmacion de compra").
            locatedBy("//*[@id=\"mainForm:j_idt36\"]/h1");

    public static Target BTN_ALERT = Target.the("Boton de alerta aceptar").
            locatedBy("//button[@class=\"ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-left RedButton\"]");

    public static Target VALUE_PACKAGE_x2 = Target.the("valor del paquete").
            locatedBy("//*[@id=\"formRecarga:j_idt85_2\"]");

    //SELECTORES PARA LOS OPERADORES QUE NO TIENEN TODOS LOS CAMPOS

    public static Target INPUT_RECHARGE_VALUE = Target.the("Input para realizar una recarga manualmente sin paquete")
            .located(By.id("formRecarga:field_valor"));


}
