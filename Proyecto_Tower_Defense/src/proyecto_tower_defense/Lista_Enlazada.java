
package proyecto_tower_defense;


public class Lista_Enlazada {
    private Nodo primerNodo;
    private Nodo ultimoNodo;
    
    public Lista_Enlazada(){
        this.primerNodo=null;
        this.ultimoNodo=null;
    }

    public Nodo getPrimerNodo() {
        return primerNodo;
    }

    public void setPrimerNodo(Nodo primerNodo) {
        this.primerNodo = primerNodo;
    }

    public Nodo getUltimoNodo() {
        return ultimoNodo;
    }

    public void setUltimoNodo(Nodo ultimoNodo) {
        this.ultimoNodo = ultimoNodo;
    }
    
    
    public boolean isVacia(){
        return primerNodo==null;
    }
    
    public void agregar(Tropa tropa){
        Nodo nuevoNodo= new Nodo(tropa);
        
        if(isVacia()){
            primerNodo=nuevoNodo;
            ultimoNodo=nuevoNodo;
        }else{
            ultimoNodo.setSiguiente(nuevoNodo);
            ultimoNodo=nuevoNodo;
        }
    }
    public Tropa eliminar(){
        if(!isVacia()){
            Tropa tropa=primerNodo.getTropa();
            primerNodo=primerNodo.getSiguiente();
            return tropa;
        }
        return null;
    }
    
    private class Nodo{
        private Tropa tropa;
        private Nodo siguiente;
        
        public Nodo(Tropa tropa){
            this.tropa=tropa;
            this.siguiente=null;
        }

        public Tropa getTropa() {
            return tropa;
        }

        public void setTropa(Tropa tropa) {
            this.tropa = tropa;
        }

        public Nodo getSiguiente() {
            return siguiente;
        }

        public void setSiguiente(Nodo siguiente) {
            this.siguiente = siguiente;
        }
        
        
    }
}
