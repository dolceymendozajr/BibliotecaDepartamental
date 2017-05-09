package Modelo;

public class MultilistaAutores {

    private Autor primero;
    private Autor ultimo;
    private Autor aux;
    private int tamaño;

    public MultilistaAutores() {
        this.primero = null;
        this.ultimo = null;
    }

    public void InsertarAutor(String nombre) {
        aux = new Autor(nombre);
        if (primero == null) {
            primero = aux;
            ultimo = aux;
            tamaño = 1;
        } else {
            ultimo.setLinkPrincipal(aux);
            ultimo = aux;
            tamaño++;
        }
        aux.setLinkLibro(null);
        aux.setLinkPrincipal(null);
    }

    public void agregarNuevoLibro(String nombreA, String nombreL, int codigoL) {
        aux = buscarAutor(nombreA);
        if (aux != null) {
            aux.agregarLibro(new Libro(nombreL, codigoL));
        } else {
            System.out.println("El autor especificado no existe");
        }
    }

    public Autor buscarAutor(String nombre) {
        aux = primero;
        while (aux != null) {
            if (aux.getNombre().equalsIgnoreCase(nombre)) {
                return aux;
            }
            aux = aux.getLinkPrincipal();
        }
        return null;
    }

    public void verLista() {
        aux = primero;
        while (aux != null) {
            System.out.println(aux.getNombre());
            aux = aux.getLinkPrincipal();
        }
    }
    
    public void verlistaDeLibros(String nombre){
        aux = buscarAutor(nombre);
        if (aux != null) {
            aux.verLibros();
        } else {
            System.out.println("El autor especificado no existe");
        }
    }

    public Autor getPrimero() {
        return primero;
    }

    public void setPrimero(Autor primero) {
        this.primero = primero;
    }

    public Autor getUltimo() {
        return ultimo;
    }

    public void setUltimo(Autor ultimo) {
        this.ultimo = ultimo;
    }

    public int getTamaño() {
        return tamaño;
    }
}
