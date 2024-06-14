package com.co.datacenter.runners;

import com.co.datacenter.runners.buc.login_buc.*;
import com.co.datacenter.runners.buc.register_buc.*;
import org.junit.runner.JUnitCore;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MainBuc {

    private final Map<String, Class<?>> loginTestClasses = new HashMap<>();
    private final Map<String, Class<?>> registerTestClasses = new HashMap<>();
    private String selectedCategory;

    public void createAndShowGUI() {
        JFrame frame = new JFrame("Aplicacion de automatización de pruebas buc");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);

        loginTestClasses.put("Logueo con CC", DataLoginCCBucRunner.class);
        loginTestClasses.put("Logueo con CE", DataLoginCEBucRunner.class);
        loginTestClasses.put("Logueo con Pasaporte", DataLoginPassportBucRunner.class);
        loginTestClasses.put("Logueo con PEDP", DataLoginPEDPBucRunner.class);
        loginTestClasses.put("Logueo con PEDPPEFDLF", DataLoginPEDPPEFDLFBucRunner.class);
        loginTestClasses.put("Logueo con PPPT", DataLoginPPPTBucRunner.class);
        loginTestClasses.put("Logueo completo", DataRegisterLandingTheBUCRunner.class);

        registerTestClasses.put("Registro completo", DataRegisterBucRunner.class);
        registerTestClasses.put("Registro con CC", DataRegisterCCBucRunner.class);
        registerTestClasses.put("Registro con CE", DataRegisterCEBucRunner.class);
        registerTestClasses.put("Registro con Pasaporte", DataRegisterPassportBucRunner.class);
        registerTestClasses.put("Registro con PEDP", DataRegisterPEDPBucRunner.class);
        registerTestClasses.put("Registro con PEDPPEFDLF", DataRegisterPEDPPEFDLFBucRunner.class);
        registerTestClasses.put("Registro con PPPT", DataRegisterPPPTBucRunner.class);

        JPanel backgroundPanel = new JPanel(new GridBagLayout()) {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon background = new ImageIcon(getClass().getResource("/images/Fondo2.jpg"));
                g.drawImage(background.getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };

        backgroundPanel.setOpaque(true);
        backgroundPanel.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));

        JLabel logoLabel = new JLabel(new ImageIcon(getClass().getResource("/images/Logo.png")));

        JLabel titleLabel = new JLabel("<html><font color='white'>Selecciona la prueba:</font></html>");
        Font font = new Font("Times New Roman", Font.PLAIN, 25);
        titleLabel.setFont(font);

        // Crear un panel para el título
        JPanel titlePanel = new JPanel();
        titlePanel.setBackground(new Color(30, 30, 30));
        titlePanel.setLayout(new BorderLayout());
        titlePanel.add(titleLabel, BorderLayout.CENTER);

        JPanel categoryPanel = new JPanel();
        categoryPanel.setOpaque(false);
        JButton loginButton = new JButton("Loguear");
        JButton registerButton = new JButton("Registrar");
        categoryPanel.add(loginButton);
        categoryPanel.add(registerButton);

        JComboBox<String> choiceBox = new JComboBox<>();
        choiceBox.setBackground(new Color(255, 255, 255, 150));
        choiceBox.setForeground(Color.BLACK);

        JButton runTestsButton = new JButton("Iniciar Pruebas");

        JPanel formContainer = new JPanel();
        Color transparentWhite = new Color(255, 255, 255, 0);
        formContainer.setBorder(new LineBorder(transparentWhite, 10, true));
        formContainer.setPreferredSize(new Dimension(600, 700));

        // Establecer el panel como transparente
        formContainer.setOpaque(false);
        GridBagLayout layout = new GridBagLayout();
        formContainer.setLayout(layout);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(20, -25, 20, 20);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.PAGE_START;
        gbc.gridwidth = GridBagConstraints.REMAINDER;

        formContainer.add(logoLabel, gbc);
        formContainer.add(Box.createRigidArea(new Dimension(0, 20)));

        gbc.gridy++;
        formContainer.add(titlePanel, gbc);
        formContainer.add(Box.createRigidArea(new Dimension(0, 20)));

        gbc.gridy++;
        formContainer.add(categoryPanel, gbc);
        formContainer.add(Box.createRigidArea(new Dimension(0, 20)));

        gbc.gridy++;
        formContainer.add(choiceBox, gbc);
        formContainer.add(Box.createRigidArea(new Dimension(0, 20)));

        gbc.gridy++;
        formContainer.add(runTestsButton, gbc);

        backgroundPanel.add(formContainer);
        frame.add(backgroundPanel);
        frame.setVisible(true);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectedCategory = "Login";
                updateTestOptions(selectedCategory, choiceBox);
            }
        });

        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectedCategory = "Registro";
                updateTestOptions(selectedCategory, choiceBox);
            }
        });

        runTestsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedOption = (String) choiceBox.getSelectedItem();
                if (selectedOption != null) {
                    ejecutarPruebas(selectedOption);
                }
            }
        });
    }

    private void updateTestOptions(String category, JComboBox<String> choiceBox) {
        choiceBox.removeAllItems();
        Map<String, Class<?>> selectedMap = (category.equals("Login")) ? loginTestClasses : registerTestClasses;
        selectedMap.keySet().forEach(choiceBox::addItem);
    }

    private void ejecutarPruebas(String selectedOption) {
        // limpiarReportes();

        if (selectedCategory != null) {
            Map<String, Class<?>> selectedMap = (selectedCategory.equals("Login")) ? loginTestClasses : registerTestClasses;
            Class<?> selectedClass = selectedMap.get(selectedOption);

            if (selectedClass != null) {
                try {
                    JUnitCore junit = new JUnitCore();
                    junit.run(selectedClass);
                    String reportFilePath = "target/site/serenity/index.html";
                    abrirReporte(reportFilePath);
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("Error al ejecutar las pruebas: " + e.getMessage());
                }
            } else {
                System.out.println("La clase seleccionada no fue encontrada en las pruebas.");
            }
        } else {
            System.out.println("Error: selectedCategory es null. Por favor, selecciona una categoría antes de ejecutar las pruebas.");
        }
    }

    private void abrirReporte(String reportFilePath) {
        File reportFile = new File(reportFilePath);

        if (reportFile.exists()) {
            try {
                Desktop.getDesktop().browse(reportFile.toURI());
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Error al abrir el informe en el navegador: " + e.getMessage());
            }
        } else {
            System.out.println("El informe no se encontró en la ubicación especificada: " + reportFilePath);
        }
    }

   /* private void limpiarReportes() {
        try {
            String rutaReportes = "target/site/serenity";
            File directorioReportes = new File(rutaReportes);
            if (directorioReportes.exists() && directorioReportes.isDirectory()) {
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
    }*/

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                MainBuc mainBuc = new MainBuc();
                mainBuc.createAndShowGUI();
            }
        });
    }
}