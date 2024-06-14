package com.co.datacenter.tasks.login.max_screen;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ChangeBrowserWindowSize implements Task {

    private final int width;
    private final int height;

    public ChangeBrowserWindowSize(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public static Performable to(int width, int height) {
        return instrumented(ChangeBrowserWindowSize.class, width, height);
    }

    @Override
    @Step("{0} cambia el tamaño de la ventana a #width x #height")
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        driver.manage().window().setSize(new Dimension(width, height));
    }

}
