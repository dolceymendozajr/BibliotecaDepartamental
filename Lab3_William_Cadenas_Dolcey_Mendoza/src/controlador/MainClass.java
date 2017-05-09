package controlador;

import Modelo.*;
import vista.*;

public class MainClass {

    private static MainView mv = new MainView();
    private static Ingresar iv = new Ingresar();
    private static Usuario uv = new Usuario();
    private static Prestar pv = new Prestar();
    private static Entregar ev = new Entregar();

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
        
        MultilistaAfiliados afi = new MultilistaAfiliados();
        afi.InsertarAfiliado("William", 100);
        afi.InsertarAfiliado("Dolcey", 99);
        afi.InsertarAfiliado("Jesus", 88);
        afi.InsertarAfiliado("Laura", 90);
        afi.InsertarAfiliado("Hector", 101);
        afi.verListaDeAfiliados();
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

}
