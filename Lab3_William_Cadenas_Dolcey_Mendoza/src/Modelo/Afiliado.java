/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author William Cadenas
 */
public class Afiliado {

    private String nombre;
    private int codigo;
    private Afiliado linkPrincipal;
    private Ejemplar primero;
    private Ejemplar ultimo;
    private Ejemplar aux;
    private int numeroDeEjemplares;

    public Afiliado(String nombre, int codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public void agregarEjemplar(Ejemplar ejemplar) {
        aux = ejemplar;
        if (primero == null) {
            primero = aux;
            ultimo = aux;
            aux.setLinkLeft(null);
            numeroDeEjemplares = 1;
        } else {
            ultimo.setLinks(aux);
            ultimo = aux;
            numeroDeEjemplares++;
        }
        aux.setLinkRight(null);
    }

    public void setLinkPrincipal(Afiliado linkPrincipal) {
        this.linkPrincipal = linkPrincipal;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public Afiliado getLinkPrincipal() {
        return linkPrincipal;
    }

    public int getNumeroDeEjemplares() {
        return numeroDeEjemplares;
    }

    void verlibros() {
        Ejemplar aux = primero;
        System.out.println("__Libros prestados__");
        while (aux != null) {
            System.out.println("nombre libro:" + aux.getNombre());
            System.out.println("codigo:" + aux.getCodigoEjemplar());
            aux = aux.getLinkRight();
        }
        System.out.println("__Fin libros__");
    }

}
