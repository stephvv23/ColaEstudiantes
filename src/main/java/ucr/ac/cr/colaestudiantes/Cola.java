/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ucr.ac.cr.colaestudiantes;

/**
 *
 * @author Usuario
 */
public class Cola {

    private Nodo frente, finaal;

    public void vacia() {
        frente = null;
        finaal = null;
    }

    public Estudiante primero() {
        try {
            return frente.getDato();
        } catch (NullPointerException e) {
            System.err.println("Lista vacia.");
        }
        return null;
    }

    public void inserta(Estudiante dato) {
        Nodo nuevo = new Nodo(dato);
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
