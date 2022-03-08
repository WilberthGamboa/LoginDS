package com.mycompany.proyectocsvencriptar;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;

import javax.swing.filechooser.FileNameExtensionFilter;

public class VerificadorArchivo {
    private boolean flag;

    public VerificadorArchivo() {
        this.flag = false;
    }

    public boolean getVerificarExistenciaArchivo() {

        return flag;

    }

    public void setVerificarExistenciaArchivo() {
        JFileChooser seleccionarArchivo = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos txt", "txt");
        seleccionarArchivo.setFileFilter(filtro);
        int result = seleccionarArchivo.showDialog(new JFrame(), "Abrir txt");
        if (result == JFileChooser.APPROVE_OPTION) {
            File archivo = seleccionarArchivo.getSelectedFile();
            if (archivo.getName().endsWith("usuarios.txt")) {
                this.flag = true;

                // ESTA PARTE DE AQUI ESTÁ RARA SE DEBE CAMBIAR, POR QUE ESTAMOS USANDO LA
                // VARIABLE SISTEMA

                // JOptionPane.showMessageDialog(null, "Se encontró");

            } 

        } else {

            /*
             * JOptionPane.showMessageDialog(null,
             * "Archivo no encontrado, el programa no se cerrará");
             * System.exit(0);
             */
        }

    }
}
