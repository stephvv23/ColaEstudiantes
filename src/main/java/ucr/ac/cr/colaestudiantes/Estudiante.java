/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.colaestudiantes;

/**
 *
 * @author Stephanie
 */
public class Estudiante {

    private String carnet;
    private int edad;
    private String nombre;

    public Estudiante(String carnet, int edad, String nombre) {
        this.carnet = carnet;
        this.edad = edad;
        this.nombre = nombre;
    }

    public Estudiante() {
        this.nombre = "Empty";
        this.carnet = "CXXXX";
        this.edad = -1;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
