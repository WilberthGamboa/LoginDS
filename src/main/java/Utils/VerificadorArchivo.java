package Utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JOptionPane;

public class VerificadorArchivo {

    public VerificadorArchivo() {

    }

    public void validarEstructuraArchivo(File archivo) {

        // Var leer doc
        FileReader fr = null;
        BufferedReader br = null;
        // contador de columnas
        int columnas = 0;

        try {

            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            String linea;

            while ((linea = br.readLine()) != null) {

                String arreglo[] = linea.split(" ");
                columnas = arreglo.length;


                if (columnas != 2) {
                    JOptionPane.showMessageDialog(null, "Estructura incorrecta, el programa finalizará",
                            "ALERTA", JOptionPane.ERROR_MESSAGE);
                    System.exit(0);

                } 

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Archivo vacio");
            e.printStackTrace();

        }
        
        JOptionPane.showMessageDialog(null, "Estructura Correcta");

    }

}
