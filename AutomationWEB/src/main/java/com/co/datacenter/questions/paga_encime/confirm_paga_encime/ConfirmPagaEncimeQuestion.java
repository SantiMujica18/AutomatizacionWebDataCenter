package com.co.datacenter.questions.paga_encime.confirm_paga_encime;

import com.co.datacenter.userinterfaces.maxi_chance.confirm_maxi_chance.ConfirmMaxiChanceInterface;
import com.co.datacenter.userinterfaces.paga_encime.confirm_paga_encime.ConfirmPagaEncimeInterface;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class ConfirmPagaEncimeQuestion {

    public static Question<String > confirmPagaEncime(){
        return actor -> TextContent.of(ConfirmPagaEncimeInterface.TITLE_VALIDATION).viewedBy(actor).asString();
    }
}
