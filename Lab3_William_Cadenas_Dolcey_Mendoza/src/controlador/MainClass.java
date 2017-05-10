package controlador;

import Modelo.ListaDobleEjemplares;
import Modelo.MultilistaAfiliados;
import Modelo.MultilistaAutores;
import vista.*;

public class MainClass {

    private static MainView mv = new MainView();
    private static Ingresar iv = new Ingresar();
    private static Afiliar uv = new Afiliar();
    private static Prestar pv = new Prestar();
    private static Entregar ev = new Entregar();
    private static MultilistaAfiliados afi = new MultilistaAfiliados();
    private static MultilistaAutores aut = new MultilistaAutores();
    private static ListaDobleEjemplares ldejem = new ListaDobleEjemplares();

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
        
        aut.InsertarAutor("william");
        aut.InsertarAutor("hector");
        aut.InsertarAutor("laura");
        aut.agregarNuevoLibro("william", "multiverso", 100);
        aut.agregarNuevoLibro("william", "memoria", 101);
        aut.agregarNuevoLibro("william", "utopia", 102);
        aut.agregarNuevoLibro("hector", "cien años", 200);
        aut.agregarNuevoLibro("laura", "habitos de ricos", 300);
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
    
    public static void agregarEjemplar(String nameL, int codEjem, String autorName){
        boolean observador = aut.libroExiste(autorName,nameL);
        if (observador == true) {//libro si existe
            ldejem.agregarEjemplar(nameL,codEjem);
        }
        ldejem.verListaDesdeIncio();
        System.out.println("tamaño:"+ldejem.getTamaño());
    }

    public static void agregarEjemplar(int codLibro, int codEjem, String autorName) {
        boolean observador = aut.libroExiste(autorName,codLibro);
        String nombreLibro = aut.buscarNombre(autorName,codLibro);
        if (observador == true) {//libro si existe
            ldejem.agregarEjemplar(nombreLibro,codEjem);
        }
        ldejem.verListaDesdeIncio();
        System.out.println("tamaño:"+ldejem.getTamaño());
    }
}
