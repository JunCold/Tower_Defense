/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_tower_defense;

/**
 *
 * @author JunCo
 */
public class Castillo {
    private String nombre;
    private double puntosdeVida;

    public Castillo(String nombre, double puntosdeVida) {
        this.puntosdeVida = puntosdeVida;
        this.nombre = nombre;
    }

    public double getPuntosdeVida() {
        return puntosdeVida;
    }

    public void setPuntosdeVida(double puntosdeVida) {
        this.puntosdeVida = puntosdeVida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    public void recibirAtaque(double cantidad){
        //puntosdeVida -= puntos
    }
}
