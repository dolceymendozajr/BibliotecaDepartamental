package Modelo;


/**
 * Estos van a ser los nodos de la multilisa de autores
 * @author William Cadenas
 */
public class Autor {

    private String nombre;
    private Autor linkPrincipal;
    private Libro primero;
    private Libro ultimo;
    private int numeroDelibros;

    public void agregarLibro(Libro libro) {
        if (primero == null) {
            primero = libro;
            ultimo = libro;
            numeroDelibros = 1;
        } else {
            libro.setLinkPrincipal(null);
            ultimo.setLinkPrincipal(libro);
            ultimo = libro;
            numeroDelibros++;
        }
        libro.setLinkPrincipal(null);
    }

    public void verLibros() {
        Libro aux = primero;
        while (aux != null) {
            System.out.println(aux.getNombre());
            aux = aux.getLinkPrincipal();
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

    public Libro getPrimero() {
        return primero;
    }

    public Libro getUltimo() {
        return ultimo;
    }
    
    
}
