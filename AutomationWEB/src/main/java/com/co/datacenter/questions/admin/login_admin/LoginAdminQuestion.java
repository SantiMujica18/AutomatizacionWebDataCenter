package com.co.datacenter.questions.admin.login_admin;

import com.co.datacenter.userinterfaces.HomeAdminPage;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class LoginAdminQuestion {

    public static Question<String> loginAdminSuccessful(){
        return actor -> TextContent.of(HomeAdminPage.TITLE_WELCOME).viewedBy(actor).asString();
    }
}
