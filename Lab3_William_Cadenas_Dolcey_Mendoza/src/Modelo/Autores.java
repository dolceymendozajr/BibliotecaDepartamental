package Modelo;

/*
Una multilista con la información de los autores, y cada uno de los libros.
*/

public class Autores extends Nodo{
    private String nombre;
    private Nodo linkPrincipal;
    private Nodo linkLibro;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Nodo getLinkPrincipal() {
        return linkPrincipal;
    }
    
    @Override
    public void setLinkPrincipal(Nodo linkPrincipal) {
        this.linkPrincipal = linkPrincipal;
    }

    public Nodo getLinkLibro() {
        return linkLibro;
    }

    public void setLinkLibro(Nodo linkLibro) {
        this.linkLibro = linkLibro;
    }

    public Autores(String nombre) {
        this.nombre = nombre;
    }
    
    
}
