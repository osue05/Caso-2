/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso.pkg2;

/**
 *
 * @author byron
 */
import javax.swing.JOptionPane;

class Cine {
      private static final int FILAS = 4;
    private static final int COLUMNAS = 6;
    private static String[][] asientos = new String[FILAS][COLUMNAS];
    private static String peliculaActual = "Película Actual";

    public static void inicializarAsientos() {
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                asientos[i][j] = "F" + (i + 1) + "A" + (j + 1);
            }
        }
    }

    public static String[][] getAsientos() {
        return asientos;
    }

    public static String getPeliculaActual() {
        return peliculaActual;
    }

    public static void setPeliculaActual(String peliculaActual) {
        Cine.peliculaActual = peliculaActual;
    }

    public static void mostrarAsientos() {
        StringBuilder sb = new StringBuilder("Asientos Disponibles:\n");
        for (String[] fila : asientos) {
            for (String asiento : fila) {
                sb.append(asiento).append(" ");
            }
            sb.append("\n");
        }
        sb.append("Pelicula Actual: ").append(peliculaActual);
        JOptionPane.showMessageDialog(null, sb.toString(), "Asientos Disponibles", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void modificarPelicula() {
        String nuevaPelicula = JOptionPane.showInputDialog(null, "Ingrese el nombre de la nueva película:", "Modificar Película", JOptionPane.QUESTION_MESSAGE);
        if (nuevaPelicula != null && !nuevaPelicula.isEmpty()) {
            peliculaActual = nuevaPelicula;
            JOptionPane.showMessageDialog(null, "La película ha sido modificada correctamente.", "Modificar Película", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Nombre de película inválido.", "Modificar Película", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void asignarAsiento() {
        String filaStr = JOptionPane.showInputDialog(null, "Ingrese la fila del asiento:", "Asignar Asiento", JOptionPane.QUESTION_MESSAGE);
        String columnaStr = JOptionPane.showInputDialog(null, "Ingrese la columna del asiento:", "Asignar Asiento", JOptionPane.QUESTION_MESSAGE);

        try {
            int fila = Integer.parseInt(filaStr);
            int columna = Integer.parseInt(columnaStr);

            if (fila >= 1 && fila <= FILAS && columna >= 1 && columna <= COLUMNAS) {
                asientos[fila - 1][columna - 1] = "OCUPADO";
                JOptionPane.showMessageDialog(null, "Asiento asignado correctamente.", "Asignar Asiento", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Asiento inválido.", "Asignar Asiento", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido.", "Asignar Asiento", JOptionPane.ERROR_MESSAGE);
        }
    }
}
