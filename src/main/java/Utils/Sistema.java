package Utils;

import java.io.File;

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
        File archivo = null;
        JFileChooser seleccionarArchivo = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos txt", "txt");
        seleccionarArchivo.setFileFilter(filtro);
        int result = seleccionarArchivo.showDialog(new JFrame(), "Abrir txt");

        if (result == JFileChooser.APPROVE_OPTION) {
            archivo = seleccionarArchivo.getSelectedFile();

            if (archivo.getName().endsWith("usuarios.txt")) {
                VerificadorArchivo verificadorArchivo = new VerificadorArchivo();

                JOptionPane.showMessageDialog(null, "Archivo seleccionado con exito");

                verificadorArchivo.validarEstructuraArchivo(archivo);

            } else {

                mensajeFinalizarPrograma("El nombre del archivo es incorrecto, el programa finalizará");

            }

        } else {
            mensajeFinalizarPrograma("No seleccionaste ningún archivo, el programa finalizará");

        }

        return archivo;

    }

    private void mensajeFinalizarPrograma(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje,
                "ALERTA", JOptionPane.ERROR_MESSAGE);
        System.exit(0);

    }

}
