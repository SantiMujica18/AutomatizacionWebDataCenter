package com.co.datacenter.userinterfaces.maxi_chance.select_maxi_chance;

import net.serenitybdd.screenplay.targets.Target;

public class SelectMaxiChanceInterface {

    public static Target MAXI_CHANCE= Target.the("servicio de apuestas maxi chance").
            locatedBy("//a[@id=\"formApuestas:buttonMaxiChance\"]");
    public static Target SCROLL_MAXI_CHANCE= Target.the("Titulo para ganar con nuestros juegos").
            locatedBy("//a[@id=\"formApuestas:buttonChance\"]");
    public static Target WELCOME_MAXI_CHANCE = Target.the("titulo de bienvenida").
            locatedBy(("//a[@id=\"formChance:j_idt30\"]"));



























}
