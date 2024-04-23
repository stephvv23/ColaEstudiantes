/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.colaestudiantes;

/**
 *
 * @author Stephanie
 */
public class Nodo {

    private Estudiante dato;
    private Nodo siguiente;

    public Nodo() {
        this.dato = null;
        this.siguiente = null;
    }

    public Nodo(Estudiante dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    public Nodo(Estudiante dato, Nodo siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }

    public void setDato(Estudiante dato) {
        this.dato = dato;
    }

    public Estudiante getDato() {
        return this.dato;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo getSiguiente() {
        return this.siguiente;
    }
}
