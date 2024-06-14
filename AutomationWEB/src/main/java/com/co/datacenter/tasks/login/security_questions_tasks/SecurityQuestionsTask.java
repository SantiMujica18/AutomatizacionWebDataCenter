package com.co.datacenter.tasks.login.security_questions_tasks;
import com.co.datacenter.tasks.delay.Delay;
import com.co.datacenter.userinterfaces.login.security_questions_userinterfaces.SecurityQuestionsUserinterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SecurityQuestionsTask implements Task {
    private boolean questionsAnswered = false;

    @Override
    public <T extends Actor> void performAs(T actor) {
        long startTime = System.currentTimeMillis();


        if (!questionsAnswered) {
            performAction(actor, SecurityQuestionsUserinterface.QUESTIONS_SEGUNDO_APELLIDO_DE_PAPÁ, "medina");
            performAction(actor, SecurityQuestionsUserinterface.QUESTIONS_MES_QUE_NACIO_TU_MAMA, "octubre");
            performAction(actor, SecurityQuestionsUserinterface.QUESTIONS_COLEGIO_DE_GRADUACION, "paula montal");
            /*
            performAction(actor, SecurityQuestionsUserinterface.QUESTIONS_EQUIPO_DE_FUTBOL_FAVORITO, "Real");
            performAction(actor, SecurityQuestionsUserinterface.QUESTIONS_NOMBRE_DE_TU_PRIMER_JEFE, "Herbert");
            performAction(actor, SecurityQuestionsUserinterface.QUESTIONS_PRIMER_PLAYA_A_LA_QUE_FUE, "Barranquilla");
            performAction(actor, SecurityQuestionsUserinterface.QUESTIONS_SEGUNDO_APELLIDO_DE_PAPÁ, "");
            performAction(actor, SecurityQuestionsUserinterface.QUESTIONS_MES_QUE_NACIO_TU_MAMA, "");
            performAction(actor, SecurityQuestionsUserinterface.QUESTIONS_MARCA_DE_PRIMER_CARRO, "");
            performAction(actor, SecurityQuestionsUserinterface.QUESTIONS_NOMBRE_PROFESOR_FAVORITO, "");
            performAction(actor, SecurityQuestionsUserinterface.QUESTIONS_AMIGO_DE_LA_INFANCIA, "");
            performAction(actor, SecurityQuestionsUserinterface.QUESTIONS_MARCA_DE_PRIMER_CELULAR, "");
            performAction(actor, SecurityQuestionsUserinterface.QUESTIONS_PRIMER_NUMERO_DE_TELEFONO, "");
            performAction(actor, SecurityQuestionsUserinterface.QUESTIONS_LUGAR_FAVORITO, "");
            performAction(actor, SecurityQuestionsUserinterface.QUESTIONS_CIUDAD_POR_CONOCER, "");
            performAction(actor, SecurityQuestionsUserinterface.QUESTIONS_AUTOR_LIBRO_FAVORITO, "");
            performAction(actor, SecurityQuestionsUserinterface.QUESTIONS_COLEGIO_DE_GRADUACION, "");
            performAction(actor, SecurityQuestionsUserinterface.QUESTIONS_DEDICACION_DE_TU_ABUELO, "");
            waitAndPerform(actor,SecurityQuestionsUserinterface.FINDOURSERVICESHERE);
             */
            questionsAnswered = true;
        } else {
            System.out.println("Las preguntas de seguridad ya han sido respondidas anteriormente.");
            return;
        }

        waitAndPerform(actor, SecurityQuestionsUserinterface.FINDOURSERVICESHERE);


        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println("Tiempo total de ejecución de SecurityQuestionsTask: " + totalTime + " milisegundos");

    }

    private <T extends Actor> void performAction(T actor, Target question, String answer) {

        if (question.resolveFor(actor).isVisible()) {
            actor.attemptsTo(
                    WaitUntil.the(question, isVisible()),
                    WaitUntil.the(question, isEnabled()),
                    Enter.theValue(answer).into(SecurityQuestionsUserinterface.ANSWERBOX),
                    Click.on(SecurityQuestionsUserinterface.BOTTON),
                    Delay.ofMilliseconds(1000),
                    WaitUntil.the(SecurityQuestionsUserinterface.RADIOBUTTON, isVisible()),
                    WaitUntil.the(SecurityQuestionsUserinterface.RADIOBUTTON, isEnabled()),
                    Click.on(SecurityQuestionsUserinterface.RADIOBUTTON),
                    Delay.ofMilliseconds(1000),
                    Click.on(SecurityQuestionsUserinterface.SAVEBUTTON)
            );
        }

        long startTime = System.currentTimeMillis();
        long endTime = System.currentTimeMillis();
        long actionTime = endTime - startTime;
        System.out.println("Tiempo de ejecución de la acción: " + actionTime + " milisegundos");
    }

    private <T extends Actor> void waitAndPerform(T actor, Target target) {
        if (target.resolveFor(actor).isVisible()) {
            actor.attemptsTo(WaitUntil.the(target, isVisible()));
        }
    }

    public static SecurityQuestionsTask on() {
        return instrumented(SecurityQuestionsTask.class);
    }

}

