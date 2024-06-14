package com.co.datacenter.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://chaxtest.pagatodo.com.co:8643/pages/app/ingreso.xhtml")

public class HomeAdminPage extends PageObject {

    /*--------LOCALIZADORES HOME PAGE PANEL ADMINISTRADOR---------*/
    public static Target INPUT_NAME = Target.the("Campo de nombre de usuario")
            .locatedBy("//input[@id=\"inputLogin:j_username\"]");

    public static Target INPUT_PASSWORD = Target.the("Campo de ingresar contraseña")
            .locatedBy("//input[@id=\"inputLogin:j_password\"]");

    public static Target BTN_GET_INTO = Target.the("Boton de ingresar")
            .locatedBy("//button[@id=\"inputLogin:buttonLogin\"]");

    //Titulo de validacion

    public static Target TITLE_WELCOME = Target.the("Titulo de Bienvenido")
            .locatedBy("//h1[contains(text(), 'Bienvenido')]");
}
