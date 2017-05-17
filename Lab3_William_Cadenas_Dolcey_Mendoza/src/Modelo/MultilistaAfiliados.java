package Modelo;

/**
 * Una multilista con la información de todos los afiliados a la biblioteca
 * (Está lista se encuentra ordenada), y los ejemplares que tiene a su cargo.
 *
 * @author William Cadenas
 */
public class MultilistaAfiliados {

    private Afiliado primero;
    private Afiliado ultimo;
    private Afiliado aux;
    private Afiliado anteaux;
    private int tamaño;

    public MultilistaAfiliados() {
        this.primero = null;
        this.ultimo = null;
    }

    public void InsertarAfiliado(String nombre, int codigo) {
        Afiliado p = null, antep = null;
        if (primero == null) {
            aux = new Afiliado(nombre, codigo);
            primero = aux;
            ultimo = aux;
            tamaño = 1;
            aux.setLinkPrincipal(null);
        } else {
            aux = buscarAfiliado(codigo);//busca si existe un afiliado con el mismo cod 
            if (aux != null) {
                System.out.println("El usuario ya existe");
            } else {
                antep = null;
                p = primero;
                while (p.getCodigo() < codigo && p.getLinkPrincipal() != null) {
                    antep = p;
                    p = p.getLinkPrincipal();
                }
                Afiliado q = new Afiliado(nombre, codigo);
                if (p.getCodigo() > codigo) {
                    if (p == primero) {
                        q.setLinkPrincipal(primero);//cuando es menor que el ptr(primero)
                        primero = q;
                    } else {
                        antep.setLinkPrincipal(q);//insercion en la mitad de la lista
                        q.setLinkPrincipal(p);
                    }
                    tamaño++;//el tamaño crece en cualquiera de los dos casos
                } else {
                    p.setLinkPrincipal(q);//cuando es el ultimo 
                    q.setLinkPrincipal(null);
                    ultimo = q;
                    tamaño++;
                }
            }
        }

    }

    public void verListaDeAfiliados() {
        aux = primero;
        System.out.println("Inicio");
        while (aux != null) {
            System.out.println(aux.getNombre() + "," + aux.getCodigo());
            aux.verlibros();
            aux = aux.getLinkPrincipal();
        }
        System.out.println("Fin");
    }

    public Afiliado buscarAfiliado(int codigo) {//busqueda por codigo
        aux = primero;
        anteaux = null;
        while (aux != null) {
            if (aux.getCodigo() == codigo) {
                return aux;
            }
            anteaux = aux;
            aux = aux.getLinkPrincipal();
        }
        return null;
    }

    public int getTamaño() {
        return tamaño;
    }

}