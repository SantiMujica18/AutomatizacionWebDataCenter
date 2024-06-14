package com.co.datacenter.userinterfaces.chance_tradicional.date_chance;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import java.util.HashMap;

public class DataChanceInterface {

    public static Target SCROLL_1 = Target.the("Scroll seleccion de loterias").
            located(By.xpath("//*[@id=\"formChance\"]/div/div[2]/div[2]/div[1]/div[3]"));

    public static Target BTN_SELECT_LOTTERY= Target.the("boton de seleccionar loteria").
            locatedBy("//button[@id=\"formChance:j_idt40\"]");

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
            locatedBy("//*[@id=\"idDivModalidadSuperPlenoDirecto\"]/div[2]/p");



    public static Target INPUT_PLENO_DIRECTO= Target.the("input de valor pleno directo").
            locatedBy("//*[@id=\"formChance:j_idt75\"]");

    public static Target INPUT_PLENO_CONVINADO= Target.the("input de valor pleno convinado").
            locatedBy("//*[@id=\"formChance:itSuperPlenoCombinado\"]");

    public static Target SCROLL_3 = Target.the("Scroll boton siguiente").
            located(By.xpath("//*[@id=\"formChance:j_idt94\"]"));

    public static Target BTN_SIGUIENTE= Target.the(" boton siguiente").
            located(By.xpath("//button[@id=\"formChance:j_idt318\"]"));


    public static Target CONFIRM_BUY = Target.the("titulo de bienvenida").
            located(By.xpath("//*[@id=\"mainForm:j_idt36\"]/h1"));































}
