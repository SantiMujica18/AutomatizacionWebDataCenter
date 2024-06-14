package com.co.datacenter.questions;

import com.co.datacenter.userinterfaces.chance_tradicional.bet_four_figure_chance_spd.BetFourFigureChanceSpdInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.By;

import java.util.List;


public class BotonSelectLotterieQuestion implements Question<Boolean> {


    @Override
    public Boolean answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).find((List<By>) BetFourFigureChanceSpdInterface.SEE_CHECK_BOX).isVisible();
    }

    public static BotonSelectLotterieQuestion at(){
        return new BotonSelectLotterieQuestion();
    }
}
