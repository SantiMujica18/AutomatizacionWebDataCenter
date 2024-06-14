package com.co.datacenter.userinterfaces.combo_millonario.confirm_combo_millonario;

import net.serenitybdd.screenplay.targets.Target;

public class ConfirmComboMillonarioInterface {

    public static Target SCROLL_ONE = Target.the("Scroll hasta valor")
            .locatedBy("//b[contains(text(), 'VALOR:')]");

    public static Target CHECK_BOX_PAY_COMBO_MILLONARIO = Target.the("Checkbox de metodo de pago")
            .locatedBy("//span[@class=\"ui-radiobutton-icon ui-icon ui-icon-blank ui-c\"]");

    //*[@id="mainForm:opt_22500"]/div[2]/span

    public static Target BTN_NEXT_COMBO_MILLONARIO = Target.the("Boton de siguiente")
            .locatedBy("//button[@id=\"mainForm:j_idt91\"]");

    public static Target BTN_ACCEPT_ALERT = Target.the("Boton de acceptar alerta seleciona un metodo de pago")
            .locatedBy("//button[@id=\"mainForm:j_idt429\"]");


    public static Target TITLE_VALIDATION_BUY= Target.the("Titulo de pago exitoso")
            .locatedBy("//span[contains(text(), 'Pago exitoso')]");

    public static Target BTN_PAY_COMBO_MILLONARIO = Target.the("Boton de pagar")
            .locatedBy("//button[@class=\"ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-left RedButton MarginRight ui-button-text-icon-right\"]");





}
