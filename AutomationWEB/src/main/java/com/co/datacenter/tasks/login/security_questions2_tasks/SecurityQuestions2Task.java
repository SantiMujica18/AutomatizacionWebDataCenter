package com.co.datacenter.tasks.login.security_questions2_tasks;

import com.co.datacenter.tasks.delay.Delay;
import com.co.datacenter.tasks.login.security_questions2_tasks.SecurityQuestions2Task;
import com.co.datacenter.userinterfaces.login.security_questions2_userinterfaces.SecurityQuestions2Userinterface;
import com.co.datacenter.userinterfaces.login.security_questions_userinterfaces.SecurityQuestionsUserinterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SecurityQuestions2Task implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        for (int i = 1; i <= 16; i++) {


            switch (i) {
                case 1:
                    if (SecurityQuestions2Userinterface.QUESTIONS1_SEGUNDO_APELLIDO_DE_PAPÁ.resolveFor(actor).isVisible()) {
                        actor.attemptsTo(
                                WaitUntil.the(SecurityQuestions2Userinterface.QUESTIONS1_SEGUNDO_APELLIDO_DE_PAPÁ, isVisible()),
                                Click.on((SecurityQuestions2Userinterface.ANSWERBOX)),
                                Enter.theValue("Puyo").into(SecurityQuestions2Userinterface.ANSWERBOX),
                                Click.on((SecurityQuestions2Userinterface.BOTTON)),
                                Enter.theValue("compuDatacenter").into(SecurityQuestions2Userinterface.ASSINGNAMECOMPUTER),
                                Click.on((SecurityQuestions2Userinterface.SAVEBUTTON)),
                                WaitUntil.the(SecurityQuestions2Userinterface.SAVEDSUCCESSFULLY, isVisible()),
                                Click.on((SecurityQuestions2Userinterface.BOTTON2))


                        );
                    }


                    break;

                case 2:
                    if (SecurityQuestions2Userinterface.QUESTIONS2_EQUIPO_DE_FUTBOL_FAVORITO.resolveFor(actor).isVisible()) {
                        actor.attemptsTo(
                                WaitUntil.the(SecurityQuestions2Userinterface.QUESTIONS2_EQUIPO_DE_FUTBOL_FAVORITO, isVisible()),
                                Click.on((SecurityQuestions2Userinterface.ANSWERBOX)),
                                Enter.theValue("Real").into(SecurityQuestions2Userinterface.ANSWERBOX),
                                Click.on((SecurityQuestions2Userinterface.BOTTON)),
                                Enter.theValue("compuDatacenter").into(SecurityQuestions2Userinterface.ASSINGNAMECOMPUTER),
                                Click.on((SecurityQuestions2Userinterface.SAVEBUTTON)),
                                WaitUntil.the(SecurityQuestions2Userinterface.SAVEDSUCCESSFULLY, isVisible()),
                                Click.on((SecurityQuestions2Userinterface.BOTTON2))

                        );
                    }

                    break;

                case 3:
                    if (SecurityQuestions2Userinterface.QUESTIONS3_NOMBRE_DE_TU_PRIMER_JEFE.resolveFor(actor).isVisible()) {
                        actor.attemptsTo(
                                WaitUntil.the(SecurityQuestions2Userinterface.QUESTIONS3_NOMBRE_DE_TU_PRIMER_JEFE, isVisible()),
                                Click.on((SecurityQuestions2Userinterface.ANSWERBOX)),
                                Enter.theValue("Herbert").into(SecurityQuestions2Userinterface.ANSWERBOX),
                                Click.on((SecurityQuestions2Userinterface.BOTTON)),
                                Enter.theValue("compuDatacenter").into(SecurityQuestions2Userinterface.ASSINGNAMECOMPUTER),
                                Click.on((SecurityQuestions2Userinterface.SAVEBUTTON)),
                                WaitUntil.the(SecurityQuestions2Userinterface.SAVEDSUCCESSFULLY, isVisible()),
                                Click.on((SecurityQuestions2Userinterface.BOTTON2))
                        );
                    }

                    break;
                case 4:
                    if (SecurityQuestions2Userinterface.QUESTIONS4_MES_QUE_NACIO_TU_MAMA.resolveFor(actor).isVisible()) {
                        actor.attemptsTo(
                                WaitUntil.the(SecurityQuestions2Userinterface.QUESTIONS4_MES_QUE_NACIO_TU_MAMA, isVisible()),
                                Click.on((SecurityQuestions2Userinterface.ANSWERBOX)),
                                Enter.theValue("Marzo").into(SecurityQuestions2Userinterface.ANSWERBOX),
                                Click.on((SecurityQuestions2Userinterface.BOTTON)),
                                Enter.theValue("compuDatacenter").into(SecurityQuestions2Userinterface.ASSINGNAMECOMPUTER),
                                Click.on((SecurityQuestions2Userinterface.SAVEBUTTON)),
                                WaitUntil.the(SecurityQuestions2Userinterface.SAVEDSUCCESSFULLY, isVisible()),
                                Click.on((SecurityQuestions2Userinterface.BOTTON2))
                        );
                    }

                    break;

                case 5:
                    if (SecurityQuestions2Userinterface.QUESTIONS5_MARCA_DE_PRIMER_CARRO.resolveFor(actor).isVisible()) {
                        actor.attemptsTo(
                                WaitUntil.the(SecurityQuestions2Userinterface.QUESTIONS5_MARCA_DE_PRIMER_CARRO, isVisible()),
                                Click.on((SecurityQuestions2Userinterface.ANSWERBOX)),
                                Enter.theValue("Duster").into(SecurityQuestions2Userinterface.ANSWERBOX),
                                Click.on((SecurityQuestions2Userinterface.BOTTON)),
                                Enter.theValue("compuDatacenter").into(SecurityQuestions2Userinterface.ASSINGNAMECOMPUTER),
                                Click.on((SecurityQuestions2Userinterface.SAVEBUTTON)),
                                WaitUntil.the(SecurityQuestions2Userinterface.SAVEDSUCCESSFULLY, isVisible()),
                                Click.on((SecurityQuestions2Userinterface.BOTTON2))
                        );
                    }

                    break;

                case 6:
                    if (SecurityQuestions2Userinterface.QUESTIONS6_NOMBRE_PROFESOR_FAVORITO.resolveFor(actor).isVisible()) {
                        actor.attemptsTo(
                                WaitUntil.the(SecurityQuestions2Userinterface.QUESTIONS6_NOMBRE_PROFESOR_FAVORITO, isVisible()),
                                Click.on((SecurityQuestions2Userinterface.ANSWERBOX)),
                                Enter.theValue("").into(SecurityQuestions2Userinterface.ANSWERBOX),
                                Click.on((SecurityQuestions2Userinterface.BOTTON)),
                                Enter.theValue("compuDatacenter").into(SecurityQuestions2Userinterface.ASSINGNAMECOMPUTER),
                                Click.on((SecurityQuestions2Userinterface.SAVEBUTTON)),
                                WaitUntil.the(SecurityQuestions2Userinterface.SAVEDSUCCESSFULLY, isVisible()),
                                Click.on((SecurityQuestions2Userinterface.BOTTON2))
                        );
                    }

                    break;

                case 7:
                    if (SecurityQuestions2Userinterface.QUESTIONS7_AMIGO_DE_LA_INFANCIA.resolveFor(actor).isVisible()) {
                        actor.attemptsTo(
                                WaitUntil.the(SecurityQuestions2Userinterface.QUESTIONS7_AMIGO_DE_LA_INFANCIA, isVisible()),
                                Click.on((SecurityQuestions2Userinterface.ANSWERBOX)),
                                Enter.theValue("").into(SecurityQuestions2Userinterface.ANSWERBOX),
                                Click.on((SecurityQuestions2Userinterface.BOTTON)),
                                Enter.theValue("compuDatacenter").into(SecurityQuestions2Userinterface.ASSINGNAMECOMPUTER),
                                Click.on((SecurityQuestions2Userinterface.SAVEBUTTON)),
                                WaitUntil.the(SecurityQuestions2Userinterface.SAVEDSUCCESSFULLY, isVisible()),
                                Click.on((SecurityQuestions2Userinterface.BOTTON2))
                        );
                    }

                    break;

                case 8:
                    if (SecurityQuestions2Userinterface.QUESTIONS8_MARCA_DE_PRIMER_CELULAR.resolveFor(actor).isVisible()) {
                        actor.attemptsTo(
                                WaitUntil.the(SecurityQuestions2Userinterface.QUESTIONS8_MARCA_DE_PRIMER_CELULAR, isVisible()),
                                Click.on((SecurityQuestions2Userinterface.ANSWERBOX)),
                                Enter.theValue("").into(SecurityQuestions2Userinterface.ANSWERBOX),
                                Click.on((SecurityQuestions2Userinterface.BOTTON)),
                                Enter.theValue("compuDatacenter").into(SecurityQuestions2Userinterface.ASSINGNAMECOMPUTER),
                                Click.on((SecurityQuestions2Userinterface.SAVEBUTTON)),
                                WaitUntil.the(SecurityQuestions2Userinterface.SAVEDSUCCESSFULLY, isVisible()),
                                Click.on((SecurityQuestions2Userinterface.BOTTON2))
                        );
                    }

                    break;

                case 9:
                    if (SecurityQuestions2Userinterface.QUESTIONS9_PRIMER_NUMERO_DE_TELEFONO.resolveFor(actor).isVisible()) {
                        actor.attemptsTo(
                                WaitUntil.the(SecurityQuestions2Userinterface.QUESTIONS9_PRIMER_NUMERO_DE_TELEFONO, isVisible()),
                                Click.on((SecurityQuestions2Userinterface.ANSWERBOX)),
                                Enter.theValue("").into(SecurityQuestions2Userinterface.ANSWERBOX),
                                Click.on((SecurityQuestions2Userinterface.BOTTON)),
                                Enter.theValue("compuDatacenter").into(SecurityQuestions2Userinterface.ASSINGNAMECOMPUTER),
                                Click.on((SecurityQuestions2Userinterface.SAVEBUTTON)),
                                WaitUntil.the(SecurityQuestions2Userinterface.SAVEDSUCCESSFULLY, isVisible()),
                                Click.on((SecurityQuestions2Userinterface.BOTTON2))
                        );
                    }

                    break;

                case 10:
                    if (SecurityQuestions2Userinterface.QUESTIONS10_LUGAR_FAVORITO.resolveFor(actor).isVisible()) {
                        actor.attemptsTo(
                                WaitUntil.the(SecurityQuestions2Userinterface.QUESTIONS10_LUGAR_FAVORITO, isVisible()),
                                Click.on((SecurityQuestions2Userinterface.ANSWERBOX)),
                                Enter.theValue("").into(SecurityQuestions2Userinterface.ANSWERBOX),
                                Click.on((SecurityQuestions2Userinterface.BOTTON)),
                                Enter.theValue("compuDatacenter").into(SecurityQuestions2Userinterface.ASSINGNAMECOMPUTER),
                                Click.on((SecurityQuestions2Userinterface.SAVEBUTTON)),
                                WaitUntil.the(SecurityQuestions2Userinterface.SAVEDSUCCESSFULLY, isVisible()),
                                Click.on((SecurityQuestions2Userinterface.BOTTON2))
                        );
                    }

                    break;

                case 11:
                    if (SecurityQuestions2Userinterface.QUESTIONS11_CIUDAD_POR_CONOCER.resolveFor(actor).isVisible()) {
                        actor.attemptsTo(
                                WaitUntil.the(SecurityQuestions2Userinterface.QUESTIONS11_CIUDAD_POR_CONOCER, isVisible()),
                                Click.on((SecurityQuestions2Userinterface.ANSWERBOX)),
                                Enter.theValue("").into(SecurityQuestions2Userinterface.ANSWERBOX),
                                Click.on((SecurityQuestions2Userinterface.BOTTON)),
                                Enter.theValue("compuDatacenter").into(SecurityQuestions2Userinterface.ASSINGNAMECOMPUTER),
                                Click.on((SecurityQuestions2Userinterface.SAVEBUTTON)),
                                WaitUntil.the(SecurityQuestions2Userinterface.SAVEDSUCCESSFULLY, isVisible()),
                                Click.on((SecurityQuestions2Userinterface.BOTTON2))
                        );
                    }

                    break;

                case 12:
                    if (SecurityQuestions2Userinterface.QUESTIONS12_AUTOR_LIBRO_FAVORITO.resolveFor(actor).isVisible()) {
                        actor.attemptsTo(
                                WaitUntil.the(SecurityQuestions2Userinterface.QUESTIONS12_AUTOR_LIBRO_FAVORITO, isVisible()),
                                Click.on((SecurityQuestions2Userinterface.ANSWERBOX)),
                                Enter.theValue("").into(SecurityQuestions2Userinterface.ANSWERBOX),
                                Click.on((SecurityQuestions2Userinterface.BOTTON)),
                                Enter.theValue("compuDatacenter").into(SecurityQuestions2Userinterface.ASSINGNAMECOMPUTER),
                                Click.on((SecurityQuestions2Userinterface.SAVEBUTTON)),
                                WaitUntil.the(SecurityQuestions2Userinterface.SAVEDSUCCESSFULLY, isVisible()),
                                Click.on((SecurityQuestions2Userinterface.BOTTON2))
                        );
                    }

                    break;

                case 13:
                    if (SecurityQuestions2Userinterface.QUESTIONS13_COLEGIO_DE_GRADUACION.resolveFor(actor).isVisible()) {
                        actor.attemptsTo(
                                WaitUntil.the(SecurityQuestions2Userinterface.QUESTIONS13_COLEGIO_DE_GRADUACION, isVisible()),
                                Click.on((SecurityQuestions2Userinterface.ANSWERBOX)),
                                Enter.theValue("").into(SecurityQuestions2Userinterface.ANSWERBOX),
                                Click.on((SecurityQuestions2Userinterface.BOTTON)),
                                Enter.theValue("compuDatacenter").into(SecurityQuestions2Userinterface.ASSINGNAMECOMPUTER),
                                Click.on((SecurityQuestions2Userinterface.SAVEBUTTON)),
                                WaitUntil.the(SecurityQuestions2Userinterface.SAVEDSUCCESSFULLY, isVisible()),
                                Click.on((SecurityQuestions2Userinterface.BOTTON2))
                        );
                    }

                    break;

                case 14:
                    if (SecurityQuestions2Userinterface.QUESTIONS14_PRIMER_PLAYA_A_LA_QUE_FUE.resolveFor(actor).isVisible()) {
                        actor.attemptsTo(
                                WaitUntil.the(SecurityQuestions2Userinterface.QUESTIONS14_PRIMER_PLAYA_A_LA_QUE_FUE, isVisible()),
                                Click.on((SecurityQuestions2Userinterface.ANSWERBOX)),
                                Enter.theValue("Barranquilla").into(SecurityQuestions2Userinterface.ANSWERBOX),
                                Click.on((SecurityQuestions2Userinterface.BOTTON)),
                                Enter.theValue("compuDatacenter").into(SecurityQuestions2Userinterface.ASSINGNAMECOMPUTER),
                                Click.on((SecurityQuestions2Userinterface.SAVEBUTTON)),
                                WaitUntil.the(SecurityQuestions2Userinterface.SAVEDSUCCESSFULLY, isVisible()),
                                Click.on((SecurityQuestions2Userinterface.BOTTON2))
                        );
                    }

                    break;

                case 15:
                    if (SecurityQuestions2Userinterface.QUESTIONS15_DEDICACION_DE_TU_ABUELO.resolveFor(actor).isVisible()) {
                        actor.attemptsTo(
                                WaitUntil.the(SecurityQuestions2Userinterface.QUESTIONS15_DEDICACION_DE_TU_ABUELO, isVisible()),
                                Click.on((SecurityQuestions2Userinterface.ANSWERBOX)),
                                Enter.theValue("").into(SecurityQuestions2Userinterface.ANSWERBOX),
                                Click.on((SecurityQuestions2Userinterface.BOTTON)),
                                Enter.theValue("compuDatacenter").into(SecurityQuestions2Userinterface.ASSINGNAMECOMPUTER),
                                Click.on((SecurityQuestions2Userinterface.SAVEBUTTON)),
                                WaitUntil.the(SecurityQuestions2Userinterface.SAVEDSUCCESSFULLY, isVisible()),
                                Click.on((SecurityQuestions2Userinterface.BOTTON2))
                        );
                    }

                    break;


                case 16:
                    if (SecurityQuestionsUserinterface.FINDOURSERVICESHERE.resolveFor(actor).isVisible()) {
                        actor.attemptsTo(
                                WaitUntil.the(SecurityQuestionsUserinterface.FINDOURSERVICESHERE, isVisible())
                        );
                    }

                    break;


            }


        }
    }

    public static SecurityQuestions2Task on() {
        return instrumented(SecurityQuestions2Task.class);
    }
}