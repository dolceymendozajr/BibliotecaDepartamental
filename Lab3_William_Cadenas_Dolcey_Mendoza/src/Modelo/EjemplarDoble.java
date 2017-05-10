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
class EjemplarDoble {

    private String nombre;
    private boolean estado;
    private int codigoEmjemplar;
    private int codigoAfiliado;
    private Date fecha;//aun no estoy seguro se dejar este atributo de tipo date 
    private EjemplarDoble linkRight, linkLeft;

    public EjemplarDoble(String nombre, int codigoEmjemplar) {
        this.nombre = nombre;
        this.codigoEmjemplar = codigoEmjemplar;
        this.estado = true;
        this.codigoAfiliado = 0;
    }
    
    void setLinks(EjemplarDoble aux) {
        this.linkRight = aux;
        aux.setLinkLeft(this);
    }

    public void setLinkRight(EjemplarDoble linkRight) {
        this.linkRight = linkRight;
    }

    public void setLinkLeft(EjemplarDoble linkLeft) {
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
    
    public EjemplarDoble getLinkRight() {
        return linkRight;
    }

    public EjemplarDoble getLinkLeft() {
        return linkLeft;
    }

    public int getCodigoEmjemplar() {
        return codigoEmjemplar;
    }
    
    
}
