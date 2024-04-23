/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.colaestudiantes;

/**
 *
 * @author Stephanie Venegas Villalobos
 */
public class OperacionesCola {

    private Cola infoEstudiantes;
    private ColaEnteros listaEdades, listaTotal;

    public OperacionesCola() {
        infoEstudiantes = new Cola();
        listaEdades = new ColaEnteros();
        listaTotal = new ColaEnteros();
    }

    //1
    public String insertarEstudiante(Estudiante dato) {

        if (dato != null) {
            if (!existeEstudiante(dato.getCarnet())) {
                infoEstudiantes.inserta(dato);
                return "El estudiante fue almacenado";
            } else {
                return "Error. La información del estudiante ya estaba almacenada";
            }

        }
        return "Error al añadir";
    }

    //2
    public boolean existeEstudiante(String carnet) {
        Cola colaAux = new Cola();
        boolean mensaje = false;
        while (infoEstudiantes.primero() != null) {
            if (infoEstudiantes.primero().getCarnet().equalsIgnoreCase(carnet)) {
                mensaje = true;
                break;
            }
            colaAux.inserta(infoEstudiantes.primero());
            infoEstudiantes.quitarPrimero();

        }

        while (colaAux.primero() != null) {
            infoEstudiantes.inserta(colaAux.primero());
            colaAux.quitarPrimero();
        }
        return mensaje;
    }

    public String buscarEstudiante(String carnet) {
        if (!infoEstudiantes.esVacia()) {
            Cola colaAux = new Cola();
            String mensaje = "El estudiante solicitado NO se encuentra";
            while (infoEstudiantes.primero() != null) {
                if (infoEstudiantes.primero().getCarnet().equalsIgnoreCase(carnet)) {
                    mensaje = "El estudiante si se encuentra";
                    break;
                }
                colaAux.inserta(infoEstudiantes.primero());
                infoEstudiantes.quitarPrimero();

            }

            while (colaAux.primero() != null) {
                infoEstudiantes.inserta(colaAux.primero());
                colaAux.quitarPrimero();
            }
            return mensaje;
        }
        return "No hay información almacenada";
    }

    public boolean buscarEdad(int edad) {
        ColaEnteros colaAux = new ColaEnteros();
        boolean exito = false;
        if (!listaEdades.esVacia()) {

            while (!listaEdades.esVacia()) {
                if (listaEdades.primero() == edad) {
                    exito = true;
                    break;
                }
                colaAux.inserta(listaEdades.primero());
                listaEdades.quitarPrimero();
                System.out.print("1");
            }

            while (!colaAux.esVacia()) {
                listaEdades.inserta(colaAux.primero());
                colaAux.quitarPrimero();
                System.out.print("2");
            }

        }
        return exito;
    }

    //3
    public String estudiantesMismaEdad(int edad) {
        Cola colaAux = new Cola();
        int contador = 0;
        while (!infoEstudiantes.esVacia()) {

            if (edad == infoEstudiantes.primero().getEdad()) {
                contador++;
            }
            colaAux.inserta(infoEstudiantes.primero());
            infoEstudiantes.quitarPrimero();
            System.out.print("e");
        }
        listaTotal.inserta(contador);

        while (!colaAux.esVacia()) {

            infoEstudiantes.inserta(colaAux.primero());
            colaAux.quitarPrimero();
            System.out.print("f");
        }

        if (contador == 1) {
            return "No hay estudiantes repetidos con esa edad";
        } else if (contador == 0) {
            return "No hay estudiantes con esa edad.";
        } else {
            return "La cantidad de estudiantes con " + edad + " son: " + contador;
        }
    }

    //4
    public String totalEstudiantes() {
        if (!infoEstudiantes.esVacia()) {
            Cola colaAux = new Cola();
            int suma = 0;
            while (infoEstudiantes.primero() != null) {
                suma++;
                colaAux.inserta(infoEstudiantes.primero());
                infoEstudiantes.quitarPrimero();

            }

            while (colaAux.primero() != null) {
                infoEstudiantes.inserta(colaAux.primero());
                colaAux.quitarPrimero();
            }

            return "El total de estudiantes es de: " + suma;
        }
        return "No hay información almacenada";
    }

    public int totalEstudiantesEntero() {
        int suma = 0;
        if (!infoEstudiantes.esVacia()) {
            Cola colaAux = new Cola();

            while (infoEstudiantes.primero() != null) {
                suma++;
                colaAux.inserta(infoEstudiantes.primero());
                infoEstudiantes.quitarPrimero();

            }

            while (colaAux.primero() != null) {
                infoEstudiantes.inserta(colaAux.primero());
                colaAux.quitarPrimero();
            }

        }
        return suma;
    }

    //5
    public String imprimirDatosEstudiantes() {
        if (!infoEstudiantes.esVacia()) {
            Cola colaAux = new Cola();
            String mensaje = "No hay estudiantes añadidos";
            int contador = 0;

            if (infoEstudiantes.primero() != null) {
                mensaje = "";
            }

            while (infoEstudiantes.primero() != null) {
                mensaje += contador + "-Nombre: " + infoEstudiantes.primero().getNombre() + ", edad: " + infoEstudiantes.primero().getEdad() + ", carnet: " + infoEstudiantes.primero().getCarnet() + "\n";
                colaAux.inserta(infoEstudiantes.primero());
                infoEstudiantes.quitarPrimero();
                contador++;

            }

            while (colaAux.primero() != null) {
                infoEstudiantes.inserta(colaAux.primero());
                colaAux.quitarPrimero();
            }

            return mensaje;
        }
        return "No hay información almacenados";
    }

    //6
    public String vaciar() {
        infoEstudiantes.vacia();
        return "Ya se eliminaron todos los estudiantes";
    }

    //7
    public int sumaEdades() {
        if (!infoEstudiantes.esVacia()) {
            Cola colaAux = new Cola();
            int suma = 0;
            while (infoEstudiantes.primero() != null) {
                suma += infoEstudiantes.primero().getEdad();
                colaAux.inserta(infoEstudiantes.primero());
                infoEstudiantes.quitarPrimero();

            }

            while (colaAux.primero() != null) {
                infoEstudiantes.inserta(colaAux.primero());
                colaAux.quitarPrimero();
            }

            return suma;
        }
        return 0;
    }

    //8
    public double promedioEdades() {
        double promedio = 0;
        int sumaEdades = this.sumaEdades();
        int cantidadEstudiantes = this.totalEstudiantesEntero();

        try {
            promedio = sumaEdades / cantidadEstudiantes;
        } catch (ArithmeticException e) {
            return 0;
        }
        return promedio;
    }

    //9
    public String buscarEdadMayorE(int edad) {
        Cola colaAux = new Cola();
        int contador = 0;
        while (!infoEstudiantes.esVacia()) {

            if (edad < infoEstudiantes.primero().getEdad()) {
                contador++;
            }
            colaAux.inserta(infoEstudiantes.primero());
            infoEstudiantes.quitarPrimero();
        }
        listaTotal.inserta(contador);

        while (!colaAux.esVacia()) {

            infoEstudiantes.inserta(colaAux.primero());
            colaAux.quitarPrimero();
        }

        if (contador == 0) {
            return "No hay estudiantes mayores a esa edad.";
        } else {
            return "La cantidad de estudiantes con más de " + edad + " son: " + contador;
        }
    }
}
