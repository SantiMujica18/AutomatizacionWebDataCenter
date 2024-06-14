package com.co.datacenter.tasks.buc.register_buc;
import com.co.datacenter.tasks.delay.Delay;
import com.co.datacenter.userinterfaces.buc.HomePageBUCInterfaces;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.WebElement;
import java.util.List;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class FillsTheFormBucTask implements Task {
    //FUNCION PARA LLENAR UN CAMPO CON VALORES DEFINIDOS HASTA SU LONGITUD MAXIMA
    private String generateRandomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = (int) (Math.random() * characters.length());
            stringBuilder.append(characters.charAt(index));
        }

        return stringBuilder.toString();
    }

    //FUNCION PARA LLENAR UN CAMPO CON VALORES DEFINIDOS
    private void insertValuesUntilMaxLength(int maxLength, Target field, Actor actor) {
        String value = "";

        while (value.length() < maxLength) {
            String randomString = generateRandomString(maxLength - value.length());
            value += randomString;
            actor.attemptsTo(Enter.theValue(value).into(field));
        }
    }


    //Validacion de radiobuttons si hay mas de uno
    private void selectSecondPepRadiobutton() {
        List<WebElement> pepRadiobuttons = getDriver().findElements(By.xpath("//p-radiobutton[@id='PEP']"));

        if (pepRadiobuttons.size() >= 2) {
            WebElement segundoPepRadiobutton = pepRadiobuttons.get(1);
            segundoPepRadiobutton.click();
        } else {
            System.out.println("No se encontraron al menos dos elementos con el ID PEP");
        }
    }

    //validacion de caracteres especiales y longitud de campos

    private void validateField(String fieldValue, int expectedLength) {
        boolean isLengthValid = fieldValue.length() == expectedLength;
        boolean containsInvalidCharacters = !fieldValue.matches("^[a-zA-Z0-9 ]*$");

        if (!isLengthValid || containsInvalidCharacters) {
            String validationMessage = "El campo no cumple con la longitud requerida o contiene caracteres no permitidos";
            System.out.println(validationMessage);
            throw new IllegalArgumentException(validationMessage);
        } else {
            String validationMessage = "El campo cumple con las validaciones requeridas";
            System.out.println(validationMessage);
        }
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(HomePageBUCInterfaces.EXPEDITION_DATE, isVisible()),
                Click.on(HomePageBUCInterfaces.EXPEDITION_DATE),
                Delay.ofMilliseconds(500),
                WaitUntil.the(HomePageBUCInterfaces.YEAR, isVisible()),
                WaitUntil.the(HomePageBUCInterfaces.YEAR, isEnabled()),
                Delay.ofMilliseconds(500),
                Click.on(HomePageBUCInterfaces.YEAR),
                Delay.ofMilliseconds(500),
                Click.on(HomePageBUCInterfaces.YEAR_SPECIFIC),
                Delay.ofMilliseconds(500),
                Click.on(HomePageBUCInterfaces.MONTH_SPECIFIC),
                Delay.ofMilliseconds(500),
                Click.on(HomePageBUCInterfaces.DAY_SPECIFIC),
                Delay.ofMilliseconds(500)
        );
        actor.attemptsTo(
                Enter.theValue("Bucaramanga").into(HomePageBUCInterfaces.EXPEDITION_PLACE),
                WaitUntil.the(HomePageBUCInterfaces.OPTION_EXPEDITION, isVisible()),
                Click.on(HomePageBUCInterfaces.OPTION_EXPEDITION),
                Delay.ofMilliseconds(500)
        );

        String expeditionPlaceValue = "Bucaramanga";
        validateField(expeditionPlaceValue, 11);
        insertValuesUntilMaxLength(2000, HomePageBUCInterfaces.FIRST_NAME, actor);

        actor.attemptsTo(
                Enter.theValue("Pruebas").into(HomePageBUCInterfaces.FIRST_NAME),
                Delay.ofMilliseconds(500),
                Enter.theValue("Pruebas").into(HomePageBUCInterfaces.SECOND_NAME),
                Delay.ofMilliseconds(500),
                Scroll.to(HomePageBUCInterfaces.EXPEDITION_DATE),
                Delay.ofMilliseconds(500),
                Enter.theValue("Pruebas").into(HomePageBUCInterfaces.FIRST_SURNAME),
                Delay.ofMilliseconds(500),
                Enter.theValue("Pruebas").into(HomePageBUCInterfaces.SECOND_SURNAME),
                Delay.ofMilliseconds(500)
        );
        actor.attemptsTo(
                Click.on(HomePageBUCInterfaces.BIRTH_DATE),
                Delay.ofMilliseconds(500),
                Click.on(HomePageBUCInterfaces.YEAR_TWO),
                Delay.ofMilliseconds(500),
                Click.on(HomePageBUCInterfaces.YEAR_SPECIFIC_TWO),
                Delay.ofMilliseconds(500),
                Click.on(HomePageBUCInterfaces.MONTH_SPECIFIC_TWO),
                Delay.ofMilliseconds(500),
                Click.on(HomePageBUCInterfaces.DAY_SPECIFIC_TWO),
                Delay.ofMilliseconds(500)
        );
        actor.attemptsTo(
                Enter.theValue("Bogo").into(HomePageBUCInterfaces.CITY),
                Delay.ofMilliseconds(500),
                Click.on(HomePageBUCInterfaces.CITY_AUTOCOMPLETE),
                Delay.ofMilliseconds(500)
        );
        actor.attemptsTo(
                Click.on(HomePageBUCInterfaces.GENRE),
                Delay.ofMilliseconds(500),
                Click.on(HomePageBUCInterfaces.NO_BINARY),
                Delay.ofMilliseconds(500)
        );
        actor.attemptsTo(
                Enter.theValue("3222123288").into(HomePageBUCInterfaces.PHONE_NUMBER),
                Delay.ofMilliseconds(500),
                Enter.theValue("3222123288").into(HomePageBUCInterfaces.CONFIRM_PHONE_NUMBER),
                Delay.ofMilliseconds(500),
                Enter.theValue("pruebas@yopmail.com").into(HomePageBUCInterfaces.EMAIL),
                Delay.ofMilliseconds(500),
                Enter.theValue("pruebas@yopmail.com").into(HomePageBUCInterfaces.CONFIRM_EMAIL),
                Delay.ofMilliseconds(500)
        );
        actor.attemptsTo(
                Click.on(HomePageBUCInterfaces.RESIDENCE_ADDRESS),
                WaitUntil.the(HomePageBUCInterfaces.RESIDENCE_ADDRESS_TITTLE, isVisible()),
                WaitUntil.the(HomePageBUCInterfaces.ADRRESS_BASE, isVisible()),
                WaitUntil.the(HomePageBUCInterfaces.ADRRESS_BASE, isEnabled()),
                Enter.theValue("Calle").into(HomePageBUCInterfaces.ADRRESS_BASE),
                Delay.ofMilliseconds(500),
                Click.on(HomePageBUCInterfaces.SELECT_OPTION_ONE),
                Delay.ofMilliseconds(500),
                Enter.theValue("1").into(HomePageBUCInterfaces.ADDRESS_NUMBER_ONE),
                Delay.ofMilliseconds(500),
                Enter.theValue("D").into(HomePageBUCInterfaces.COMPLEMENTARY_INFORMATION),
                Delay.ofMilliseconds(500),
                Click.on(HomePageBUCInterfaces.SELECT_OPTION_TWO),
                Delay.ofMilliseconds(500),
                Enter.theValue("40").into(HomePageBUCInterfaces.ADDRESS_NUMBER_TWO),
                Delay.ofMilliseconds(500),
                Enter.theValue("BIS").into(HomePageBUCInterfaces.COMPLEMENTARY_INFORMATION_TWO),
                Delay.ofMilliseconds(500),
                Click.on(HomePageBUCInterfaces.SELECT_OPTION_THREE),
                Delay.ofMilliseconds(500),
                Enter.theValue("75").into(HomePageBUCInterfaces.ADDRESS_NUMBER_TRHEE),
                Delay.ofMilliseconds(500),
                WaitUntil.the(HomePageBUCInterfaces.CHECK_ADD_DETAILS, isVisible()),
                WaitUntil.the(HomePageBUCInterfaces.CHECK_ADD_DETAILS, isEnabled()),
                Click.on(HomePageBUCInterfaces.CHECK_ADD_DETAILS),
                Delay.ofMilliseconds(500),
                Enter.theValue("Apartamento de pruebas").into(HomePageBUCInterfaces.INPUT_ADD_DETAILS),
                Delay.ofMilliseconds(500),
                Click.on(HomePageBUCInterfaces.BTN_CLEAN),
                Delay.ofMilliseconds(500)
        );
        actor.attemptsTo(
                WaitUntil.the(HomePageBUCInterfaces.RESIDENCE_ADDRESS_TITTLE, isVisible()),
                WaitUntil.the(HomePageBUCInterfaces.ADRRESS_BASE, isVisible()),
                WaitUntil.the(HomePageBUCInterfaces.ADRRESS_BASE, isEnabled()),
                Enter.theValue("Calle").into(HomePageBUCInterfaces.ADRRESS_BASE),
                Delay.ofMilliseconds(500),
                Click.on(HomePageBUCInterfaces.SELECT_OPTION_ONE),
                Delay.ofMilliseconds(500),
                Enter.theValue("1").into(HomePageBUCInterfaces.ADDRESS_NUMBER_ONE),
                Delay.ofMilliseconds(500),
                Enter.theValue("D").into(HomePageBUCInterfaces.COMPLEMENTARY_INFORMATION),
                Delay.ofMilliseconds(500),
                Click.on(HomePageBUCInterfaces.SELECT_OPTION_TWO),
                Delay.ofMilliseconds(500),
                Enter.theValue("40").into(HomePageBUCInterfaces.ADDRESS_NUMBER_TWO),
                Delay.ofMilliseconds(500),
                Enter.theValue("BIS").into(HomePageBUCInterfaces.COMPLEMENTARY_INFORMATION_TWO),
                Delay.ofMilliseconds(500),
                Click.on(HomePageBUCInterfaces.SELECT_OPTION_THREE),
                Delay.ofMilliseconds(500),
                Enter.theValue("75").into(HomePageBUCInterfaces.ADDRESS_NUMBER_TRHEE),
                Delay.ofMilliseconds(500),
                WaitUntil.the(HomePageBUCInterfaces.CHECK_ADD_DETAILS, isVisible()),
                WaitUntil.the(HomePageBUCInterfaces.CHECK_ADD_DETAILS, isEnabled()),
                Click.on(HomePageBUCInterfaces.CHECK_ADD_DETAILS),
                Delay.ofMilliseconds(500),
                Enter.theValue("Apartamento de pruebas").into(HomePageBUCInterfaces.INPUT_ADD_DETAILS),
                Delay.ofMilliseconds(500),
                Click.on(HomePageBUCInterfaces.BTN_SAVE_ADDRESS),
                Delay.ofMilliseconds(500)
        );
        actor.attemptsTo(
                Enter.theValue("12345ABCD").into(HomePageBUCInterfaces.REFERRAL_CODE),
                Delay.ofMilliseconds(500),
                Scroll.to(HomePageBUCInterfaces.REFERRAL_CODE)
        );

        selectSecondPepRadiobutton();

        actor.attemptsTo(
                Click.on(HomePageBUCInterfaces.TERMS_AND_CONDITIONS),
                Delay.ofMilliseconds(500),
                Click.on(HomePageBUCInterfaces.DATA_TREATMENT),
                Delay.ofMilliseconds(500),
                Click.on(HomePageBUCInterfaces.REGISTER_BUTTON),
                Delay.ofMilliseconds(500)
        );
    }

    public static FillsTheFormBucTask on() {
        return instrumented(FillsTheFormBucTask.class);
    }

}

