package Modelo;

/**
 * Una lista doblemente enlazada donde se tiene la información de cada ejemplar
 *
 * @author William Cadenas
 */
public class ListaDobleEjemplares {

    private Ejemplar primero;
    private Ejemplar ultimo;
    private Ejemplar aux;
    private int tamaño;

    public ListaDobleEjemplares() {
        this.primero = null;
        this.ultimo = null;
    }

    public boolean agregarEjemplar(String name, int codigo) {
        if (validacionCodEjem(codigo)){
            aux = new Ejemplar(name, codigo);
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
            return true;
        }else{
            return false;
        }
    }

    public void verListaDesdeIncio() {
        aux = primero;
        System.out.println("-----LISTA DOBLE ENLAZADA-----");
        while (aux != null) {
            System.out.println(aux.getNombre());
            System.out.println("codigo:" + aux.getCodigoEjemplar());
            System.out.println("Estado:" + aux.getEstado());
            aux = aux.getLinkRight();
            System.out.println("--------------------------");
        }
        System.out.println("-----------FIN-------------");
    }

    public void verListaDesdeFin() {
        aux = ultimo;
        while (aux != null) {
            System.out.println(aux.getNombre());
            System.out.println("codigo:" + aux.getCodigoEjemplar());
            System.out.println("Estado:" + aux.getEstado());
            aux = aux.getLinkLeft();
        }
    }

    public int getTamaño() {
        return tamaño;
    }

    public boolean validacionCodEjem(int codigo) {
        aux = primero;
        boolean sw = true;
        while (aux != null && sw == true) {
            if (aux.getCodigoEjemplar() == codigo) {
                sw = false;
                return sw;
            }
            aux =  aux.getLinkRight();
        }
        return sw;
    }
}
