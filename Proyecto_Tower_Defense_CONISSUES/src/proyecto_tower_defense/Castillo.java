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
    
    private double puntosdeVida;

    public Castillo( double puntosdeVida) {
        this.puntosdeVida = puntosdeVida;
        
    }

    public double getPuntosdeVida() {
        return puntosdeVida;
    }

    public void setPuntosdeVida(double puntosdeVida) {
        this.puntosdeVida = puntosdeVida;
    }

   
    
    
    public void recibirAtaque(double danio){
        this.puntosdeVida-=danio;
        if(this.puntosdeVida<0){
            this.puntosdeVida=0;
        }
    }
}
        /*
<<<<<<< Updated upstream
        //puntosdeVida -= puntos
=======
        puntosdeVida -= puntos
>>>>>>> Stashed changes
*/