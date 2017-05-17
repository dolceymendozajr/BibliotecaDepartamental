package controlador;

import Modelo.Afiliado;
import Modelo.Autor;
import Modelo.Ejemplar;
import Modelo.ListaDobleEjemplares;
import Modelo.MultilistaAfiliados;
import Modelo.MultilistaAutores;
import java.util.Calendar;
import java.util.Date;
import vista.*;
import java.util.GregorianCalendar;

public class MainClass {

    private static MainView mv = new MainView();
    private static Ingresar iv = new Ingresar();
    private static Afiliar uv = new Afiliar();
    private static Prestar pv = new Prestar();
    private static Entregar ev = new Entregar();
    public static MultilistaAfiliados afi = new MultilistaAfiliados();
    public static MultilistaAutores aut = new MultilistaAutores();
    public static ListaDobleEjemplares ldejem = new ListaDobleEjemplares();
    private static Date fechaActual;

    public static void main(String[] args) {

        mv.setVisible(true);
        mv.setResizable(false);

        iv.setVisible(false);
        iv.setResizable(false);

        uv.setVisible(false);
        uv.setResizable(false);

        pv.setVisible(false);
        pv.setResizable(false);

        ev.setVisible(false);
        ev.setResizable(false);
        
        afi.InsertarAfiliado("Hector", 2001);
        afi.InsertarAfiliado("Jose", 2002);
        afi.InsertarAfiliado("Daniel", 2003);
        
        aut.AgregarAutor("Gabriel");
        aut.AgregarAutor("Dolcey");
        aut.AgregarAutor("William");
        aut.agregarNuevoLibro("William", "la bolsa", 100);
        aut.agregarNuevoLibro("William", "la bolsa e inversiones", 101);
        aut.agregarNuevoLibro("William", "Mente millonaria", 103);
        aut.agregarNuevoLibro("Dolcey", "Habitos de ricos", 200);
        aut.agregarNuevoLibro("Gabriel", "Cien años de solded", 300);        
        
        ldejem.agregarEjemplar("la bolsa", 100);
        ldejem.agregarEjemplar("la bolsa e inversiones", 101);
        ldejem.agregarEjemplar("Mente millonaria", 103);
        ldejem.agregarEjemplar( "Habitos de ricos", 200);
        ldejem.agregarEjemplar( "Cien años de solded", 300);
        
        ldejem.verListaDesdeIncio();
        aut.verListaDeAutores();
    }

    public static void verIngresar() {
        iv.setVisible(true);
    }


    public static void verUsuario() {
        uv.setVisible(true);
    }

    public static void verPrestar() {
        pv.setVisible(true);
    }

    public static void verEntregar() {
        ev.setVisible(true);
    }

    public static void agregarAfiliado(String name, int cod) {
        afi.InsertarAfiliado(name, cod);
        afi.verListaDeAfiliados();
    }

    public static String agregarEjemplar(String nameL, int codEjem, String autorName) {
        boolean observador = aut.libroExiste(autorName, codEjem);
        if (observador == true) {//libro si existe
            return "El libro ya existe con el mismo codigo";
        } else {//hay que averiguar quien no existe
            Autor autor = aut.buscarAutor(autorName);
            if (autor != null) {//el autor existe, lo que no existe es el libro, lo creamos!
                if (ldejem.agregarEjemplar(nameL, codEjem)) {
                    aut.agregarNuevoLibro(autor, nameL, codEjem);
                    return "Ejemplar añadido con exito!";
                } else {
                    return "Ya se encuntra un ejemplar con el mismo codigo";
                }
            } else{//no existe el autor lo creamos !
                if (ldejem.agregarEjemplar(nameL, codEjem)) {
                    aut.AgregarAutor(autorName);
                    aut.agregarNuevoLibro(autorName, nameL, codEjem);
                    return "Ejemplar añadido con exito!";
                } else {
                    return "Ya se encuntra un ejemplar con el mismo codigo";
                }
            }
        }
    }

    public static void setFechaActual(int dia, int mes, int año) {
        fechaActual = new Date(año, mes, dia);
        //System.out.println("fecha actual:" + fechaActual.getDate() + "/" + fechaActual.getMonth() + "/" + fechaActual.getYear());    
    }

    public static String prestarEjemplar(int codUsuario, int codEjem) {
        Ejemplar ejemplar = ldejem.buscarCodEjem(codEjem);
        if (ejemplar != null) {//Existe el ejemplar con ese codigo
            if (ejemplar.getEstado() == true) {//Se puede prestar
                Afiliado afiliado = afi.buscarAfiliado(codUsuario);
                if (afiliado != null) {//Existe el Usurario con ese codigo
                    ejemplar.setEstado(false);
                    ejemplar.setCodigoAfiliado(codUsuario);
                    GregorianCalendar fechadev=new GregorianCalendar();
                    fechadev.add(Calendar.DAY_OF_MONTH, 4);
                    ejemplar.setFechaDevolucion(fechadev);
                    //añade el libro al afiliado
                    afiliado.agregarEjemplar(ejemplar.clonar()); 
                    return "Accion completada con exito !!";
                } else {//no existe el usuario
                    return "No se encontro ningun afiliado con ese codigo";
                }
            } else {
                return "El ejemplar no se encuentra disponible(se encuentra bajo prestamo de otro usuario)";
            }
        } else {// no existe el ejemplar con el codigo
            return "no existe un ejemplar con dicho codigo";
        }
    }
    
    public static String EntregarEjemplar(int user, int ejem, GregorianCalendar fechaentrega) {
        Ejemplar ejemplar = ldejem.buscarCodEjem(ejem);
        if (ejemplar != null) {
            if (ejemplar.getEstado()) {
                return "Ejemplar ya entregado";
            } else {
                Afiliado afiliado = afi.buscarAfiliado(user);
                if (afiliado != null) {
                    ejemplar.setEstado(true);
                    ejemplar.setCodigoAfiliado(0);
                    afiliado.EliminarEjemplar(ejemplar.getCodigoEjemplar());
                    return afi.CalcularMulta(fechaentrega, ejemplar.getCodigoEjemplar(), afiliado);
                } else {
                    return "Afiliado inexistente";
                }
            }
        } else {
            return "Ejemplar inexistente";
        }
    }

}
