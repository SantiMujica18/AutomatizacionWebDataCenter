package com.co.datacenter.userinterfaces.select_bets;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SelectBetsInterface {

    public static Target BETS= Target.the("servicio de apuestas").
            locatedBy("//li[@id=\"menuform:sm_jsa\"]");
    public static Target WELCOME_BET = Target.the("titulo de bienvenida").
            locatedBy("//div[@class='Container50 Responsive50 OvHidden juegaGana']");






























}
