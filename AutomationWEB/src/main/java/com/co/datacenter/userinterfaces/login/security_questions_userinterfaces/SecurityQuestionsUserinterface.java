package com.co.datacenter.userinterfaces.login.security_questions_userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;


public class SecurityQuestionsUserinterface {

    public static Target  FINDOURSERVICESHERE  = Target.the(" pantalla Principal de paga todo   ")
            .locatedBy("//div[@class='Container50 Responsive50 OvHidden juegaGana']");

    public static Target QUESTIONS_SEGUNDO_APELLIDO_DE_PAPÁ = Target.the(" Pregunta 1 ")
            .locatedBy("//span[contains(text(), '¿Cuál es el segundo apellido de tu papá?')]");


    public static Target QUESTIONS_EQUIPO_DE_FUTBOL_FAVORITO = Target.the(" Pregunta 2 ")
            .locatedBy("//span[contains(text(), '¿Cuál es tu equipo de fútbol favorito?')]");

    public static Target QUESTIONS_NOMBRE_DE_TU_PRIMER_JEFE = Target.the(" Pregunta 3 ")
            .locatedBy("//span[contains(text(), '¿Cuál es el nombre de tu primer jefe?')]");

    public static Target QUESTIONS_MES_QUE_NACIO_TU_MAMA = Target.the(" Pregunta 4 ")
            .locatedBy("//span[contains(text(), '¿Cuál es el mes en que nació tu mamá?')]");


    public static Target QUESTIONS_MARCA_DE_PRIMER_CARRO = Target.the(" Pregunta 5 ")
            .locatedBy("//span[contains(text(), '¿Cuál es la marca de tu primer carro?')]");

    public static Target QUESTIONS_NOMBRE_PROFESOR_FAVORITO = Target.the(" Pregunta 6 ")
            .locatedBy("//span[contains(text(), '¿Cuál es el nombre de tu profesor favorito?')]");

    public static Target QUESTIONS_AMIGO_DE_LA_INFANCIA = Target.the(" Pregunta 7 ")
            .locatedBy("//span[contains(text(), '¿Cuál es tu mejor amigo de la infancia?')]");

    public static Target QUESTIONS_MARCA_DE_PRIMER_CELULAR = Target.the(" Pregunta 8 ")
            .locatedBy("//span[contains(text(), '¿Cuál es la marca de tu primer celular?')]");

    public static Target QUESTIONS_PRIMER_NUMERO_DE_TELEFONO = Target.the(" Pregunta 9 ")
            .locatedBy("//span[contains(text(), '¿Cuál es tu primer número de teléfono?')]");

    public static Target QUESTIONS_LUGAR_FAVORITO = Target.the(" Pregunta 10 ")
            .locatedBy("//span[contains(text(), '¿Cuál es el nombre de tu lugar preferido?')]");

    public static Target QUESTIONS_CIUDAD_POR_CONOCER = Target.the(" Pregunta 11 ")
            .locatedBy("//span[contains(text(), '¿Una ciudad que quieres conocer?')]");


    public static Target QUESTIONS_AUTOR_LIBRO_FAVORITO = Target.the(" Pregunta 12 ")
            .locatedBy("//span[contains(text(), '¿Cuál es tu autor de libros favorito?')]");

    public static Target QUESTIONS_COLEGIO_DE_GRADUACION = Target.the(" Pregunta 13 ")
            .locatedBy("//span[contains(text(), '¿Cuál es el colegio donde te graduaste?')]");

    public static Target QUESTIONS_PRIMER_PLAYA_A_LA_QUE_FUE = Target.the(" Pregunta 14 ")
            .locatedBy("//span[contains(text(), '¿Cuál es la primera playa a la que fuiste?')]");

    public static Target QUESTIONS_DEDICACION_DE_TU_ABUELO = Target.the(" Pregunta 15 ")
            .locatedBy("//span[contains(text(), '¿A qué se dedicaba tu abuelo?')]");

    public static Target ANSWERBOX = Target.the(" RESPUESTA  ")
            .locatedBy("//input[@id='formMain:idFieldRespuesta']");

    public static Target BOTTON = Target.the(" Boton ")
            .locatedBy("//button[@id='formMain:j_idt26']");

    public static Target RADIOBUTTON = Target.the(" Boton ")
            .locatedBy("//span[@class='ui-radiobutton-icon ui-icon ui-icon-blank ui-c']");
    //input[@id='formMain:idRadio:1']
    public static Target SAVEBUTTON = Target.the(" Boton ")
            .locatedBy("//button[@id='formMain:j_idt28']");
}