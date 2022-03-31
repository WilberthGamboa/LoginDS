package com.mycompany.proyectocsvencriptar;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;



public class VerificadorArchivo {
    private boolean flag;
    private boolean flagEstructura;
    private File archivo;

    public VerificadorArchivo() {
        this.flag = false;
        this.flagEstructura=false;
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
            archivo = seleccionarArchivo.getSelectedFile();
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

    public boolean validarEstructuraArchivo() {
        FileReader fr = null;
        BufferedReader br = null;
        int columnas = 0;
        try {
           
            fr  = new FileReader(archivo);
            br = new BufferedReader(fr);
            String linea;
            while ((linea=br.readLine())!=null){

                String arreglo [] = linea.split(" ");
                columnas=arreglo.length;
               
               
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Archivo vacio");
            e.printStackTrace();
            //TODO: handle exception
        }


        if(columnas==2){
            JOptionPane.showMessageDialog(null, "Estructura Correcta");
            this.flagEstructura=true;
            

        }else{
            JOptionPane.showMessageDialog(null, "Estructura incorrecta");
        }

        return this.flagEstructura;

    }
}
