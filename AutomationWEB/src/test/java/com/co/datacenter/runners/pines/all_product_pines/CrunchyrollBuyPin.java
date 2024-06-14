package com.co.datacenter.runners.pines.all_product_pines;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/pines/crunchyroll_pin.feature",
        glue = "com.co.datacenter.stepsdefinitions.pines.all_pines.crunchyroll",
        tags = "@SuccesfulPinPurchase",
        snippets = SnippetType.CAMELCASE
)
public class CrunchyrollBuyPin {

    public void ejecutarComando() {
        String comando = "gradle clean test"; // Cambia el comando según tu entorno y herramienta de construcción

        try {
            ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c", comando);
            builder.redirectErrorStream(true);
            Process proceso = builder.start();

            // Lee la salida del proceso
            BufferedReader reader = new BufferedReader(new InputStreamReader(proceso.getInputStream()));
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea); // Imprime la salida del proceso en la consola principal
            }

            proceso.waitFor(); // Espera a que el proceso termine
            System.out.println("Proceso terminado.");
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
