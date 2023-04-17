
package proyecto_tower_defense;


public class Arquero extends Tropa{

    public Arquero(double ataque) {
        super(ataque);
    }

    @Override
    public void atacarCastillo(Castillo castillo) {
       castillo.recibirAtaque(this.getAtaque());
    }
    
}
