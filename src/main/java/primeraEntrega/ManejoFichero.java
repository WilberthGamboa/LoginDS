package primeraEntrega;

import java.io.*;
import java.util.LinkedList;

public class ManejoFichero {
    private LinkedList<DatosAlumno> listaAlumnos = new LinkedList<>();
    private int navegador =0;
    private int importarConfirmado = 0;
    private int cantidadColumnas;

    public void importarArchivos(File archivo) {
        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            String linea;
            while ((linea = br.readLine()) != null) {

                String arreglo[] = linea.split(",");
                cantidadColumnas = arreglo.length;

                if (arreglo.length == 4) {
                    DatosAlumno a = new DatosAlumno();
                    a.setMatricula(arreglo[0]);
                    a.setPrimerApellido(arreglo[1]);
                    a.setSegundoApellido(arreglo[2]);
                    a.setNombres(arreglo[3]);
                    listaAlumnos.add(a);

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            // TODO: handle exception
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
                // TODO: handle exception
            }
        }

    }


    public void inicio(javax.swing.JTextField matriculajTextField1, javax.swing.JTextField apellidoPjTextField1, javax.swing.JTextField apellidoMjTextField1, javax.swing.JTextField nombresjTextField,javax.swing.JTextField materiajTextField){
       
        matriculajTextField1.setText(listaAlumnos.get(navegador).getMatricula());
        
        apellidoPjTextField1.setText(listaAlumnos.get(navegador).getPrimerApellido());
       
        apellidoMjTextField1.setText(listaAlumnos.get(navegador).getSegundoApellido());
        
        nombresjTextField.setText(listaAlumnos.get(navegador).getNombres());

        materiajTextField.setText(listaAlumnos.get(navegador).getAsignatura());
        
 
        
    }

    public void atras(){
        System.out.println(navegador);
        if(navegador==-1){
            navegador=0;
        }else{
            navegador=navegador-1;
        }
        
       

        

    }

    public void delante(){
        System.out.println(listaAlumnos.size());
        System.out.println(navegador);
        if(navegador>listaAlumnos.size()){
            navegador=listaAlumnos.size()-1;
        }else{
            navegador=navegador+1;
        }
       
       

      

    }

    public void setImportarConfirmado(){
        importarConfirmado=1;
    }


    public int getImportarConfirmado() {
        return importarConfirmado;
    }


    public int getCantidadColumnas() {
        return cantidadColumnas;
    }


    public int getNavegador() {
        return navegador;
    }

    public void borrarAlumnos(int index){
        listaAlumnos.remove(index);
        setNavegador();
    }


    public void setNavegador() {
        navegador=listaAlumnos.size();
        
    }


  

    public boolean confirmarCaptura(){
        return listaAlumnos.isEmpty();
    }

}
