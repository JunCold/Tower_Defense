
package tower_defense;


public class Caballero extends Tropa{

<<<<<<< Updated upstream
    public Caballero(int puntosDeVida, int ataque, int defensa) {
        super(puntosDeVida, ataque, defensa);
=======
    public Caballero(double ataque) {
        super(ataque);
>>>>>>> Stashed changes
    }

   
    @Override
<<<<<<< Updated upstream
    public void atacar(Tropa enemigo) {
          if (enemigo instanceof Arquero) {
            enemigo.recibirAtaque(this.getAtaque() * 2);
        } else if (enemigo instanceof Mago) {
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
