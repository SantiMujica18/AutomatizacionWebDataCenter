package com.co.datacenter.userinterfaces.login.validation_of_empty_login_fields;

import net.serenitybdd.screenplay.targets.Target;

public class LoginEmptyFieldsInterface {

    public static Target USERNAME = Target.the("correo").
            locatedBy("//input[@id=\"formMain:idFieldLogin\"]");
    public static Target PASSWORD = Target.the("contraseña").
            locatedBy("//input[@id=\"formMain:idFieldPwd\"]");

    public static Target TITLE_ALERT = Target.the("alerta de no valido").
            locatedBy("//*[@id=\"formMain:j_idt35\"]/div/ul/li/span");

    public static Target BTN_LOGIN = Target.the("ingresar").
            locatedBy("//button[@id=\"formMain:idBtoLogin\"]");

}
