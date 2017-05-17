package Modelo;

/**
 * Estos van a ser los nodos de la multilisa de autores
 *
 * @author William Cadenas
 */
public class Autor {

    private String nombre;
    private Autor linkPrincipal;
    private Ejemplar primero;
    private Ejemplar ultimo;
    private Ejemplar aux;
    private int numeroDelibros;

    public void agregarEjemplar(String name, int codigo) {
            aux = new Ejemplar(name, codigo);
            if (primero == null) {
                primero = aux;
                ultimo = aux;
                aux.setLinkLeft(null);
                numeroDelibros = 1;
            } else {
                ultimo.setLinks(aux);
                ultimo = aux;
                numeroDelibros++;
            }
            aux.setLinkRight(null);
    }

    private boolean ValidacionCodEjem(int codigo) {
        aux = primero;
        boolean sw = true;
        while (aux != null && sw == true) {
            if (aux.getCodigoEjemplar() == codigo) {
                sw = false;
                return sw;
            }
            aux = aux.getLinkRight();
        }
        return sw;
    }

    public void verEjemplares() {
        Ejemplar aux = primero;
        System.out.println("_______Lista de Libros_______");
        while (aux != null) {
            System.out.println("nombre libro:"+aux.getNombre());
            System.out.println("codigo:"+aux.getCodigoEjemplar());
            aux = aux.getLinkRight();
            System.out.println("");
        }
        System.out.println("_______Fin libros_______");
    }

    public Autor(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroDelibros() {
        return numeroDelibros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Autor getLinkPrincipal() {
        return linkPrincipal;
    }

    public void setLinkPrincipal(Autor linkPrincipal) {
        this.linkPrincipal = linkPrincipal;
    }

    public Ejemplar getPrimero() {
        return primero;
    }

    public Ejemplar getUltimo() {
        return ultimo;
    }
}
