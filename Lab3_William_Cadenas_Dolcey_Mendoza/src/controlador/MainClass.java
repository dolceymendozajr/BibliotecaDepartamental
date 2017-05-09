package controlador;

import Modelo.MultilistaAutores;
import vista.Ingresar;
import vista.MainView;
import vista.Usuario;

public class MainClass {

    private static MainView mv = new MainView();
    private static Ingresar iv = new Ingresar();
    private static Usuario uv = new Usuario();

    public static void main(String[] args) {

        mv.setVisible(true);
        mv.setResizable(false);
        
        iv.setVisible(false);
        iv.setResizable(false);

        uv.setVisible(false);
        uv.setResizable(false);
        MultilistaAutores autores = new MultilistaAutores();
        autores.InsertarAutor("William");
        autores.InsertarAutor("Dolcey");
        autores.InsertarAutor("Jesus");
        autores.InsertarAutor("Hanye");
        
        autores.agregarNuevoLibro("William", "multiverse", 100);
        autores.agregarNuevoLibro("William", "alterit", 101);
        autores.agregarNuevoLibro("William", "memoria", 102);
        
        autores.verlistaDeLibros("William");
    }

    public static void verIngresar() {
        iv.setVisible(true);
    }

    public static void verUsuario() {
        uv.setVisible(true);
    }

}
