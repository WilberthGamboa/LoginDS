package Utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Sistema {

    public Sistema() {

    }


    // CLASE UIIMPORTAR, MANDA ALERTAS
    public File verificarArchivoUsuario() {
        // Variable para distintas alertas sistema

        // bandera

        // Codigo para seleccionar un archivo y guardarlo


        File archivo = new File("usuarios.txt");
        // Var leer doc
        FileReader fr = null;
        BufferedReader br = null;
        // contador de columnas
   
        try {

            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
 

            
            JOptionPane.showMessageDialog(null, "Archivo seleccionado con exito");
            VerificadorArchivo  verificadorArchivo = new VerificadorArchivo();
            verificadorArchivo.validarEstructuraArchivo(archivo);
            

        } catch (Exception e) {
           mensajeFinalizarPrograma("Archivo no existe");
            e.printStackTrace();

        }
        
        return archivo;
    }

    private void mensajeFinalizarPrograma(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje,
                "ALERTA", JOptionPane.ERROR_MESSAGE);
        System.exit(0);

    }

 

}
