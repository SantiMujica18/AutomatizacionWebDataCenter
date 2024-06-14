package com.co.datacenter.questions.buc;

import com.co.datacenter.userinterfaces.buc.HomePageBUCInterfaces;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;
import net.serenitybdd.screenplay.targets.Target;

public class EntryToTheDataRecordTableQuestions  {



    public static Question<String> EntryToTheDataRecordTable(){
        return actor -> TextContent.of(HomePageBUCInterfaces.REGISTRATION_PAGE).viewedBy(actor).asString();

    }
}
