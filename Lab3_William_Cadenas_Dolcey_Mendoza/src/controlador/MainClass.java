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
        mv.setResizable(false);
        
        iv.setVisible(false);
        iv.setResizable(false);

        uv.setVisible(false);
        uv.setResizable(false);

    }

    public static void verIngresar() {
        iv.setVisible(true);
    }

    public static void verUsuario() {
        uv.setVisible(true);
    }

}
