package com.co.datacenter.runners;

import com.co.datacenter.runners.Chance_millonario_runner.ConfimChanceMillonarioRunner;
import com.co.datacenter.runners.paga_triple.all_scenarios_paga_triple.AllScenariosPagaTripleRunner;
import com.co.datacenter.runners.pines.all_product_pines.*;
import com.co.datacenter.runners.recargas_app.ConfirmRechargeAppRunner;
import com.co.datacenter.runners.validation_recharge.all_operators.*;
import org.junit.runner.JUnitCore;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main {

    private final Map<String, Class<?>> testClasses = new HashMap<>();
    private static class RoundBorder extends LineBorder {
        private final int radius;

        public RoundBorder(Color color, int radius) {
            super(color);
            this.radius = radius;
        }

        @Override
        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            super.paintBorder(c, g, x, y, width, height);
            if ((radius > 0) && (getLineColor() != null)) {
                g.setColor(getLineColor());
                g.drawRoundRect(x, y, width - 1, height - 1, radius * 2, radius * 2);
            }
        }
    }

    public void createAndShowGUI() {
        JFrame frame = new JFrame("Aplicacion de automatización");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); // Maximizar el JFrame
        frame.setVisible(true);

        //Se agregan las demas clases para que se vean a nivel de front
        testClasses.put("Paga Triple", AllScenariosPagaTripleRunner.class);
        testClasses.put("Paga encime", ConfimPagaEncimeRunner.class);
        testClasses.put("Chance Tradicional", ConfirmChanceRunner.class);
        testClasses.put("Paga millonario", ConfimPagaMillonarioRunner.class);
        testClasses.put("Combo Millonario", ConfimComboMillonarioRunner.class);
        testClasses.put("Chance Millonario", ConfimChanceMillonarioRunner.class);
        testClasses.put("Super Chance", ConfimSuperChanceRunner.class);
        testClasses.put("Maxi Chance", ConfirmMaxiChanceRunner.class);
        testClasses.put("Recargas Operadores", null);
        testClasses.put("Pines", null);
        testClasses.put("Recargas App", ConfirmRechargeAppRunner.class);
        testClasses.put("Super Astro", SendSuperAstroRunner.class);


        JLabel titleLabel = new JLabel("Selecciona el test a ejecutar:");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        titleLabel.setForeground(Color.black);

        // Agregar padding top y bottom al JLabel

        int paddingTop = 60;
        int paddingBottom = 30;
        titleLabel.setBorder(new EmptyBorder(paddingTop, 0, paddingBottom, 0));




        String[] testOptions = testClasses.keySet().toArray(new String[0]);
        JComboBox<String> choiceBox = new JComboBox<>(testOptions);
        choiceBox.setSelectedIndex(0);
        choiceBox.setPreferredSize(new Dimension(200, 30));
        choiceBox.setFont(new Font("Arial", Font.BOLD, 14));
        choiceBox.setBackground(new Color(255, 255, 255));





        JButton runTestsButton = new JButton("Ejecutar Pruebas");
        runTestsButton.setPreferredSize(new Dimension(200, 30));
        runTestsButton.setFont(new Font("Arial", Font.BOLD, 14));
        runTestsButton.setBackground(new java.awt.Color(179, 182, 183));
        runTestsButton.setForeground(new java.awt.Color(0, 0, 0));


        JComboBox<String> subChoiceBox = new JComboBox<>();
        subChoiceBox.setPreferredSize(new Dimension(200, 30));
        subChoiceBox.setFont(new Font("Arial", Font.BOLD, 14));
        subChoiceBox.setBackground(Color.WHITE);
        subChoiceBox.setVisible(false);

        JComboBox<String> subChoiceBox2 = new JComboBox<>();
        subChoiceBox2.setPreferredSize(new Dimension(200, 30));
        subChoiceBox2.setFont(new Font("Arial", Font.BOLD, 14));
        subChoiceBox2.setBackground(Color.WHITE);
        subChoiceBox2.setVisible(false);




        //Se un crea metodo para generar sublista desplegable con el fin de realizar escenarios especificos de pruebas(Regargas operadores)
        choiceBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (choiceBox.getSelectedItem().equals("Recargas Operadores")) {

                    testClasses.put("Validar todos los operadores", AllOperatorsRechargeDataRunner.class);
                    testClasses.put("Avantel", AvantelRechargeDataRunner.class);
                    testClasses.put("Claro", ClaroRechargeDataRunner.class);
                    testClasses.put("Etb", EtbRechargeDataRunner.class);
                    testClasses.put("Exito", ExitoRechargeDataRunner.class);
                    testClasses.put("Flash", FlashRechargeDataRunner.class);
                    testClasses.put("Kalley", KalleyRechargeDataRunner.class);
                    testClasses.put("Movistar", MovistarRechargeDataRunner.class);
                    testClasses.put("Tigo", TigoRechargeDataRunner.class);
                    testClasses.put("Unicorn", UnicornRechargeDataRunner.class);
                    testClasses.put("Virgin", VirginRechargeDataRunner.class);
                    testClasses.put("Wings", WingsRechargeDataRunner.class);
                    testClasses.put("Wom", WomRechargeDataRunner.class);

                    subChoiceBox.removeAllItems();
                    subChoiceBox.addItem("Validar todos los operadores");
                    subChoiceBox.addItem("Avantel");
                    subChoiceBox.addItem("Claro");
                    subChoiceBox.addItem("Etb");
                    subChoiceBox.addItem("Exito");
                    subChoiceBox.addItem("Flash");
                    subChoiceBox.addItem("Kalley");
                    subChoiceBox.addItem("Movistar");
                    subChoiceBox.addItem("Tigo");
                    subChoiceBox.addItem("Unicorn");
                    subChoiceBox.addItem("Virgin");
                    subChoiceBox.addItem("Wings");
                    subChoiceBox.addItem("Wom");
                    subChoiceBox.setVisible(true);

                } else {
                    subChoiceBox.setVisible(false);
                }
            }
        });
        //Se un crea metodo para generar sublista desplegable con el fin de realizar escenarios especificos de pruebas(Pines)
        choiceBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (choiceBox.getSelectedItem().equals("Pines")) {

                    testClasses.put("Validar todos los pines", AllPinsBuy.class);
                    testClasses.put("Xbox", BuyXboxPin.class);
                    testClasses.put("Crunchyroll", CrunchyrollBuyPin.class);
                    testClasses.put("DirectvGo", DirectvGoBuyPin.class);
                    testClasses.put("FreeFire", FreefireBuyPin.class);
                    testClasses.put("Imvu", ImvuBuyPin.class);
                    testClasses.put("Microsoft", MicrosoftBuyPin.class);
                    testClasses.put("Playstation", PlaystationBuyPin.class);
                    testClasses.put("Razer Gold", RazerGoldBuyPin.class);
                    testClasses.put("Rixty", RixtyBuyPin.class);
                    testClasses.put("Spotify", SpotifyBuyPin.class);
                    testClasses.put("Xbox Games Pass", XboxgamepassBuyPin.class);
                    testClasses.put("Xbox Live", XboxLiveBuyPin.class);

                    subChoiceBox2.removeAllItems();
                    subChoiceBox2.addItem("Validar todos los pines");
                    subChoiceBox2.addItem("Xbox");
                    subChoiceBox2.addItem("Crunchyroll");
                    subChoiceBox2.addItem("DirectvGo");
                    subChoiceBox2.addItem("FreeFire");
                    subChoiceBox2.addItem("Imvu");
                    subChoiceBox2.addItem("Microsoft");
                    subChoiceBox2.addItem("Playstation");
                    subChoiceBox2.addItem("Razer Gold");
                    subChoiceBox2.addItem("Rixty");
                    subChoiceBox2.addItem("Spotify");
                    subChoiceBox2.addItem("Xbox Games Pass");
                    subChoiceBox2.addItem("Xbox Live");
                    subChoiceBox2.setVisible(true);
                } else {
                    subChoiceBox2.setVisible(false);
                }
            }
        });




        runTestsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedOption = (String) choiceBox.getSelectedItem();

                if (selectedOption.equals("Recargas Operadores")) {
                    // Obtener la clase seleccionada de la sublista desplegable
                    selectedOption = (String) subChoiceBox.getSelectedItem();
                }
                if (selectedOption.equals("Pines")) {
                    // Obtener la clase seleccionada de la sublista desplegable
                    selectedOption = (String) subChoiceBox2.getSelectedItem();
                }
                ejecutarPruebas(selectedOption);
                System.out.println("Ejecutando producto " + choiceBox.getSelectedItem());

                    /*

                    Result result = JUnitCore.runClasses(ConfirmRechargeRunner.class);

                    // Mostrar los resultados
                    System.out.println("Ejecución de pruebas: "+ (result.wasSuccessful() ? "Éxito" : "Fallo"));
                    // Mostrar detalles de los fallos, si los hay
                    for
                    (Failure failure : result.getFailures()) {
                        System.out.println("Fallo: "  + failure.toString());         }

                     */
            }
        });

    /*
            JPanel panel = new JPanel();
            panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
            panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
            //panel.add(imageLabel);
            panel.add(titleLabel);
            panel.add(choiceBox);
            panel.add(runTestsButton);

            frame.add(panel);
            frame.setVisible(true);

     */
        JPanel panel = new JPanel(new GridBagLayout()) {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon background = new ImageIcon("src/test/resources/images/Fondo2.jpg");
                g.drawImage(background.getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };

        panel.setOpaque(true);
        panel.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));

        JPanel formContainer = new JPanel();
        //formContainer.setLayout(new BoxLayout(formContainer, BoxLayout.Y_AXIS));
        formContainer.setBorder(new LineBorder(Color.WHITE, 10, true)); // El tercer parámetro indica si el borde es redondeado
        formContainer.setPreferredSize(new Dimension(400, 500));
        formContainer.setBackground(new Color(240, 243, 244));

        //Nuevo

        ImageIcon logoIcon = new ImageIcon("src/test/resources/images/Logo.png");
        JLabel logoLabel = new JLabel(logoIcon);
        logoLabel.setAlignmentX(Component.CENTER_ALIGNMENT); // Alinear al centro horizontalmente

        // Agregar el JLabel del título
        formContainer.add(logoLabel);

        // Agregar espacio entre la imagen y otros componentes
        formContainer.add(Box.createRigidArea(new Dimension(0, 20)));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(200, 200, 200, 200);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.PAGE_START;
        gbc.gridwidth = GridBagConstraints.REMAINDER;


        formContainer.add(titleLabel, gbc);

        gbc.gridy = 5;
        gbc.gridwidth = 1;
        formContainer.add(choiceBox, gbc);

        gbc.gridy = 2;
        formContainer.add(subChoiceBox, gbc);

        gbc.gridy = 3;
        formContainer.add(subChoiceBox2, gbc);

        gbc.gridy = 4;
        formContainer.add(runTestsButton, gbc);

        panel.add(formContainer);

        frame.add(panel);
        frame.setVisible(true);

    }

    // Metodo para limpiar la carpeta de reportes de la ruta absoluta en donde se guardan
    private void limpiarReportes() {
        try {
            String rutaReportes = "target/site/serenity";
            File directorioReportes = new File(rutaReportes);
            if (directorioReportes.exists() && directorioReportes.isDirectory()) {
                // Eliminar todos los archivos del directorio de reportes
                File[] archivosReportes = directorioReportes.listFiles();
                if (archivosReportes != null) {
                    for (File archivo : archivosReportes) {
                        archivo.delete();
                    }
                    System.out.println("Reportes eliminados correctamente.");
                }
            } else {
                System.out.println("No se encontraron reportes en la ruta especificada.");
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error al intentar limpiar los reportes." + e.getMessage());
        }
    }

    private void ejecutarPruebas(String className) {
        limpiarReportes();
        Class<?> selectedClass = testClasses.get(className);
        if (selectedClass != null) {
            try {
                System.out.println("Intento instanciar Junit");
                JUnitCore junit = new JUnitCore();
                System.out.println("instancia Junit");
                junit.run(selectedClass);
                System.out.println("ejecutando producto");

                String reportFilePath = "target/site/serenity/index.html"; // Asegúrate de que esta ruta sea la correcta
                int tiempoEsperaSegundos = 30;
                int segundosTranscurridos = 0;
                boolean archivoExiste = false;

                while (segundosTranscurridos < tiempoEsperaSegundos) {
                    File htmlFile = new File(reportFilePath);
                    if (htmlFile.exists()) {
                        archivoExiste = true;
                        break;
                    }

                    try {
                        Thread.sleep(1000); // Esperar 1 segundo antes de verificar nuevamente
                        segundosTranscurridos++;
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }

                if (archivoExiste) {
                    Desktop.getDesktop().browse(new File(reportFilePath).toURI());
                } else {
                    System.out.println("El archivo del reporte no existe en la ruta especificada después de " + tiempoEsperaSegundos + " segundos.");
                }

            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Error al ejecutar las pruebas." + e.getMessage());
            }
        } else {
            System.out.println("La clase seleccionada no fue encontrada en las pruebas.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                System.out.println("Iniciando ejecucion....");
                Main main = new Main();
                System.out.println("instanciando main");
                main.createAndShowGUI();
            }
        });
    }
}
