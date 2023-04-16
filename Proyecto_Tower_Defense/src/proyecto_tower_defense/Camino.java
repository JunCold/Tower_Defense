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
    private Tropa[] tropas; //Array que almacena las tropas en el camino
    private int longitud; //Logitud del camino
    
    public Camino(int longitud){
        this.longitud =  longitud;
        tropas = new Tropa[longitud];
    }
    
    //agregar tropa en posicion determinada del camino
    public void agregarTropa(Tropa tropa, int posicion){
        tropas[posicion]= tropa;
    }
    
    //obtener tropa en posicion determinada del camino
    public Tropa obtenerTropa(int posicion){
        return tropas[posicion];
    }
    
    //obtener la longitud del camino
    public int obtenerLongitud(){
        return longitud;
    }
}
