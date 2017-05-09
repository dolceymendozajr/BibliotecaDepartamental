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
    private Ejemplar linkEjemplar;
    private Afiliado primero;
    private Afiliado ultimo;
    private int numeroDeEjemplares;

    public Afiliado(String nombre, int codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public void setLinkPrincipal(Afiliado linkPrincipal) {
        this.linkPrincipal = linkPrincipal;
    }

    public void setLinkEjemplar(Ejemplar linkEjemplar) {
        this.linkEjemplar = linkEjemplar;
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

    public Ejemplar getLinkEjemplar() {
        return linkEjemplar;
    }

    public int getNumeroDeEjemplares() {
        return numeroDeEjemplares;
    }
        
}
