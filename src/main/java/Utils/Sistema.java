package Utils;



import javax.swing.JOptionPane;

public class Sistema {

    

    public Sistema() {

        

    }

    // CLASE UIIMPORTAR, MANDA ALERTAS
    public void verificarArchivoUsuario(boolean bandera, String mensaje) {

        if (bandera) {

            JOptionPane.showMessageDialog(null, mensaje);

        } else {
            JOptionPane.showMessageDialog(null, mensaje,
                    "ALERTA", JOptionPane.ERROR_MESSAGE);

            System.exit(0);

        }

    }
    /*
    public UIImportar getUiImportar() {
        return uiImportar;
    }

    public void setUiImportar(UIImportar uiImportar) {
        this.uiImportar = uiImportar;
    }

    // CLASE UILOGIN

    public static void main(String[] args) {
        Sistema sistema = new Sistema();

        sistema.getUiImportar().setVisible(true);

    }

    */

}
