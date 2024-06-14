package com.co.datacenter.userinterfaces.chance_tradicional.bet_three_figures_chance_pd;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BetThreeFigureChancePdInterface {

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
            locatedBy("//*[@id=\"formChance:j_idt80\"]");

    public static Target INPUT_PLENO_CONVINADO= Target.the("input de valor pleno convinado").
            locatedBy("//*[@id=\"formChance:j_idt83\"]");

    public static Target SCROLL_3 = Target.the("Scroll boton siguiente").
            located(By.xpath("//*[@id=\"formChance:j_idt94\"]"));

    public static Target BTN_SIGUIENTE= Target.the(" boton siguiente").
            located(By.xpath("//button[@id=\"formChance:j_idt318\"]"));


    public static Target ALERT_TITLE = Target.the("titulo de bienvenida").
            located(By.xpath("//*[@id=\"formMessagesGlobal:messagesGlobal_container\"]/div[2]/div/div[2]/span"));

    /*LOCALIZADORES DE LOS  y CHECK BOX LOTERIAS*/

    public static Target DAY_DOM = Target.the("dia domingo").
            located(By.xpath("//*[@id=\"formChance:j_idt42\"]/ul/li[1]"));



    public static Target DAY_LUN = Target.the("dia lunes").
            located(By.xpath("//*[@id=\"formChance:j_idt42\"]/ul/li[2]"));

    public static Target CHECK_BOX_LUN = Target.the("loteria del dia lunes").
            located(By.xpath("//*[@id=\"formChance:j_idt42:1:j_idt50:0:j_idt52\"]/div[2]"));


    public static Target DAY_MAR = Target.the("dia martes").
            located(By.xpath("//*[@id=\"formChance:j_idt42\"]/ul/li[3]"));

    public static Target CHECK_BOX_MAR = Target.the("loteria del dia martes").
            located(By.xpath("//*[@id=\"formChance:j_idt42:2:j_idt50:0:j_idt52\"]/div[2]"));

    public static Target DAY_MIE = Target.the("dia miercoles").
            located(By.xpath("//*[@id=\"formChance:j_idt42\"]/ul/li[4]"));

    public static Target CHECK_BOX_MIE = Target.the("loteria del dia miercoles").
            located(By.xpath("//*[@id=\"formChance:j_idt42:3:j_idt50:0:j_idt52\"]/div[2]"));

    public static Target DAY_JUE = Target.the("dia jueves").
            located(By.xpath("//*[@id=\"formChance:j_idt42\"]/ul/li[5]"));

    public static Target CHECK_BOX_JUE = Target.the("loteria del dia jueves").
            located(By.xpath("//*[@id=\"formChance:j_idt42:4:j_idt50:0:j_idt52\"]/div[2]"));

    public static Target DAY_VIE = Target.the("dia viernes").
            located(By.xpath("//*[@id=\"formChance:j_idt42\"]/ul/li[6]"));
    public static Target CHECK_BOX_VIE = Target.the("loteria del dia viernes").
            located(By.xpath("//*[@id=\"formChance:j_idt42:5:j_idt50:0:j_idt52\"]/div[2]"));

    public static Target DAY_SAB = Target.the("dia sabado").
            located(By.xpath("//*[@id=\"formChance:j_idt42\"]/ul/li[7]"));
    public static Target CHECK_BOX_SAB = Target.the("loteria del dia sabado").
            located(By.xpath("//*[@id=\"formChance:j_idt42:6:j_idt50:0:j_idt52\"]/div[2]"));


    public static Target SUCCESSFUL_PAY = Target.the("Scroll metodo de pago").
            located(By.xpath("//*[@id=\"mainForm:idVentaExitosa\"]/div[1]/span"));


    public static Target SCROLL_4 = Target.the("Scroll metodo de pago").
            located(By.xpath("//*[@id=\"mainForm:idPanelDatosMain\"]/p[4]"));

    public static Target CHECK_BOX_BALANCE_PAY = Target.the("check box de saldo de pago").
            located(By.xpath("//div[@id=\"mainForm:opt__1\"]"));

    public static Target BTN_NEXT = Target.the("boton de siguiente").
            located(By.id("mainForm:j_idt98"));


    public static Target BTN_ACCEP = Target.the("boton acceptar alerta").
            located(By.id("mainForm:j_idt445"));




}
