package Modelo;

/**
 * Estos seran los nodos de la lista de autor 
 * @author William Cadenas
 */
public class Libro {

    private String nombre;
    private int codigoLibro;
    private Libro linkPrincipal;

    public Libro(String nombre, int codigoLibro) {
        this.nombre = nombre;
        this.codigoLibro = codigoLibro;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCodigoLibro() {
        return codigoLibro;
    }

    public Libro getLinkPrincipal() {
        return linkPrincipal;
    }
    
    public void setLinkPrincipal(Libro linkPrincipal) {
        this.linkPrincipal = linkPrincipal;
    }

}
