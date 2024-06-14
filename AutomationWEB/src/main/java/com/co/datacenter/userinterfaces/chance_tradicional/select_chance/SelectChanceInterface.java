package com.co.datacenter.userinterfaces.chance_tradicional.select_chance;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SelectChanceInterface {

    public static Target CHANCE= Target.the("servicio de apuestas").
            locatedBy("//a[@id=\"formApuestas:buttonChance\"]");
    public static Target SCROLL_CHANCE= Target.the("Titulo para ganar con nuestros juegos").
            locatedBy("//*[@id=\"formApuestas\"]/div[9]/div[3]/div[1]/div/h2");
    public static Target WELCOME_CHANCE = Target.the("titulo de bienvenida").
            locatedBy(("//a[@id=\"formChance:j_idt30\"]"));



























}
