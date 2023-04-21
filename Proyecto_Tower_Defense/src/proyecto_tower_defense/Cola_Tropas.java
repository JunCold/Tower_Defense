/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_tower_defense;

/**
 *
 * @author JunCo
 */
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

    public Lista_Enlazada getListaTropas() {
        return listaTropas;
    }

    public void setListaTropas(Lista_Enlazada listaTropas) {
        this.listaTropas = listaTropas;
    }
    
    

   
    
}
