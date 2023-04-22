
package proyecto_tower_defense;


public class Jugador {
    private Cola tropas;

    public Jugador(Cola tropas) {
        this.tropas = tropas;
    }

    public Cola getTropas() {
        return tropas;
    }

    public void setTropas(Cola tropas) {
        this.tropas = tropas;
    }
    
}
