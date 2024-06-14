package com.co.datacenter.questions.login.signin;

import com.co.datacenter.userinterfaces.recarga.select_recharge.SelectRechargeInterface;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class LoginUserQuestion {


    public static Question<String> loginUser() {
        return actor -> TextContent.of(SelectRechargeInterface.WELCOME_TITLE).viewedBy(actor).asString();
    }


}
