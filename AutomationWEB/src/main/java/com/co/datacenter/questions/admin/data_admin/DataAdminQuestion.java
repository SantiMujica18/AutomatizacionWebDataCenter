package com.co.datacenter.questions.admin.data_admin;

import com.co.datacenter.userinterfaces.HomeAdminPage;
import com.co.datacenter.userinterfaces.admin.data_admin.DataAdminInterface;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class DataAdminQuestion {

    public static Question<String> dataAdminSuccessful(){
        return actor -> TextContent.of(DataAdminInterface.RESPONSE_QUESTION).viewedBy(actor).asString();
    }
}
