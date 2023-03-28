package tower_defense;

public class Mago extends Tropa {

    public Mago(int puntosDeVida, int ataque, int defensa) {
        super(puntosDeVida, ataque, defensa);
    }

    @Override
    public void recibirAtaque(int cantidad) {
        this.setPuntosDeVida(this.getPuntosDeVida()-cantidad);
        if(this.getPuntosDeVida()<0){
            this.setPuntosDeVida(0);
        }
    }

    @Override
    public void atacar(Tropa enemigo) {
        if (enemigo instanceof Caballero) {
            enemigo.recibirAtaque(this.getAtaque() * 2);
        } else if (enemigo instanceof Arquero) {
            enemigo.recibirAtaque(this.getAtaque() - 50);
        }else{
            enemigo.recibirAtaque(this.getAtaque());
        }
    }

}
