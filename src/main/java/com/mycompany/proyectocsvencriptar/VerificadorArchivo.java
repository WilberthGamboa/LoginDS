/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectocsvencriptar;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author wmgc5
 */



public class VerificadorArchivo {
    private boolean flag;

    public VerificadorArchivo(){
        this.flag=false;
    }



    public boolean getVerificarExistenciaArchivo(){

        return flag;
       
      
    }


    public void setVerificarExistenciaArchivo(boolean flag){

        this.flag=flag;
        
    }





    
    
}
