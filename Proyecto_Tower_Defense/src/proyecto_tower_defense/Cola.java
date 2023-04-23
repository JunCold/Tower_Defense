/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_tower_defense;

/**
 *
 * @author melan
 */
public class Cola {
    private Nodo frente;
    private Nodo ultimo;
    private int largo;

    public Cola() {
        this.frente = null;
        this.ultimo = null;
        this.largo = 0;
    }
        
    public void encola(Nodo nuevoNodo){
        if(frente == null){  // significa que la cola esta vacia
            frente = nuevoNodo;
            ultimo = nuevoNodo;                    
        }
        else{
            ultimo.setAtras(nuevoNodo);
            ultimo=nuevoNodo;
        }
        largo++;
    }
    
    public Nodo atiende(){
        Nodo aux = frente;
        if(frente!=null){
            frente=frente.getAtras();
            aux.setAtras(null);
            largo--;
        }
        return aux;
    }
    
    public boolean isVacia(){
        return frente == null;
    }
    
    public Tropa eliminar(){
        if(!isVacia()){
            Tropa tropa = frente.getTropa();
            frente = frente.getAtras();
            return tropa;
        }
        return null;
    }
    public void vaciarCola(){
        while(!isVacia()){
            eliminar();
        }
    }
    
    public void Lista_Enlazada(){
        this.frente = null;
        this.ultimo = null;
    }

    public Nodo getPrimerNodo(){
        return frente;
    }

    private void setFrente(Nodo frente){
        this.frente = frente;
    }

    public Nodo getUltimoNodo(){
        return ultimo;
    }

    private void setUltimo(Nodo ultimoNodo){
        this.ultimo = ultimoNodo;
    }
}
