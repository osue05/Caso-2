/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caso.pkg2;

/**
 *
 * @author byron
 */
import javax.swing.JOptionPane;

public class Caso2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cine.inicializarAsientos();
        mostrarMenu();
    }

    private static void mostrarMenu() {
        while (true) {
            int seleccion = JOptionPane.showOptionDialog(null, "Seleccione una opción:", "Menú Cine", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, new String[]{"Mostrar Asientos", "Modificar Película", "Asignar Asiento", "Salir"}, 0);

            switch (seleccion) {
                case 0 -> Cine.mostrarAsientos();
                case 1 -> Cine.modificarPelicula();
                case 2 -> Cine.asignarAsiento();
                case 3 -> {
                    JOptionPane.showMessageDialog(null, "¡Hasta luego!", "Salir", JOptionPane.INFORMATION_MESSAGE);
                    System.exit(0);
                }
                default -> JOptionPane.showMessageDialog(null, "Opción inválida.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}