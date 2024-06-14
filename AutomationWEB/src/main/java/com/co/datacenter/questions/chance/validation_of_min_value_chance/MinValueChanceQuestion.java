package com.co.datacenter.questions.chance.validation_of_min_value_chance;

import com.co.datacenter.userinterfaces.chance_tradicional.validation_of_min_value_chance.MinValueChanceInterface;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

//import static com.co.datacenter.userinterfaces.validation_of_min_value_chance.MinValueChanceInterface.COMPONENTES_CON_CLASE_CSS;

public class MinValueChanceQuestion {

    public static Question<String> minValueChance() {
        return actor -> TextContent.of(MinValueChanceInterface.ALERT_TITLE).viewedBy(actor).asString();
    }
    /*
    public static Question<Integer> cantidadDeComponentesVisibles (){

      return Question.about("cantidad de componentes visibles")
            .answeredBy(actor -> Integer.valueOf(WebElementQuestion.valueOf(COMPONENTES_CON_CLASE_CSS).answeredBy(actor).getValue()));
    }

     */


}
