/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.GregorianCalendar;

/**
 *
 * @author wcadenas
 */
public class Ejemplar {

    private String nombre;
    private boolean estado;
    private int codigoEmjemplar;
    private int codigoAfiliado;
    private GregorianCalendar fechaDevolucion;//aun no estoy seguro se dejar este atributo de tipo date 
    private Ejemplar linkRight, linkLeft;

    public Ejemplar(String nombre, int codigoEmjemplar) {
        this.nombre = nombre;
        this.codigoEmjemplar = codigoEmjemplar;
        this.estado = true;
        this.codigoAfiliado = 0;
    }

    public Ejemplar(String nombre, boolean estado, int codigoEmjemplar, int codigoAfiliado,GregorianCalendar fecha) {
        this.nombre = nombre;
        this.estado = estado;
        this.codigoEmjemplar = codigoEmjemplar;
        this.codigoAfiliado = codigoAfiliado;
        this.fechaDevolucion = fecha;
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

    public void setCodigoAfiliado(int codigoAfiliado) {
        this.codigoAfiliado = codigoAfiliado;
    }
    
    public Ejemplar clonar(){
        Ejemplar ejemplar = new Ejemplar(nombre, estado, codigoEmjemplar, codigoAfiliado, fechaDevolucion);
        return ejemplar;
    }
}
