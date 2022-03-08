/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectocsvencriptar;

import javax.swing.JOptionPane;

/**
 *
 * @author wmgc5
 */
public class Sistema {
    

   

    private VerificadorArchivo verificarArchivo;
    
    
    public Sistema() {
        this.verificarArchivo= new VerificadorArchivo();
       
        

    
        
    }

    public void verificarArchivoUsuario() {
    
        verificarArchivo.setVerificarExistenciaArchivo();
        if (verificarArchivo.getVerificarExistenciaArchivo()) {
            
        
        }else{
            JOptionPane.showMessageDialog(null, "Archivo no encontrado, el programa se cerrará");
                System.exit(0);
        }

    }
    public void ingresarUsuarioContra(javax.swing.JTextField userjTextField1, javax.swing.JPasswordField passwordjPasswordField1) {
        String user;
        String pass = new String(passwordjPasswordField1.getPassword());
        user=userjTextField1.getText();
        
        System.out.println(user+" "+pass);

    }

    public void mostrarInterfazUsuario() {

    }

   

    public void mostrarMenu() {

    }

    private void ejecutarInstrucciones(){

        UIimport vista = new UIimport();
        vista.setVisible(true);


    }

    public static void main(String[] args) {
        /*
        UIimport vista = new UIimport();
        vista.setVisible(true);
       */
        Sistema sistema = new Sistema();
        sistema.ejecutarInstrucciones();
    }

}