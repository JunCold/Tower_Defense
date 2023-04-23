package proyecto_tower_defense;

public class Juego {

    public Nodo generarTropasCpu() {
        
        int random = (int) (Math.random() * 3);
        if (random == 0) {
            Nodo caballero = new Nodo(new Caballero(2));
            return caballero;
        } else if (random == 1) {
            Nodo arquero = new Nodo(new Arquero(1));
            return arquero;
        } else if (random == 2) {
            Nodo mago = new Nodo(new Mago(1.5));
            return mago;
        }
        
        return null;
    }
}
