/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.colaestudiantes;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class PrincipalColaEstudiantes {

    int edad;
    String carnet, nombre;

    private OperacionesCola operacionesCola;

    public PrincipalColaEstudiantes() {
        operacionesCola = new OperacionesCola();
        menu();
    }

    public void menu() {
        String opcion = "0";
        String instrucciones = "1. Almacenar información del estudiante.\n"
                + "2. Indicar si un estudiante determinado existe.\n"
                + "3. Mostrar la cantidad de estudiantes que tengan la misma edad.\n"
                + "4. Mostrar la cantidad de estudiantes almacenados.\n"
                + "5. Imprimir todos los datos almacenados de los estudiantes.\n"
                + "6. Eliminar todos los estudiantes.\n"
                + "7. Mostrar suma de edades.\n"
                + "8. Mostrar promedio de edades.\n"
                + "9. Mostrar edades mayores que ´e´.\n"
                + "10. Salir.";

        do {
            opcion = JOptionPane.showInputDialog(instrucciones);

            switch (opcion) {
                case "1": //insertar
                    nombre = JOptionPane.showInputDialog("Digite el nombre del estudiante.");
                    carnet = JOptionPane.showInputDialog("Digite el carnet del estudiante.");
                    edad = Integer.parseInt(JOptionPane.showInputDialog("Digite la edad del estudiante."));
                    JOptionPane.showMessageDialog(null, operacionesCola.insertarEstudiante(new Estudiante(carnet, edad, nombre)));
                    break;
                case "2": //buscar
                    carnet = JOptionPane.showInputDialog("Digite el carnet del estudiante a buscar.");
                    JOptionPane.showMessageDialog(null, operacionesCola.buscarEstudiante(carnet));

                    break;
                case "3"://borrar un elemento 
                    edad = Integer.parseInt(JOptionPane.showInputDialog("Digite la edad cual desea conocer el total."));
                    JOptionPane.showMessageDialog(null, operacionesCola.estudiantesMismaEdad(edad));

                    break;
                case "4"://Total estudiantes
                    JOptionPane.showMessageDialog(null, operacionesCola.totalEstudiantes());
                    break;

                case "5"://Imprimir todos los datos
                    JOptionPane.showMessageDialog(null, operacionesCola.imprimirDatosEstudiantes());
                    break;
                case "6"://Salir
                    operacionesCola.vaciar();
                    break;
                case "7"://Salir
                    JOptionPane.showMessageDialog(null, operacionesCola.sumaEdades());
                    break;
                case "8"://Salir
                    JOptionPane.showMessageDialog(null, operacionesCola.promedioEdades());
                    break;
                case "9"://Salir
                    edad = Integer.parseInt(JOptionPane.showInputDialog("Digite la edad, para buscar el total de edades mayor a ella."));
                    JOptionPane.showMessageDialog(null, operacionesCola.buscarEdadMayorE(edad));
                    break;
                case "10"://Salir
                    JOptionPane.showMessageDialog(null, "Muchas gracias.");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Numero incorrecto");
            }//Fin switch
        } while (!opcion.equalsIgnoreCase("10"));

    }//Fin del main

    public static void main(String arg[]) {
        PrincipalColaEstudiantes principalCola = new PrincipalColaEstudiantes();
        principalCola.menu();
    }//Fin del main
}
