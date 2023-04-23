
package proyecto_tower_defense;


public class Caballero extends Tropa{

    public Caballero(double ataque) {
        super(ataque);
    }

    @Override
    public void atacarCastillo(Castillo castillo) {
       castillo.recibirAtaque(this.getAtaque());
    }
    
}
