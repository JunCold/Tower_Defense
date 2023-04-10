/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_tower_defense;

/**
 *
 * @author JunCo
 */
public abstract class Tropa {
    private double ataque;

    public Tropa(double ataque) {
        this.ataque = ataque;
    }

    public double getAtaque() {
        return ataque;
    }

    public void setAtaque(double ataque) {
        this.ataque = ataque;
    }
    public abstract void atacarCastillo(Castillo castillo);
    
}
