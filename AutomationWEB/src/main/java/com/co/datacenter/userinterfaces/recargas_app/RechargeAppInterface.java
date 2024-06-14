package com.co.datacenter.userinterfaces.recargas_app;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RechargeAppInterface {
    public static Target BALANCE_BUTTON = Target.the("Boton de saldo de cuenta")
            .located(By.id("formMain:j_idt17"));
    public static Target RECHARGE_BALANCE_BUTTON = Target.the("Boton de recargar saldos")
            .located(By.id("j_idt23:j_idt48"));
    public static Target INPUT_VALUE_RECHARGE = Target.the("Input para ingresar el valor de la recharga")
            .located(By.id("mainForm:field_valor"));
    public static Target ALERT_PAY_METHOD = Target.the("Alerta de seleccionar metodo de pago")
            .located(By.id("mainForm:j_idt443"));
    public static Target METODO_PAGO = Target.the("Metodo de pago")
            .located(By.id("mainForm:j_idt39"));
    public static Target RADIO_BUTTON_PAY = Target.the("Boton para seleccionar el metodo de pago")
            .locatedBy("//div[@id=\"mainForm:opt2__1\"]");
    public static Target NEXT_BUTTON = Target.the("Boton de siguiente")
            .located(By.id("mainForm:j_idt105"));
    public static Target QUESTION_PIN_GENERADO = Target.the("Validacion pin generado exitosamente")
            .locatedBy("//span[contains(text(), 'PIN Generado correctamente')]");
}
