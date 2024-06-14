package com.co.datacenter.questions.paga_encime.select_paga_encime;

import com.co.datacenter.userinterfaces.loteries.select_loteries.SelectLoteriesInterface;
import com.co.datacenter.userinterfaces.paga_encime.select_paga_encime.SelectPagaEncimeInterface;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class SelectPagaEncimeQuestion {

    public static Question<String> selectPagaEncime(){
        return actor -> TextContent.of(SelectPagaEncimeInterface.TITLE_MI_JUEGO).viewedBy(actor).asString();
    }
}
