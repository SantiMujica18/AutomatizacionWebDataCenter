package com.co.datacenter.tasks.gelsaapp.olvidarcontraseña;

import com.co.datacenter.userinterfaces.gelsaapp.olvidarcontraseña.OlvidarContraseñaInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class UserIfRegisteredTask implements Task {

    private String user;

    public UserIfRegisteredTask(String user) {
        this.user = user;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(user).into(OlvidarContraseñaInterface.INPUT_USER)
        );

    }
    public static UserIfRegisteredTask on(){
        Properties properties = new Properties();

        try {
            // Cargando el archivo credentials.properties
            FileInputStream archivoPropiedades = new FileInputStream("credentials.properties");
            properties.load(archivoPropiedades);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Obteniendo el valor del usuario desde el archivo de propiedades
        String usuario = properties.getProperty("usuario");

        return new UserIfRegisteredTask(usuario);
    }
}
