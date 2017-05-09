package Modelo;


public class Ejemplar extends Nodo{
    
    private int codigoLibro;
    private boolean disponible;
    private int codigoUsuario;
    private Nodo linkPrincipal;

    
    @Override
    public void setLinkPrincipal(Nodo linkPrincipal) {
        this.linkPrincipal = linkPrincipal; 
    }
    
}
