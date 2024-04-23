/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.colaestudiantes;

/**
 *
 * @author Stephanie
 */
public class NodoEntero {

    private int dato;
    private NodoEntero siguiente;

    public NodoEntero() {
        this.dato = 0;
        this.siguiente = null;
    }

    public NodoEntero(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    public NodoEntero(int dato, NodoEntero siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public int getDato() {
        return this.dato;
    }

    public void setSiguiente(NodoEntero siguiente) {
        this.siguiente = siguiente;
    }

    public NodoEntero getSiguiente() {
        return this.siguiente;
    }
}
