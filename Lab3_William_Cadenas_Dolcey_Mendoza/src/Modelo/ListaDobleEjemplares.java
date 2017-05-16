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

    public String agregarEjemplar(String name, int codigo) {
        if (ValidacionCodEjem(codigo)){
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
            return "Nodo añadido con exito!";
        }else{
            return "Ya se encuntra un ejemplar con el mismo codigo";
        }
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

    private boolean ValidacionCodEjem(int codigo) {
        aux = primero;
        boolean sw = true;
        while (aux != null && sw == true) {
            if (aux.getCodigoEmjemplar() == codigo) {
                sw = false;
                return sw;
            }
            aux =  aux.getLinkRight();
        }
        return sw;
    }
}
