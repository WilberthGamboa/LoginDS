package Main;

import java.io.File;


import UI.UIlogin;
import Utils.Sistema;

public class Main {
    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        File archivo=  sistema.verificarArchivoUsuario();
        UIlogin uIlogin = new UIlogin(archivo);
        uIlogin.setVisible(true);

    }
    
}
