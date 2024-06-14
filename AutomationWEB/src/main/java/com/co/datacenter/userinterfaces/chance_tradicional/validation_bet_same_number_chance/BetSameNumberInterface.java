package com.co.datacenter.userinterfaces.chance_tradicional.validation_bet_same_number_chance;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BetSameNumberInterface {

    public static Target SCROLL_1 = Target.the("Scroll seleccion de loterias").
            located(By.xpath("//*[@id=\"formChance\"]/div/div[2]/div[2]/div[1]/div[3]"));

    public static Target BTN_SELECT_LOTTERY= Target.the("boton de seleccionar loteria").
            locatedBy("//button[@id=\"formChance:j_idt40\"]");
    public static Target BUTTON_GENERATE_NUM= Target.the("boton numero de apuesta").
            locatedBy("//button[@id=\"formChance:j_idt68\"]");

    public static Target DAY_LOTTERY= Target.the("dia seleccionado").
            locatedBy("//*[@id=\"formChance:j_idt42\"]/ul/li[5]");


    public static Target CKECK_BOX_ALL_LOTTERY= Target.the("boton de seleccionar loteria").
            locatedBy("//*[@id=\"formChance:j_idt42:2:j_idt45\"]/div[3]");

    public static Target CKECK_BOX_LOTTERY= Target.the("boton de seleccionar loteria").
            locatedBy("//*[@id=\"formChance:j_idt42:4:j_idt50:0:j_idt52\"]/div[2]/span");


    public static Target BTN_ACCEPT_LOTTERY= Target.the("boton de aceptar loterias").
            locatedBy("//button[@id=\"formChance:j_idt57\"]");

    public static Target SCROLL_2 = Target.the("Scroll seleccion de modalidad de apuesta").
            located(By.xpath("//*[@id=\"formChance:j_idt70\"]"));

    public static Target INPUT_NUM= Target.the("numero de apuesta").
            locatedBy("//input[@id=\"formChance:idFieldNumero\"]");

    public static Target CLICK_UPDATE= Target.the("clicl para habilitar los input").
            locatedBy("//*[@id=\"formChance:idPanelseleccionarModalidad\"]/div[1]");

    public static Target INPUT_PLENO_DIRECTO= Target.the("input de valor pleno directo").
            locatedBy("//*[@id=\"formChance:j_idt75\"]");

    public static Target INPUT_PLENO_CONVINADO= Target.the("input de valor pleno convinado").
            locatedBy("//*[@id=\"formChance:itSuperPlenoCombinado\"]");

    public static Target SCROLL_3 = Target.the("Scroll boton siguiente").
            located(By.xpath("//*[@id=\"formChance:j_idt94\"]"));

    public static Target BTN_ADD_GAME= Target.the("Button de agregar juego").
            locatedBy("//button[@id=\"formChance:j_idt96\"]");

    public static Target BTN_SIGUIENTE= Target.the(" boton siguiente").
            located(By.xpath("//button[@id=\"formChance:j_idt309\"]"));


    public static Target ALERT_TITLE = Target.the("titulo de alerta").
            located(By.xpath("//*[@id=\"formMessagesGlobal:messagesGlobal_container\"]/div/div/div[2]/span"));






























}
