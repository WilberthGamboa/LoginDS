package Utils;


import UI.UIImportar;
import java.io.File;


import javax.swing.JOptionPane;


public class Sistema {

    private UIImportar uiImportar;
   // private UIlogin uIlogin;
    private File file;


    public Sistema(){
       
        this.uiImportar = new UIImportar();
 
        
    }
    //CLASE UIIMPORTAR, MANDA ALERTAS 
    public void verificarArchivoUsuario(boolean bandera, String mensaje) {

        if (bandera) {

            JOptionPane.showMessageDialog(null, mensaje);
           


        } else {
            JOptionPane.showMessageDialog(null, mensaje,
                    "ALERTA", JOptionPane.ERROR_MESSAGE);

        System.exit(0);

        }

  

    }

    //CLASE UILOGIN

    public void verificarUsuarioContra(String usuario,String contrasenia){

    }
   
    

   
    public void mostrarMenu() {
  //      UImenu menu = new UImenu();
       // menu.setVisible(true);

    }

    public void mostrarLogin() {
     //   UIlogin login = new UIlogin();
        //login.setVisible(true);
    }
/*
    public void alertaUsuarioNoexiste() {
        System.out.println("PUTA MADRE");
        System.out.println(getListaUsuario().size());
        administradorUsuarios.administradorUsuarios(getListaUsuario());

    }

    public LinkedList<Usuario> getListaUsuario() {
        return listaUsuario;
    }

    public void setListaUsuario(LinkedList<Usuario> listaUsuario) {
        this.listaUsuario = listaUsuario;
        System.out.println(listaUsuario.size());
    }

    */
    public UIImportar getUiImportar() {
        return uiImportar;
    }
    public void setUiImportar(UIImportar uiImportar) {
        this.uiImportar = uiImportar;
    }
    

   
    public static void main(String[] args) {
        Sistema sistema = new Sistema();
      
        sistema.getUiImportar().setVisible(true);
        

        
        //UI IMPORTAR DEBE TENER UNA VARIABLE DE TIPO FILE, PARA QUE ASÍ LA PUEDAS OBTENER

        /*
        FileReader fr = null;
        BufferedReader br = null;
 
        try {
           
            fr  = new FileReader(sistema.getFile());
            br = new BufferedReader(fr);
            String linea;
            while ((linea=br.readLine())!=null){

                String arreglo [] = linea.split(" ");
                
                System.out.println(linea);
               
               
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Archivo vacio");
            e.printStackTrace();
            //TODO: handle exception
        }

        */
        
    }
   
}
