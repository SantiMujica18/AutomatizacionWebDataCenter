package com.co.datacenter.questions.gelsaapp.olvidarcontraseña;

import com.co.datacenter.userinterfaces.gelsaapp.olvidarcontraseña.OlvidarContraseñaInterface;
import com.co.datacenter.userinterfaces.recarga.select_recharge.SelectRechargeInterface;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class OlvidarContraseñaQuestion {


    public static Question<String> OlvidarClave() {
        return actor -> TextContent.of(OlvidarContraseñaInterface.TITLE_CONFIRMATION).viewedBy(actor).asString();
    }


}
