package com.co.datacenter.questions.paga_encime.data_paga_encime;

import com.co.datacenter.userinterfaces.maxi_chance.data_maxi_chance.DataMaxiChanceInterface;
import com.co.datacenter.userinterfaces.paga_encime.data_paga_encime.DataPagaEncimeInterface;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class DataPagaEncimeQuestion {

    public static Question<String> dataPagaEncime(){
        return actor -> TextContent.of(DataPagaEncimeInterface.TITLE_CONFIRM_BUY).viewedBy(actor).asString();
    }
}
