
package tower_defense;


public class Caballero extends Tropa{

    public Caballero(int puntosDeVida, int ataque, int defensa) {
        super(puntosDeVida, ataque, defensa);
    }

    @Override
    public void atacar(Tropa enemigo) {
          if (enemigo instanceof Arquero) {
            enemigo.recibirAtaque(this.getAtaque() * 2);
        } else if (enemigo instanceof Mago) {
            enemigo.recibirAtaque(this.getAtaque() - 50);
        }else{
            enemigo.recibirAtaque(this.getAtaque());
        }
    }

    @Override
    public void recibirAtaque(int cantidad) {
        this.setPuntosDeVida(this.getPuntosDeVida()-cantidad);
        if(this.getPuntosDeVida()<0){
            this.setPuntosDeVida(0);
        }
    }

    


    
}
