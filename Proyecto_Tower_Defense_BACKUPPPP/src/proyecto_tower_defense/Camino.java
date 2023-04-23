/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_tower_defense;

/**
 *
 * @author cadam
 */
public class Camino {

    private Nodo inicio; // inicio de la lista
    private int longitud; //Logitud del camino

    public class Nodo {

        Tropa tropa; //tropa que se almacena en el nodo
        Nodo siguiente;

        public Nodo(Tropa tropa) {
            this.tropa = tropa;
            this.siguiente = null;
        }
    }

    public Camino(int longitud) {
        this.longitud = longitud;
        inicio = null;
    }

    //agregar tropa en posicion determinada del camino
    public void agregarTropa(Tropa tropa, int posicion) {
        if (posicion < 0 || posicion >= longitud) {
            throw new IllegalArgumentException("Posición inválida");
        }
        Nodo nuevoNodo = new Nodo(tropa);
        if (posicion == 0) {
            nuevoNodo.siguiente = inicio;
            inicio = nuevoNodo;
        } else {
            Nodo nodoAnterior = obtenerNodo(posicion - 1);
            nuevoNodo.siguiente = nodoAnterior.siguiente;
            nodoAnterior.siguiente = nuevoNodo;
        }
    }
    
    // Obtener el nodo en posición determinada del camino
    private Nodo obtenerNodo(int posicion) {
        Nodo nodo = inicio;
        for (int i = 0; i < posicion; i++) {
            nodo = nodo.siguiente;
        }
        return nodo;
    }

    //obtener tropa en posicion determinada del camino
    public Tropa obtenerTropa(int posicion) {
        if(posicion < 0 || posicion >= longitud){
            throw new IllegalArgumentException("Posición inválida");
        }
        Nodo nodo = obtenerNodo(posicion);
        return nodo.tropa;
    }

    //obtener la longitud del camino
    public int obtenerLongitud() {
        return longitud;
    }
}
