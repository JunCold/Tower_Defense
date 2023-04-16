
package proyecto_tower_defense;


public class Juego {
    public Tropa generarTropasCpu(){
        int random=(int)(Math.random()*2);
        if(random==0){
            Tropa caballero=new Caballero(2);
            return caballero;
        }else if (random==1){
            Tropa arquero=new Arquero(1);
            return arquero;
        }else if (random==2){
            Tropa mago=new Mago(1.5);
            return mago; 
        }
        return null;
    }
}
