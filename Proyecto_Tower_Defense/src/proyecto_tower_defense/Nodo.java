/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_tower_defense;

/**
 *
 * @author melan
 */
public class Nodo {
    private Tropa tropa;
    private Nodo atras;

    public Nodo(Tropa tropa){
        this.tropa=tropa;
        this.atras=null;
    }

    public Tropa getTropa() {
        return tropa;
    }

    public void setTropa(Tropa tropa) {
        this.tropa = tropa;
    }

    public Nodo getAtras() {
        return atras;
    }

    public void setAtras(Nodo atras) {
        this.atras = atras;
    }
}
