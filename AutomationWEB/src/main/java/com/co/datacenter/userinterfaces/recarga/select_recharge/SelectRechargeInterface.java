package com.co.datacenter.userinterfaces.recarga.select_recharge;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SelectRechargeInterface {
    public static Target WELCOME_TITLE = Target.the("titulo de bienvenida").
            locatedBy("//*[@id=\"formMain:idDatosUsuario\"]/div[1]/span[2]");

    public static Target RECHARGE= Target.the("servicio de recargas").
            located(By.id("menuform:sm_recarga_movil"));

    public static Target WELCOME_RECHARGE = Target.the("titulo de bienvenida").
            locatedBy("//a[@id=\"formRecarga:j_idt30\"]/");
    public static Target RECHARGE_MENU = Target.the("Boton de la barra nav para seleccionar recargas")
            .located(By.id("menuform:sm_recarga_movil"));


    public static Target INPUT_CELLPHONE_NUM = Target.the("numero de celular").
            locatedBy("//input[@id=\"formRecarga:field_celular\"]");


    public static Target SELECT_PACKAGE= Target.the("seleccionar paquete").
            locatedBy("//label[@id=\"formRecarga:j_idt85_label\"]");
    public static Target VALUE_PACKAGE= Target.the("valor del paquete").
            locatedBy("//*[@id=\"formRecarga:j_idt85_1\"]");


    public static Target CHECK_BOX_PAY= Target.the("seleccionar mi saldo para pagar").
            locatedBy("//*[@id=\"mainForm:opt__1\"]/div[2]/span");


    public static Target BTN_NEXT_PAY= Target.the("seleccionar mi saldo para pagar").
            locatedBy("//*[@id=\"mainForm:j_idt95\"]/span[2]");


























}
