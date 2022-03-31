/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyectocsvencriptar;

import javax.swing.JOptionPane;

/**
 * 
 * @author wmgc5
 */
public class Sistema extends javax.swing.JFrame {
    

    private VerificadorArchivo verificarArchivo;

    public Sistema() {
        initComponents();
        this.verificarArchivo = new VerificadorArchivo();

    }
    // METODOS PROPIOS

    public void verificarArchivoUsuario() {

        verificarArchivo.setVerificarExistenciaArchivo();
        if (verificarArchivo.getVerificarExistenciaArchivo()) {
            JOptionPane.showMessageDialog(null, "Archivo ENCONTRADO");
            if (verificarArchivo.validarEstructuraArchivo()) {
                setVisible(false);
                mostrarMenu();
            }
            System.exit(0);
        } else {
            JOptionPane.showMessageDialog(null, "Archivo no encontrado, el programa se cerrará");
            System.exit(0);
        }

    }

    public void ingresarUsuarioContra(javax.swing.JTextField userjTextField1,
            javax.swing.JPasswordField passwordjPasswordField1) {
        String user;
        String pass = new String(passwordjPasswordField1.getPassword());
        user = userjTextField1.getText();

        System.out.println(user + " " + pass);

    }

    public void mostrarInterfazUsuario() {

    }

    public void mostrarMenu() {
        UImenu menu = new UImenu();
        menu.setVisible(true);

    }

  
    // BOTONES

    private void importarUsuariosjButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_importarUsuariosjButton1ActionPerformed
        // TODO add your handling code here:
        verificarArchivoUsuario();

    }// GEN-LAST:event_importarUsuariosjButton1ActionPerformed

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        importarUsuariosjButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        importarUsuariosjButton1.setText("Importar Archivo Usuarios");
        importarUsuariosjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importarUsuariosjButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(165, Short.MAX_VALUE)
                                .addComponent(importarUsuariosjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 200,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(143, 143, 143)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(149, 149, 149)
                                .addComponent(importarUsuariosjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(171, Short.MAX_VALUE)));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton importarUsuariosjButton1;
    // End of variables declaration//GEN-END:variables

    /*
    public static void main(String[] args) {
        Sistema vista = new Sistema();
        vista.setVisible(true);
    }
    */
}