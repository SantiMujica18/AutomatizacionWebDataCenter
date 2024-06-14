package com.co.datacenter.userinterfaces.gelsaapp.olvidarcontraseña;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("http://10.101.0.10:8080/gelsaapp/login.xhtml")
public class OlvidarContraseñaInterface extends PageObject {

    public static Target LINK_OLVIDAR_CLAVE = Target.the("Enlace de olvidar clave")
            .located(By.id("olvideClave"));
    public static Target INPUT_USER = Target.the("Input para ingresar usuario")
            .located(By.id("olvideClave:j_idt14"));
    public static Target BTN_GET = Target.the("Boton de solicitar")
            .located(By.id("olvideClave:j_idt16"));
    public static Target BTN_ALERT_CLOSE = Target.the("Boton de cerrar alerta")
            .located(By.id("olvideClave:j_idt19"));
    public static Target TITLE_CONFIRMATION = Target.the("Titulo de confirmacion")
            .located(By.id("olvideClave:confirmacion_title"));
    public static Target BTN_CONFIRMATION_YES = Target.the("Boton de confirmacion SI")
            .located(By.id("olvideClave:j_idt20"));








}
