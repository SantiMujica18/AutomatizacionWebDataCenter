package com.co.datacenter.userinterfaces.login;

import net.serenitybdd.screenplay.targets.Target;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;


public class LoginUserUserInterface{

    public static Target USERNAME = Target.the("correo").
            locatedBy("//input[@id=\"formMain:idFieldLogin\"]");
    public static Target PASSWORD = Target.the("contraseña").
            locatedBy("//input[@id=\"formMain:idFieldPwd\"]");
    public static Target CHECK_BOX_1 = Target.the("terminos").
            locatedBy("//span[@class=\"ui-chkbox-icon ui-icon ui-icon-blank ui-c\"]");
    public static Target CHECK_BOX_2 = Target.the("portafolio").
            locatedBy("//*[@id=\"formMain:field_portafolio\"]/div[2]/span");
    public static Target CHECK_BOX_3 = Target.the("terminos y condiciones").
            locatedBy("//div[@id=\"formMain:field_tratamiento\"]");
    //*[@id="formMain:field_tratamiento"]/div[2]


    public static Target BTN_LOGIN = Target.the("ingresar").
            locatedBy("//button[@id=\"formMain:idBtoLogin\"]");

    public static Target SESSION = Target.the("Boton emergente de cerrar todas la sesiones")
            .locatedBy("//button[@id=\"formMain:j_idt41\"]");

}
