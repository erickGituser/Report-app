package Reporte;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Estudiante {
    String nombre;
    char sexo;
    double promedio;

    public Estudiante(String nombre, char sexo, double promedio) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.promedio = promedio;
    }

    public double getPromedio() {
        return promedio;
    }
}

public class Reporte {
    private List<Estudiante> estudiantesList = new ArrayList<>();

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Registro de Estudiantes");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setTitle("Report app");
            frame.setSize(500, 300);
            frame.setResizable(false);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
            Reporte main = new Reporte();
            JPanel panel = main.createUI();
            frame.add(panel, BorderLayout.CENTER);
            frame.setLayout(new FlowLayout());
        });
    }

    private JPanel createUI() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 2));
        JTextField nombreField = new JTextField();
        JTextField sexoField = new JTextField();
        JTextField promedioField = new JTextField();

        panel.add(new JLabel("  Nombre:"));
        panel.add(nombreField);
        panel.add(new JLabel(" Sexo:"));
        panel.add(sexoField);
        panel.add(new JLabel(" Promedio:"));
        panel.add(promedioField);

        JButton agregarButton = new JButton("Agregar Estudiante");
        agregarButton.setBounds(150, 100, 80, 30);

        JButton generarReporteButton = new JButton("Generar Reportes");
        generarReporteButton.setBounds(150, 100, 80, 30);

        panel.add(agregarButton);
        panel.add(generarReporteButton);

        agregarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = nombreField.getText();
                char sexo = sexoField.getText().charAt(0);
                double promedio = Double.parseDouble(promedioField.getText());

                Estudiante estudiante = new Estudiante(nombre, sexo, promedio);
                estudiantesList.add(estudiante);

                nombreField.setText("");
                sexoField.setText("");
                promedioField.setText("");
            }
        });

        generarReporteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                generateReporteOder();
                generarReporte();
            }
        });

        return panel;
    }

    private void generarReporte() {
        File orderFile = new File("C:\\Users\\Erick\\Desktop\\Java\\Reporte\\Report\\reporte_estudiantes.txt");
        if (!orderFile.exists()) {
            try (PrintWriter writer = new PrintWriter(
                    "C:\\Users\\Erick\\Desktop\\Java\\Reporte\\Report\\reporte_estudiantes.txt")) {
                for (Estudiante estudiante : estudiantesList) {
                    writer.println("Nombre: " + estudiante.nombre + ", Sexo: " + estudiante.sexo + ", Promedio: "
                            + estudiante.promedio);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            JOptionPane.showMessageDialog(null, "Reportes estudiante generado correctamente.");
        }
    }

    private void generateReporteOder() {
        Collections.sort(estudiantesList, Comparator.comparingDouble(Estudiante::getPromedio));
        try (PrintWriter writer = new PrintWriter(
                "C:\\Users\\Erick\\Desktop\\Java\\Reporte\\Report\\reporte_estudiantes_order.txt")) {
            for (Estudiante estudiante : estudiantesList.reversed()) {
                writer.println("Nombre: " + estudiante.nombre + ", Sexo: " + estudiante.sexo + ", Promedio: "
                        + estudiante.promedio);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        File orderFile = new File("C:\\Users\\Erick\\Desktop\\Java\\Reporte\\Report\\reporte_estudiantes_order.txt");
        if (!orderFile.exists()) {
            String rutaArchivoEntrada = "C:\\Users\\Erick\\Desktop\\Java\\Reporte\\Report\\reporte_estudiantes.txt";
            String rutaArchivoSalida = "C:\\Users\\Erick\\Desktop\\Java\\Reporte\\Report\\reporte_estudiantes_order.txt";

            try {
                // Leer desde el archivo de entrada
                FileReader fileReader = new FileReader(rutaArchivoEntrada);
                BufferedReader bufferedReader = new BufferedReader(fileReader);

                // Almacenar números double en una lista
                List<Double> numerosDouble = new ArrayList<>();

                String linea;
                while ((linea = bufferedReader.readLine()) != null) {
                    try {
                        // Intentar convertir la línea a un número double
                        double numero = Double.parseDouble(linea);
                        numerosDouble.add(numero);
                    } catch (NumberFormatException e) {
                        // Ignorar líneas que no sean números double
                    }
                }

                // Ordenar la lista de números double de mayor a menor
                Collections.sort(numerosDouble, Collections.reverseOrder());

                // Escribir en el archivo de salida
                PrintWriter fileWriter = new PrintWriter(rutaArchivoSalida);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

                // Escribir los números ordenados en el archivo de salida
                for (Double numero : numerosDouble) {
                    bufferedWriter.write(numero.toString());
                    bufferedWriter.newLine(); // Agregar nueva línea después de cada número
                }

                // Cerrar recursos
                bufferedReader.close();
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        JOptionPane.showMessageDialog(null, "Reporte de estudiantes ordenado por promedio generado correctamente.");
    }
}
