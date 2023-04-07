
package tower_defense;

public class Jugador {
<<<<<<< Updated upstream
    private String nombre;
    private Cola_Tropas tropas;

    public Jugador(String nombre, Cola_Tropas tropas) {
        this.nombre = nombre;
        this.tropas = tropas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
=======
    
    private Cola_Tropas tropas;

    public Jugador( Cola_Tropas tropas) {
        
        this.tropas = tropas;
    }
  
>>>>>>> Stashed changes

    public Cola_Tropas getTropas() {
        return tropas;
    }

    public void setTropas(Cola_Tropas tropas) {
        this.tropas = tropas;
    }
    
    
}
