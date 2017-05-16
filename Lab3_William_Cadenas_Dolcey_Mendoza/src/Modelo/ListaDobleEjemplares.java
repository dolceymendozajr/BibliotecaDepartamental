package Modelo;

/**
 * Una lista doblemente enlazada donde se tiene la información de cada ejemplar
 *
 * @author William Cadenas
 */
public class ListaDobleEjemplares {

    private EjemplarDoble primero;
    private EjemplarDoble ultimo;
    private EjemplarDoble aux;
    private int tamaño;

    public ListaDobleEjemplares() {
        this.primero = null;
        this.ultimo = null;
    }

    public void agregarEjemplar(String name, int codigo) {
        aux = new EjemplarDoble(name, codigo);
        if (primero == null) {
            primero = aux;
            ultimo = aux;
            aux.setLinkLeft(null);
            tamaño = 1;
        } else {
            ultimo.setLinks(aux);
            ultimo = aux;
            tamaño++;
        }
        aux.setLinkRight(null);
    }

    public void verListaDesdeIncio() {
        aux = primero;
        while (aux != null) {
            System.out.println(aux.getNombre());
            System.out.println("codigo:" + aux.getCodigoEmjemplar());
            System.out.println("Estado:" + aux.getEstado());
            aux = aux.getLinkRight();
        }
    }

    public void verListaDesdeFin() {
        aux = ultimo;
        while (aux != null) {
            System.out.println(aux.getNombre());
            System.out.println("codigo:" + aux.getCodigoEmjemplar());
            System.out.println("Estado:" + aux.getEstado());
            aux = aux.getLinkLeft();
        }
    }

    public int getTamaño() {
        return tamaño;
    }
    
}
