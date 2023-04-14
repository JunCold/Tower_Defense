
package proyecto_tower_defense;


public class Jugador {
    private Cola_Tropas tropas;

    public Jugador(Cola_Tropas tropas) {
        this.tropas = tropas;
    }

    public Cola_Tropas getTropas() {
        return tropas;
    }

    public void setTropas(Cola_Tropas tropas) {
        this.tropas = tropas;
    }
    
}
