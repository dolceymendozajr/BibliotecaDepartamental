package Modelo;


public class ListaEnlazada {    
    private Nodo primero;
    private Nodo ultimo;

    public ListaEnlazada() {
        this.primero = null;
        this.ultimo = null;
    }
    
    public void InsertarNodo(Nodo aux){        
        
        if (primero == null) {
            primero = aux;
            ultimo = (Ejemplar) aux;
        }else {
            ultimo.setLinkPrincipal(aux);
           
        }
    }
    
    
    public Nodo getPrimero() {
        return primero;
    }

    public void setPrimero(Nodo primero) {
        this.primero = primero;
    }

    public Nodo getUltimo() {
        return ultimo;
    }

    public void setUltimo(Nodo ultimo) {
        this.ultimo = ultimo;
    }
    
    
}
