package controlador;

import vista.Ingresar;
import vista.MainView;
import vista.Usuario;

public class MainClass {

    private static MainView mv = new MainView();
    private static Ingresar iv = new Ingresar();
    private static Usuario uv = new Usuario();

    public static void main(String[] args) {

        mv.setVisible(true);
        iv.setVisible(false);
        uv.setVisible(false);

    }

    public static void verIngresar() {
        iv.setVisible(true);
    }
    
    public static void verUsuario() {
        uv.setVisible(true);
    }

}
