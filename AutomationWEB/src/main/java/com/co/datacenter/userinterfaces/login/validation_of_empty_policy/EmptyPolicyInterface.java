package com.co.datacenter.userinterfaces.login.validation_of_empty_policy;

import net.serenitybdd.screenplay.targets.Target;

public class EmptyPolicyInterface {

    public static Target USERNAME = Target.the("correo").
            locatedBy("//input[@id=\"formMain:idFieldLogin\"]");
    public static Target PASSWORD = Target.the("contraseña").
            locatedBy("//input[@id=\"formMain:idFieldPwd\"]");
    public static Target CHECK_BOX_1 = Target.the("terminos").
            locatedBy("//span[@class=\"ui-chkbox-icon ui-icon ui-icon-blank ui-c\"]");
    public static Target CHECK_BOX_2 = Target.the("portafolio").
            locatedBy("//*[@id=\"formMain:field_portafolio\"]/div[2]/span");
    public static Target TITLE_ALERT = Target.the("alerta de no valido").
            locatedBy("//*[@id=\"formMain:j_idt49\"]/span[2]");

    public static Target BTN_LOGIN = Target.the("ingresar").
            locatedBy("//button[@id=\"formMain:idBtoLogin\"]");
}
