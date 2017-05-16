package Modelo;

/**
 * Una multilista con la información de los autores, y cada uno de los libros.
 *
 * @author William Cadenas
 */
public class MultilistaAutores {

    private Autor primero;
    private Autor ultimo;
    private Autor aux;
    private int tamaño;

    public MultilistaAutores() {
        this.primero = null;
        this.ultimo = null;
    }

    public void InsertarAutor(String nombre) {
        aux = new Autor(nombre);
        if (primero == null) {
            primero = aux;
            ultimo = aux;
            tamaño = 1;
        } else {
            ultimo.setLinkPrincipal(aux);
            ultimo = aux;
            tamaño++;
        }
        aux.setLinkPrincipal(null);
    }

    public void agregarNuevoLibro(String nombreA, String nombreL, int codigoL) {
        aux = buscarAutor(nombreA);
        if (aux != null) {
            aux.agregarEjemplar(new Ejemplar(nombreL, codigoL));
        } else {
            System.out.println("El autor especificado no existe");
        }
    }

    public boolean libroExiste(String nombreA, String nombreL) {
        aux = buscarAutor(nombreA);
        if (aux != null) {
            Ejemplar libro = aux.getPrimero();
            while (libro != null) {
                if (libro.getNombre().equalsIgnoreCase(nombreL)) {
                    return true;
                }
                libro = libro.getLinkRight();
            }
        } else {
            System.out.println("El autor especificado no existe");
        }
        return false;
    }

    public boolean libroExiste(String nombreA, int codLibro) {
        aux = buscarAutor(nombreA);
        if (aux != null) {
            Ejemplar libro = aux.getPrimero();
            while (libro != null) {
                System.out.println("libro:" + libro.getNombre());
                if (libro.getCodigoEmjemplar() == codLibro) {
                    return true;
                }
                libro = libro.getLinkRight();
            }
        } else {
            System.out.println("El autor especificado no existe");
        }
        return false;
    }

    public Autor buscarAutor(String nombre) {
        aux = primero;
        while (aux != null) {
            if (aux.getNombre().equalsIgnoreCase(nombre)) {
                return aux;
            }
            aux = aux.getLinkPrincipal();
        }
        return null;
    }

    public void verListaDeAutores() {
        aux = primero;
        while (aux != null) {
            System.out.println(aux.getNombre());
            aux = aux.getLinkPrincipal();
        }
    }

    public void verlistaDeLibros(String nombre) {
        aux = buscarAutor(nombre);
        if (aux != null) {
            aux.verEjemplares();
        } else {
            System.out.println("El autor especificado no existe");
        }
    }

    public String buscarNombre(String nombreA, int codLibro) {
        aux = buscarAutor(nombreA);
        if (aux != null) {
            Ejemplar libro = aux.getPrimero();
            while (libro != null) {
                if (libro.getCodigoEmjemplar() == codLibro) {
                    return libro.getNombre();
                }
                libro = libro.getLinkRight();
            }
        } else {
            System.out.println("El autor especificado no existe");
        }
        return null;
    }

    public Autor getPrimero() {
        return primero;
    }

    public void setPrimero(Autor primero) {
        this.primero = primero;
    }

    public Autor getUltimo() {
        return ultimo;
    }

    public void setUltimo(Autor ultimo) {
        this.ultimo = ultimo;
    }

    public int getTamaño() {
        return tamaño;
    }

}
