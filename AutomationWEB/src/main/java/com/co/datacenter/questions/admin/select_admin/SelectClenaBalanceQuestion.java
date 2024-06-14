package com.co.datacenter.questions.admin.select_admin;

import com.co.datacenter.userinterfaces.admin.select_admin.SelectAdminInterface;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class SelectClenaBalanceQuestion {

    public static  Question<String> titleCleanBalance(){
        return actor -> TextContent.of(SelectAdminInterface.VALIDATION_TITLE).viewedBy(actor).asString();
    }
}
