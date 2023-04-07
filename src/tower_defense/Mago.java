package tower_defense;

public class Mago extends Tropa {

<<<<<<< Updated upstream
    public Mago(int puntosDeVida, int ataque, int defensa) {
        super(puntosDeVida, ataque, defensa);
=======
    public Mago(double ataque) {
        super(ataque);
>>>>>>> Stashed changes
    }

  

    @Override
<<<<<<< Updated upstream
    public void atacar(Tropa enemigo) {
        if (enemigo instanceof Caballero) {
            enemigo.recibirAtaque(this.getAtaque() * 2);
        } else if (enemigo instanceof Arquero) {
            enemigo.recibirAtaque(this.getAtaque() - 50);
        }else{
            enemigo.recibirAtaque(this.getAtaque());
        }
=======
    public void atacar(Castillo castillo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
>>>>>>> Stashed changes
    }

}
