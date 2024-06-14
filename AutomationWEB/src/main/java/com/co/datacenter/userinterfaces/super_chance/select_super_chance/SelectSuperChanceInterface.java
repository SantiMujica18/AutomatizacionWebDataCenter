package com.co.datacenter.userinterfaces.super_chance.select_super_chance;

import net.serenitybdd.screenplay.targets.Target;

public class SelectSuperChanceInterface {

    public static Target SUPER_CHANCE= Target.the("servicio de super chance").
            locatedBy("//a[@id=\"formApuestas:buttonSuperChance\"]");
    public static Target SCROLL_SUPER_CHANCE= Target.the("scroll para seleccionar super chance").
            locatedBy("//a[@id=\"formApuestas:buttonChanceMillonario\"]");

    public static Target WELCOME_SUPER_CHANCE = Target.the("titulo de bienvenida").
            locatedBy(("//a[@id=\"formChance:j_idt30\"]"));



























}
