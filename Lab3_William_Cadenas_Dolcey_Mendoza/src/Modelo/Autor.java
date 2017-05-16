package Modelo;


/**
 * Estos van a ser los nodos de la multilisa de autores
 * @author William Cadenas
 */
public class Autor {

    private String nombre;
    private Autor linkPrincipal;
    private Ejemplar primero;
    private Ejemplar ultimo;
    private int numeroDelibros;

    public void agregarEjemplar(Ejemplar libro) {
        if (primero == null) {
            primero = libro;
            ultimo = libro;
            numeroDelibros = 1;
        } else {
            libro.setLinkRight(null);
            ultimo.setLinkRight(libro);
            ultimo = libro;
            numeroDelibros++;
        }
        libro.setLinkRight(null);
    }

    public void verEjemplares() {
        Ejemplar aux = primero;
        while (aux != null) {
            System.out.println(aux.getNombre());
            aux = aux.getLinkRight();
        }
    }

    public Autor(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroDelibros() {
        return numeroDelibros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Autor getLinkPrincipal() {
        return linkPrincipal;
    }

    public void setLinkPrincipal(Autor linkPrincipal) {
        this.linkPrincipal = linkPrincipal;
    }

    public Ejemplar getPrimero() {
        return primero;
    }

    public Ejemplar getUltimo() {
        return ultimo;
    }
    
    
}
