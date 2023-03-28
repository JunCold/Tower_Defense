
package tower_defense;

public class Cola_Tropas {
    private Lista_Enlazada listaTropas;

    public Cola_Tropas() {
        listaTropas = new Lista_Enlazada();
    }
    public void encolar (Tropa tropa){
        listaTropas.agregar(tropa);
    }
    public Tropa desencolar (){
        return listaTropas.eliminar();
        
    }
    
    public boolean isVacia(){
        return listaTropas.isVacia();
    }
            
    
}
