package com.co.datacenter.userinterfaces.buc;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

import javax.swing.plaf.PanelUI;

@DefaultUrl("https://bucqa.dcsas.com.co:8116")

public class HomePageBUCInterfaces extends PageObject {


    //LOCALIZADORES DE LOGIN
    public static Target DOCUMENT_TYPE = Target.the("OPCION DE TIPO DE DOCUMENTO").
            locatedBy("//input[@id='listTipoDocumento']");
    public static Target BUTONN_ARROW = Target.the("Boton de opcion de documento").
            locatedBy("//button[@class='p-element p-ripple p-autocomplete-dropdown p-button-icon-only ng-tns-c28-4 p-button p-component ng-star-inserted']");
    public static Target CITIZENSHIP_CARD_CC = Target.the("OPCION DE CEDULA DE CIUDADANIA").
            locatedBy("(//li[@class='p-ripple p-element p-autocomplete-item ng-tns-c28-4 ng-star-inserted'])[2]");//*[@id="pr_id_5_list"]/li[2]
    public static Target CITIZENSHIP_CARD_CE = Target.the("OPCION DE CEDULA DE EXTRANJERIA").
            locatedBy("//*[@id=\"pr_id_5_list\"]/li[1]");
    public static Target CITIZENSHIP_CARD_PASSPORT = Target.the("Pasaporte").
            locatedBy("(//li[@class='p-ripple p-element p-autocomplete-item ng-tns-c28-4 ng-star-inserted'])[3]");
    public static Target CITIZENSHIP_CARD_PEDP = Target.the("opcion de Permiso especial de permanencia").
            locatedBy("//span[contains(text(),'Permiso Especial de Permanencia')]");
    public static Target CITIZENSHIP_CARD_PEDPPEFDLF = Target.the("Input Permiso Especial de Permanencia para el Fomento de la Formalización").
            locatedBy("//span[contains(text(),'Permiso Especial de Permanencia para el Fomento de la Formalización')]");
    public static Target CITIZENSHIP_CARD_PPPT = Target.the("Input Permiso por Protección Temporal").
            locatedBy("//span[contains(text(),'Permiso por Protección Temporal')]");
    public static Target DOCUMENT_NUMBER = Target.the("NUMERO DE DOCUMENTO").
            locatedBy("//input[@placeholder='Escribe tu número de identificación']");
    public static Target RECAPTCHA = Target.the(" RECAPTCHA").
            locatedBy("//span[@class='recaptcha-checkbox goog-inline-block recaptcha-checkbox-unchecked rc-anchor-checkbox']");

    public static Target VALIDATE_DATA = Target.the(" BOTON VALIDAR DATOS").
            locatedBy("//button[@class='p-ripple p-element p-button p-component']");

    public static Target REGISTRATION_PAGE = Target.the(" TITULO DE LA LANDING ").
            locatedBy("//img[@src='assets/LOGO_Paga_Todo.png']");
    //div[@class='elementos-head TexAlCenter dialog-title']
    //---------------------------------LOCALIZADORES DE REGISTRO---------------------------------------------//
    public static Target EXPEDITION_DATE = Target.the("Fecha de expedicion del documento")
            .located(By.id("EXPEDITION_DATE"));
    public static Target YEAR = Target.the("Año de expedicion")
            .locatedBy("//button[contains(text(), '2024')]");
    public static Target LEFT_ARROW = Target.the("Boton de flecha retroceder año")
            .locatedBy("//button[@class='p-ripple p-element p-datepicker-prev p-link ng-tns-c38-15 ng-star-inserted']");
    public static Target YEAR_SPECIFIC = Target.the("Boton de año especifico(2000)")
            .locatedBy("//span[contains(text(), ' 2020 ')]");
    public static Target MONTH_SPECIFIC = Target.the("Boton de mes especifico(Semptiembre)")
            .locatedBy("//span[contains(text(), ' ene ')]");
    public static Target DAY_SPECIFIC = Target.the("Boton de dia especifico(29)")
            .locatedBy("//*[@id=\"EXPEDITION_DATE\"]/span/div/div/div/div[2]/table/tbody/tr[2]/td[6]");
    public static Target EXPEDITION_PLACE = Target.the("Input lugar de expedicion del documento")
            .locatedBy("//input[@id='24']");
    public static Target OPTION_EXPEDITION = Target.the("Opcion bogota menu desplegable")
            .locatedBy("//span[contains(text(), 'Bucaramanga - Santander')]");
    public static Target FIRST_NAME = Target.the("Input del primer nombre")
            .locatedBy("//input[@placeholder='Escribe tu primer nombre']");
    public static Target SECOND_NAME = Target.the("Input del segundo nombre")
            .locatedBy("//input[@placeholder='Escribe tu segundo nombre']");
    public static Target FIRST_SURNAME = Target.the("Input del primer apelldio")
            .locatedBy("//input[@placeholder='Escribe tu primer apellido']");
    public static Target SECOND_SURNAME = Target.the("Input del primer apelldio")
            .locatedBy("//input[@placeholder='Escribe tu segundo apellido']");
    public static Target BIRTH_DATE = Target.the("Input de fecha de nacimiento")
            .located(By.id("DATE_OF_BIRTH"));
    public static Target YEAR_TWO = Target.the("Año de expedicion")
            .locatedBy("//button[contains(text(), ' 2006 ')]");
    public static Target LEFT_ARROW_TWO = Target.the("Boton de flecha retroceder año")
            .locatedBy("//*[@id=\"DATE_OF_BIRTH\"]/span/div/div/div/div[1]/button[1]");
    public static Target YEAR_SPECIFIC_TWO = Target.the("Boton de año especifico(2000)")
            .locatedBy("//span[contains(text(), ' 2000')]");
    public static Target MONTH_SPECIFIC_TWO = Target.the("Boton de mes especifico(Semptiembre)")
            .locatedBy("//span[contains(text(), ' ene ')]");
    public static Target DAY_SPECIFIC_TWO = Target.the("Boton de dia especifico(29)")
            .locatedBy("//*[@id=\"DATE_OF_BIRTH\"]/span/div/div/div/div[2]/table/tbody/tr[5]/td[7]");
    public static Target CITY = Target.the("Input de ciudad o residencia actual")
            .locatedBy("//input[@id='23']");
    public static Target CITY_AUTOCOMPLETE = Target.the("Opcion desplegada Bogota")
            .locatedBy("//span[contains(text(), 'BOGOTÁ D.C - Bogotá, D.C.')]");
    public static Target NATIONALITY = Target.the("Input de la nacionalidad")
            .locatedBy("//button[@class='p-element p-ripple p-autocomplete-dropdown p-button-icon-only ng-tns-c28-23 p-button p-component ng-star-inserted']");
    public static Target GENRE = Target.the("Input del genero o sexo")
            .locatedBy("//button[@class='p-element p-ripple p-autocomplete-dropdown p-button-icon-only ng-tns-c28-19 p-button p-component ng-star-inserted']");
    public static Target NO_BINARY = Target.the("Opcion no binario")
            .locatedBy("//span[contains(text(), 'No binario')]");
    public static Target PHONE_NUMBER = Target.the("Input de numero telefonico")
            .locatedBy("//input[@placeholder='Escribe tu número celular']");
    public static Target CONFIRM_PHONE_NUMBER = Target.the("Input confirmar numero telefonico")
            .locatedBy("//input[@placeholder='Escribe nuevamente tu número celular']");
    public static Target EMAIL = Target.the("Input de correo electronico")
            .locatedBy("//input[@name='EMAIL']");
    public static Target CONFIRM_EMAIL = Target.the("Input de confirmar correo electronico")
            .locatedBy("//input[@name='CONFIRM_EMAIL']");
    public static Target RESIDENCE_ADDRESS = Target.the("Input de direccion de residencia")
            .locatedBy("//input[@name='RESIDENCE_ADDRESS']");
    public static Target RESIDENCE_ADDRESS_TITTLE = Target.the("Titulo de validacion de direccion de residencia")
            .locatedBy("//div[contains(text(), ' DIRECCIÓN DE RESIDENCIA ')]");
    public static Target ADRRESS_BASE = Target.the("Input de la base de la direccion")
            .locatedBy("//input[@id='selectBase']");
    public static Target SELECT_OPTION_ONE = Target.the("Boton seleccionable calle")
            .locatedBy("//span[contains(text(), 'CALLE')]");
    public static Target ADDRESS_NUMBER_ONE = Target.the("Input del primer numero de direccion")
            .locatedBy("//input[@id='numero']");
    public static Target COMPLEMENTARY_INFORMATION = Target.the("Input de informacion complementaria numero")
            .locatedBy("//input[@id='selectComp']");
    public static Target SELECT_OPTION_TWO = Target.the("Boton seleccionable D bis sur")
            .locatedBy("//span[contains(text(), 'D BIS SUR')]");
    public static Target ADDRESS_NUMBER_TWO = Target.the("Input de informacion complementaria ")
            .locatedBy("//input[@id='numero2']");
    public static Target COMPLEMENTARY_INFORMATION_TWO = Target.the("Input informacion complementaria de numero")
            .locatedBy("//input[@id='selectComp2']");
    public static Target SELECT_OPTION_THREE = Target.the("Boton seleccionable D bis sur")
            .locatedBy("//span[contains(text(), 'BIS')]");
    public static Target ADDRESS_NUMBER_TRHEE = Target.the("Input del tercer numero de direccion")
            .locatedBy("//input[@id='numero3']");
    public static Target ADDRESS_CARDINALITY = Target.the("Input de la cardinalidad de direccion")
            .locatedBy("//input[@id='selectComp3']");
    public static Target CHECK_ADD_DETAILS = Target.the("Checkbox de adicionar elementos o complementos")
            .locatedBy("//label[contains(text(), 'Adicionar detalles o complementos')]");
    public static Target INPUT_ADD_DETAILS = Target.the("Input para agregar los detalles adicionales")
            .locatedBy("//input[@id='infoAdicional']");
    public static Target CLOSE_DETAILS_WINDOW = Target.the("Input boton para cerrar las venta de direccion")
            .locatedBy("//i[@class='fa fa-window-close-o close-icon']");
    public static Target BTN_SAVE_ADDRESS = Target.the("Boton para guardar la direccion")
            .locatedBy("//span[contains(text(), 'GUARDAR DIRECCIÓN')]");
    public static Target BTN_CLEAN = Target.the("Boton para limpiar el registro de direcciones")
            .locatedBy("//span[contains(text(), 'LIMPIAR')]");
    public static Target REFERRAL_CODE = Target.the("Input de codigo de referido")
            .locatedBy("//input[@name='REFERRAL_CODE']");
    public static Target PEP_YES = Target.the("Radiobutton persona expuesta politicamente positivo")
            .locatedBy("//div[@class='p-radiobutton-box']");
    public static Target PEP_NO = Target.the("Radiobutton persona expuesta politicamente negativo")
            .locatedBy("//div[@class='p-radiobutton-box'][2]");
    public static Target QUESTION_ONE = Target.the("Pregunta de seguridad 1")
            .located(By.id("WORK_PEP"));
    public static Target QUESTION_TWO = Target.the("Pregunta de seguridad 2")
            .located(By.id("JOB_TITLE_PEP"));
    public static Target QUESTION_THREE = Target.the("Pregunta de seguridad 3")
            .located(By.id("EXPERINCE_PEP"));
    public static Target QUESTION_FOURTH_RADIO = Target.the("Pregunta de seguridad 4")
            .located(By.id("PUBLIC_RESOURCES_PEP"));

    //CHECKBOX DE TERMINOS, CONDICIONES, TRATAMIENTO DE DATOS
    public static Target TERMS_AND_CONDITIONS = Target.the("Checkbox terminos y condiciones")
            .locatedBy("//*[@id=\"2\"]/div/div[2]");
    public static Target DATA_TREATMENT = Target.the("Checkbox tratamiento de datos")
            .locatedBy("//*[@id=\"11\"]/div/div[2]");
    public static Target REGISTER_BUTTON = Target.the("Boton de registro")
            .locatedBy("//button[@class='p-ripple p-element p-button p-component']");

    //MENSAJES DE REQUERIDO PARA VALIDAR CAMPOS VACIOS
    public static Target FIRST_ERROR_MESSAGE = Target.the("mensaje requerido 1")
            .locatedBy("/html/body/app-root/div[2]/div/div/app-landing/div/form[1]/div[3]/div/app-field-input/div/app-dynamic-calendar/form/div/app-mensaje-error-input/p");
    public static Target SECOND_ERROR_MESSAGE = Target.the("mensaje requerido 2")
            .locatedBy("/html/body/app-root/div[2]/div/div/app-landing/div/form[1]/div[4]/div/app-field-input/div/app-dynamic-select/form/div/app-mensaje-error-input/p");
    public static Target THIRD_ERROR_MESSAGE = Target.the("mensaje requerido 2")
            .locatedBy("/html/body/app-root/div[2]/div/div/app-landing/div/form[1]/div[5]/div/app-field-input/div/app-dynamic-input/form/span/div/app-mensaje-error-input/p");
    public static Target FOURTH_ERROR_MESSAGE = Target.the("mensaje requerido 2")
            .locatedBy("/html/body/app-root/div[2]/div/div/app-landing/div/form[1]/div[7]/div/app-field-input/div/app-dynamic-input/form/span/div/app-mensaje-error-input/p");
    public static Target FIFTH_ERROR_MESSAGE = Target.the("mensaje requerido 2")
            .locatedBy("/html/body/app-root/div[2]/div/div/app-landing/div/form[1]/div[9]/div/app-field-input/div/app-dynamic-calendar/form/div/app-mensaje-error-input/p");
    public static Target SIXTH_ERROR_MESSAGE = Target.the("mensaje requerido 2")
            .locatedBy("/html/body/app-root/div[2]/div/div/app-landing/div/form[1]/div[10]/div/app-field-input/div/app-dynamic-select/form/div/app-mensaje-error-input/p");
    public static Target SEVENTH_ERROR_MESSAGE = Target.the("mensaje requerido 2")
            .locatedBy("/html/body/app-root/div[2]/div/div/app-landing/div/form[1]/div[12]/div/app-field-input/div/app-dynamic-select/form/div/app-mensaje-error-input/p");
    public static Target EIGHTH_ERROR_MESSAGE = Target.the("mensaje requerido 2")
            .locatedBy("/html/body/app-root/div[2]/div/div/app-landing/div/form[1]/div[13]/div/app-field-input/div/app-dynamic-input/form/span/div/app-mensaje-error-input/p");
    public static Target NINTH_ERROR_MESSAGE = Target.the("mensaje requerido 2")
            .locatedBy("/html/body/app-root/div[2]/div/div/app-landing/div/form[1]/div[14]/div/app-field-input/div/app-dynamic-input/form/span/div/app-mensaje-error-input/p");
    public static Target TENTH_ERROR_MESSAGE = Target.the("mensaje requerido 2")
            .locatedBy("/html/body/app-root/div[2]/div/div/app-landing/div/form[1]/div[15]/div/app-field-input/div/app-dynamic-input-concat/form/span/div/app-mensaje-error-input/p");
    public static Target ELEVENTH_ERROR_MESSAGE = Target.the("mensaje requerido 2")
            .locatedBy("/html/body/app-root/div[2]/div/div/app-landing/div/form[1]/div[16]/div/app-field-input/div/app-dynamic-input-concat/form/span/div/app-mensaje-error-input/p");
    public static Target TWELFTH_ERROR_MESSAGE = Target.the("mensaje requerido 2")
            .locatedBy("/html/body/app-root/div[2]/div/div/app-landing/div/form[1]/div[19]/div/app-field-input/div/app-dynamic-radio/form/div/div[1]/div/app-mensaje-error-input/p");
    public static Target THIRTEENTH_ERROR_MESSAGE = Target.the("mensaje requerido 2")
            .locatedBy("/html/body/app-root/div[2]/div/div/app-landing/div/form[1]/div[19]/div/app-field-input/div/app-dynamic-radio/form/div/div[2]/div/app-mensaje-error-input/p");
    public static Target FOURTEENTH_ERROR_MESSAGE = Target.the("mensaje requerido 2")
            .locatedBy("/html/body/app-root/div[2]/div/div/app-landing/div/form[2]/div[1]/app-dynamic-terms/app-dynamic-checkbox-term/form/div/div/div/div/app-mensaje-error-input/p");
    public static Target FIFTEENTH_ERROR_MESSAGE = Target.the("mensaje requerido 2")
            .locatedBy("/html/body/app-root/div[2]/div/div/app-landing/div/form[2]/div[2]/app-dynamic-terms/app-dynamic-checkbox-term/form/div/div/div/div/app-mensaje-error-input/p");
    public static Target SIXTEENTH_ERROR_MESSAGE = Target.the("mensaje requerido 2")
            .locatedBy("//*[@id=\"mat-mdc-dialog-0\"]/div/div/app-modal-adress/form/div[1]/div[1]/div/div[1]/div/app-mensaje-error-input/p");
    public static Target SEVENTEENTH_ERROR_MESSAGE = Target.the("mensaje requerido 2")
            .locatedBy("//*[@id=\"mat-mdc-dialog-0\"]/div/div/app-modal-adress/form/div[1]/div[1]/div/div[2]/div/app-mensaje-error-input/p");
    public static Target EIGHTEENTH_ERROR_MESSAGE = Target.the("mensaje requerido 2")
            .locatedBy("//*[@id=\"mat-mdc-dialog-0\"]/div/div/app-modal-adress/form/div[1]/div[3]/div[2]/div/app-mensaje-error-input/p");
    public static Target NINETEENTH_ERROR_MESSAGE = Target.the("mensaje requerido 2")
            .locatedBy("//*[@id=\"mat-mdc-dialog-0\"]/div/div/app-modal-adress/form/div[1]/div[3]/div[5]/div/app-mensaje-error-input/p");
    public static Target TWENTIETH_ERROR_MESSAGE = Target.the("mensaje requerido 2")
            .locatedBy("//*[@id=\"mat-mdc-dialog-0\"]/div/div/app-modal-adress/form/div[2]/div[2]/div/div/app-mensaje-error-input/p");

}

