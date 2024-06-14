package com.co.datacenter.questions.super_chance.confirm_super_chance;

import com.co.datacenter.userinterfaces.super_chance.confirm_super_chance.ConfirmSuperChanceInterface;
import com.co.datacenter.userinterfaces.super_chance.data_super_chance.DataSuperChanceInterface;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class ConfirmSuperChanceQuestion {

    public static Question<String> confirmSuperChance() {
        return actor -> TextContent.of(ConfirmSuperChanceInterface.SUCCESSFUL_PAY_SUPER_CHANCE).viewedBy(actor).asString();
    }
}
