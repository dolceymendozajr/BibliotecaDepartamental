/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author wcadenas
 */
class Ejemplar {

    private String nombre;
    private boolean estado;
    private int codigoEmjemplar;
    private int codigoAfiliado;
    private Date fecha;//aun no estoy seguro se dejar este atributo de tipo date 
    private Ejemplar linkRight, linkLeft;

    public Ejemplar(String nombre, int codigoEmjemplar) {
        this.nombre = nombre;
        this.codigoEmjemplar = codigoEmjemplar;
        this.estado = true;
        this.codigoAfiliado = 0;
    }
    
    void setLinks(Ejemplar aux) {
        this.linkRight = aux;
        aux.setLinkLeft(this);
    }

    public void setLinkRight(Ejemplar linkRight) {
        this.linkRight = linkRight;
    }

    public void setLinkLeft(Ejemplar linkLeft) {
        this.linkLeft = linkLeft;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean getEstado() {
        return estado;
    }

    public int getCodigoAfiliado() {
        return codigoAfiliado;
    }
    
    public Ejemplar getLinkRight() {
        return linkRight;
    }

    public Ejemplar getLinkLeft() {
        return linkLeft;
    }

    public int getCodigoEjemplar() {
        return codigoEmjemplar;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
}
