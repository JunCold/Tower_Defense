package proyecto_tower_defense;

public class CPU {

    private Cola tropas;

    public CPU(Cola tropas) {
        this.tropas = tropas;
    }

    public Cola getTropas() {
        return tropas;
    }

    public void setTropas(Cola tropas) {
        this.tropas = tropas;
    }
}
