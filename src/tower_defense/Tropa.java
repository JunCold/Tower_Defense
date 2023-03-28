
package tower_defense;


public abstract class Tropa {
    private int puntosDeVida;
   private int ataque;
   private int defensa;

    public Tropa(int puntosDeVida, int ataque, int defensa) {
        this.puntosDeVida = puntosDeVida;
        this.ataque = ataque;
        this.defensa = defensa;
    }

    public int getPuntosDeVida() {
        return puntosDeVida;
    }

    public void setPuntosDeVida(int puntosDeVida) {
        this.puntosDeVida = puntosDeVida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }
   
   public abstract void atacar(Tropa enemigo);
   public abstract void recibirAtaque(int cantidad);
   
}
