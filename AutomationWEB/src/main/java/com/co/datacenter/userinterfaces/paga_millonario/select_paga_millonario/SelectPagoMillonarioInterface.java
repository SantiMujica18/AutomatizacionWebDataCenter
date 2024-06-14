package com.co.datacenter.userinterfaces.paga_millonario.select_paga_millonario;

import net.serenitybdd.screenplay.targets.Target;

public class SelectPagoMillonarioInterface {

    public static Target PAGA_MILLONARIO= Target.the("servicio de apuestas").
            locatedBy("//a[@id=\"formApuestas:buttonPagaMillonario\"]");
    public static Target SCROLL_CHANCE= Target.the("Titulo para ganar con nuestros juegos").
            locatedBy("//*[@id=\"formApuestas\"]/div[9]/div[3]/div[1]/div/h2");
    public static Target WELCOME_PAGA_MILLONARIO = Target.the("titulo de bienvenida").
            locatedBy(("//a[contains(text(), 'Mi Juego')]"));



























}
