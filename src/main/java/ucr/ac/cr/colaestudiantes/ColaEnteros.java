/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ucr.ac.cr.colaestudiantes;

/**
 *
 * @author Usuario
 */
public class ColaEnteros {

    private NodoEntero frente, finaal;

    public void vacia() {
        frente = null;
        finaal = null;
    }

    public int primero() {
        try {
            return frente.getDato();
        } catch (NullPointerException e) {
           return -1;
        }
        
    }

    public void inserta(int dato) {
        NodoEntero nuevo = new NodoEntero(dato);
        if (esVacia()) {
            frente = nuevo;
            finaal = nuevo;
        } else {
            finaal.setSiguiente(nuevo);
            finaal = nuevo;
        }

    }

    public void quitarPrimero() {
        if (!esVacia()) {
            frente = frente.getSiguiente();
        }

    }

    public boolean esVacia() {
        return frente == null;

    }
}
